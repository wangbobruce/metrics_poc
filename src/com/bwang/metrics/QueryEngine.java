package com.bwang.metrics;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bwang.metrics.expr.AggregationExpr;
import com.bwang.metrics.expr.BinaryExpr;
import com.bwang.metrics.expr.Expr;
import com.bwang.metrics.expr.ExprType;
import com.bwang.metrics.expr.FunctionExpr;
import com.bwang.metrics.expr.MatrixSelectorExpr;
import com.bwang.metrics.expr.NumberExpr;
import com.bwang.metrics.expr.Offset;
import com.bwang.metrics.expr.ParentExpr;
import com.bwang.metrics.expr.StringExpr;
import com.bwang.metrics.expr.UnaryExpr;
import com.bwang.metrics.expr.VectorSelectorExpr;
import com.bwang.metrics.gen.AthenaQueryLexer;
import com.bwang.metrics.gen.AthenaQueryParser;
import com.bwang.metrics.modal.ExprValue;
import com.bwang.metrics.modal.ExprValueNumber;
import com.bwang.metrics.modal.LabelMatcher;
import com.bwang.metrics.modal.Metrics;
import com.bwang.metrics.modal.MetricsInstantData;
import com.bwang.metrics.modal.MetricsRangeData;
import com.bwang.metrics.modal.StorageService;
import com.bwang.metrics.modal.TimeData;
import com.bwang.metrics.modal.VectorSelectorExprValue;

public class QueryEngine {
	
	private StorageService storageService = new LocalStorageService();
	
	@Before
	public void setup() {
		
	}
	
	 @Test
     public void evaluateValue() throws Exception {
            String text = "250 == 300 - 50.000001 ";
            System.out.println(parseRequest(text));

            AthenaExprFactorary factor = new AthenaExprFactorary();
            Expr expr = factor.parseExpr(text);
            ExprValue value = eval(expr);

            if (value != null && value instanceof ExprValueNumber) {
                   System.out.println( ((ExprValueNumber) value).getValue() );
            }
     }
	 @Test
     public void evaluateVectorSelectorValue() throws Exception {
            String text = "(cpu_usage{test_label_name!='label_value_7'} OFFSET 1H ) * 5 > 20";
            System.out.println(parseRequest(text));

            AthenaExprFactorary factor = new AthenaExprFactorary();
            Expr expr = factor.parseExpr(text);
            ExprValue value = eval(expr);

            if (value != null && value instanceof VectorSelectorExprValue) {
            	print( ((VectorSelectorExprValue) value).getInstantData());
            }
     }
	 
	 private void print(List<MetricsInstantData> instantDataList) {
		 for(MetricsInstantData d : instantDataList) {
			 Metrics m = d.getMetrics();
			 
			 Date timestamp = d.getTimeData().getTimestamp();
			 Double value = d.getTimeData().getValue();
			 SimpleDateFormat dateFormat = new SimpleDateFormat(
	                    "yyyy-MM-dd'T'hh:mm:ss");
			 System.out.println(String.format("%s %s value %f", formatMetrics(m), dateFormat.format(timestamp), value));
		 }
	 }
	 
	 private String formatMetrics(Metrics m) {
		 StringBuilder sb = new StringBuilder();
		 sb.append(m.getName()).append("{");
		 int i=0; 
		 for(Entry<String, String> e : m.getLabels().entrySet()) {
			 if (i != 0) {
				sb.append(",");
			 }
			 sb.append(e.getKey()).append("=").append(e.getValue());
			 i++;
		 }
		 sb.append("}");
		 return sb.toString();
	 }
    
	 private VectorSelectorExprValue evalVectorSelector(VectorSelectorExpr vectorSelectorExpr) {
		 String metricsName = vectorSelectorExpr.getMetricsName();
		 Offset offset = vectorSelectorExpr.getOffset();
		 List<LabelMatcher> labelMatcherList = vectorSelectorExpr.getLabelMatcherList();
		 Date toDate = new Date();
		 Date fromDate = toDate;
		 if (offset != null) {
			 String timeUnit = offset.getUnit();
			 Integer offsetValue = offset.getValue();
				if (StringUtils.equalsIgnoreCase(timeUnit, "d")) {
					fromDate = DateUtils.addDays(toDate, -offsetValue);
				} else if (StringUtils.equalsIgnoreCase(timeUnit, "h")) {
					fromDate = DateUtils.addHours(toDate, -offsetValue);
				} else if (StringUtils.equalsIgnoreCase(timeUnit, "m")) {
					fromDate = DateUtils.addMinutes(toDate, -offsetValue);
				} else {
					fromDate = DateUtils.addSeconds(toDate, -offsetValue);
				}
			 toDate = fromDate; //  vector selector only for instant metrics
		 }
		 
		 VectorSelectorExprValue value = new VectorSelectorExprValue(); 
		 List<MetricsRangeData>	rangeDataList = storageService.queryMetricsData(metricsName, "", labelMatcherList, fromDate, toDate);
		 List<MetricsInstantData> instantDataList = pickInstantData(rangeDataList);
				
		 value.setInstantData(instantDataList);
		 return value;
	 }

