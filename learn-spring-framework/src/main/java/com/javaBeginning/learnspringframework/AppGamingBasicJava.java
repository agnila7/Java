package com.javaBeginning.learnspringframework;

import com.javaBeginning.learnspringframework.game.GameRunner;
import com.javaBeginning.learnspringframework.game.MarioGame;
import com.javaBeginning.learnspringframework.game.PokemonGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		var marioGame = new MarioGame();
		var pokemonGame = new PokemonGame();
		
//		var gameRunner = new GameRunner(marioGame); // Gamerunner is tightly coupled with MarioGame
		var gameRunner = new GameRunner(pokemonGame);
		gameRunner.run();

	}

}
