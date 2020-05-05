package testingJavaConcept;

public class Factorial {
	
	public static long getFactorial(long num) {
		
		long fact=1;
		if (num<1) {
			return 1;
		} else {
			
			for (long i=1;i<=num;i++) {
				fact = fact *i;//1, 2, 6
				
			}
			return fact;
		}
	}
	
	public static int recurciveFact(int num) {
		
		int fact=1;
		
		if (num<1) {
			return 1;
		} else {
			
			fact = num* recurciveFact(num -1);
			
			return fact;
		}
	}

	public static void main(String[] args) {
		
		//System.out.println(getFactorial(50));
		
		System.out.println(recurciveFact(4));
		

	}

}
