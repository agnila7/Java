package com.oops_level2;

public class Customer {

	//state
	private String name;
	private Address homeAddress; // this address can be object or class of its own
	private Address workAddress;
	
	//creation/constructor

//	if is is mandatory for customer , homeadd. / workadd. , then i put it in the constructor or else not
	
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	//operations
	
//	lets say i want to have modification in home and work address. hence getters, stetters
	
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	//print
	
	public String toString() {
		return String.format("name - %s, homeAddress - %s, workAddress- %s)", name, homeAddress ,workAddress);
	}
}
