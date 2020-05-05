package testingJavaConcept;

public class MissingArray {

	public static void main(String[] args) {
		
		int i[] = {1,2,3,4,5,7};
		int sum = 0;
		int sum1 = 0;
		
		for (int j = 0; j< i.length;j++) {
			
			sum = sum + i[j];
			
		}
		
		for (int j = 0; j<=7;j++) {
			
			sum1 = sum1+ j;
		}
		
		

		int diff = sum1-sum;
		System.out.println(diff);
		
		

	}

}
