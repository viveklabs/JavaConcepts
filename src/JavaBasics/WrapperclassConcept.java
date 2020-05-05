package JavaBasics;

public class WrapperclassConcept {

	public static void main(String[] args) {
		
		//String to Integer
		String a = "200";
		int i = Integer.parseInt(a);
		System.out.println(i);
		
		
		String a1 = "200.23";
		int i1 = Integer.parseInt(a1); // it will throw NumberFormatException
		System.out.println(i1); 
		
		
		// String to double
		
		String b = "12.32";
		double j = Double.parseDouble(b);
		System.out.println(j);
		
		
		String b1 = "12";
		double j1 = Double.parseDouble(b1);
		System.out.println(j1); //it will append .0
		
		//String to boolean
		
		String c = "true";
		boolean k = Boolean.parseBoolean(c);
		System.out.println(k);
		
		// String to char is not possible
		
		// Integer to String
		
		int e = 34;
		String m = String.valueOf(e);
		System.out.println(m);
		

	}

}
