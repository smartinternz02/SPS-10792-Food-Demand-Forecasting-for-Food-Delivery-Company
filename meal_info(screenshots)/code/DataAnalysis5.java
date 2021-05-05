package org.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;

public class DataAnalysis5
{
	
	public static void main(String args[])
	{
		System.out.println("Data Analysis");
		
		try
		{
			Table test_data=Table.read().csv("C:\\Users\\User\\eclipse-workspace\\org.ml\\src\\main\\java\\org\\ml\\meal_info.csv");
			System.out.println(test_data.shape());
			System.out.println(test_data.first(5));
			System.out.println(test_data.last(10));
			
			System.out.println(test_data.structure());
			System.out.println(test_data.summary());
			

		    Layout layout1=Layout.builder().title("Distribution of meal_id").build();
			HistogramTrace trace1=HistogramTrace.builder(test_data.nCol("meal_id")).build();
			Plot.show(new Figure(layout1,trace1));
			
			/*Layout layout2=Layout.builder().title("Distributio of category").build();
			HistogramTrace trace2=HistogramTrace.builder(test_data.nCol("category")).build();
			Plot.show(new Figure(layout2,trace2));*/
			
			Layout layout2=Layout.builder().title("Distribution of category").build();
			BoxTrace trace2=BoxTrace.builder(test_data.categoricalColumn("category"),test_data.nCol("category")).build();
			Plot.show(new Figure(layout2,trace2));
			
		
			Layout layout3=Layout.builder().title("Distributio of cuisine").build();
			BoxTrace trace3=BoxTrace.builder(test_data.categoricalColumn("cuisine"),test_data.nCol("cuisine")).build();
			Plot.show(new Figure(layout3,trace3));
			
			/*Layout layout8=Layout.builder().title("Distributio of cusine").build();
			HistogramTrace trace8=HistogramTrace.builder(test_data.nCol("cusine")).build();
			Plot.show(new Figure(layout8,trace8));*/
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
	}	
}
