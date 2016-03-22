package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.collections.map.ListOrderedMap;

public enum MapTypes {
	HASH_MAP("java.util.HashMap", new HashMap<Integer, Integer>()),
	LINKED_HASH_MAP("java.util.LinkedHashMap", new LinkedHashMap<Integer, Integer>()),
	TREE_MAP("java.util.TreeMap", new TreeMap<Integer, Integer>()),
	@SuppressWarnings("unchecked")
	LIST_ORDERED_MAP("org.apache.commons.collections.map.ListOrderedMap", new ListOrderedMap()),
	@SuppressWarnings("unchecked")
	LINKED__MAP("org.apache.commons.collections.map.LinkedMap", new LinkedMap());
	
	String className;
	String type;
	Map<Integer, Integer> map;

	private MapTypes(String className, Map<Integer, Integer> map) {
		this.className = className;
		this.map = map;
	}

	public String getClassName() {
		return className;
	}

	public Map<Integer, Integer> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Integer> map) {
		this.map = map;
	}
}
