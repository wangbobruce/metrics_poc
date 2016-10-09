package com.bwang.metrics;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.bwang.metrics.modal.LabelMatcher;
import com.bwang.metrics.modal.Metrics;
import com.bwang.metrics.modal.MetricsRangeData;
import com.bwang.metrics.modal.StorageService;
import com.bwang.metrics.modal.TimeData;

public class LocalStorageService implements StorageService{

	@Override
	public List<MetricsRangeData> queryMetricsData(String metricsName,
			String owner, List<LabelMatcher> labelMatcherList, Date begin,
			Date end) {
		List<MetricsRangeData> list = queryAllRangeMetricsData(metricsName, owner, begin, end);
		
		if(labelMatcherList == null ||labelMatcherList.isEmpty()) {
			return list;
		}
		Iterator<MetricsRangeData> iterator =  list.iterator();
		while(iterator.hasNext()) {
			MetricsRangeData data = iterator.next();
			Map<String, String> labels = data.getMetrics().getLabels();
			boolean match = true;
			for(LabelMatcher matcher : labelMatcherList) {
				if(matcher.getOperator().equals(LabelMatcher.Operator.EQUAL)) {
					String labelName = matcher.getLabelName();
					if (labels.get(labelName) == null || !labels.get(labelName).equals(matcher.getLabelValue())) {
						match = false;
						break;
					}
				}
				
				if(matcher.getOperator().equals(LabelMatcher.Operator.NOT_EQUAL)) {
					String labelName = matcher.getLabelName();
					if (labels.get(labelName) != null && labels.get(labelName).equals(matcher.getLabelValue())) {
						match = false;
						break;
					}
				}
				
				// need two more like functions

			}
			if (!match) {
				iterator.remove();
			}
		}
		
		
		return list;
	}
	
	private List<MetricsRangeData> queryAllRangeMetricsData(String metricsName,
			String owner, Date begin, Date end) {
		List<MetricsRangeData> list = new ArrayList<MetricsRangeData>();
		
		for(int i=0; i< 10; i++) {
			Map<String, String> labels = new HashMap<String, String>();
			String label = "test_label_name";
			String labelValue = String.format("label_value_%d", i);
			labels.put(label, labelValue);
			
			MetricsRangeData data = new MetricsRangeData();
			Metrics m = new Metrics(metricsName);
			m.setLabels(labels);
			data.setMetrics(m);

			List<TimeData> listData = new ArrayList<TimeData>();
			data.setTimeData(listData);
			for(long start = begin.getTime(); start <= end.getTime(); start+= 60*1000L) {
				listData.add(new TimeData(new Date(start), 1D*i));
			}
			list.add(data);
		}
		
		return list;
	}

}
