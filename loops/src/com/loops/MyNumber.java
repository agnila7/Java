package com.loops;

public class MyNumber {
	private int number;

	
	MyNumber (int number){
		this.number = number;
	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
//		if(number == 0 || number == 1)
		if(number <2)
			return false;
		for (int i = 2; i< number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumOfDivisors() {
		// TODO Auto-generated method stub
		int divisorSum = 0;
		for (int i = 2; i< number; i++) {
			if(number % i == 0) {
				divisorSum += i;
			}
		}
		return divisorSum;
	}

	public int sumUptoN() {
		// TODO Auto-generated method stub
		int totalSum = 0;
		for (int i = 1; i<= number; i++) {
			totalSum += i; 
		}
		return totalSum;
	}

	public void printANumberTriangle() {
		// TODO Auto-generated method stub
		for (int i = 1; i<= number; i++) {
			System.out.println(" ");
			
			for(int j = 1; j<= i; j++) {

				System.out.print(j + ""); //println adds a line. hence use print
			}

		}
		
	}
	
	

}
