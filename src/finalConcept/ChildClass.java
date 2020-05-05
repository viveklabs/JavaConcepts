package finalConcept;

public class ChildClass extends ParentClass{
	
	// final method cannot be overridden
	// final var cannot be changed
	// final class cannot be iinherited
	
	ParentClass p = new ParentClass();
	
	
	
	public void car() {
		System.out.println("ar = child method");
	//	p.i = 20; // final varialbe cannot be used in child class
		
		

		
		
	}

}
