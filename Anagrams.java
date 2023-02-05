import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        scanner.close();
            
        boolean ret = isAnagram(firstWord, secondWord);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
            
    } 
    
    static boolean isAnagram(String firstWord, String secondWord) {
        String[] arrayOfFirstWord = firstWord.toLowerCase().split("");
        String[] arrayOfSecondWord = secondWord.toLowerCase().split("");
        
        if(arrayOfFirstWord.length != arrayOfSecondWord.length) {
            return false;
        }
        
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
        
        int index = 0;
        for (String s : stringArrayOfFirstWord) {
            if (s.equals(stringArrayOfSecondWord.get(index))) {
                index++;
                
            }
            
        }
        
        
        
        if (index == arrayOfSecondWord.length && index == arrayOfFirstWord.length) {
            return true;
        } 
        return false;

        
    }
    }
