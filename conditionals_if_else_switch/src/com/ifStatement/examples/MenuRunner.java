package com.ifStatement.examples;

import java.util.Scanner; //as Scanner is an inbuilt java class

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Type obj = new Type(argument)  same like creating an object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1:");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter Number2: ");
		int number2 = scanner.nextInt();
		
		System.out.println("Choices are availableare \n 1 - Add \n 2 - Subtract \n 3 - Divide \n 4 - Multiply \n Choose Operation:");
		int order = scanner.nextInt();
		System.out.println("Your choices are:  ");
		System.out.println("Number1 : " + number1 + "\n" +  "Number2 : " + number2 + "\n" + "Choice : " + order + "\n");
		
		performOperationUsingNestedIfelse(number1, number2, order);
		performOperationUsingSwitch(number1, number2, order);
				
	}

	private static void performOperationUsingNestedIfelse
	(int number1, int number2, int order) {
		if (order == 1) {
			System.out.println("Result: " + (number1 + number2));
		}else if (order == 2) {
			System.out.println("Result: " + (number1 - number2));
		}else if (order == 3) {
			System.out.println("Result: " + (number1 / number2));
		} else if (order == 4) {
			System.out.println("Result: " + (number1 * number2));
		}
	}

	private static void performOperationUsingSwitch
	(int number1, int number2, int order) {
		switch(order) {
		case 1: 
			System.out.println("Result: " + (number1 + number2));
			break;
		case 2: 
			System.out.println("Result: " + (number1 - number2));
			break;
		case 3: 
			System.out.println("Result: " + (number1 / number2));
			break;
		case 4: 
			System.out.println("Result: " + (number1 * number2));
			break;
		default: 
			System.out.println("Invalid Operation");
		}
	}
	
}
