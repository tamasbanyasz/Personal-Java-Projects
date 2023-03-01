import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Number {
	
	private int hexaValueInDecimal = 0;
	
	public Number() {
	}
	
	private int calculateIntoBinarySystem(int number_in_decimal) {

		List<Integer> binaryNumbers = addNumbersToList(number_in_decimal);
		String binaryNumbersInString = concatenateNumbersToString(binaryNumbers);
		int binaryNumber = Integer.parseInt(binaryNumbersInString);
		
		System.out.println("The "+number_in_decimal+" calculated into binary system: "+binaryNumber);
		return binaryNumber;
	}
		
	private int calculateOctalToDecimal(int number_in_octal) {
		
		String numberToString = Integer.toString(number_in_octal);
		String[] slicedString = numberToString.split("");
		int decimalNumber = concatenateSlicedStringsNumbersToInteger(slicedString);
		
		System.out.println("The "+number_in_octal+" calculated to decimal is: "+decimalNumber);
		return decimalNumber;
	}
	
	private int calculateHexaIntoDecimal(String hexaValue) {
		
		Map<String, Integer> hexaDigits = new HashMap<String, Integer>();
		hexaDigits.put("A", 10);
		hexaDigits.put("B", 11);
		hexaDigits.put("C", 12);
		hexaDigits.put("D", 13);
		hexaDigits.put("E", 14);
		hexaDigits.put("F", 15);

		
		Map<Integer, Integer> digitAndItsIndexNumber = new HashMap<Integer, Integer>();
		
		StringBuilder hexaValueInStringBuilder = new StringBuilder(hexaValue.toUpperCase());
		hexaValueInStringBuilder.reverse();

		String[] splitedHexaValue = hexaValueInStringBuilder.toString().split("");
		
		separateCharacterIfDigit(hexaValue, digitAndItsIndexNumber, splitedHexaValue);

		splitedValueEqualsOneOfHexaDigitsKey(splitedHexaValue, hexaDigits);
		
		addDigitsInDecimalToFinalValue(digitAndItsIndexNumber);
		
		System.out.println("The '"+hexaValue+"' calculated to decimal: "+hexaValueInDecimal);
		return hexaValueInDecimal;
		
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
	
	private void separateCharacterIfDigit(String hexaValue, Map<Integer, Integer> digitAndItsIndexNumber, String[] splitedHexaValue) {
		
		for (int i = 0; i < hexaValue.length(); i++) {
			if (Character.isDigit(hexaValue.charAt(i))) {
				digitAndItsIndexNumber.put(Integer.parseInt(splitedHexaValue[i]), i);
			}
		}
	}
	
	private void splitedValueEqualsOneOfHexaDigitsKey(String[] splitedHexaValue, Map<String, Integer> hexaDigits){
		
		for(String hexaNumber : splitedHexaValue) {
			for (String digit : hexaDigits.keySet()) {
				if (hexaNumber.equals(digit))  {
					hexaValueInDecimal += (hexaDigits.get(digit) * Math.pow(16, Arrays.asList(splitedHexaValue).indexOf(digit)));
				}
			}
		}	
	}
	private void addDigitsInDecimalToFinalValue(Map<Integer, Integer> digitAndItsIndexNumber) {
		
		for (Entry<Integer, Integer> digit : digitAndItsIndexNumber.entrySet()) {
			hexaValueInDecimal += (digit.getKey() * Math.pow(16, digit.getValue()));
	    }
	}
	
	public int inBinarySystem(int number_in_decimal) {
		return calculateIntoBinarySystem(number_in_decimal);
	}
	
	public int octalInDecimal(int number_in_octal) {
		return calculateOctalToDecimal(number_in_octal);
	}
	
	public int hexaInDecimal(String hexaValue) {
		return calculateHexaIntoDecimal(hexaValue);
	}
}
