package testingJavaConcept;

public class CheckdigitInString {
	
	public static boolean isEmpty(CharSequence str) {
		
		return str==null | str.length()==0;
	}
	
	public static boolean isDigit(CharSequence str) {
		
		int len = str.length();
		
		if (isEmpty(str)) {
			return false;
		}
		
		for (int i=0;i<len;i++) {
			
			if (!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(isDigit("123"));
		System.out.println(isDigit("123a"));
		System.out.println(isDigit(""));
		System.out.println(isDigit(" "));
		System.out.println(isDigit("abc"));
		

		
	}

}
