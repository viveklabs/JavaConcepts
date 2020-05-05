package interfaceConcept;

public class TestBank {

	public static void main(String[] vivek) {
		
		System.out.println(USBank.i);
		
		//USBank.i=300; cannot change the value of interface variable
		
		
		//USBank b = new USBank(); // we cannot createan object of interfcace
		
		HSBCBank h = new HSBCBank(); // compile time or static polymorphism
		
		h.credit();
		h.debit();
		h.transferMoney();
		h.carLoan();
		h.mutualFunds();
		
		//dynakic polymorphism or run time polymorphism
		
		USBank b1 = new HSBCBank();
		b1.credit();
		b1.debit();
		b1.transferMoney();
		//b1.carLoan(); Can only call overridden methods
		
		
		
		

	}

}
