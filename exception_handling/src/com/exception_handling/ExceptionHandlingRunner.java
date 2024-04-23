package com.exception_handling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			method1(); // copied the code and extract the code by refactor.//		 as it ays which line caused the exception: at exception_handling/com.exception_handling.ExceptionHandlingRunner.main(ExceptionHandlingRunner.java:8)
			System.out.println("main method");
	}

	private static void method1() {
		String str= null;
		str.length(); // after running the prog, we see stack race.
		System.out.println("method1 ended"); // here no sysout is executed  as main> method1 but method1 throws error hence method1< main. it will throw it out as they could not handle it
		
//know: 1. when exception happenns, 2. if it is not handled, the code after that wont execute
//3. also in calling method, the method after that wont executed if not handled. 
//exception goes up. if not resolved in the calling methods. the main method has final authority. if it cant handle it. it will throw it out

	}

}
