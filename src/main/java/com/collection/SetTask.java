package com.collection;

import java.util.List;
import java.util.Set;

public class SetTask extends CollectionTask {
	public SetTask(CollectionTypes collection, CollectionActions action) {
		super(collection, action);
	}

	@Override
	public List<Statistics> execute() {
		getActions().setType(getCollection());
		Set<Integer> set = (Set<Integer>) getCollection().getCollection();
		Statistics add = getActions().add(set);
		List<Statistics> statistics = executeTask(set);
		Statistics addAll = getActions().addAll(set);
		statistics.add(add);
		statistics.add(addAll);
		return statistics;

	}

}
