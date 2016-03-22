package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.collection.Statistics;
import com.general.AbstractTask;

public class MapTask extends AbstractTask<Map<Integer, Integer>> {
	private MapTypes mapTypes;
	private MapActions mapActions;

	@Override
	public List<Statistics> execute() {
		getMapActions().setMapTypes(getMapTypes());
		Map<Integer, Integer> map = getMapTypes().getMap();
		return executeTask(map);
	}

	public MapTask(MapTypes mapTypes, MapActions mapActions) {
		super();
		this.mapTypes = mapTypes;
		this.mapActions = mapActions;
	}

	@Override
	public List<Statistics> executeTask(Map<Integer, Integer> map) {
		List<Statistics> statistics = new ArrayList<Statistics>();

		Statistics put = getMapActions().put(map);
		Statistics containsKey = getMapActions().containsKey(map);
		Statistics containsValue = getMapActions().containsValue(map);
		Statistics get = getMapActions().get(map);
		Statistics remove = getMapActions().remove(map);
		Statistics putAll = getMapActions().putAll(map);
		Statistics clear = getMapActions().clear(map);

		statistics.add(put);
		statistics.add(putAll);
		statistics.add(containsKey);
		statistics.add(containsValue);
		statistics.add(get);
		statistics.add(remove);
		statistics.add(clear);
		return statistics;
	}

	public MapTypes getMapTypes() {
		return mapTypes;
	}

	public void setMapTypes(MapTypes mapTypes) {
		this.mapTypes = mapTypes;
	}

	public MapActions getMapActions() {
		return mapActions;
	}

	public void setMapActions(MapActions mapActions) {
		this.mapActions = mapActions;
	}

}
