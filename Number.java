import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number {
	
	public Number() {
	}
	
	private int calculateIntoBinarySystem(int number_in_decimal) {

		List<Integer> binaryNumbers = addNumbersToList(number_in_decimal);
		String binaryNumbersInString = concatenateNumbersToString(binaryNumbers);
		int binaryNumber = Integer.parseInt(binaryNumbersInString);
		
		System.out.println(binaryNumber);
		return binaryNumber;
	}
		
	private int calculateOctalToDecimal(int number_in_octal) {
		
		String numberToString = Integer.toString(number_in_octal);
		String[] slicedString = numberToString.split("");
		int decimalNumber = concatenateSlicedStringsNumbersToInteger(slicedString);
		
		System.out.println(decimalNumber);
		return decimalNumber;
	}
	
	private List<Integer> addNumbersToList(int number) {
		
		List<Integer> binaryNumbers = new ArrayList<Integer>();

		while (number != 0) {
			binaryNumbers.add(number % 2);
			number = number / 2;
		}
		Collections.reverse(binaryNumbers);
		
		return binaryNumbers;
	}
	
	private String concatenateNumbersToString(List<Integer> numbers) {
		
		   StringBuilder binaryNumber = new StringBuilder(numbers.size());
		   
		   for (int digit : numbers) {
			   binaryNumber.append(digit);
		   }
		   return binaryNumber.toString();
	}
	
	private int concatenateSlicedStringsNumbersToInteger(String[] slicedString) {
		List<Integer> numbers = new ArrayList<Integer>();
		int decimalNumber = 0;
		
		for (int i = 0; i < slicedString.length ; i++) {
			numbers.add(Integer.parseInt(slicedString[i]));
		}
		
		Collections.reverse(numbers);
		
		for (int j = 0 ; j < slicedString.length ; j++) {
			decimalNumber += (numbers.get(j) * Math.pow(8, j));
		}
		return decimalNumber;
	}	
	
	public int inBinarySystem(int number_in_decimal) {
		return calculateIntoBinarySystem(number_in_decimal);
	}
	
	public int octalInDecimal(int number_in_octal) {
		return calculateOctalToDecimal(number_in_octal);
	}
}
