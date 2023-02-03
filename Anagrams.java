import java.util.ArrayList;
import java.util.Collections;

public class Anagrams {

	public static void main(String[] args) {
      String firstWord = "mamaii";
      String secondWord = "mammai";
        
      String[] arrayOfFirstWord = firstWord.toLowerCase().split("");
      String[] arrayOfSecondWord = secondWord.toLowerCase().split("");
        
      ArrayList<String> stringArrayOfFirstWord = new ArrayList<String>();
      for (int i = 0; i<arrayOfFirstWord.length;i++) {
          stringArrayOfFirstWord.add(arrayOfFirstWord[i]);
      }
        
      ArrayList<String> stringArrayOfSecondWord = new ArrayList<String>();
      for (int i = 0; i<arrayOfSecondWord.length;i++) {
        	stringArrayOfSecondWord.add(arrayOfSecondWord[i]);
      }
        
      Collections.sort(stringArrayOfFirstWord);
      Collections.sort(stringArrayOfSecondWord);
        
      System.out.println(stringArrayOfFirstWord);
      System.out.println(stringArrayOfSecondWord);
        
      int index = 0;
      for (String s : stringArrayOfFirstWord) {
        	if (s.equals(stringArrayOfSecondWord.get(index))) {
            	index++;
        	}
      }
        
      if (index == arrayOfSecondWord.length) {
        	System.out.println("Anagrams.");
      } else {
        	System.out.println("Not anagrams.");
      }
	 } 
}
