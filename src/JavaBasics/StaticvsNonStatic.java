package JavaBasics;

public class StaticvsNonStatic {
	
	static String a = "vivek";
	int i = 10;

	public static void main(String[] args) {
		
		test2(); //calling static method directly
		
		StaticvsNonStatic.test2(); //Calling static method using class name
		
		System.out.println(a);
		
		System.out.println(StaticvsNonStatic.a);
		
		//////////////////////////////////////////////////////////////////////////
		
		
		StaticvsNonStatic obj = new StaticvsNonStatic();
		
		obj.test1(); // Non static methods can be accessed via obj reference
		
		System.out.println(obj.i);
		
		
	}
	
	public void test1() {
		System.out.println("Non Static method");
	}
	
	public static void test2() {
		System.out.println("Static method");
	}

}
