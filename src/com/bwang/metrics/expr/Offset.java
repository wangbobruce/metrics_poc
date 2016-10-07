package com.bwang.metrics.expr;

public class Offset {
	private Double value;
	private String unit;
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public Offset(Double value, String unit) {
		this.value = value;
		this.unit = unit;
	}
}
