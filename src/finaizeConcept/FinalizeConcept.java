package finaizeConcept;

public class FinalizeConcept {
	
	public void finalize() { // this method will only be called if we have any null object reference
		System.out.println("Insidse FInalize method");
	}

	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 ; //this wont invode finalize method
		f1 = null;
		
		System.gc();

	}

}
