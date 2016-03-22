package com.general;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.collection.Statistics;

public abstract class GeneralActions {
	private Map<Integer, Integer> predefinedMap = new HashMap<Integer, Integer>();
	private Set<Integer> predefinedCollection = new HashSet<Integer>();

	public GeneralActions() {
	}

	public Statistics getStatistic(long start, String type, String operation) {
		long end = System.nanoTime();
		long time = end - start;
		Statistics statistics = new Statistics(time, type, operation);
		return statistics;
	}

	public void initMap() {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_PREDEFINED; i++) {
			predefinedMap.put(i, i);
		}
	}

	public void initCollection() {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_PREDEFINED; i++) {
			predefinedCollection.add(i);
		}
	}

	public Collection<Integer> addElementsToCollection(
			Collection<Integer> collection) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.add(i);
		}
		return collection;
	}

	public void addAllElementsToCollection(Collection<Integer> collection) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.addAll(getPredefinedCollection());
		}
	}

	public void containsCollectionLoop(Collection<Integer> collection) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.contains(OperationConstants.GET_VALUE);
		}
	}

	public void containsAllCollectionLoop(Collection<Integer> collection) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.containsAll(getPredefinedCollection());
		}
	}

	public void removeCollectionLoop(Collection<Integer> collection) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.remove(OperationConstants.GET_VALUE);
		}
	}

	public void removeAllCollectionLoop(Collection<Integer> collection) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.removeAll(getPredefinedCollection());
		}
	}

	public void clearCollectionLoop(Collection<Integer> collection) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.clear();
		}
	}

	public void iteratorCollection(Collection<Integer> collection) {
		Iterator<Integer> iterator = collection.iterator();
		while (iterator.hasNext()) {
			iterator.next();
		}
	}

	public void getCollectionElement(List<Integer> list) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_SMALL; i++) {
			list.get(OperationConstants.INDEX);
		}
	}

	public void subListCollection(List<Integer> list) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_SMALL; i++) {
			list.subList(0, i);
		}
	}

	public void lastIndexCollection(List<Integer> list) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_SMALL; i++) {
			list.lastIndexOf(OperationConstants.INDEX);
		}
	}

	public void insertElementCollection(List<Integer> list) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_SMALL; i++) {
			list.set(OperationConstants.INDEX, i);
		}
	}

	public void putElements(Map<Integer, Integer> map) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.put(i, i);
		}
	}

	public void putAllElements(Map<Integer, Integer> map) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_SMALL; i++) {
			map.putAll(predefinedMap);
		}
	}

	public void containsKeyLoop(Map<Integer, Integer> map) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.containsKey(OperationConstants.GET_VALUE);
		}
	}

	public void containsValuesLoop(Map<Integer, Integer> map) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.containsValue(OperationConstants.GET_VALUE);
		}
	}

	public void getElement(Map<Integer, Integer> map) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_SMALL; i++) {
			map.get(OperationConstants.GET_VALUE);
		}
	}

	public void clearLoop(Map<Integer, Integer> map) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.clear();
		}
	}

	public void removeLoop(Map<Integer, Integer> map) {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			map.remove(OperationConstants.GET_VALUE);
		}
	}

	public Set<Integer> getPredefinedCollection() {
		return predefinedCollection;
	}

	public void setPredefinedCollection(Set<Integer> predefinedCollection) {
		this.predefinedCollection = predefinedCollection;
	}
}
