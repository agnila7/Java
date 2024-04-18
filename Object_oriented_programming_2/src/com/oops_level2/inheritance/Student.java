package com.oops_level2.inheritance;

public class Student extends Person{// subclass extends the Person super class. it extends all the fetures of the superclass.

	private String college;
	private int year;
	
	public Student(String name) {
		super(name);
	}
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
