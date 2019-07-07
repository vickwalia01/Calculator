package Abstraction_Interface;

// created a child class to extend from interface need to use implements keyword.
// Every time new method is created in the parent interface an error will show in child
// class so that method has to be implemented in child class too.


public class CitiBank implements USbank,RbIBank{

	
	// USBank Interface over riden methods
	@Override
	public void Debit() {
    System.out.println("citi Debit");		
	}

	@Override
	public void Credit() {
    System.out.println("citi credit ");		
	}

	@Override
	public void TransferMoney() {
		System.out.println("Citi Money transfer");
	}

	
	// RBI Interface over riden methods.
	@Override
	public void educationLoan() {
      System.out.println("citibank edication loan");		
	}

	@Override
	public void HomeLoan() {
     System.out.println("citibank home loan");		
	}

	@Override
	public void CarLoan() {
    System.out.println("CitiCarloan");		
	}

	@Override
	public void Trading() {
	System.out.println("Citi trading");	
	}

	
// Citi bank adding their own class methods not over riden from other interface:
	
	public void mutualfunds() {
		System.out.println("citi mutual funding");
	}
	
	public void inscurance() {
		System.out.println("citi inscurance");
	}
	
	
	
	
}
