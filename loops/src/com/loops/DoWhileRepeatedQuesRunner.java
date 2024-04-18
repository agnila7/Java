package com.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int number1 = 0;
//		performCubeNumber(number1);
		
		// we are asking the enter nmb ques ateast once rvrn for -1. thats why we are using do while
//		do {
//			System.out.print("Enter a number: ");
//			number1 = scanner.nextInt();
//			System.out.println("Cube is: " + (number1* number1* number1));
//		}while(number1 >= 0);
		
		do {
			if(number1 > 0) {// this is done for not printing cube for negative number
				System.out.println("Cube is: " + (number1* number1* number1));
			}
			System.out.print("Enter a number: ");
			number1 = scanner.nextInt();
		
		}while(number1 >= 0);
		
		
	}

//	private static void performCubeNumber(int number1) {
//		// TODO Auto-generated method stub
//		do {
//			System.out.println(number1* number1* number1);
//		}while(number1 < 0);
//			}
//	}
	
	
	

}
