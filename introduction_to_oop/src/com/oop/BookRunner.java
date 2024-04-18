package com.oop;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		
		artOfComputerProgramming.reading();
		effectiveJava.reading();
		cleanCode.reading();
		
		artOfComputerProgramming.setNoOfCopies(1);
		effectiveJava.setNoOfCopies(5);
		cleanCode.setNoOfCopies(3);
		
		artOfComputerProgramming.increaseNoOfCopies(5);
		effectiveJava.increaseNoOfCopies(5);
		cleanCode.increaseNoOfCopies(5);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}
