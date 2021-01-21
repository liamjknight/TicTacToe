package Player;

public  class Player {
	//variables
	private String playerName;
	private Character playerPiece;
	
	//getters/setters
	public void setPlayerPiece(Character playerPiece) {
		this.playerPiece = playerPiece;
	}
	public Character getPlayerPiece() {
		return playerPiece;
	}
	public String getPlayerName() {
		return playerName;
	}
	
	
	//constructors
	public Player(String playerName) {
		this.playerName = playerName;
	}
	public Player(String playerName, boolean isTurn, Character playerPiece) {
		this.playerName = playerName;
		this.playerPiece = playerPiece;
	}
	
	//methods
}
