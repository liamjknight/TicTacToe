package Board;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Gameboard {
	private Character[] a = {3};//top row
	private Character[] b = {3};//middle row
	private Character[] c = {3};//bottom row
	
	//Constructors
	public Gameboard() {
		this.a = new Character[]{'-', '-', '-'};
		this.b = new Character[]{'-', '-', '-'};
		this.c = new Character[]{'-', '-', '-'};
	}
	
	//methods
	public void makeMove(char player, String move) {
		boolean worked = false;//used to see if user picked a free or used spot
		if(move.contains("a")) {//finds row
			if(this.a[Integer.parseInt(move.substring(1))].equals('-')) {//checks if spot has been picked
				this.a[Integer.parseInt(move.substring(1))] = player;
				worked = !worked;
			}else {
				System.out.println("The space you chose is already taken.");
			}
		}else if(move.contains("b")) {
			if(this.b[Integer.parseInt(move.substring(1))].equals('-')) {
				this.b[Integer.parseInt(move.substring(1))] = player;
				worked = !worked;
			}else {
				System.out.println("The space you chose is already taken.");
			}
		}else if(move.contains("c")) {
			if(this.c[Integer.parseInt(move.substring(1))].equals('-')) {
				this.c[Integer.parseInt(move.substring(1))] = player;
				worked = !worked;
			}else {
				System.out.println("The space you chose is already taken.");
			}
		}
		if(!worked) {
			System.out.println("Try Again!");
			chooseMove(player);
		}
		printBoard();
	}
	
	public void printBoard() {
		System.out.printf("%c | %c | %c\n" +
						  "==|===|==\n" +
						  "%c | %c | %c\n" +
						  "==|===|==\n" +
						  "%c | %c | %c\n", a[0], a[1], a[2], b[0], b[1], b[2], c[0], c[1], c[2]);
	}
	
	
	//methods to check if there is a winner
	public boolean isWinner() {
		Character winningPiece = '-';
		if(checkRows().get(true)!=null) {
			winningPiece = checkRows().get(true);
		}else if(checkColumns().get(true)!=null) {
			winningPiece = checkColumns().get(true);
		}else if(checkDiagonals().get(true)!=null) {
			winningPiece = checkDiagonals().get(true);
		}
		
		if(winningPiece.equals('-')) {
			return false;
			//go to next turn
		}else {
			System.out.printf("CONGRATS %s!\n YOU WON!\n", winningPiece);
			return true;
			//add option to restart game or exit app
		}
	}
	private Map<Boolean, Character> checkRows() {//are there any winning rows?
		Map<Boolean, Character> result = new HashMap<Boolean, Character>();
		if(!a[0].equals('-')&&a[0].equals(a[1])&&a[1].equals(a[2])) {
			result.put(true, a[0]);
		}else if(!b[0].equals('-')&&b[0].equals(b[1])&&b[1].equals(b[2])) {
			result.put(true,  b[0]);
		}else if(!c[0].equals('-')&&c[0].equals(c[1])&&c[1].equals(c[2])) {
			result.put(true, c[0]);
		}
		else {
			result.put(false, null);
		}
		return result;
	}
	private Map<Boolean, Character> checkColumns() {//are there any winning columns?
		Map<Boolean, Character> result = new HashMap<Boolean, Character>();
		if(!a[0].equals('-')&&a[0].equals(b[0])&&b[0].equals(c[0])) {
			result.put(true, a[0]);
		}else if(!a[1].equals('-')&&a[1].equals(b[1])&&b[1].equals(c[1])) {
			result.put(true,  a[1]);
		}else if(!a[2].equals('-')&&a[2].equals(b[2])&&b[2].equals(c[2])) {
			result.put(true, a[2]);
		}
		else {
			result.put(false, null);
		}
		return result;
	}
	private Map<Boolean, Character> checkDiagonals() {//are there any winning diagonals?
		Map<Boolean, Character> result = new HashMap<Boolean, Character>();
		if(!a[0].equals('-')&&a[0].equals(b[1])&&b[1].equals(c[2])){
			result.put(true, a[0]);
		}else if(!a[2].equals('-')&&a[2].equals(b[1])&&b[1].equals(c[0])) {
			result.put(true, a[2]);
		}else {
			result.put(false, null);
		}
		return result;
	}
	
	public boolean chooseMove(char player) {
		Scanner input = new Scanner(System.in);
		boolean worked = false;
		System.out.println("It's " + player + "'s turn, make your move!");
		
		String move = "";
		
		move = input.nextLine();
		
		if(move.length()==2)
			worked = !worked;
		
		if(worked) {
			makeMove(player, move);
		}else {
			chooseMove(player);
		}
		
		return worked;
	}
}
