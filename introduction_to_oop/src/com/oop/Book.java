package com.oop;

public class Book {
	private int noOfCopies;
	
	Book(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
	

	public int getNoOfCopies() {
		return noOfCopies;
	}


	public void setNoOfCopies(int noOfCopies) {
		if(noOfCopies > 0)
		this.noOfCopies = noOfCopies;
	}
	
	public void increaseNoOfCopies(int howMany) {
		setNoOfCopies(this.noOfCopies + howMany);
	}

	public void reading() {
		System.out.println("Reading this book");
		
		
	}
}
