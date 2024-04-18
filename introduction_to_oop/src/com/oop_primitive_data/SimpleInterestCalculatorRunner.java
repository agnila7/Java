package com.oop_primitive_data;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SimpleInterestCalculator calculator = new SimpleInterestCalculator(4500.00,7.5);
//		double totalValue = calculator.calculateTotalValue(5);//5 years
//		System.out.println(totalValue);
		
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);//5 years
		System.out.println(totalValue);
		
	}

}
