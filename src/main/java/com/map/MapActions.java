package com.map;

import java.util.Map;

import com.collection.Statistics;
import com.general.GeneralActions;
import com.general.OperationConstants;

public class MapActions extends GeneralActions {

	private MapTypes mapTypes;

	public MapActions(MapTypes mapTypes) {
		super();
		this.mapTypes = mapTypes;
		initMap();
	}

	public Statistics put(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		putElements(map);
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.PUT);
	}

	public Statistics putAll(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		putAllElements(map);
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.PUT_ALL);
	}

	public Statistics containsKey(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		containsKeyLoop(map);
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.CONTAINS_KEY);
	}

	public Statistics containsValue(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		containsValuesLoop(map);
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.CONTAINS_VALUE);
	}

	public Statistics remove(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		removeLoop(map);
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.REMOVE);
	}

	public Statistics clear(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		clearLoop(map);
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.CLEAR);
	}

	public Statistics get(Map<Integer, Integer> map) {
		long start = System.nanoTime();
		getElement(map);
		return getStatistic(start, getMapTypes().getClassName(),
				OperationConstants.GET);
	}

	public MapTypes getMapTypes() {
		return mapTypes;
	}

	public void setMapTypes(MapTypes mapTypes) {
		this.mapTypes = mapTypes;
	}

}
