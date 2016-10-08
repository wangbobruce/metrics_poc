package com.bwang.metrics.modal;

import java.util.Date;
import java.util.List;

public interface StorageService {
	MetricsData queryMetricsData(Date begin, Date end, String metricsName, String owner, List<LabelMatcher> labelMatcherList);
}
