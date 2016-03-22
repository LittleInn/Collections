package com.coll.test;

import java.util.List;

public class ListOperations extends CollectionActions {
	public ListOperations(CollectionTypes type) {
		super(type);
	}

	public Statistics get(List<Integer> list) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_SMALL; i++) {
			list.get(OperationConstants.INDEX);
		}
		System.out.println(OperationConstants.GET);
		return getStatistic(start, getType().getClassName(), OperationConstants.GET);
	}

	public Statistics subList(List<Integer> list) {
		long start = System.nanoTime();
		System.out.println("sub list collection: " + list);
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_SMALL; i++) {
			list.subList(0, i);
		}
		System.out.println(OperationConstants.SUB_LIST);
		return getStatistic(start, getType().getClassName(),OperationConstants.SUB_LIST);
	}

	public Statistics lastIndex(List<Integer> list) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_SMALL; i++) {
			list.lastIndexOf(OperationConstants.INDEX);
		}
		System.out.println(OperationConstants.LAST_INDEX);
		return getStatistic(start, getType().getClassName(),OperationConstants.LAST_INDEX);
	}

	public Statistics insert(List<Integer> collection) {
		List<Integer> list = (List<Integer>) collection;
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_SMALL; i++) {
			list.set(OperationConstants.INDEX, i);
		}
		System.out.println(OperationConstants.INSERT);
		return getStatistic(start,getType().getClassName(), OperationConstants.INSERT);
	}

}
