import java.util.Random;

public class PaperRockScissors {

	public static void main(String[] args) {
		Random random = new Random();
		
		int gameLoopNumber = 3;
		
		String paper= "Paper";
		String rock = "Rock";
		String scissors = "Scissors";
		
		String[] players = {paper, rock, scissors};
		
		gameLoop(gameLoopNumber, players, random);
			
	}

	static void gameLoop(int gameLoopNumber, String[] players, Random random) {
		if (gameLoopNumber > 0) {
			for (int iterationNumber = 1; iterationNumber <= gameLoopNumber; iterationNumber++ ) {
				System.out.println("-------------------");
				System.out.println("Round " + iterationNumber +"#:");

				int[] selectedPlayers = selectRandomPlayerByIndexNumber(players, random);

				gameMatch(players, selectedPlayers);
				
				System.out.println("-------------------");	
			}
		} else {
			System.out.println("Incorrect round number.");
		}
		
	}

	static void gameMatch(String[] players, int[] selectedPlayers) {
		
		if ((selectedPlayers[0] == 0 && selectedPlayers[1] == 1) || (selectedPlayers[0]== 1 && selectedPlayers[1] == 0)) {
			System.out.println("*Winner is*: "+players[0]);
			}
		if ((selectedPlayers[0] == 1 && selectedPlayers[1] == 2) || (selectedPlayers[0] == 2 && selectedPlayers[1] == 1)) {
			System.out.println("*Winner is*: "+players[1]);
			}
		if ((selectedPlayers[0] == 2 && selectedPlayers[1] == 0) || (selectedPlayers[0] == 0 && selectedPlayers[1] == 2)) {
			System.out.println("*Winner is*: "+players[2]);
			}
		if (selectedPlayers[0] == selectedPlayers[1] || selectedPlayers[1] == selectedPlayers[0]) {
			System.out.println("*The match is draw between "+players[selectedPlayers[0]]+" and "+players[selectedPlayers[1]]+"*");
			}
		
	}

	static int[] selectRandomPlayerByIndexNumber(String[] players, Random random) {
		int choosedPlayer1 = random.nextInt(players.length);
		int choosedPlayer2 = random.nextInt(players.length);
		System.out.println("Player 1: " + players[choosedPlayer1]);
		System.out.println("Player 2: " + players[choosedPlayer2]);
		
		return new int[] {choosedPlayer1, choosedPlayer2};
	}

}
