package Player;

public  class Player {
	//variables
	private boolean isTurn;
	private String playerName;
	private char playerPiece;
	
	//getters/setters
	public void setPlayerPiece(char playerPiece) {
		this.playerPiece = playerPiece;
	}
	public char getPlayerPiece() {
		return playerPiece;
	}
	public void setTurn() {
		this.isTurn = !this.isTurn;
	}
	public boolean getTurn() {
		return this.isTurn;
	}
	public String getPlayerName() {
		return playerName;
	}
	
	
	//constructors
	public Player(String playerName) {
		this.playerName = playerName;
		isTurn = false;
	}
	public Player(String playerName, boolean isTurn, char playerPiece) {
		this.isTurn = false;
		this.playerName = playerName;
		this.playerPiece = playerPiece;
	}
	
	//methods
}
