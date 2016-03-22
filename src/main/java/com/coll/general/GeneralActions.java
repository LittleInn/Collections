package com.coll.general;

import com.coll.test.Statistics;


public abstract class GeneralActions {
	public GeneralActions() {
	}

	public Statistics getStatistic(long start, String type, String operation) {
		long end = System.nanoTime();
		long time = end - start;
		Statistics statistics = new Statistics(time, type, operation);
		return statistics;
	}

}
