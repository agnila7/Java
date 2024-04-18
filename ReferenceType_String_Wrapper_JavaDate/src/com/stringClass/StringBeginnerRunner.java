package com.stringClass;

public class StringBeginnerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "This is a lot of text";
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5,12));
		
		System.out.println(str1.charAt(5));
		
		System.out.println(str1.indexOf("lot")); // index of the string, the 1st letter
		System.out.println(str1.indexOf('i'));
		System.out.println(str1.lastIndexOf('i')); // be sure of the camel casing of the method. as it's built in . write exactly as it is
		
		System.out.println(str1.contains("text"));
		System.out.println(str1.startsWith("This"));
		System.out.println(str1.endsWith("This")); //false
		
		System.out.println(str1.isEmpty()); //false
		System.out.println("".isEmpty()); //true
		
		System.out.println("value".equals("value")); //true		
		System.out.println(str1.equals("This is a lot of text")); //true	
		System.out.println(str1.equalsIgnoreCase("THIS iS a lot of text")); //true	
		
		
		for(int i=0;i<str1.length(); i++ ) { //i<=str1.length() will result in error as length starts with 1.
			System.out.println(str1.charAt(i));
		}
	}

}
