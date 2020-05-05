package testingJavaConcept;

public class ReverseString {

	public static void main(String[] args) {
		

		String str = "vivek is working in TCS";
		
		StringBuffer sf = new StringBuffer(str);
		
		System.out.println(sf.reverse());
		
		int length = str.length();
		
		String rev = "";
		
		for (int i=length-1;i>=0;i--) {
			
			rev = rev + str.charAt(i);
			
			
		}
		
		System.out.println("Reverse is: " + rev);
		

	}

}
