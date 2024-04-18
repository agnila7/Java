package com.ifStatement.examples;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puzzle3();
	}
	private static void puzzle1() {
		int number = 2;
		switch(number) {
		case 1: 
			System.out.println(1);
		case 2: 
			System.out.println(2);
		default:
			System.out.println("default");
		}
	}
	
	private static void puzzle2() {
		int number = 2;
		switch(number) {
		case 1: 
			System.out.println(1);
			break;
		case 2: //does fall through code, start executing next case
		case 3: 
			System.out.println("2 or 3");
			break;
		default:
			System.out.println("default");
		}
	}
	
	private static void puzzle3() {
		int number = 10;
		switch(number) {
		default:
			System.out.println("default");
			break;
		case 1: 
			System.out.println(1);
			break;
		case 2: 
			System.out.println(2);
			break;
		}
	}
	
	private static void puzzle4() {
		long number = 10;
//		switch(number) { // compilation error as int, string, char, byte, short, enams only
//		// boolean, long, float will give compilation error
//		}
	}
		
	private static void puzzle5() {
		int number = 10;
//		switch(number) { //inside case cant have conditions like this only equal
//		case number>5 :System.out.println("number>5");
//		}
	}
}
