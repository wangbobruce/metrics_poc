package com.bwang.metrics.modal;

import java.util.Date;

public class TimeData {
	private Date timestamp;
	private Double value;
	
	public TimeData(Date timestamp, Double value) {
		this.timestamp = timestamp;
		this.value = value;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public Double getValue() {
		return value;
	}
}
