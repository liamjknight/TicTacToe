package TicTacToe;

import Board.Gameboard;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Gameboard myBoard = new Gameboard();
        myBoard.printBoard();
        System.out.println(myBoard.isWinner());
    }
}
