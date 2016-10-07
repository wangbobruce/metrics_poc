package com.bwang.metrics.expr;

public class NumberExpr extends Expr {

	private Double number;
	public NumberExpr(Double number) {
		this.number = number;
	}
	
	
	public Double getNumber() {
		return number;
	}


	@Override
	public ExprType getExprType() {
		
		return ExprType.SCALAR;
	}
	
	
}
