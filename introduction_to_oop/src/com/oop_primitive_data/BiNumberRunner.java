package com.oop_primitive_data;

public class BiNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		BiNumber numbers = new BiNumber(2, 3);
		
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleValue();// double the number
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}

}
