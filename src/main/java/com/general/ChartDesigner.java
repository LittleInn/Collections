package com.general;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import com.collection.Statistics;

public class ChartDesigner {
	private List<Statistics> statistics;

	public ChartDesigner(List<Statistics> statistics) {
		super();
		this.statistics = statistics;
	}

	public List<Statistics> getStatistics() {
		return statistics;
	}

	public void setStatistics(List<Statistics> statistics) {
		this.statistics = statistics;
	}

	public void setChartvalues(String chartName, String fileName, String xName,
			String yName) throws IOException {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for (Statistics element : statistics) {
			String collectionsType = element.getType();
			dataset.addValue(element.getTime(), collectionsType,
					element.getAction());

		}
		JFreeChart chart = ChartFactory.createBarChart3D(chartName, xName,
				yName, dataset, PlotOrientation.HORIZONTAL, true, true, true);
		ChartUtilities.saveChartAsPNG(new File(fileName), chart, 2000, 1000);

	}

}
