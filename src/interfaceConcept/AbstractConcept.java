package interfaceConcept;

public abstract class AbstractConcept {
	
	int a = 10;
	final int b = 20;
	static int c = 30;
	
	public abstract void test1();
	
	public abstract int test2();
	
	public void test3() {
		System.out.println("test3 method");
	}

}
