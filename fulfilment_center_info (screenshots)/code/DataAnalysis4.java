package org.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;

public class DataAnalysis4
{
	
	public static void main(String args[])
	{
		System.out.println("Data Analysis");
		
		try
		{
		
			Table train_data=Table.read().csv("C:\\Users\\User\\eclipse-workspace\\org.ml\\src\\main\\java\\org\\ml\\fulfilment_center_info.csv");
			System.out.println(train_data.shape());
			System.out.println(train_data.first(5));
			System.out.println(train_data.last(10));
			
			System.out.println(train_data.structure());
			System.out.println(train_data.summary());
			
		   
			Layout layout3=Layout.builder().title("Distributio of center_id").build();
			HistogramTrace trace3=HistogramTrace.builder(train_data.nCol("center_id")).build();
			Plot.show(new Figure(layout3,trace3));
			
			Layout layout4=Layout.builder().title("Distributio of city_code").build();
			HistogramTrace trace4=HistogramTrace.builder(train_data.nCol("city_code")).build();
			Plot.show(new Figure(layout4,trace4));
			
			Layout layout5=Layout.builder().title("Distributio of region_code").build();
			HistogramTrace trace5=HistogramTrace.builder(train_data.nCol("region_code")).build();
			Plot.show(new Figure(layout5,trace5));
			
			Layout layout6=Layout.builder().title("Distributio of center_type").build();
			HistogramTrace trace6=HistogramTrace.builder(train_data.nCol("center_type")).build();
			Plot.show(new Figure(layout6,trace6));
			
			Layout layout7=Layout.builder().title("Distributio of op_area").build();
			HistogramTrace trace7=HistogramTrace.builder(train_data.nCol("op_area")).build();
			Plot.show(new Figure(layout7,trace7));
						
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
}
