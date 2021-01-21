package TicTacToe;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

import Board.Gameboard;
import Player.Player;

public class App {	
	
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
    	int currentTurn;
    	
    	//move all this into a logic object so it can be called for each game
    	List<Player> playerList = pVp(input);
    	
    	randomizer(playerList);
    	
        
        if(playerList.get(0).getPlayerPiece().equals('X')) {
        	currentTurn = 0;
        }else {
        	currentTurn = 1;
        }
    	
    	Gameboard myBoard = new Gameboard();
    	takeTurn(currentTurn, myBoard, playerList);
    }
    
    public static List<Player> pVp(Scanner input) {//making players for game
    	List<Player> playerList = new ArrayList<Player>();
    	
    	System.out.println("Player 1, Enter Your Name!");
    	Player player0 = new Player(input.nextLine());
    	playerList.add(player0);
    	
    	System.out.println("Player 2, Enter Your Name!");
    	Player player1 = new Player(input.nextLine());
    	playerList.add(player1);
    	
    	return playerList;
    }
    
    public static void randomizer(List<Player> playerList) {
    	//choosing which player goes first
    	int[] randomizer = {0,1};
    	Random rand = new Random();
    	int firstPlayer = randomizer[rand.nextInt(2)];
    	int secondPlayer = firstPlayer == 0 ? 1 : 0;
    	
    	//makes x the first player and o the second
    	playerList.get(firstPlayer).setPlayerPiece('X');
    	playerList.get(secondPlayer).setPlayerPiece('O');
    	
    	System.out.println(playerList.get(firstPlayer).getPlayerName() + ", you go first and mark with an 'X'.");
        System.out.println(playerList.get(secondPlayer).getPlayerName() + ", you're on the back foot and mark with 'O'.");
    }
    
    public static void takeTurn(int currentTurn, Gameboard board, List<Player> playerList) {
    	board.chooseMove(playerList.get(currentTurn).getPlayerPiece());
    	if(board.isWinner()) {
    		//this will be a back to menu but for now it quits the app
    		System.exit(0);
    	}else {
    		currentTurn = currentTurn == 0 ? 1 : 0;
    		takeTurn(currentTurn, board, playerList);
    	}
    }
}
