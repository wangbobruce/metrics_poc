package com.bwang.metrics;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.bwang.metrics.expr.AggregationExpr;
import com.bwang.metrics.expr.BinaryExpr;
import com.bwang.metrics.expr.Expr;
import com.bwang.metrics.expr.FunctionExpr;
import com.bwang.metrics.expr.MatrixSelectorExpr;
import com.bwang.metrics.expr.NumberExpr;
import com.bwang.metrics.expr.Offset;
import com.bwang.metrics.expr.ParentExpr;
import com.bwang.metrics.expr.Range;
import com.bwang.metrics.expr.StringExpr;
import com.bwang.metrics.expr.UnaryExpr;
import com.bwang.metrics.expr.VectorSelectorExpr;
import com.bwang.metrics.gen.AthenaQueryBaseVisitor;
import com.bwang.metrics.gen.AthenaQueryLexer;
import com.bwang.metrics.gen.AthenaQueryParser;
import com.bwang.metrics.gen.AthenaQueryParser.ExprContext;
import com.bwang.metrics.modal.LabelMatcher;

public class AthenaExprFactorary extends AthenaQueryBaseVisitor <Expr> {
	public Expr parseExpr(String exprString) {
		ANTLRInputStream input = new ANTLRInputStream(exprString);
		AthenaQueryLexer lexer = new AthenaQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		AthenaQueryParser parser = new AthenaQueryParser(tokens);

		return visit(parser.expr());
	}
	
	
	@Override public Expr visitUnaryExpr(AthenaQueryParser.UnaryExprContext ctx) { 
		return new UnaryExpr(visit(ctx.expr())); 
	}
	
	@Override public NumberExpr visitNumberExpr(AthenaQueryParser.NumberExprContext ctx) { 
		String content = "";
		if (ctx.numberLiteral().INT()!= null) {
			content = ctx.numberLiteral().INT().getText();
		} else {
			content = ctx.numberLiteral().DOUBLE().getText();
		}
		Double value = Double.valueOf(content);
		return new NumberExpr(value); 
	}
	
	@Override public Expr visitQuoted_string(AthenaQueryParser.Quoted_stringContext ctx) { 
		return new StringExpr(getQuotedStringContent(ctx));
	}
	
	@Override public Expr visitBinaryExp(AthenaQueryParser.BinaryExpContext ctx) { 
		Expr left = visit(ctx.left);
		Expr right = visit(ctx.right);
		String op = ctx.op.getText();

		return new BinaryExpr(op, left, right);
	}
	
	private String getQuotedStringContent(AthenaQueryParser.Quoted_stringContext ctx) {
		if (ctx == null || ctx.getText() == null) {
			return null;
		}
		String content = ctx.getText();
		int start = 0;
		int end = content.length();
		if (content.startsWith("'") || content.startsWith("\"")) {
			start = 1;
		}
		if (content.endsWith("'") || content.endsWith("\"")) {
			end-=1;
		}
		return content.substring(start, end);
	}
	
	@Override public Expr visitParentEpr(AthenaQueryParser.ParentEprContext ctx) { 

		return new ParentExpr(visit(ctx.parent));
  	}
	
	
	@Override public Expr visitVectorSelector(AthenaQueryParser.VectorSelectorContext ctx) { 
		
		String identifierName = ctx.IDENTIFIER().getText();
		List<LabelMatcher> lableMatcherList = new ArrayList<LabelMatcher>();
		if (ctx.labelMatcherList() != null) {
			for(AthenaQueryParser.LabelMatcherContext labelCtx : ctx.labelMatcherList().labelMatcher()) {
				String operation = labelCtx.match_op.getText();
				String labelName = labelCtx.IDENTIFIER().getText();
				String labelValue = (labelCtx.quoted_string()!= null? getQuotedStringContent(labelCtx.quoted_string()): labelCtx.numberLiteral().getText());
				lableMatcherList.add(new LabelMatcher(LabelMatcher.Operator.getEnum(operation), labelName, labelValue));		
			}
		}
		
		Offset offset = null;
		if (ctx.offsetExpr()!= null) {
			String offsetValue = ctx.offsetExpr().INT().getText();
			String offsetUnit = ctx.offsetExpr().TIME_UNIT().getText();
			offset = new Offset(Integer.valueOf(offsetValue), offsetUnit);
		}
		
		return new VectorSelectorExpr(identifierName, lableMatcherList, offset );
	}
	
