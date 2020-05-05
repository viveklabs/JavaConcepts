package SuperConcept;

public class ChildClass extends SuperConcept{
	
	public ChildClass() {
		super();
		System.out.println("child defauld constructor");
	}
	
	public ChildClass(String i) {
		super(i); // used to call paraterized constructo of parent class
		System.out.println("Child parameterized construcot");
	}

}
