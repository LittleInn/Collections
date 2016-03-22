package com.coll.general;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.coll.test.ChartDesigner;
import com.coll.test.OperationConstants;
import com.coll.test.Statistics;
import com.map.test.MapActions;
import com.map.test.MapTask;
import com.map.test.MapTypes;

public class TestBenchMark {
	public static void main(String[] args) throws IOException {
		List<Future<List<Statistics>>> submit = new ArrayList<Future<List<Statistics>>>();
		ExecutorService executors = Executors.newCachedThreadPool();
		
//		for (CollectionTypes type : CollectionTypes.values()) {
//			if (type.getType().equals("List")) {
//				ListTask listTest = new ListTask(type, new ListOperations(type));
//				submit.add(executors.submit(listTest));
//			}
//			if (type.getType().equals("Set")) {
//				SetTask setTest = new SetTask(type, new SetOperations(type));
//				submit.add(executors.submit(setTest));
//			}
//		}
		
		for (MapTypes type: MapTypes.values()){
			MapTask task = new MapTask(type, new MapActions(type));
			submit.add(executors.submit(task));
			
		}
		try {
			List<Statistics> list = new ArrayList<Statistics>();
			for (Future<List<Statistics>> elements : submit) {
					list.addAll(elements.get());
			}
			ChartDesigner chart = new ChartDesigner(list);
			chart.setChartvalues(OperationConstants.ADD_TITLE,
					OperationConstants.FILE_NAME,
					OperationConstants.COLLECTION_TITLE,
					OperationConstants.TIME_TITLE);
			System.out.println("END");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		executors.shutdown();
		
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	}
}
