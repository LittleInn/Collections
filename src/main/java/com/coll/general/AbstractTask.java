package com.coll.general;

import java.util.List;
import java.util.concurrent.Callable;

import com.coll.test.Statistics;

public abstract class AbstractTask<T> implements Callable<List<Statistics>> {
	public List<Statistics> call() throws Exception {
		return execute();
	}

	public abstract List<Statistics> execute();

	public abstract List<Statistics> executeTask(T collection);
}
