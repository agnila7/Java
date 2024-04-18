package com.oops_level2.abstractClass;

public abstract class AbstractRecipe {

	//preparation
	//recipe
	//cleanup
	
//	lets say all the 3 steps are mandatory for each recipes.
	
	public void execute() {
		getReady();
		cook();
		cleanup();
	}
	// so i am just laying out the algorithm (methods) but i want each recipe to set ipmplemetation for that algorithm in the subclass
	//typical use of abstract class
	abstract void getReady();
	abstract void cook();
	abstract void cleanup();
	
}