	private List<MetricsInstantData> pickInstantData(List<MetricsRangeData> rangeDataList) {
		List<MetricsInstantData> instantDataList = new ArrayList<MetricsInstantData>();
		
		 for(MetricsRangeData d : rangeDataList) {
			 if (d.getTimeData() == null || d.getTimeData().isEmpty()) {
				 continue;
			 }
			 MetricsInstantData instantData = new MetricsInstantData();
			 instantData.setMetrics(d.getMetrics());
			 instantData.setTimeData(d.getTimeData().get(d.getTimeData().size() - 1));
			 instantDataList.add(instantData);
		 }
		return instantDataList;
	}

	 String text = " sum by (foo) keep_common (some_metric{xyz==\"abc\",abc=~\"inbound.*\"} offset 3m )";
	 @Test
    public void evaluateGroup() throws Exception {
           String text = "sum by (test_label_name) keep_common ((cpu_usage{test_label_name!='label_value_7'} OFFSET 1H ) * 5 > 20 )";
           System.out.println(parseRequest(text));

           AthenaExprFactorary factor = new AthenaExprFactorary();
           Expr expr = factor.parseExpr(text);
           ExprValue value = eval(expr);

           if (value != null && value instanceof VectorSelectorExprValue) {
           	print( ((VectorSelectorExprValue) value).getInstantData());
           }
    }
	
	private ExprValue evalAggregation(AggregationExpr aggregationExpr, List<MetricsInstantData> instantDataList) {
		String aggregator = aggregationExpr.getAggregator();
		String aggregatorKey = aggregationExpr.getAggregationKey();

		List<String> columns = aggregationExpr.getAggregationLabels();
		Integer topValue = aggregationExpr.getTopValue();

		VectorSelectorExprValue vectorSelectEpxrValue = new VectorSelectorExprValue(); 
		List<MetricsInstantData>	returnDataList = new ArrayList<MetricsInstantData>();
		vectorSelectEpxrValue.setInstantData(returnDataList);

		if ((aggregator.toLowerCase().equals("topk") || aggregator.toLowerCase().equals("bottomk")) && topValue < 1) {
			return vectorSelectEpxrValue;
		}

		return null;
		
	}
	
