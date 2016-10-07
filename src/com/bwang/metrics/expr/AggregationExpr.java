package com.bwang.metrics.expr;

import java.util.List;

public class AggregationExpr extends Expr {
	private String aggregator ;
	private String aggregationKey;
	private String keepCommon ;
	private List<String> aggregationLabels;
	
	private Expr expression;
	private Integer topValue;
	
	public AggregationExpr(String aggregator, String aggregationKey, List<String> aggregationLabels, Expr expression, String keepCommon, Integer topValue) {
		this.aggregator = aggregator;
		this.aggregationKey  = aggregationKey;
		this.aggregationLabels = aggregationLabels;
		this.expression = expression;
		this.keepCommon = keepCommon;
		this.topValue = topValue;
	}
	
	@Override
	public ExprType getExprType() {
		return ExprType.VECTOR;
	}

	public String getAggregator() {
		return aggregator;
	}

	public String getAggregationKey() {
		return aggregationKey;
	}

	public String getKeepCommon() {
		return keepCommon;
	}

	public List<String> getAggregationLabels() {
		return aggregationLabels;
	}

	public Expr getExpression() {
		return expression;
	}

	public Integer getTopValue() {
		return topValue;
	}
}
