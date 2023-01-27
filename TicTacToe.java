

		static final int mapSize = 3;
		public static int indexNumberOfPlayer = 0;
		static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		String[] players = {"O", "X"};
		
		gameMap gameMap = new gameMap(mapSize);
		
		gameResult gameResult = new gameResult(mapSize);
		
		while (true) {
			System.out.println("Player " + players[indexNumberOfPlayer] + " turn!");

			int[] selectedRowAndColumn = selectingRowAndColumn();
			
			gameMap.displayPlayersHit(selectedRowAndColumn, players, indexNumberOfPlayer);
			gameMap.displayMap();
			gameResult.setindexNumberOfPlayer(indexNumberOfPlayer);
			if (gameResult.isWin(gameMap.getGameMap(), selectedRowAndColumn, players)) {
				break;
			}
			turnPlayer(players);

			if (gameResult.gameIsDraw(gameMap.getGameMap())) {
				break;
			}
		}
	}

	static int[] selectingRowAndColumn() {
		System.out.print("Select a row: ");
		int selectedRow = scanner.nextInt();
		System.out.print("Select a column: ");
		int selectedColumn = scanner.nextInt();
		
		return new int[] {selectedRow, selectedColumn};	
	}
	
	static void turnPlayer(String[] players) {
		if (indexNumberOfPlayer < players.length - 1) {
			indexNumberOfPlayer++;
		} else {
			indexNumberOfPlayer = 0;
		}
	}
}
