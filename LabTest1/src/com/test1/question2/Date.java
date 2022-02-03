package com.test1.question2;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public Date(Date date) {
		this.day=date.day;
		this.month=date.month;
		this.year=date.year;
	}
	
	public void input() {
		System.out.println("Enter date input");
	}
	
//	public void print() {
//		System.out.println(toString());
//	}

	@Override
	public String toString() {
		return "Date [day: " + day + ", month:" + month + ", year:" + year + "]";
	}
	
}
