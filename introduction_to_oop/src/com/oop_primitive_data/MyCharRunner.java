package com.oop_primitive_data;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyChar mychar = new MyChar('C');
		System.out.println(mychar.isVowel());
		//a,e,i,o,u and capital of these
		System.out.println(mychar.isConsonent());

		System.out.println(mychar.isDigit());
		System.out.println(mychar.isAlphabet());
		
		// static method. doesnt worry about argument, just print all of te+hem.
		// not using any object. we are using only the class but not using any value
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
