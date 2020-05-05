package javaCode;

public class isPrimeNumber {
	
	public static boolean verifyPrime(int num) {
		
		if (num<=1) {
			return false;
		}
		
		for (int i=2;i<num;i++) {
			
			if(num %i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void isPrimeNumbers(int num) {
		
		
		for(int i=2;i<=num;i++) {
			if (verifyPrime(i)) {
			System.out.print(i + ", ");
		}
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		//System.out.println(verifyPrime(6));
		
		if (verifyPrime(7)) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
		
		/*
		 * isPrimeNumbers(20); isPrimeNumbers(13); isPrimeNumbers(5);
		 */
		isPrimeNumbers(12);

	}

}
