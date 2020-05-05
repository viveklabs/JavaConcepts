package javaCode;

public class Armstrong {
	
	public static void isArmstrong(int num) {
		
		int r=0;
		int mul =0;
		int sum =0;
		int t;
		
		t=num;
		
		while(num>0){
			
			r = num%10; // 3, 5 , 
			mul = r*r*r; //27 , 125
			sum = sum+mul; // 27 , 152
			num = num/10; // 15, 5
		
		}
		
		if (t==sum) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("number is not armstrong");
		}
	}

	public static void main(String[] args) {
		
		//isArmstrong(153);
		isArmstrong(455);
		

	}

}
