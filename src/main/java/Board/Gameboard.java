package Board;

import java.util.HashMap;
import java.util.Map;

import Player.Player;

public class Gameboard {
	private char[] a = {3};//top row
	private char[] b = {3};//middle row
	private char[] c = {3};//bottom row
	
	//Constructors
	public Gameboard() {
		this.a = new char[]{'-', '-', '-'};
		this.b = new char[]{'-', '-', '-'};
		this.c = new char[]{'-', '-', '-'};
	}
	
	//methods
	public void makeMove(char player, String quardinent) {//change this to check if spot has been already selected, maybe switch statment
		if(quardinent.contains("a")) {
			this.a[Integer.parseInt(quardinent.substring(1))] = player;
		}else if(quardinent.contains("b")) {
			this.b[Integer.parseInt(quardinent.substring(1))] = player;
		}else if(quardinent.contains("c")) {
			this.c[Integer.parseInt(quardinent.substring(1))] = player;
		}
	}
	
	public void printBoard() {
		System.out.printf("%d | %d | %d\n" +
						  "===|====|===\n" +
						  "%d | %d | %d\n" +
						  "===|====|===\n" +
						  "%d | %d | %d", a[0], a[1], a[2], b[0], b[1], b[2], c[0], c[1], c[2]);
	}
	
	public Player checkWinnerRow() {
		return null;
	}
	
	//Getters/setters
	public char[] getA() {
		return a;
	}

	public void setA(char[] a) {
		this.a = a;
	}

	public char[] getB() {
		return b;
	}

	public void setB(char[] b) {
		this.b = b;
	}

	public char[] getC() {
		return c;
	}

	public void setC(char[] c) {
		this.c = c;
	}
}
