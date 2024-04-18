package com.oops_level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student student = new Student();
//		student.setName("Agnila");
//		student.setEmail("barua**@gmail.com");
//		student.setCollege("University of Windsor");
		
		Person person = new Person("Agnila");
//		person.setName("Agnila");
		person.setEmail("barua**@gmail.com");
//		person.toString();
		System.out.println(person.toString());// we are getting this person as student extends person class and again toString() method can be called as the object class is automatically extended by Person class.
		System.out.println(person);
		

	
	
	
	}

}
