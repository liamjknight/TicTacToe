package Player;

public class HumanOne extends SuperPlayer {
	private char playerPiece;
	
	
	public void setPlayerPiece(char playerPiece) {
		this.playerPiece = playerPiece;
	}
	public char getPlayerPiece() {
		return playerPiece;
	}
	
	public HumanOne(String playerName, char playerPiece) {
		super(playerName);
	}
}
