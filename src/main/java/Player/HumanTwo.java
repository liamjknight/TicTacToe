package Player;

public class HumanTwo extends SuperPlayer {
	private char playerPiece;
	
	
	public void setPlayerPiece(char playerPiece) {
		this.playerPiece = playerPiece;
	}
	public char getPlayerPiece() {
		return playerPiece;
	}
	
	public HumanTwo(String playerName, char playerPiece) {
		super(playerName);
	}
}
