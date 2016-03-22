package com.collection;

import java.util.Collection;

import com.general.GeneralActions;
import com.general.OperationConstants;

public abstract class CollectionActions extends GeneralActions implements
		CollectionGeneralActions<Collection<Integer>> {

	private CollectionTypes type;

	public CollectionActions(CollectionTypes type) {
		this.type = type;
		initCollection();
	}

	public Statistics add(Collection<Integer> collection) {
		long start = System.nanoTime();
		addElementsToCollection(collection);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.ADD);
	}

	public Statistics addAll(Collection<Integer> collection) {
		long start = System.nanoTime();
		addAllElementsToCollection(collection);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.ADD_ALL);
	}

	public Statistics contains(Collection<Integer> collection) {
		long start = System.nanoTime();
		containsCollectionLoop(collection);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.CONTAINS);
	}

	public Statistics containsAll(Collection<Integer> collection) {
		long start = System.nanoTime();
		containsAllCollectionLoop(collection);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.CONTAINS_ALL);
	}

	public Statistics remove(Collection<Integer> collection) {
		long start = System.nanoTime();
		removeCollectionLoop(collection);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.REMOVE);
	}

	public Statistics removeAll(Collection<Integer> collection) {
		long start = System.nanoTime();
		removeAllCollectionLoop(collection);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.REMOVE_ALL);
	}

	public Statistics clear(Collection<Integer> collection) {
		long start = System.nanoTime();
		clearCollectionLoop(collection);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.CLEAR);
	}

	public Statistics iterator(Collection<Integer> collection) {
		Collection<Integer> collectionIterable = addElementsToCollection(collection);
		long start = System.nanoTime();
		iteratorCollection(collectionIterable);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.ITERATOR);
	}

	public CollectionTypes getType() {
		return type;
	}

	public void setType(CollectionTypes type) {
		this.type = type;
	}

}
