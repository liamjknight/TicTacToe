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
    	List<Player> playerList = new ArrayList<Player>();
    	//making players for game
    	Scanner input = new Scanner(System.in);
    	System.out.println("Player 1, Enter Your Name!");
    	Player player0 = new Player(input.nextLine());
    	playerList.add(player0);
    	System.out.println("Player 2, Enter Your Name!");
    	Player player1 = new Player(input.nextLine());
    	playerList.add(player1);
    	input.close();
    	
    	//choosing which player goes first
    	int[] randomizer = {0,1};
    	Random rand = new Random();
    	int firstPlayer = randomizer[rand.nextInt(1)];
    	int secondPlayer = firstPlayer == 0 ? 1 : 0;
    	
    	playerList.get(firstPlayer).setPlayerPiece('X');
    	playerList.get(firstPlayer).setTurn();
    	playerList.get(secondPlayer).setPlayerPiece('O');
        
        
    	
        Gameboard myBoard = new Gameboard();
        myBoard.printBoard();
        myBoard.makeMove('x', "a1");
        myBoard.makeMove('x', "b1");
        myBoard.makeMove('x', "c1");
        myBoard.printBoard();
        myBoard.makeMove('o', "a1");
        myBoard.printBoard();
        myBoard.isWinner();
    }
    
    
}
