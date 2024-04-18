package com.oop_primitive_data;

import java.math.BigDecimal; // this one for using BigDecimal

public class SimpleInterestCalculator {

//	private double principle;
//	private double interest;
//	
//	public SimpleInterestCalculator(double principle,double interest) {
//		// TODO Auto-generated constructor stub
//		this.principle = principle;
//		System.out.println(this.principle);
//		this.interest = interest/100;
//		System.out.println(this.interest);
//		
//	}
//
//	public double calculateTotalValue(int noOfYears) {
//		// TODO Auto-generated method stub
//		return  (principle + principle* interest * noOfYears);
//	}
//	
	
	BigDecimal principal; 
	BigDecimal interest;
	
	public SimpleInterestCalculator(String principal, String interest) {
		// TODO Auto-generated constructor stub
		this.principal = new BigDecimal(principal); // as we are converting string to double through bigdecimal class. declare it as object
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// TODO Auto-generated method stub
//		return principal + principal * interest * noOfYears; // its not possible in BigDecimal . hence you need to use add() and multiply methods. 
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
		return totalValue;
	}

	
}
 