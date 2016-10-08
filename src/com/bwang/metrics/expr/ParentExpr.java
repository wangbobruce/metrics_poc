package com.bwang.metrics.expr;

public class ParentExpr extends Expr {

	private Expr expr;
	
	
	@Override
	public ExprType getExprType() {
		return expr.getExprType();
	}
	
	public ParentExpr(Expr expr) {
		this.expr = expr;
	}

	public Expr getExpr() {
		return expr;
	}
	
	
	
}
