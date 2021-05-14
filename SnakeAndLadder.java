package com.SnakeAndLadder;

import java.util.Random;

public class SnakeAndLadder {
	
	static final int STARTING_POSITION=0;
	
	public void DiceRoll() {
		Random random = new Random();
		int DICE = (random.nextInt(6)+1);
	
		System.out.println("Roll Dice :"+DICE);
	}
	
	
	
	public static void main(String[] args) {

	System.out.println("Welcome To Snake And Ladder Game");
	SnakeAndLadder player1= new SnakeAndLadder();
	player1.DiceRoll(); 
}
}
