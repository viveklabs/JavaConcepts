package StringImmutableConcept;

public class testMain {
	
	static Employee gemp = new grumpyEmp();

	public static void main(String[] args) {
		testMain t = new testMain();
		t.hello(gemp);

	}
	
	public void hello(Employee emp) {
		emp.greet();
	}

}
