package com.coll.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

import org.apache.commons.collections.list.NodeCachingLinkedList;
import org.apache.commons.collections.list.TreeList;

import com.map.test.MapTypes;

public enum CollectionTypes {
	
	ARRAY_LIST("java.util.ArrayList", "List", new ArrayList<Integer>()), 
	LINKED_LIST("java.util.LinkedList", "List",new LinkedList<Integer>()), 
	//COPY_ON_WRITE_ARRAY_LIST("java.util.LinkedList", new CopyOnWriteArrayList<Integer>()), 
	TREE_LIST("java.util.LinkedList","List", new TreeList()), 
	NODE_CACHING_LINKED_LIST ("java.util.LinkedList", "List",new NodeCachingLinkedList ()), 
	VECTOR("java.util.LinkedList","List", new Vector<Integer>()),
	
	HASH_SET("java.util.HashSet", "Set",new HashSet<Integer>()), 
	TREE_SET("java.util.TreeSet","Set", new TreeSet<Integer>()), 
	LINKED_HASH_SET("java.util.LinkedHashSet", "Set",new LinkedHashSet<Integer>()),
	;
	public MapTypes mapTypes;
	String className;
	String type;
	Collection<Integer> collection;

	private CollectionTypes(String className, String type, Collection<Integer> collection) {
		this.className = className;
		this.type=type;
		this.collection = collection;
	}

	public String getClassName() {
		return className;
	}

	public Collection<Integer> getCollection() {
		return collection;
	}

	public String getType() {
		return type;
	}

	public MapTypes getMapTypes() {
		return mapTypes;
	}

	public void setMapTypes(MapTypes mapTypes) {
		this.mapTypes = mapTypes;
	}
	

}
