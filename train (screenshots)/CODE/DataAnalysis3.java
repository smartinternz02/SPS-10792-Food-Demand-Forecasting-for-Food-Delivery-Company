package org.ml;
import java.io.IOException;
import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;
public class DataAnalysis3
{
	public static void main(String args[])
	{
		System.out.println("Data Analysis");
		
		try
		{
		    Table train_data=Table.read().csv("C:\\Users\\User\\eclipse-workspace\\org.ml\\src\\main\\java\\org\\ml\\train.csv");
			System.out.println(train_data.shape());
			System.out.println(train_data.first(5));
			System.out.println(train_data.last(10));
			
			System.out.println(train_data.structure());
			System.out.println(train_data.summary());
			
		    Layout layout1=Layout.builder().title("Distributio of id").build();
			HistogramTrace trace1=HistogramTrace.builder(train_data.nCol("id")).build();
			Plot.show(new Figure(layout1,trace1));
			
			Layout layout2=Layout.builder().title("Distributio of week").build();
			HistogramTrace trace2=HistogramTrace.builder(train_data.nCol("week")).build();
			Plot.show(new Figure(layout2,trace2));
			
			Layout layout3=Layout.builder().title("Distributio of center_id").build();
			HistogramTrace trace3=HistogramTrace.builder(train_data.nCol("center_id")).build();
			Plot.show(new Figure(layout3,trace3));
			
			Layout layout4=Layout.builder().title("Distributio of checkout_price").build();
			HistogramTrace trace4=HistogramTrace.builder(train_data.nCol("checkout_price")).build();
			Plot.show(new Figure(layout4,trace4));
			
			Layout layout5=Layout.builder().title("Distributio of base_price").build();
			HistogramTrace trace5=HistogramTrace.builder(train_data.nCol("base_price")).build();
			Plot.show(new Figure(layout5,trace5));
			
			Layout layout6=Layout.builder().title("Distributio of emailer_for_promotion").build();
			HistogramTrace trace6=HistogramTrace.builder(train_data.nCol("email_for_promotion")).build();
			Plot.show(new Figure(layout6,trace6));
			
			Layout layout7=Layout.builder().title("Distributio of meal_id").build();
			HistogramTrace trace7=HistogramTrace.builder(train_data.nCol("meal_id")).build();
			Plot.show(new Figure(layout7,trace7));
						
			Layout layout8=Layout.builder().title("Distributio of homepage_featured").build();
			HistogramTrace trace8=HistogramTrace.builder(train_data.nCol("homepage_featured")).build();
			Plot.show(new Figure(layout8,trace8));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
}
