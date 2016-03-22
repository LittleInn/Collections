package com.collection;

import java.util.List;

import com.general.OperationConstants;

public class ListActions extends CollectionActions {
	public ListActions(CollectionTypes type) {
		super(type);
	}

	public Statistics get(List<Integer> list) {
		long start = System.nanoTime();
		getCollectionElement(list);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.GET);
	}

	public Statistics subList(List<Integer> list) {
		long start = System.nanoTime();
		subListCollection(list);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.SUB_LIST);
	}

	public Statistics lastIndex(List<Integer> list) {
		long start = System.nanoTime();
		lastIndexCollection(list);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.LAST_INDEX);
	}

	public Statistics insert(List<Integer> list) {
		long start = System.nanoTime();
		insertElementCollection(list);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.INSERT);
	}

}
