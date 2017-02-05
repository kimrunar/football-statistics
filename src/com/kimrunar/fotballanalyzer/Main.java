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
	private static final String REALFILE = "C:/Users/kimhe/Desktop/Datasets/Football/test.txt";
	private static final String SPLIT_PATTERN = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
	public static void main(String[] args) throws IOException {
		ArrayList<String[]> matches = new ArrayList<String[]>();
		System.out.println("Collecting data from file....");
		Datastorage d = new Datastorage(REALFILE);
		d.readCVS(SPLIT_PATTERN);
		
		matches = d.getEvent();
		EventMaker eventmaker = new EventMaker(matches);
		
		System.out.println("Initializing done... Starting computing... ");
		
		Statistics stat = eventmaker.GetStatistics();
		
		//int[] goals = stat.getGoals();
		int[] redcards = stat.getRedCards();
		d.writeToFile(redcards, "{y : ", "},", "redCards.txt" );
		
	}
}


