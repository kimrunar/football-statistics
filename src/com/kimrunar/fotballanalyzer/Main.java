package com.kimrunar.fotballanalyzer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import org.jfree.data.xy.IntervalXYDataset;



public class Main {

	private static final String TESTFILE = "sample.txt";
	private static final String REALFILE = "test.txt";
	public static void main(String[] args) throws IOException {
		ArrayList<String[]> matches = new ArrayList<String[]>();
		
		
		System.out.println("Initializing..This can take a while.....");
		Datastorage d = new Datastorage(TESTFILE);
		
		d.readLargerTextFile();
		
		matches = d.getEvent();
		EventMaker eventmaker = new EventMaker(matches);
		
		System.out.println("Initializing done... Starting computing... ");
		
	
		Statistics stat = eventmaker.GetStatistics();
		
		int[] goals = stat.getGoals();
		
		d.write(goals);
		
	}
}


