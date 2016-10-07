package com.bwang.metrics.expr;

import java.util.List;

public class FunctionExpr extends Expr {

	private List<Expr> argList;
	
	private String functionName;
	
	
	@Override
	public ExprType getExprType() {
		
		return null;
	}


	public List<Expr> getArgList() {
		return argList;
	}


	public void setArgList(List<Expr> argList) {
		this.argList = argList;
	}


	public String getFunctionName() {
		return functionName;
	}


	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	

	public FunctionExpr(String functionName, List<Expr> argList) {
		this.functionName = functionName;
		this.argList = argList;
	}

}
