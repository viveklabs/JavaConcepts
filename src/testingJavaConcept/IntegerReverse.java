package testingJavaConcept;

public class IntegerReverse {
	
	public static void reverse(int num) {
		
		int rev = 0;
		int rem = 0;
		int t = num;
		
		while (num>0) {
			
			rem = num%10;
			rev = (rev*10) + rem;
			num = num/10;
		}
		
		System.out.println("reverse of "+t+ "is: "+ rev);
	}

	public static void main(String[] args) {
		
		reverse(34564);
		

	}

}
