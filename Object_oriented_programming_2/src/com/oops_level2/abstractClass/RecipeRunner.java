package com.oops_level2.abstractClass;

public class RecipeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recipie1 recipe = new Recipie1();
		recipe.execute(); // this execute method is provided in the abstract class but the defination of each steps are provided by the recipie1 class
		
		RecipieWithMicrowave ovenbaked = new RecipieWithMicrowave();
		ovenbaked.execute();
	
	}

}
