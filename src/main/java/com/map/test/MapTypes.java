package com.map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public enum MapTypes {
	HASH_MAP("Map hash", new HashMap<Integer, Integer>()),
	LINKED_HASH_MAP("Map link", new LinkedHashMap<Integer, Integer>()),
	TREE_MAP("Map tree", new TreeMap<Integer, Integer>())
	;
	
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
