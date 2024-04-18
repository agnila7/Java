package com.oops_level2;

public class Rectangle {

	//state
	private byte length;
	private byte width;
	
	private boolean whatTypeRectangle;

	
	//constructor/creation
	public Rectangle(byte length, byte width){
		this.length =length;
		this.width = width;
	}
	
	//behavior
	public void isSquare() {
		this.whatTypeRectangle = true;

	}
	
	public void isOtherRectangle() {
		this.whatTypeRectangle = false;
	}
	
	//operations: getter, setter for changing/modifying the width and length
	
	public byte getLength() {
		return length;
	}
	
	public void setLength(byte length) {
		// TODO Auto-generated method stub
		this.length = length;
	}
	
	public byte getWidth() {
		return width;
	}
	
	public void setWidth(byte width) {
		// TODO Auto-generated method stub
		this.width = width;
	}
	
	//methods
	public int perimeter() {
		return 2*(this.length + this.width);
	}
	
	public double area() {
		return this.length * this.width;
	}
	
	
	public String toString() {
		return String.format("length - %d, width - %d, isSquare - %b, perimeter - %d, area - %f", length, width, whatTypeRectangle, perimeter(), area());
	}

	
}
