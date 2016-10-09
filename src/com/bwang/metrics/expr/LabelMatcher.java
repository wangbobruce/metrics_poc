package com.bwang.metrics.expr;

public class LabelMatcher {
	private String operator;
	private String labelName;
	private String labelValue;
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getLabelName() {
		return labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}
	public String getLabelValue() {
		return labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}
	
	public LabelMatcher(String operator, String labelName, String labelValue) {
		this.operator = operator;
		this.labelName = labelName;
		this.labelValue = labelValue;
	}
}