     private ExprValue eval(Expr expr) {
            if (expr instanceof NumberExpr) {
                   ExprValueNumber valueObject = new ExprValueNumber();
                   valueObject.setValue(((NumberExpr) expr).getNumber());
                   return valueObject;
            }

            if (expr instanceof ParentExpr) {
                   ExprValue valueObject = eval( ((ParentExpr)expr).getExpr());
                   return valueObject;
            }
            
            if (expr instanceof VectorSelectorExpr) {
            	VectorSelectorExpr vectorSelectorExpr = (VectorSelectorExpr) expr;
            	return evalVectorSelector(vectorSelectorExpr);
            }
            
            if (expr instanceof AggregationExpr) {
            	AggregationExpr aggregationExpr = (AggregationExpr)expr;
            	ExprValue valueObject = eval ( aggregationExpr.getExpression());
            	if (valueObject instanceof VectorSelectorExprValue) {
            		 List<MetricsInstantData>	instantDataList = ((VectorSelectorExprValue) valueObject).getInstantData();
            		 return evalAggregation(aggregationExpr, instantDataList);
            	} else {
            		throw new RuntimeException("not supported");
            	}
            }
            

            if (expr instanceof BinaryExpr) {
                   BinaryExpr binary = (BinaryExpr) expr;
                   Expr left = binary.getLeft();
                   Expr right = binary.getRight();
                   String operator = binary.getOperator();
                   if (left.getExprType().equals(ExprType.SCALAR) && right.getExprType().equals(ExprType.SCALAR)) {
                         Double leftValue = ((ExprValueNumber) eval(left)).getValue();
                         Double rightValue = ((ExprValueNumber) eval(right)).getValue();

                         return evalScalarValue(operator, leftValue, rightValue);
                   }
                   
                   else if (left.getExprType().equals(ExprType.VECTOR) && right.getExprType().equals(ExprType.SCALAR) ||
                		    left.getExprType().equals(ExprType.SCALAR) && right.getExprType().equals(ExprType.VECTOR)) {
                	   
	                	 VectorSelectorExprValue vectorSelectEpxrValue = new VectorSelectorExprValue(); 
	                	 List<MetricsInstantData>	returnDataList = new ArrayList<MetricsInstantData>();
	                	 vectorSelectEpxrValue.setInstantData(returnDataList);
	                	 
	              		 List<MetricsInstantData>	subDataList = left.getExprType().equals(ExprType.VECTOR) ? ((VectorSelectorExprValue) eval(left)).getInstantData() : ((VectorSelectorExprValue) eval(right)).getInstantData();
	              		 Double scalarValue = left.getExprType().equals(ExprType.VECTOR) ? ((ExprValueNumber) eval(right)).getValue() : ((ExprValueNumber) eval(left)).getValue();
	              		 boolean revert = left.getExprType().equals(ExprType.SCALAR);
	              		 
	              		 // List<MetricsInstantData> instantDataList
	            		 for(MetricsInstantData d : subDataList) {
	            			 MetricsInstantData instantData = new MetricsInstantData();
	            			 instantData.setMetrics(d.getMetrics());
	            			 TimeData oldTimeData = d.getTimeData();
	            			 Double leftValue =  oldTimeData.getValue();
	            			 Double rightValue = scalarValue;
	            			 Double newValue = leftValue;
	            			 if (revert) {
	            				 leftValue = scalarValue;
	            				 rightValue = oldTimeData.getValue();
	            				 newValue = rightValue;
	            			 }
	            			  
	            			 boolean skip = false;
	            			 switch(operator) {
		                         case"-":
		                        	 newValue = leftValue - rightValue;
		                        	 break;
		                         case"+":
		                        	 newValue = leftValue + rightValue;
		                        	 break;
		                         case"*":
		                        	 newValue = leftValue * rightValue;
		                        	 break;
		                         case"/":
		                        	 newValue = leftValue / rightValue;
		                        	 break;
		                       	 // comparator <, <=, >, >=    0 or 1
	
		                         case "==":
		                        	 if (!leftValue.equals(rightValue)) {
		                        		 skip = true;
		                        	 }
		                        	 break;
		                         case "!=":
		                        	 if(leftValue.equals(rightValue)) {
		                        		 skip = true;
		                        	 }
		                        	 break;
		                         case "<":
		                        	 if (leftValue >= rightValue) {
		                        		 skip = true;
		                        	 }
		                        	 break;
		                         case "<=":
		                        	 if (leftValue > rightValue) {
		                        		 skip = true;
		                        	 }
		                        	 break;
		                         case ">":
		                        	 if (leftValue <= rightValue) {
		                        		 skip = true;
		                        	 }
		                        	 break;
		                         case ">=":
		                        	 if (leftValue < rightValue) {
		                        		 skip = true;
		                        	 }
		                        	 break;
	                         }
	            			 if (skip) {
	            				 continue;
	            			 }

	            			 TimeData newTimeData = new TimeData(oldTimeData.getTimestamp(), newValue);
	            			 instantData.setTimeData(newTimeData);
	            			 returnDataList.add(instantData);
	            		 }
              		  return vectorSelectEpxrValue;
                   }
                   
            }
            return null;
     }

	private ExprValue evalScalarValue(String operator, Double leftValue, Double rightValue) {
		ExprValueNumber valueObject = new ExprValueNumber();
		 switch(operator) {
		 case"-":
			 valueObject.setValue(leftValue - rightValue);
			 break;
		 case"+":
			 valueObject.setValue(leftValue + rightValue);
			 break;
		 case"*":
			 valueObject.setValue(leftValue * rightValue);
			 break;
		 case"/":
			 valueObject.setValue(leftValue / rightValue);
			 break;
		 // comparator <, <=, >, >=    0 or 1

		 case "==":
			 valueObject.setValue((leftValue.equals(rightValue)) ? 1D : 0D);
			 break;
		 case "!=":
			 valueObject.setValue((!leftValue.equals(rightValue)) ? 1D : 0D);
			 break;
		 case "<":
			 valueObject.setValue((leftValue < rightValue) ? 1D : 0D);
			 break;
		 case "<=":
			 valueObject.setValue((leftValue <= rightValue) ? 1D : 0D);
			 break;
		 case ">":
			 valueObject.setValue((leftValue > rightValue) ? 1D : 0D);
			 break;
		 case ">=":
			 valueObject.setValue((leftValue >= rightValue) ? 1D : 0D);
			 break;
		 }
		 return valueObject;
	}
	
	@Test
	public void parseString() throws Exception {
		String text = "123";
		System.out.println(parseRequest(text));
		
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof NumberExpr);
		
