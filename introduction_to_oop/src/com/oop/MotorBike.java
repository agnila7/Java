package com.oop;

public class MotorBike {
	//state: current state of the object. it can change. like speed now 30. later 70.
	//this state is represented by variables. member variables
	private int speed; //member variable and specific to an object
		
	MotorBike(){//this for default constructor
		this(5); //this how we call other constructors
	}
	MotorBike(int speed){
		this.speed = speed;
	}
	
	//behavior
	// method : i/p= int speed; this speed is local variable of this specific method, o/p= void, name= setSpeed

	
	/*
	void setSpeed(int speed) {//here speed this argument is a local variable in this method

//		System.out.println(speed); // this speed is coming from the argument 
//		System.out.println(this.speed); // here speed is coming from that member variable memory
		
		this.speed = speed; // we want to set the object speed in the member variable location.
	}	
	
	int getSpeed(){
		return this.speed;
	}
	
	*/
	
//	getter and setter can be found in ide by right click> source> generate getter and setter
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
//		System.out.println(speed);
//		System.out.println(this.speed);
		if(speed > 0) //preventing bad codes/adding validation as speed cant be -100
			this.speed = speed;

	}
	
	public void increaseSpeed(int howMuch) {
		//this.speed += howMuch;
		setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeed(int howMuch) {
//		if(this.speed - howMuch > 0) //validation repeated
//		this.speed -= howMuch;
		setSpeed(this.speed - howMuch);
		
	}

	void start() {
		System.out.println("Bike Started");
	}
	
	
	void stop() {}

}
