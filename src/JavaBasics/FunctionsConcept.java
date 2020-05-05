package JavaBasics;

public class FunctionsConcept {

	public static void main(String[] args) {
		
		FunctionsConcept ob = new FunctionsConcept(); //to call non static mothod in Static method, we have to use class object
		ob.test();
		int w =ob.test2(20, 30);
		System.out.println(w);
		

	}
	
	
	public void test() {
		System.out.println("test method");
	}
	
	public int test2(int i , int j) {
		
		int k = i+j;
		
		return k;
		
	}

}
