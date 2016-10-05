package com.bwang.metrics.expr;

public class BinaryExpr extends Expr {

    private String operator;
	private Expr left;
	private Expr right;
	
	
	
	public String getOperator() {
		return operator;
	}



	public void setOperator(String operator) {
		this.operator = operator;
	}



	public Expr getLeft() {
		return left;
	}



	public void setLeft(Expr left) {
		this.left = left;
	}



	public Expr getRight() {
		return right;
	}



	public void setRight(Expr right) {
		this.right = right;
	}


	public BinaryExpr(String operator, Expr left, Expr right) {
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	@Override
	public ExprType getExprType() {
		return left.getExprType();
	}

}
