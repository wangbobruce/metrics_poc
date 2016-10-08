package com.bwang.metrics.expr;

import java.util.List;

import com.bwang.metrics.modal.LabelMatcher;

public class VectorSelectorExpr extends Expr {

    private String identifier;
    private List<LabelMatcher> labelMatcherList;
	private Offset offset;
	
	public VectorSelectorExpr(String identifier, List<LabelMatcher> labelMatcherList, Offset offset) {
		this.identifier = identifier;
		this.labelMatcherList = labelMatcherList;
		this.offset = offset;
	}
	
	@Override
	public ExprType getExprType() {
		return ExprType.VECTOR;
	}

	public String getIdentifier() {
		return identifier;
	}

	public List<LabelMatcher> getLabelMatcherList() {
		return labelMatcherList;
	}

	public Offset getOffset() {
		return offset;
	}
	
	

}
