package com.general;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.collection.CollectionTypes;
import com.collection.ListActions;
import com.collection.ListTask;
import com.collection.SetOperations;
import com.collection.SetTask;
import com.collection.Statistics;
import com.map.MapActions;
import com.map.MapTask;
import com.map.MapTypes;

public class BenchMark {
	public void processMapTasks(ExecutorService executors)
			throws InterruptedException, ExecutionException, IOException {
		List<Future<List<Statistics>>> mapTasks = new ArrayList<Future<List<Statistics>>>();
		for (MapTypes type : MapTypes.values()) {
			MapTask task = new MapTask(type, new MapActions(type));
			mapTasks.add(executors.submit(task));
		}
		List<Statistics> mapList = new ArrayList<Statistics>();
		for (Future<List<Statistics>> elements : mapTasks) {
			mapList.addAll(elements.get());
		}
		ChartDesigner chartMap = new ChartDesigner(mapList);
		chartMap.setChartvalues(OperationConstants.MAP_TITLE,
				OperationConstants.FILE_NAME_MAP,
				OperationConstants.ACTION_TITLE, OperationConstants.TIME_TITLE);

	}

	public void processCollectionTasks(ExecutorService executors)
			throws InterruptedException, ExecutionException, IOException {
		List<Future<List<Statistics>>> collectionTasks = new ArrayList<Future<List<Statistics>>>();
		for (CollectionTypes type : CollectionTypes.values()) {
			if (type.getType().equals(OperationConstants.LIST)) {
				ListTask listTest = new ListTask(type, new ListActions(type));
				collectionTasks.add(executors.submit(listTest));
			}
			if (type.getType().equals(OperationConstants.SET)) {
				SetTask setTest = new SetTask(type, new SetOperations(type));
				collectionTasks.add(executors.submit(setTest));
			}
		}
		List<Statistics> collectionsList = new ArrayList<Statistics>();
		for (Future<List<Statistics>> elements : collectionTasks) {
			collectionsList.addAll(elements.get());
		}
		ChartDesigner chartCollections = new ChartDesigner(collectionsList);
		chartCollections.setChartvalues(OperationConstants.COLLECTION_TITLE,
				OperationConstants.FILE_NAME_COLLECTION,
				OperationConstants.ACTION_TITLE, OperationConstants.TIME_TITLE);

	}
}
