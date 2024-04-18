package com.oop;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(50);
		MotorBike kia = new MotorBike(); //if i provide a constructor, it will not provide any default no argument  constructor
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(kia.getSpeed());
		
		ducati.start();
		honda.start();
		
		//for state , i can set value here.
//		ducati.speed = 180;
//		honda.speed = 80;
//		
//		instead of directly setting the value, we do in this wy.
//		why encapsulation as it is more complex?
		
		ducati.setSpeed(100);
		ducati.increaseSpeed(10);
		ducati.decreaseSpeed(5);
			
//		
//		//increase the speed to 100 but complex , so create a motorbike method for increasing speed
//		int ducatiSpeed = ducati.getSpeed();//get ducati speed
//		ducatiSpeed = ducatiSpeed + 100; //increase the speed to 100
//		ducati.setSpeed(ducatiSpeed);//set it to ducati
		System.out.println(ducati.getSpeed());

		honda.setSpeed(50);
		honda.increaseSpeed(10);
		honda.decreaseSpeed(30);
		System.out.println(honda.getSpeed());		
	}

}
