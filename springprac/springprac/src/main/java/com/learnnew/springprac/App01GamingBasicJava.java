package com.learnnew.springprac;

import com.learnnew.springprac.game.GameRunner;
import com.learnnew.springprac.game.MarioGame;
import com.learnnew.springprac.game.PacmanGame;
import com.learnnew.springprac.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
	}

}
