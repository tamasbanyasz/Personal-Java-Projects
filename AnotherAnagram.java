import java.util.Scanner;

public class AnotherAnagram {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		
            String firstWord = scanner.next();
            String secondWord = scanner.next();
        
            scanner.close();
        
	    boolean ret = isAnagram(firstWord, secondWord);
	    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	static boolean isAnagram(String firstWord, String secondWord) {
            int arrayIndex = 0;
            int numberOfSameLettersInFirstWord =0;
            int numberOfSameLettersInSecondWord =0;
        
            String[] arrayOfFirstWord = firstWord.toLowerCase().split("");
            String[] arrayOfSecondWord = secondWord.toLowerCase().split("");
        
            while (arrayIndex < firstWord.length()) {
        	if (arrayOfFirstWord.length != arrayOfSecondWord.length) {
        	    break;
        	}
        	String letterToSearch = arrayOfFirstWord[arrayIndex];
        	
        	for (int i = 0; i < arrayOfFirstWord.length; i++) {
        	     if (letterToSearch.equals(arrayOfFirstWord[i])) {
        		 numberOfSameLettersInFirstWord++;
        	     for (int j = 0; j < arrayOfFirstWord.length; j++) {
        		  if (letterToSearch.equals(arrayOfSecondWord[j])) {
        		      numberOfSameLettersInSecondWord++;
        		      }
        	     }
        	     }
                }
        	
        	numberOfSameLettersInSecondWord = numberOfSameLettersInSecondWord / numberOfSameLettersInFirstWord;
        	
        	if (numberOfSameLettersInFirstWord != numberOfSameLettersInSecondWord) {
        		return false;
        	}	
        	if (arrayIndex == arrayOfFirstWord.length-1 && arrayIndex == arrayOfSecondWord.length-1) {
        		return true;
        	}
                arrayIndex ++;
                numberOfSameLettersInFirstWord = 0;
                numberOfSameLettersInSecondWord = 0;
             }
	     return false;
	}
}
