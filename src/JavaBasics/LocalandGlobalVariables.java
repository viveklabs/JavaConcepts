package JavaBasics;

public class LocalandGlobalVariables {
	
	String a = "vivek";
	int b = 33;
	static char c = 'd';

	public static void main(String[] args) {
		
		LocalandGlobalVariables ob = new LocalandGlobalVariables();

		char e = c;
		System.out.println(e);
		String o = ob.a;
		System.out.println(o);
		int f = ob.b;
		System.out.println(f);
		

		

	}
	
	public void test() {
		int b = 21;
		String a = "prasad";
		char c = 'r';
	}

}
