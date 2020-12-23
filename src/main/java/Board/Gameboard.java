package Board;

import java.util.HashMap;
import java.util.Map;



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
		System.out.printf("%c | %c | %c\n" +
						  "==|===|==\n" +
						  "%c | %c | %c\n" +
						  "==|===|==\n" +
						  "%c | %c | %c\n", a[0], a[1], a[2], b[0], b[1], b[2], c[0], c[1], c[2]);
	}
	
	
	//methods to check if there be a winner or no
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
			System.out.printf("CONGRATS %s!\n YOU WON!", winningPiece);
			return true;
			//add option to restart game or exit app
		}
	}
	private Map<Boolean, Character> checkRows() {
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
	private Map<Boolean, Character> checkColumns() {
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
	private Map<Boolean, Character> checkDiagonals() {
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
	
	
	//Getters/setters
	public Character[] getA() {
		return a;
	}

	public void setA(Character[] a) {
		this.a = a;
	}

	public Character[] getB() {
		return b;
	}

	public void setB(Character[] b) {
		this.b = b;
	}

	public Character[] getC() {
		return c;
	}

	public void setC(Character[] c) {
		this.c = c;
	}
}
