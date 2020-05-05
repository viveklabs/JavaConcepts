package javaCode;

public class palindrome {

	
	public static void isPalindrome(int num) {
		
		int r=0;
		int sum = 0;
		
		int t;
		
		t=num;
		
		while(num>0) {
			r = num %10;
			sum = (sum*10)+ r;
			num = num/10;
		}
		
		if (t==sum) {
			System.out.println("num is palindrome");
		}
		else {
			System.out.println("its not palindrome");
		}
	}
	public static void main(String[] args) {
		
		isPalindrome(1453541);
		isPalindrome(123);



	}

}
