package com.collection;

import java.util.List;

public class ListTask extends CollectionTask {

	public ListTask(CollectionTypes type, CollectionActions action) {
		super(type, action);
	}

	@Override
	public List<Statistics> execute() {
		ListActions action = (ListActions) getActions();
		action.setType(getCollection());

		List<Integer> list = (List<Integer>) getCollection().getCollection();

		Statistics add = action.add(list);
		Statistics subList = action.subList(list);
		Statistics lastIndexOf = action.lastIndex(list);

		List<Statistics> statistics = executeTask(list);
		Statistics addAll = action.addAll(list);
		Statistics get = action.get(list);
		Statistics insert = action.insert(list);

		statistics.add(add);
		statistics.add(addAll);
		statistics.add(lastIndexOf);
		statistics.add(get);
		statistics.add(insert);
		statistics.add(subList);

		return statistics;

	}

}
