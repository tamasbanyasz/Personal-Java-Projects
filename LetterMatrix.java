package LetterMatrix;

import AppendLetters.AppendLetter;

public class SnailLetterMatrix {
	
	static final int size = 4;
	static final String sentence = "coding good";

	public static void main(String[] args) {
		String[] words = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k","l","m","n","o","p"};
		String[][] matrixMap = new String[size][size];
		AppendLetter appendLetter = new AppendLetter();
		
		createMatrix(words, matrixMap);
		
		String[] slicedSentence = appendLetter.splitSentence(sentence);
		StringBuilder appenedLetters = appendLetter.appendSameLetters(matrixMap, slicedSentence);
		System.out.println("                ");
		System.out.println(appenedLetters);
		
	}
	
	static void createMatrix(String[] words, String[][] matrix) {
		int countLastRow = size + size / 2;
		int countMiddleSecondRow = countLastRow / 2;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				if (row == 0 && column < size) {
					matrix[row][column] = words[column]+" ";
				}
				if (row > 0 && row < size && column == size - 1) {
					matrix[row][column] = words[row + column]+" ";
				}
				if (row == size - 1 && column < size - 1) {
					matrix[row][column] = words[(row + column) + countLastRow]+" ";
					countLastRow = countLastRow - size / 2;
				}
				if (row > 0 && row < size - 1 && column == 0) {
					matrix[row][column] = words[words.length-row- size]+" ";
				}
				if (row == 1 && column < size - 1 && column > 0) {
					matrix[row][column] = words[words.length-column-countMiddleSecondRow]+" ";
					countMiddleSecondRow -= size / 2;
				}
				if (row == size / 2 && column < size - 1 && column > 0) {
					matrix[row][column] = words[words.length-column]+" ";
				}
				
				System.out.print(matrix[row][column]);				
			}System.out.println();
		}	
	}

}
