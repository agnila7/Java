package com.oops_level2.interfaceExample;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MarioGame game = new MarioGame();	
//		ChessGame game = new ChessGame();
		
//		GamingConsole game = new MarioGame();
		GamingConsole game = new ChessGame();
		
// with same code , we can get  different implementation. This is called polymorphism.	
		//interface basically represents same actions that can be performed.
		
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
