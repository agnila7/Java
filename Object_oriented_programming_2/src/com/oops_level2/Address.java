package com.oops_level2;

public class Address {//this is object composition. as this class is a reference to another  customer object

	private String line1;
	private String city;
	private String zip;
	
	//creation
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}
	
	
	//this for homeAddress object string print
	public String toString() {
		return (line1 + " " + city + " " + zip);
	}
	
}
