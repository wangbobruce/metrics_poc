package com.bwang.metrics.modal;

import java.util.Set;

public class Metrics {
	private final String name;
	private String owner;
	private Set<String> labels;
	
	
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
	
}
