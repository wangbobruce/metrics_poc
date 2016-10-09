package com.bwang.metrics.modal;

import java.util.Map;

public class Metrics {
	private final String name;
	private String owner;
	private Map<String, String> labels;
	
	
	public Metrics(String name) {
		if (name == null || name.trim().length() == 0) {
			throw new IllegalArgumentException("metrics name can't be empty");
		}
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (! (o instanceof Metrics) ) {
			return false;
		}
		Metrics right = (Metrics) o;

		return name.equals(right.name);
	}

	public Map<String, String> getLabels() {
		return labels;
	}

	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}

	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}
}
