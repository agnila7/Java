package com.oops_level2.abstractClass;

public class Recipie1 extends AbstractRecipe{

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		//super.getReady();
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
	}

	@Override
	void cook() {
		// TODO Auto-generated method stub
		//super.cook();
		System.out.println("cook the dish");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		//super.cleanup();
		System.out.println("clean up the utensils");
	}
	 
}
