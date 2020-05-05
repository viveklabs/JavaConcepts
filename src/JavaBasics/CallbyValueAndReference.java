package JavaBasics;

public class CallbyValueAndReference {
	
	int p = 20;
	int q = 40;
	
	

	public static void main(String[] args) {
		
		CallbyValueAndReference ob = new CallbyValueAndReference();
		int x = 10;
		int y = 20;
		
		System.out.println(ob.teset1(x, y));
		ob.teset1(x, y); // call by value
		
		//// call by reference
		
		ob.swap(ob);
		System.out.println("value od p is " + ob.p);
		System.out.println("value of q is " +ob.q);

	}
	
	
	public int teset1(int a, int b) {
		
		int c = a + b;
		
		return c;
	}
	
	public void swap(CallbyValueAndReference t) {
		
		int temp = t.p;
		t.p = t.q;
		t.q = temp;
		
	}

}
