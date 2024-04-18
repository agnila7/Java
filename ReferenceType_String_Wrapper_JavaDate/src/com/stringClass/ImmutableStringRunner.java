package com.stringClass;

public class ImmutableStringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "in28Minutes";
		System.out.println(str.concat(" is awesome"));
		System.out.println(str);// here value of string remains the same. it did not modify with concat. it just added another string. that's why string is immutable
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str1= "  in28min is awesome     ";
		System.out.println(str1.trim());//removes the space at the strt & end of the string
		
		//if there is any string in any operation, it will concatenate.
		int i= 1+23;
		System.out.println(i);
		
		System.out.println(1+ "23");
		System.out.println(1 + " is awesome");
		System.out.println(1 + 2+ "23");
		System.out.println("23" + 1 + 2); // left to right  operations are done as it encounters with string 1st. 23string +1= string; string +2= another string
		System.out.println("23" + (1 + 2));
		
		//static utility method: appending comma in string
		System.out.println(String.join(",",  "2","5"));
		System.out.println("abcd".replace("ab", "xy"));
		
		//ObjcetName. and it will show all the possible methods that can be applied on this string. 
		//ClassName. and it will show all the possible static methods
		//or just search java doc String java17 in the internet. see the api's and use it from the documentation
		
		
		
	}

}
