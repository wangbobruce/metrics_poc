package com.bwang.metrics.modal;

import java.util.List;

public class MetricsData {
	private Metrics metrics;
	private List<TimeData> timeData;
	public Metrics getMetrics() {
		return metrics;
	}
	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}
	public List<TimeData> getTimeData() {
		return timeData;
	}
	public void setTimeData(List<TimeData> timeData) {
		this.timeData = timeData;
	}
	
	
}
