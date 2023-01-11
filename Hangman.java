import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Hangman {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		String[] words = {"Cloud", "Water", "Island", "Uncle", "Company", "Motor"};
		
		String[] selectedWord = selectWord(words, random);
		System.out.println(Arrays.toString(selectedWord));

		String[] hiddenWord = createHiddenWord(selectedWord);
		
		
		gameLoop(selectedWord, hiddenWord, scanner);
		
	}

	static void gameLoop(String[] selectedWord, String[] HiddenWord, Scanner scanner) {
		
		int round = selectedWord.length + 3;
		
		do {
			System.out.println(round+" guess remaining!");
			System.out.print("Guess a letter: ");
			String guess = scanner.next();
			
			for (int i = 0; i < selectedWord.length; i++) {
				if (selectedWord[i].equals(guess)) {
					HiddenWord[i] = guess;
				}
			}
			
			if (gameWin(HiddenWord)) {
				System.out.println(Arrays.toString(HiddenWord));	
				break;	
				}
			
			else {
				round -= 1;
				System.out.println("------------------");
				System.out.println(Arrays.toString(HiddenWord));	
				System.out.println("------------------");


			}
		} while(round > 0);
		
		if (round == 0) {
			System.out.println("You LOST!");

		}
		
	}

	static boolean gameWin(String[] lines) {
		for (int i = 0; i < lines.length; i++) {
			if (lines[i].equals("_")) {
				return false;
			}
		}
		System.out.println("You WIN!");
		return true;	
	}

	static String[] createHiddenWord(String[] selectedWord) {
		
		String newarr[] = new String[selectedWord.length];
		
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = "_";
		}
		return newarr;
	}

	static String[] selectWord(String[] words, Random random) {
		
		int selectedWordIndexNumber = random.nextInt(words.length);
		String selectedWord = words[selectedWordIndexNumber];
		String[] parts = selectedWord.toLowerCase().split("");

		return parts;
		
		
	}

}
