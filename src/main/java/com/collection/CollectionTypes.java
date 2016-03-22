package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

import org.apache.commons.collections.list.NodeCachingLinkedList;
import org.apache.commons.collections.list.TreeList;
import org.apache.commons.collections.set.ListOrderedSet;

import com.general.OperationConstants;
import com.map.MapTypes;

public enum CollectionTypes {
	
	ARRAY_LIST("java.util.ArrayList", OperationConstants.LIST, new ArrayList<Integer>()), 
	LINKED_LIST("java.util.LinkedList", OperationConstants.LIST,new LinkedList<Integer>()), 
	COPY_ON_WRITE_ARRAY_LIST("java.util.concurrent.CopyOnWriteArrayList",OperationConstants.LIST, new CopyOnWriteArrayList<Integer>()), 
	TREE_LIST("org.apache.commons.collections.list.TreeList",OperationConstants.LIST, new TreeList()), 
	NODE_CACHING_LINKED_LIST ("org.apache.commons.collections.list.NodeCachingLinkedList", OperationConstants.LIST,new NodeCachingLinkedList ()), 
	VECTOR("java.util.Vector",OperationConstants.LIST, new Vector<Integer>()),
	
	HASH_SET("java.util.HashSet", OperationConstants.SET,new HashSet<Integer>()), 
	TREE_SET("java.util.TreeSet",OperationConstants.SET, new TreeSet<Integer>()), 
	LINKED_HASH_SET("java.util.LinkedHashSet", OperationConstants.SET,new LinkedHashSet<Integer>()),
	COPY_ON_WRITE_SET("java.util.concurrent.CopyOnWriteArraySet", OperationConstants.SET,new CopyOnWriteArraySet<Integer>()),
	LIST_ORDERED_SET("org.apache.commons.collections.set.ListOrderedSet", OperationConstants.SET,new ListOrderedSet());
	
	MapTypes mapTypes;
	String className;
	String type;
	Collection<Integer> collection;

	private CollectionTypes(String className, String type,
			Collection<Integer> collection) {
		this.className = className;
		this.type = type;
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
