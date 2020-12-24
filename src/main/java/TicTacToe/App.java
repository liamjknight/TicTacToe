package TicTacToe;

import Board.Gameboard;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
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
