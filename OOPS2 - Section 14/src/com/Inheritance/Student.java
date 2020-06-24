package com.Inheritance;

public class Student extends Person {
	public Student(String name, int phone, String email, String college, int year) {
		super(name, phone, email);
		this.college = college;
		this.year = year;
	}
	private String college;
	private int year;
	
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
