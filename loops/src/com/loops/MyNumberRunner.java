package com.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber number = new MyNumber(9);
		boolean PrimeNumber = number.isPrime(); //as println dont print boolean
		System.out.println("isPrime" + PrimeNumber);
		
		System.out.println(number.sumUptoN());
		System.out.println(number.sumOfDivisors());
		
		number.printANumberTriangle();

	}

}
