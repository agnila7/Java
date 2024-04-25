package com.exception_handling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		
		try {
		scanner = new Scanner(System.in);// scanning info from user
		
		int[] numbers= {12,3,4,5};
		int number = numbers[5];
		
		System.out.println("Before Scanner close"); // in this error scanner remains open , does not close. doing this repeatedly will cause memory leakage for 10ks lines of codes while scanner is not closed
//		making sure that scanner is closed, this exception is handled by finally
		
		scanner.close();// if not close, there can be a resource leakage or memory leakage
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("finally is executed to ensure closing of scanner");
			if(scanner!=null) {// this if statement is included to ensure to only call this exception when scanner is not null. or else instead of if, we simply use scanner.close() method			scanner.close();// ensuring scanner is closed
				scanner.close();
			}
		}
		
		System.out.println("Exception is handled");
	}
}
