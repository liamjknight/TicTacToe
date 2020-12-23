package Player;

public abstract class SuperPlayer {
	boolean isTurn;
	String playerName;
	
	public void setTurn() {
		this.isTurn = !this.isTurn;
	}
	public boolean getTurn() {
		return this.isTurn;
	}
	
	public SuperPlayer(String playerName) {
		this.isTurn = false;
		this.playerName = playerName;
	}
}
