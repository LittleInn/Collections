package com.general;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunApp {
	public static void main(String[] args) throws InterruptedException,
			ExecutionException, IOException {
		System.out.println("Application started");
		BenchMark benchMark = new BenchMark();

		ExecutorService executors = Executors.newCachedThreadPool();

		benchMark.processCollectionTasks(executors);
		benchMark.processMapTasks(executors);

		executors.shutdown();
		System.out.println("Application finished");
	}
}
