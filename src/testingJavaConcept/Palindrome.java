package testingJavaConcept;

public class Palindrome {
	
	public static void isPalindrome(int num) {
		
		int r=0;
		int sum =0;
		int t;
		
		t=num;
		
		while(num>0) {
			
			r= num%10;
			sum = (sum*10) + r; //1, 15
			num = num/10;
		}
		
		if (t==sum) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		
		isPalindrome(0);

	}

}
