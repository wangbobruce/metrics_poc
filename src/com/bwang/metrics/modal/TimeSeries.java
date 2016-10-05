package com.bwang.metrics.modal;

import java.util.Map;

public class TimeSeries {
	private final Metrics metrics;
	private String owner;
	private Map<String, String> labels;
	
	
	public TimeSeries(Metrics metrics) {
		this.metrics = metrics;
	}
}
