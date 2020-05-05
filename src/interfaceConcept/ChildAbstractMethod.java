package interfaceConcept;

public class ChildAbstractMethod extends AbstractConcept{

	//AbstractConcept ob = new ChildAbstractMethod();
	//ChildAbstractMethod ob = new ChildAbstractMethod();
	@Override
	public void test1() {
		System.out.println("child - abstract 1");
		
		
	}

	@Override
	public int test2() {
		
		  System.out.println("non static var : "+ a);
		  System.out.println("non static var: "+ b);
		  System.out.println("call tatic var: "+ c);
		 
		System.out.println("static var: "+ AbstractConcept.c);
		System.out.println("child abstract 2");
		return 0;
	}

	
	
	

}
