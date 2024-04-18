package com.oops_level2.abstractClass;

public class RecipieWithMicrowave extends AbstractRecipe{

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		//super.getReady();
		System.out.println("Get the raw materials in a microwave safe plate");
		System.out.println("Power on the microwave");
	}

	@Override
	void cook() {
		// TODO Auto-generated method stub
		//super.cook();
		System.out.println("Put it in the microwave");
		System.out.println("Switch on the microwave");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		//super.cleanup();
		System.out.println("clean up the utensils");
		System.out.println("Switch off the microwave");
	}
	 
}
