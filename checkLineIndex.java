public class checkLineIndex {
	
	private int winX = 0;
	private int winO = 0;
	private int mapSize;	
	
	public checkLineIndex(int mapSize) {
		this.mapSize = mapSize;
	}

	public void setWinX(int winX) {
		this.winX += winX;
	}

	public void setWinO(int winO) {
		this.winO += winO;
	}
	
	public boolean someoneFilledALine(String[] players, int indexNumberOfPlayer) {
		if (winX == mapSize || winO == mapSize) {
			System.out.println("Player " + players[indexNumberOfPlayer] + " WON!");
			return true;
		}
		return false;
	}
}
