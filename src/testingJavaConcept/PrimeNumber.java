package testingJavaConcept;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		
		
		if(num<=1) {
			return false;
		}else {
			
			for(int i=2;i<num;i++) {
				if (num % i ==0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static void allPrime(int num) {
		
		for (int i =2;i<=num;i++) {
			
			if (isPrime(i)) {
				System.out.print(i+ ", ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println(isPrime(11));
		
		allPrime(11);
		


	}

}
