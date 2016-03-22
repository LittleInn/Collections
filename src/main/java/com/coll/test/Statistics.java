package com.coll.test;

public class Statistics {
	private long time;
	private String type;
	private String operation;

	public Statistics(long time, String type, String operation) {
		super();
		this.time = time;
		this.type = type;
		this.operation = operation;
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

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
}
