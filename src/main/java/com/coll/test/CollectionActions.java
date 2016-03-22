package com.coll.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.coll.general.GeneralActions;

public abstract class CollectionActions extends GeneralActions implements
		CollectionGeneralActions<Collection<Integer>> {
	private Set<Integer> predefinedCollection = new HashSet<Integer>();
	private CollectionTypes type;

	public CollectionActions(CollectionTypes type) {
		this.type = type;
		init();
	}

	public Statistics add(Collection<Integer> collection) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.add(i);
		}
		System.out.println(OperationConstants.ADD);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.ADD);
	}

	public Statistics addAll(Collection<Integer> collection) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.addAll(getPredefinedCollection());
		}
		System.out.println(OperationConstants.ADD_ALL);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.ADD_ALL);
	}

	public Statistics contains(Collection<Integer> collection) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.contains(OperationConstants.GET_VALUE);
		}
		System.out.println(OperationConstants.CONTAINS);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.CONTAINS);
	}

	public Statistics containsAll(Collection<Integer> collection) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.containsAll(getPredefinedCollection());
		}
		System.out.println(OperationConstants.CONTAINS_ALL);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.CONTAINS_ALL);
	}

	public Statistics remove(Collection<Integer> collection) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.remove(OperationConstants.GET_VALUE);
		}
		System.out.println(OperationConstants.REMOVE);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.REMOVE);
	}

	public Statistics removeAll(Collection<Integer> collection) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.removeAll(getPredefinedCollection());
		}
		System.out.println(OperationConstants.REMOVE_ALL);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.REMOVE_ALL);
	}

	public Statistics clear(Collection<Integer> collection) {
		long start = System.nanoTime();
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE; i++) {
			collection.clear();
		}
		System.out.println(OperationConstants.CLEAR);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.CLEAR);
	}

	public Statistics iterator(Collection<Integer> collection) {
		long start = System.nanoTime();
		Iterator<Integer> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(OperationConstants.ITERATOR);
		return getStatistic(start, getType().getClassName(),
				OperationConstants.ITERATOR);
	}

	private void init() {
		for (int i = 0; i < OperationConstants.COLLECTION_SIZE_PREDEFINED; i++) {
			predefinedCollection.add(i);
		}
	}

	public Set<Integer> getPredefinedCollection() {
		return predefinedCollection;
	}

	public void setPredefinedCollection(Set<Integer> predefinedCollection) {
		this.predefinedCollection = predefinedCollection;
	}

	public CollectionTypes getType() {
		return type;
	}

	public void setType(CollectionTypes type) {
		this.type = type;
	}

}
