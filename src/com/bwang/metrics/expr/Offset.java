package com.bwang.metrics.expr;

public class Offset {
	private Integer value;
	private String unit;
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public Offset(Integer value, String unit) {
		this.value = value;
		this.unit = unit;
	}
}
