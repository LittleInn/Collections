package com.map.test;

import java.util.HashMap;
import java.util.Map;

import com.coll.general.GeneralActions;
import com.coll.test.OperationConstants;
import com.coll.test.Statistics;

public class MapActions extends GeneralActions implements MapGeneralActions<Map<Integer, Integer>>{
	private Map<Integer, Integer> predefinedMap = new HashMap<Integer, Integer>();
	
	private MapTypes mapTypes;
	
	
	public MapActions(MapTypes mapTypes) {
		super();
		this.mapTypes = mapTypes;
		init();
	}

	public Statistics put(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.put(i, i);
		}
		System.out.println(OperationConstants.PUT+" "+getMapTypes().getClassName());
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.PUT);
	}

	public Statistics putAll(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.putAll(predefinedMap);
		}
		System.out.println(OperationConstants.PUT_ALL+" "+getMapTypes().getClassName());
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.PUT_ALL);
	}

	public Statistics containsKey(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.containsKey(OperationConstants.GET_VALUE);
		}
		System.out.println(OperationConstants.CONTAINS_KEY+" "+getMapTypes().getClassName());
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.CONTAINS_KEY);
	}

	public Statistics containsValue(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.containsValue(OperationConstants.GET_VALUE);
		}
		System.out.println(OperationConstants.CONTAINS_VALUE+" "+getMapTypes().getClassName());
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.CONTAINS_VALUE);
	}

	public Statistics remove(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.remove(OperationConstants.GET_VALUE);
		}
		System.out.println(OperationConstants.REMOVE+" "+getMapTypes().getClassName());
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.REMOVE);
	}

	public Statistics clear(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.clear();
		}
		System.out.println(OperationConstants.CLEAR+" "+getMapTypes().getClassName());
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.CLEAR);
	}

	public Statistics get(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.get(OperationConstants.GET_VALUE);
		}
		System.out.println(OperationConstants.GET+" "+getMapTypes().getClassName());
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.GET);
	}

	public MapTypes getMapTypes() {
		return mapTypes;
	}

	public void setMapTypes(MapTypes mapTypes) {
		this.mapTypes = mapTypes;
	}

	private void init() {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_PREDEFINED; i++) {
			predefinedMap.put(i, i);
		}
	}
}