	@Override public Expr visitMatrixSelector(AthenaQueryParser.MatrixSelectorContext ctx) { 
		
		String identifierName = ctx.IDENTIFIER().getText();
		List<LabelMatcher> lableMatcherList = new ArrayList<LabelMatcher>();
		if (ctx.labelMatcherList() != null) {
			for(AthenaQueryParser.LabelMatcherContext labelCtx : ctx.labelMatcherList().labelMatcher()) {
				String operation = labelCtx.match_op.getText();
				String labelName = labelCtx.IDENTIFIER().getText();
				String labelValue = (labelCtx.quoted_string()!= null? getQuotedStringContent(labelCtx.quoted_string()): labelCtx.numberLiteral().getText());
				lableMatcherList.add(new LabelMatcher(LabelMatcher.Operator.getEnum(operation), labelName, labelValue));		
			}
		}
		
		Range range = null;
		if (ctx.rangeExpr()!= null) {
			String begin = (ctx.rangeExpr().from_time()!= null ? ctx.rangeExpr().from_time().getText(): null);
			String end = (ctx.rangeExpr().to_time()!= null ? ctx.rangeExpr().to_time().getText(): null);
			
			Integer value = (ctx.rangeExpr().INT() != null ? Integer.valueOf(ctx.rangeExpr().INT().getText()): null);
			String unit = (ctx.rangeExpr().TIME_UNIT() != null ? ctx.rangeExpr().TIME_UNIT().getText(): null);
			
			range = new Range();
			range.setBegin(begin);
			range.setEnd(end);
			range.setValue(value);
			range.setUnit(unit);
		}
		
		Offset offset = null;
		if (ctx.offsetExpr()!= null) {
			String offsetValue = ctx.offsetExpr().INT().getText();
			String offsetUnit = ctx.offsetExpr().TIME_UNIT().getText();
			offset = new Offset(Integer.valueOf(offsetValue), offsetUnit);
		}
		
		return new MatrixSelectorExpr(identifierName, lableMatcherList, range, offset );
	}
	
	@Override public Expr visitCall(AthenaQueryParser.CallContext ctx) { 
		String functionName = ctx.callName.getText();
		List<Expr> argList = new ArrayList<Expr> ();
		if (ctx.argslist() != null) {
			for(ExprContext eC : ctx.argslist().expr()) {
				argList.add(visit(eC));
			}
		}
		
		return new FunctionExpr(functionName, argList);
	}
	
	@Override public Expr visitAggregateExp(AthenaQueryParser.AggregateExpContext ctx) { 
		String aggregator = ctx.aggregator.getText();
		String aggregationKey = null;
		String keepCommon = null;
		List<String> aggregationLabels= new ArrayList<String>();
		if(ctx.aggregatorParam()!= null ){
			aggregationKey = (ctx.aggregatorParam().K_BY() != null ? ctx.aggregatorParam().K_BY().getText() :
				ctx.aggregatorParam().K_WITHOUT().getText());
		    keepCommon = (ctx.aggregatorParam().K_KEEP_COMMON() != null ? ctx.aggregatorParam().K_KEEP_COMMON().getText() : null);
		
		    if(ctx.aggregatorParam().identifierList() != null) {
		    	for(TerminalNode node  : ctx.aggregatorParam().identifierList().IDENTIFIER()) {
		    		aggregationLabels.add(node.getText());
		    	}
		    }
		}
		Integer topValue = null;
		if( ctx.INT()!= null) {
			topValue = Integer.valueOf(ctx.INT().getText());
		}
		Expr expression = visit(ctx.expr());
		return new AggregationExpr(aggregator, aggregationKey, aggregationLabels, expression, keepCommon, topValue);
	}
	
}
