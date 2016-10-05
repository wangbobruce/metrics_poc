package com.bwang.metrics;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.bwang.metrics.expr.BinaryExpr;
import com.bwang.metrics.expr.Expr;
import com.bwang.metrics.expr.NumberExpr;
import com.bwang.metrics.expr.UnaryExpr;
import com.bwang.metrics.gen.AthenaQueryBaseVisitor;
import com.bwang.metrics.gen.AthenaQueryLexer;
import com.bwang.metrics.gen.AthenaQueryParser;

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
			ctx.numberLiteral().DOUBLE().getText();
		}
		return new NumberExpr(content); 
	}
	
	@Override public Expr visitBinaryExp(AthenaQueryParser.BinaryExpContext ctx) { 
		Expr left = visit(ctx.left);
		Expr right = visit(ctx.right);
		String op = ctx.op.getText();

		return new BinaryExpr(op, left, right);
	}
	
	/*
	
	@Override
	public Expression visitExpr(@NotNull StupidParser.ExprContext ctx) {
		if (ctx.value() != null) {
			return visitValue(ctx.value());
		} if (ctx.AND() != null) {
			return new AndExpression(visitExpr(ctx.left), visitExpr(ctx.right));
		} else if (ctx.MINUS() != null && ctx.left != null) {
			return new MinusExpression(visitExpr(ctx.left), visitExpr(ctx.right));
		} else if (ctx.PLUS() != null) {
			return new PlusExpression(visitExpr(ctx.left), visitExpr(ctx.right));
		} else if (ctx.OR() != null) {
			return new OrExpression(visitExpr(ctx.left), visitExpr(ctx.right));
		} else if (ctx.STAR() != null) {
			return new MultiplicationExpression(visitExpr(ctx.left), visitExpr(ctx.right));
		} else if (ctx.SLASH() != null) {
			return new DivisionExpression(visitExpr(ctx.left), visitExpr(ctx.right));
		} else if (ctx.LPAREN() != null) {
			if (ctx.DOT() != null) {
				// apply, not value
				StupidParser.ArgslistContext args = ctx.argslist();
				List<Expression> argsList = new ArrayList<Expression>();
				while (args != null) {
					argsList.add(visitExpr(args.expr()));
					args = args.argslist();
				}
				return new ApplyExpression(visitExpr(ctx.left), argsList.toArray(new Expression[argsList.size()]));
			}
			return visitExpr(ctx.center);
		} else if (ctx.BANG() != null) {
			return new NotExpression(visitExpr(ctx.center));
		} else if (ctx.MINUS() != null) {
			return new NegateExpression(visitExpr(ctx.center));
		} else if (ctx.EQUALS() != null && ctx.EQUALS().size() == 2) {
			return new EqualsExpression(visitExpr(ctx.left), visitExpr(ctx.right));
		} else if (ctx.LANGLE() != null) {
			return new ComparisonExpression(visitExpr(ctx.left), visitExpr(ctx.right));
		} else if (ctx.RANGLE() != null) {
			return new ComparisonExpression(visitExpr(ctx.right), visitExpr(ctx.left));
		} else if (ctx.var() != null) {
			Expression base = null;
			if (ctx.DOT() != null) {
				base = visitExpr(ctx.left);
			}
			return new VarExpression(base, ctx.var().IDENTIFIER().getText());
		} else if (ctx.call() != null) {
			StupidParser.ArgslistContext args = ctx.call().argslist();
			List<Expression> argsList = new ArrayList<Expression>();
			while (args != null) {
				argsList.add(visitExpr(args.expr()));
				args = args.argslist();
			}
			Expression base = null;
			if (ctx.DOT() != null) {
				base = visitExpr(ctx.left);
			}
			return new CallExpression(base, ctx.call().IDENTIFIER().getText(),
					argsList.toArray(new Expression[argsList.size()]));
		} else if (ctx.ASK() != null) {
			return new TernaryExpression(visitExpr(ctx.left), visitExpr(ctx.center), visitExpr(ctx.right));
		} else if (ctx.assign() != null) {
			Expression base = null;
			if (ctx.DOT() != null) {
				base = visitExpr(ctx.left);
			}
			return new AssignExpression(base, ctx.assign().IDENTIFIER().getText(), visitExpr(ctx.assign().expr()));
		}
		return super.visitExpr(ctx);
		
		*/
}
