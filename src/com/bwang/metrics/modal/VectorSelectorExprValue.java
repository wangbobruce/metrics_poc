package com.bwang.metrics.modal;

import java.util.List;

import com.bwang.metrics.modal.MetricsInstantData;

public class VectorSelectorExprValue extends ExprValue {
	List<MetricsInstantData> instantData;

	public List<MetricsInstantData> getInstantData() {
		return instantData;
	}

	public void setInstantData(List<MetricsInstantData> instantData) {
		this.instantData = instantData;
	}

}
