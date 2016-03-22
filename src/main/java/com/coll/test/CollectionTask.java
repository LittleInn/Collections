package com.coll.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.coll.general.AbstractTask;

public abstract class CollectionTask extends AbstractTask<Collection<Integer>> {
	private CollectionTypes collection;
	private CollectionActions actions;

	public CollectionTypes getCollection() {
		return collection;
	}

	public void setCollection(CollectionTypes collection) {
		this.collection = collection;
	}

	public CollectionTask(CollectionTypes collection,
			CollectionActions actions) {
		super();
		this.collection = collection;
		this.actions = actions;
	}

	public CollectionActions getActions() {
		return actions;
	}

	public void setActions(CollectionActions actions) {
		this.actions = actions;
	}

	public List<Statistics> executeTask(Collection<Integer> collection) {
		Statistics contains = getActions().contains(collection);
		Statistics containsAll = getActions().containsAll(collection);
		Statistics remove = getActions().remove(collection);
		Statistics removeAll = getActions().removeAll(collection);

		List<Statistics> statistics = new ArrayList<Statistics>();

		statistics.add(contains);
		statistics.add(containsAll);
		statistics.add(remove);
		statistics.add(removeAll);
		return statistics;
	}

}
