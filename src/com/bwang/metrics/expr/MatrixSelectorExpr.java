package com.bwang.metrics.expr;

import java.util.List;

public class MatrixSelectorExpr extends Expr {

    private String identifier;
    private List<LabelMatcher> labelMatcherList;
    private Range  range;
	private Offset offset;
	
	public MatrixSelectorExpr(String identifier, List<LabelMatcher> labelMatcherList, Range range, Offset offset) {
		this.identifier = identifier;
		this.labelMatcherList = labelMatcherList;
		this.range = range;
		this.offset = offset;
	}
	
	@Override
	public ExprType getExprType() {
		return ExprType.MATRIX;
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

	public Range getRange() {
		return range;
	}
	
	

}
