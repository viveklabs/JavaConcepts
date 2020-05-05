package testingJavaConcept;

public class SwapnumberWithoutExtra {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		// using + and -
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("x is: "+ x);
		System.out.println("y is: "+ y);
		
		//using * and /
		
		int i = 10;
		int j = 20;
		
		i = i*j;
		j = i/j;
		i = i/j;
		
		System.out.println("i is: "+ i);
		System.out.println("j is: "+ j);
		
		//using xor
		
		int a = 10;
		int b = 20;
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("a is: "+ a);
		System.out.println("b is: "+ b);
		
		
		
	}

}
