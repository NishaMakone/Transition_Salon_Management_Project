package com.java.entity;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	
	public MyDate() {
		super();
	}


	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	@Override
	public String toString() {
		return "[" + day + " / " + month + " / " + year + "]";
	}
	
	
}
