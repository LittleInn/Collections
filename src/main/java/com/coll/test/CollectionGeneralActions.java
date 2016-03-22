package com.coll.test;


public interface CollectionGeneralActions<T> {
	 Statistics add(T collection);
	 Statistics addAll(T collection);
	 Statistics contains(T collection);
	 Statistics containsAll(T collection);
	 Statistics remove(T collection);
	 Statistics removeAll(T collection);
	 Statistics clear(T collection);
	 Statistics iterator(T collection);
	
}
