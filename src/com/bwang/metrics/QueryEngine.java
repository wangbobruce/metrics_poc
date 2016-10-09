package com.bwang.metrics;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bwang.metrics.expr.AggregationExpr;
import com.bwang.metrics.expr.BinaryExpr;
import com.bwang.metrics.expr.Expr;
import com.bwang.metrics.expr.ExprType;
import com.bwang.metrics.expr.FunctionExpr;
import com.bwang.metrics.expr.MatrixSelectorExpr;
import com.bwang.metrics.expr.NumberExpr;
import com.bwang.metrics.expr.ParentExpr;
import com.bwang.metrics.expr.StringExpr;
import com.bwang.metrics.expr.UnaryExpr;
import com.bwang.metrics.expr.VectorSelectorExpr;
import com.bwang.metrics.gen.AthenaQueryLexer;
import com.bwang.metrics.gen.AthenaQueryParser;
import com.bwang.metrics.modal.ExprValue;
import com.bwang.metrics.modal.ExprValueNumber;
import com.bwang.metrics.modal.LabelMatcher;

public class QueryEngine {
	
	
	@Before
	public void setup() {
		
	}
	
	 @Test

     public void evaluateValue() throws Exception {
            String text = "250 == 300 - 50.000001 ";
            System.out.println(parseRequest(text));

            AthenaExprFactorary factor = new AthenaExprFactorary();
            Expr expr = factor.parseExpr(text);
            ExprValue value = eval(expr);

            if (value != null && value instanceof ExprValueNumber) {
                   System.out.println( ((ExprValueNumber) value).getValue() );
            }
     }
    

     private ExprValue eval(Expr expr) {
            if (expr instanceof NumberExpr) {
                   ExprValueNumber valueObject = new ExprValueNumber();
                   valueObject.setValue(((NumberExpr) expr).getNumber());
                   return valueObject;
            }

            if (expr instanceof ParentExpr) {
                   ExprValue valueObject = eval( ((ParentExpr)expr).getExpr());
                   return valueObject;
            }

            if (expr instanceof BinaryExpr) {
                   BinaryExpr binary = (BinaryExpr) expr;
                   Expr left = binary.getLeft();
                   Expr right = binary.getRight();
                   String operator = binary.getOperator();
                   if (left.getExprType().equals(ExprType.SCALAR) && right.getExprType().equals(ExprType.SCALAR)) {
                         Double leftValue = ((ExprValueNumber) eval(left)).getValue();
                         Double rightValue = ((ExprValueNumber) eval(right)).getValue();

                         ExprValueNumber valueObject = new ExprValueNumber();
                         switch(operator) {
                         case"-":
                        	 valueObject.setValue(leftValue - rightValue);
                        	 break;
                         case"+":
                        	 valueObject.setValue(leftValue + rightValue);
                        	 break;
                         case"*":
                        	 valueObject.setValue(leftValue * rightValue);
                        	 break;
                         case"/":
                        	 valueObject.setValue(leftValue / rightValue);
                        	 break;
                       	 // comparator <, <=, >, >=    0 or 1

                         case "==":
                        	 valueObject.setValue((leftValue.equals(rightValue)) ? 1D : 0D);
                        	 break;
                         case "!=":
                        	 valueObject.setValue((!leftValue.equals(rightValue)) ? 1D : 0D);
                        	 break;
                         case "<":
                        	 valueObject.setValue((leftValue < rightValue) ? 1D : 0D);
                        	 break;
                         case "<=":
                        	 valueObject.setValue((leftValue <= rightValue) ? 1D : 0D);
                        	 break;
                         case ">":
                        	 valueObject.setValue((leftValue > rightValue) ? 1D : 0D);
                        	 break;
                         case ">=":
                        	 valueObject.setValue((leftValue >= rightValue) ? 1D : 0D);
                        	 break;
                         }
                         return valueObject;
                   }
            }
            return null;
     }
	
	@Test
	public void parseString() throws Exception {
		String text = "123";
		System.out.println(parseRequest(text));
		
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof NumberExpr);
		
