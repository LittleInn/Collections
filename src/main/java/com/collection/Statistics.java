package com.collection;

public class Statistics {
	private long time;
	private String type;
	private String action;

	public Statistics(long time, String type, String action) {
		super();
		this.time = time;
		this.type = type;
		this.action = action;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