		NumberExpr numExpr = (NumberExpr) expr;
		Assert.assertEquals(numExpr.getNumber(), (Double)123.0D);
	}
	
	@Test
	public void parseUnary() throws Exception {
		String text = "- 123";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof UnaryExpr);
	}
	
	@Test
	public void parseStringLiteral() throws Exception {
		String text = "'abc'";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		StringExpr expr = (StringExpr) factor.parseExpr(text);
		
		Assert.assertEquals(expr.getContent(), "abc");
	}
	
	
	@Test
	public void parseAnd() throws Exception {
		String text = "foo and bar";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof BinaryExpr);
	}
	
	@Test
	public void parseParent() throws Exception {
		String text = " (12 + 123) * 345";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof BinaryExpr);
	}
	
	@Test
	public void parseMatrixSelectorExpr() throws Exception {
		String text = "some_metrics{col1=='abc',col2=~'inbound.*'} between \"2016-05-16\" and \"2015-05-17\"";
//		String text = "some_metrics [5m] offset 1D";
//		String text = "some_metrics{col1=='abc',col2=~'inbound.*'}";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof MatrixSelectorExpr);
		
		MatrixSelectorExpr ve = (MatrixSelectorExpr) expr;
		
		System.out.println(ve.getIdentifier());
		for(LabelMatcher m :ve.getLabelMatcherList()) {
			System.out.println(m.getOperator());
			System.out.println(m.getLabelName());
			System.out.println(m.getLabelValue());
		}

		System.out.println(ve.getRange().getValue());
		System.out.println(ve.getRange().getUnit());
		System.out.println(ve.getRange().getBegin());
		System.out.println(ve.getRange().getEnd());
		
		if (ve.getOffset() != null) {
			System.out.println(ve.getOffset().getValue());
			System.out.println(ve.getOffset().getUnit());

		}
	}
	
	@Test
	public void parseVectorSelectorExpr() throws Exception {
//		String text = "some_metrics offset 5m";
		String text = "some_metrics{col1=='abc',col2=~'inbound.*'}";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof VectorSelectorExpr);
		
		VectorSelectorExpr ve = (VectorSelectorExpr) expr;
		
		System.out.println(ve.getMetricsName());
		for(LabelMatcher m :ve.getLabelMatcherList()) {
			System.out.println(m.getOperator());
			System.out.println(m.getLabelName());
			System.out.println(m.getLabelValue());
		}
		
		if (ve.getOffset() != null) {
			System.out.println(ve.getOffset().getValue());
			System.out.println(ve.getOffset().getUnit());
			
		}
	}
	
	
	@Test
	public void parseBinary() throws Exception {
		String text = "12 + 123 * 345";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof BinaryExpr);
	}
	
	
	@Test
	public void parseTimeRang() throws Exception {
		String text = "(some_metric) between \"2016-05-16\" and \"2015-05-17\" offset 3m ";
		System.out.println(parseRequest(text));
	}
	
	@Test
	public void parseTopk() throws Exception {
		String text = " topk(100, (some_metric{xyz==\"abc\",abc=~\"inbound.*\"}) offset 3m )";
//		String text = "topk( 5, some_metric ) ";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof AggregationExpr);
		
		AggregationExpr fe = (AggregationExpr)expr;
		
		System.out.println(fe.getTopValue());
		
	}
	
	@Test
	public void parseCall() throws Exception {
		String text = "time()";
//		String text = "topk( 5, some_metric ) ";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof FunctionExpr);
		
		FunctionExpr fe = (FunctionExpr)expr;
		
		System.out.println(fe.getFunctionName());
		
	}
	
	@Test
	public void parseGroupby() throws Exception {
		String text = " sum by (foo) keep_common (some_metric{xyz==\"abc\",abc=~\"inbound.*\"} offset 3m )";
//		String text = "topk( 5, some_metric ) ";
		System.out.println(parseRequest(text));
		
		AthenaExprFactorary factor = new AthenaExprFactorary();
		Expr expr = factor.parseExpr(text);
		
		Assert.assertTrue(expr instanceof AggregationExpr);
		
		AggregationExpr fe = (AggregationExpr)expr;
		
		System.out.println(fe.getAggregator());
		System.out.println(fe.getAggregationKey());
		System.out.println(fe.getKeepCommon());
		if(fe.getAggregationLabels()!= null) {
			for(String l : fe.getAggregationLabels()) {
				System.out.println("k Label " + l);
			}
		}
	}
	
	
	
	private String parseRequest(String request) {
		ANTLRInputStream input = new ANTLRInputStream(request);
		AthenaQueryLexer lexer = new AthenaQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		AthenaQueryParser parser = new AthenaQueryParser(tokens);
		ParseTree tree = parser.expr();
		return tree.toStringTree(parser);
	}
}
