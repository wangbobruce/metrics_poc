package com.bwang.metrics.modal;

public class LabelMatcher {
	private Operator operator;
	private String labelName;
	private String labelValue;
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
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
	
	public LabelMatcher(Operator operator, String labelName, String labelValue) {
		this.operator = operator;
		this.labelName = labelName;
		this.labelValue = labelValue;
	}
	
	public enum Operator {
		EQUAL("=="),    
		NOTEQUAL("!="),
		EQREG("=~"),
		NOTREG("!~");

		private String op;
		Operator(String v){
			this.op = v;
		}
		String getOp() {
			return op;
		}

		public static Operator getEnum(String value) {
			for(Operator v : values()) {
				if(v.getOp().equalsIgnoreCase(value)) {
					return v;
				}
			}
			throw new IllegalArgumentException();
		}
	}
}
