package com.javaBeginning.learnspringframework.game;

public class GameRunner {
//	MarioGame game;
	PokemonGame game;
	
//	public GameRunner(MarioGame game) {
//		// TODO Auto-generated constructor stub
//		this.game = game;
//	}
	
	public GameRunner(PokemonGame game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game:" + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}


}
