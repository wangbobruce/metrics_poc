package com.bwang.metrics.expr;

public class NumberExpr extends Expr {

	private String content;
	public NumberExpr(String content) {
		this.content = content;
	}
	
	@Override
	public ExprType getExprType() {
		
		return ExprType.SCALAR;
	}
	
	
}
