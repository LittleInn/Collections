package com.coll.test;

import java.util.List;

public class ListTask extends CollectionTask 
		 {

	public ListTask(CollectionTypes type, CollectionActions operation) {
		super(type, operation);
	}

	@Override
	public List<Statistics> execute() {
		ListOperations operation = (ListOperations)getActions();
		operation.setType(getCollection());
		
		List<Integer> list = (List<Integer>) getCollection().getCollection();
		
		Statistics add = operation.add(list);
		Statistics subList = operation.subList(list);
		Statistics lastIndexOf = operation.lastIndex(list);
		
		List<Statistics> statistics = executeTask(list);
		Statistics addAll = operation.addAll(list);
		//Statistics get = getOperation().get(list);
		//Statistics insert = getOperation().insert(list);
		
		statistics.add(add);
		statistics.add(addAll);
		statistics.add(lastIndexOf);
		//statistics.add(get);
		//statistics.add(insert);
		statistics.add(subList);
		return statistics;

	}

}
