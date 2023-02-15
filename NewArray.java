import java.util.ArrayList;
import java.util.List;

public class NewArray {
	
	private int arrayLength;
	private int numberOfRotate;
	private List<Integer> mySubArray; 
	
	public NewArray(int rotateNumber, int arrayLength) {
		this.numberOfRotate = rotateNumber;
		this.arrayLength = arrayLength;
	}
	
	public List<Integer> rotatedToRight() {
		
		List<Integer> myArray = new ArrayList<Integer>();
		List<Integer> concatedList = new ArrayList<Integer>(); 
		
		for (int i = 0; i < arrayLength; i++) {
			myArray.add(arrayLength+i);
		}
		
		System.out.print("My Array --> ");
		System.out.println(myArray);
		
		mySubArray = myArray.subList(arrayLength-numberOfRotate, arrayLength);
		
		concatedList.addAll(mySubArray);
		
		int arrayIndex = arrayLength;
		do {
			arrayIndex--;
			if (arrayIndex >= arrayLength-numberOfRotate) {
				myArray.remove(arrayIndex);
			}
		} while (arrayIndex > 0);
		
		concatedList.addAll(myArray);
		
		System.out.print("Rotated Array --> ");
		System.out.println(concatedList);
		
		return concatedList;
	}
}
