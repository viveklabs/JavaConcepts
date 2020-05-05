package interfaceConcept;

public  class HSBCBank implements USBank , BrazilBank{ // we are achieving multiple inheritance
	//is-a relationship  - for implements
	//has a relationship -  for extends

	@Override
	public void credit() {
		System.out.println("HSBC ---- credit");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBC ---- debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC ---- transfer money");
		
	}
	
	public void carLoan() {
		System.out.println("HSBC ----- car loan");
	}

	@Override
	public void mutualFunds() {
		System.out.println("HSBC Bank --- mutual Funds");
		
	}


}
