package com.bwang.metrics.modal;

import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class Metrics {
	private final String name;
	private String owner;
	private Set<String> labels;
	
	
	public Metrics(String name) {
		if (StringUtils.isEmpty(name)) {
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
