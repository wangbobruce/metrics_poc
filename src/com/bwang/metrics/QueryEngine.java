package com.bwang.metrics;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bwang.metrics.expr.BinaryExpr;
import com.bwang.metrics.expr.Expr;
import com.bwang.metrics.expr.NumberExpr;
import com.bwang.metrics.expr.UnaryExpr;
import com.bwang.metrics.gen.AthenaQueryLexer;
import com.bwang.metrics.gen.AthenaQueryParser;

public class QueryEngine {
	
	
	@Before
	public void setup() {
		
	}

	@Test
	public void parseString() throws Exception {
		String text = "123";
		System.out.println(parseRequest(text));
		
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof NumberExpr);
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
