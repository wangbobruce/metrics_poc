package com.bwang.metrics.modal;

import java.util.Date;
import java.util.List;

public interface StorageService {
	List<MetricsData> queryMetricsData(String metricsName, String owner, List<LabelMatcher> labelMatcherList, Date begin, Date end);
}
