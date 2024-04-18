package com.oops_level2;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan= new Fan("Samsung", 0.545, "White");
		
//		fan.isOn(true);
		fan.switchOn(); // useful type API for consumer to read; now isOn is true;
		fan.setSpeed((byte)3); // this is typecasting, making int 5 to byte
//		they are not getter and seeters, they are 
		
		System.out.println(fan);// printing the package name, class and hashcode from memory 
		//but i wanna print the value, so i used toString returning method, which will give string representation of the object 
		fan.switchOff();
		System.out.println(fan);
		
	}

}
