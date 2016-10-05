package com.bwang.metrics.expr;

public class UnaryExpr extends Expr {

	private Expr expr;
	
	
	@Override
	public ExprType getExprType() {
		return expr.getExprType();
	}
	
	public UnaryExpr(Expr expr) {
		this.expr = expr;
	}
	
}
