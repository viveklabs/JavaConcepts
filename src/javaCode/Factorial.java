package javaCode;

public class Factorial {
	
	public static int fact(int num) {
		
		int facto = 1;
		if (num ==0) {
			return 1;
		} else {
			
			for (int i=1;i<=num;i++) {
				
				facto = facto*i; // 1, 2, 6
			
			}
			return facto;
		}
	}
	
	
	public static int recurcive(int num) {
		
		int factor = 1;
		if (num ==0) {
			return 1;
		} else {
			
			factor = num * (recurcive(num-1)); 
			
		}
		
		return factor;
			
		
	}

	public static void main(String[] args) {
		
		//System.out.println(fact(99));
		
		System.out.println(recurcive(99));
		


	}

}
