package com.oops_level2;

public class customerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("221B baker street", "London", "NW16XE" );
		Customer customer = new Customer("Agnila", homeAddress);// passing another object as argument
//		this is object composition
		System.out.println(customer);
		
		Address workAddress = new Address("deloitte", "London", "NW16XE" );
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
