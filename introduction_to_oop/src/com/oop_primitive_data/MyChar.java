package com.oop_primitive_data;

public class MyChar {

	private char ch;
	
	public MyChar(char alphabet) {
		// TODO Auto-generated constructor stub
		this.ch = alphabet;
		System.out.println(this.ch);
	}

	public boolean isVowel(){
		// TODO Auto-generated method stub
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			return true;
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
			return true;
		return false;
	}


	public boolean isDigit() {
		// TODO Auto-generated method stub
		//digit is from 0 to 9; here (int)'0' means 48 and (int)'9' means 50.
		//get the help of jshell to find out the ascii value of the digits
		//ch >= 48 && ch <=57 here c ascii value 99
		if (ch >= 48 && ch <=57)
			return true;
		return false;
	}

	public boolean isAlphabet() {
		// TODO Auto-generated method stub
		//get the help of jshell to find out the ascii value of the alphabet a to z
		// a to z : 97 to 122, A to Z L 65 to 90
		if (ch >= 97 && ch <=122 )
			return true;
		if (ch >= 65 && ch <=90 )
			return true;
		return false;
	}
	
	public boolean isConsonent() {
		// TODO Auto-generated method stub
//		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
//			return false;
//		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
//			return false;
//		if (ch >= 48 && ch <=57)
//			return false;
//		return true;
		
		if(isAlphabet() && !(isVowel()))// conditional with method
			return true;
		return false;
	}

	public static void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub
//			for(int i= 97; i <=122; i++) {
//				char lowerCaseAlphabets = (char)i;
//				System.out.println(lowerCaseAlphabets);
//			}
		for(char ch= 'a'; ch <='z'; ch++) {	
			System.out.println(ch);
		}
		
	}

	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub
//		for(int i= 65; i <=90; i++) {	
//			System.out.println((char)i);
//		}
		
		for(char ch= 'A'; ch <='Z'; ch++) {	
			System.out.println(ch);
		}
	}

	
}
