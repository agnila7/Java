package com.exception_handling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			method1(); // copied the code and extract the code by refactor.// as it says which line caused the exception: at exception_handling/com.exception_handling.ExceptionHandlingRunner.main(ExceptionHandlingRunner.java:8)
			System.out.println("main method");
	}

	private static void method1() {
		try {// this try block will contain the code which throws the exception
//			String str= null;
//			str.length(); // after running the prog, we see stack Trace.
			
			int[] i = {1,2};
			int number = i[3];
			
			System.out.println("method1 ended");
		// here no sysout is executed  as main> method1 but method1 throws error hence method1< main. it will throw it out as they could not handle it	
		}
		catch(NullPointerException ex) {
			System.out.println("Matched NullPointer Exception");
			ex.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched Array Index Out Of Bounds Exception");
			ex.printStackTrace();
		}
//		catch(Exception ex) {
//			ex.printStackTrace();// trying to print and catch entire block when exception happens. so one can stack Trace and debug the problem of the method. it wont throw it to other methods. hidden from other methods.
//				} //Press the keyboard shortcut Ctrl + Shift + T (Cmd + Shift + T on macOS) to open the "Open Type" dialog.
		
		
//know: 1. when exception happens, 2. if it is not handled, the code after that wont execute
//3. also in calling method, the method after that wont executed if not handled. 
//exception goes up. if not resolved in the calling methods. the main method has final authority. if it cant handle it. it will throw it out
// stack race is useful to find out
	
//	try and catch is use full for stopping throwing exception. it will still run the code of ther methods that is good.// exception is a class in java 
//	 there is a hirearchy in the exception. Exception> Runtime> NullPointer /ArrayIndexOutOfBounds. if Null pointer exception is called for array bound exception. it wont be handled
	}

}
