package com.SnakeAndLadder;

import java.util.Random;

public class SnakeAndLadder {
	
	static final int STARTING_POSITION=0;
	static final int ENDING_POSITION=100;
	
	public static void GamePlayed() {

		
		Random random = new Random();
		int playerPosition = STARTING_POSITION;
		
		System.out.println("Player Start Playing The Game");
		
		while(playerPosition < ENDING_POSITION) {
			
		int DICE = (random.nextInt(6)+1);
	
		int action = random.nextInt(3);
		
		System.out.println("Roll Dice :"+DICE);
		System.out.println("Action perform :"+action);
			if(action == 1 && (playerPosition + DICE <= ENDING_POSITION)){
				
			playerPosition = playerPosition + DICE;
			System.out.println("Player Moves Towards Ladder");
			}
			
			else if(action == 2 && (playerPosition - DICE >= STARTING_POSITION)) {
		    	 playerPosition = playerPosition - DICE;
		    	 System.out.println("Player Moves Towards Snake");
		    	 
		}
		     else {
		    	 	System.out.println("No Play");
		     }
			System.out.println(" "+playerPosition);
		}
		
		
}
  public static void main(String[] args) {
	 SnakeAndLadder Player1 = new SnakeAndLadder();
	 Player1.GamePlayed();
  }
}		

	

