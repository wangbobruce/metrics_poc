package com.bwang.metrics.expr;

public class StringExpr extends Expr {

	private String content;
	public StringExpr(String content) {
		this.content = content;
	}
	
	@Override
	public ExprType getExprType() {
		
		return ExprType.SCALAR;
	}
	
	public String getContent() {
		return content;
	}
}
