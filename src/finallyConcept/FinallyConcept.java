package finallyConcept;

public class FinallyConcept {
	
	
	public static void main (String[] args) {
		
		test();
		
	}
	
	public static void test() {
		
		try {
			int i = 10;
			System.out.println("Inside Try");
			int d = i/0;
			
		}catch (NullPointerException e) {
			System.out.println("Inside catch");
		}
		finally { // finally block always should be just below try block
			System.out.println("Inside finally");
		}
		
		System.out.println("Outside"); //this line is not executed

	}

}
