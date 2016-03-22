package com.map.test;

import com.coll.test.Statistics;

public interface MapGeneralActions<T> {
	 Statistics put(T map);
	 Statistics putAll(T map);
	 Statistics containsKey(T map);
	 Statistics containsValue(T map);
	 Statistics remove(T map);
	 Statistics clear(T map);
	 Statistics get(T map);
}
