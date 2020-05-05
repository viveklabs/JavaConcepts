package testingJavaConcept;

import java.util.Arrays;

public class LargestandSmallest {

	public static void main(String[] args) {
		
		int numbers[] = {1,3,4,55,-23,-49,56};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for (int i=1;i<numbers.length;i++) {
			
			if (numbers[i]>largest) {
				largest = numbers[i];
			} else if (numbers[i]<smallest) {
				
				smallest = numbers[i];
			}
		}
		
		System.out.println("array is: " + Arrays.toString(numbers));
		
		System.out.println("largest number is: "+ largest);
		System.out.println("smallest number is: "+ smallest);
	}

}