		NumberExpr numExpr = (NumberExpr) expr;
		Assert.assertEquals(numExpr.getNumber(), (Double)123.0D);
	}
	
	@Test
	public void parseUnary() throws Exception {
		String text = "- 123";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof UnaryExpr);
	}
	
	@Test
	public void parseStringLiteral() throws Exception {
		String text = "'abc'";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		StringExpr expr = (StringExpr) factor.parseExpr(text);
		
		Assert.assertEquals(expr.getContent(), "'abc'");
	}
	
	
	@Test
	public void parseAnd() throws Exception {
		String text = "foo and bar";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof BinaryExpr);
	}
	
	@Test
	public void parseParent() throws Exception {
		String text = " (12 + 123) * 345";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof BinaryExpr);
	}
	
	@Test
	public void parseMatrixSelectorExpr() throws Exception {
		String text = "some_metrics{col1=='abc',col2=~'inbound.*'} between \"2016-05-16\" and \"2015-05-17\"";
//		String text = "some_metrics [5m] offset 1D";
//		String text = "some_metrics{col1=='abc',col2=~'inbound.*'}";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof MatrixSelectorExpr);
		
		MatrixSelectorExpr ve = (MatrixSelectorExpr) expr;
		
		System.out.println(ve.getIdentifier());
		for(LabelMatcher m :ve.getLabelMatcherList()) {
			System.out.println(m.getOperator());
			System.out.println(m.getLabelName());
			System.out.println(m.getLabelValue());
		}

		System.out.println(ve.getRange().getValue());
		System.out.println(ve.getRange().getUnit());
		System.out.println(ve.getRange().getBegin());
		System.out.println(ve.getRange().getEnd());
		
		if (ve.getOffset() != null) {
			System.out.println(ve.getOffset().getValue());
			System.out.println(ve.getOffset().getUnit());

		}
	}
	
	@Test
	public void parseVectorSelectorExpr() throws Exception {
//		String text = "some_metrics offset 5m";
		String text = "some_metrics{col1=='abc',col2=~'inbound.*'}";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof VectorSelectorExpr);
		
		VectorSelectorExpr ve = (VectorSelectorExpr) expr;
		
		System.out.println(ve.getMetricsName());
		for(LabelMatcher m :ve.getLabelMatcherList()) {
			System.out.println(m.getOperator());
			System.out.println(m.getLabelName());
			System.out.println(m.getLabelValue());
		}
		
		if (ve.getOffset() != null) {
			System.out.println(ve.getOffset().getValue());
			System.out.println(ve.getOffset().getUnit());
			
		}
	}
	
	
	@Test
	public void parseBinary() throws Exception {
		String text = "12 + 123 * 345";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof BinaryExpr);
	}
	
	
	@Test
	public void parseTimeRang() throws Exception {
		String text = "(some_metric) between \"2016-05-16\" and \"2015-05-17\" offset 3m ";
		System.out.println(parseRequest(text));
	}
	
	@Test
	public void parseTopk() throws Exception {
		String text = " topk(100, (some_metric{xyz==\"abc\",abc=~\"inbound.*\"}) offset 3m )";
//		String text = "topk( 5, some_metric ) ";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof AggregationExpr);
		
		AggregationExpr fe = (AggregationExpr)expr;
		
		System.out.println(fe.getTopValue());
		
	}
	
	@Test
	public void parseCall() throws Exception {
		String text = "time()";
//		String text = "topk( 5, some_metric ) ";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof FunctionExpr);
		
		FunctionExpr fe = (FunctionExpr)expr;
		
		System.out.println(fe.getFunctionName());
		
	}
	
	@Test
	public void parseGroupby() throws Exception {
		String text = " sum by (foo) keep_common (some_metric{xyz==\"abc\",abc=~\"inbound.*\"} offset 3m )";
//		String text = "topk( 5, some_metric ) ";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof AggregationExpr);
		
		AggregationExpr fe = (AggregationExpr)expr;
		
		System.out.println(fe.getAggregator());
		System.out.println(fe.getAggregationKey());
		System.out.println(fe.getKeepCommon());
		if(fe.getAggregationLabels()!= null) {
			for(String l : fe.getAggregationLabels()) {
				System.out.println("k 锛� " + l);
			}
		}
	}
	
	
	
	private String parseRequest(String request) {
		ANTLRInputStream input = new ANTLRInputStream(request);
		AthenaQueryLexer lexer = new AthenaQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		AthenaQueryParser parser = new AthenaQueryParser(tokens);
		ParseTree tree = parser.expr();
		return tree.toStringTree(parser);
	}
}
