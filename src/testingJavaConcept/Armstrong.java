package testingJavaConcept;

public class Armstrong {
	
	public static void isArmstrong(int num) {
		
		int cube = 0;
		
		int t;
		
		int sum=0;
		int r=0;
		
		t=num;
		
		while (num>0) {
			
			r = num%10;
			cube = r*r*r;
			sum = sum + cube;
			num = num/10;
		}
		
		if (t==sum) {
			System.out.println("its Armstrong");
		}
		else {
			System.out.println("Its not armstrong");
		}
	}

	public static void main(String[] args) {
		
		isArmstrong(151);

	}

}
