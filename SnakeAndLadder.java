package com.SnakeAndLadder;

import java.util.Random;

public class SnakeAndLadder {
	
	static final int STARTING_POSITION=0;
	static final int ENDING_POSITION=100;
	static Random RANDOM = new Random();
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;
	static String TASK;
	static final int PLAYER1 = 1;
	static final int PLAYER2 = 2;

	
	public int GamePlayed(int playerPosition, int DiceCount) {

		if (playerPosition < ENDING_POSITION) {
		
			int DICE = (RANDOM.nextInt(6)+1);

			int action = RANDOM.nextInt(3);
			switch(action) {
			case LADDER:
			if(playerPosition + DICE <= ENDING_POSITION) {
				playerPosition = playerPosition + DICE;
				TASK = "Ladder";
			}
			break;
			
			case SNAKE:
			if(playerPosition - DICE >= STARTING_POSITION) {
			playerPosition = playerPosition - DICE;
			TASK = "Snake";
			}
			break;
			
			case NOPLAY:	
			playerPosition = playerPosition;
			TASK = "NoPlay";
			break;			
		}
		
		System.out.println(" | Dice: "+DICE+" for "+TASK+" and Player Position : "+playerPosition+"| ");
	}
		if(TASK == "LADDER" && playerPosition != ENDING_POSITION) {
		DiceCount = dice_Player(DiceCount);
		GamePlayed(playerPosition,DiceCount);
		}
		return playerPosition;
	}
	public int dice_Player(int diceCount) {
		diceCount++;
		return diceCount;
	}
	public void TwoPlayers() {
		int Player1Position = STARTING_POSITION ;
		int Player2Position = STARTING_POSITION;
		int dice_count = STARTING_POSITION;
		System.out.println("Players Start Playinging The Game");
		while(Player1Position < ENDING_POSITION && Player2Position < ENDING_POSITION) {
			System.out.println("Player 1 :- ");
			Player1Position = GamePlayed(Player1Position,dice_count);
			dice_count = dice_Player(dice_count);
			if(Player1Position == ENDING_POSITION) {
				break;
			}
			System.out.println("Player 2 :- ");
			Player2Position = GamePlayed(Player1Position,dice_count);
			dice_count = dice_Player(dice_count);
			}
		if(Player1Position == ENDING_POSITION) {
			System.out.println("CONGRATULATIONS PLAYER 1 WON THE MATCH");
		}
		else if(Player2Position == ENDING_POSITION) {
			System.out.println("CONGRATULATIONS PLAYER 2 WON THE MATCH");
		}
		System.out.println("Total Dice Count of Both The Players "+dice_count);
	}
	public static void main(String[] args) {
		SnakeAndLadder Player = new SnakeAndLadder();
		Player.TwoPlayers();
	}
}
	

	

