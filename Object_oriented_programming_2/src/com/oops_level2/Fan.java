package com.oops_level2;

public class Fan {
	//state of the object
	private String make;
	private double radius;
	private String color;
	
	private boolean isOn;
	private byte speed;
	
	//creation; wht are the thing need definiately to create it
	
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color; 
	}
	
	
//	behavior: no chance to modify color, make, radius of the fan. 
//	isOn and speed are the two things that can expose behavior
	
//	public void isOn(boolean isOn) { // this is the generic isOn method
//		this.isOn =isOn;
//	}
	
//	this is the consumer behavior type methods should be written
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)5);
	}
	
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0);
	}
	
//	speed
	
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	//print the current state(values no the class name) instead of the classname, hashcode of the object
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn, speed);
		//instead of appending, we are using format method .
		//we are actually returning a String representation of the entire obj
	
	
	}
	

}
