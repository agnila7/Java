package com.oops_level2.inheritance;

public class Person {

	//state
	private String name;
	private String email;
	private String phoneNumber;
	
	//creation
	
//	public Person(String name) {
//		super();
//		this.name = name;
//	}
	
	public Person(String name) {
		System.out.println("Person Constructor");
		this.name = name;
	}
	
	
	//

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
//	overriding the toString() method of Object class in Person class which is extending the Object class
//	com.oops_level2.inheritance.Person@e580929; this is coming form the toString method. getClass().getName()+"@"+Integer.toHexString(hashCode())
	
	 public String toString() {
	        return name+ "##" + email + "##" + phoneNumber;
	    }
	
	
}
