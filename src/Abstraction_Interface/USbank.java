package Abstraction_Interface;

public interface USbank {
// no method body just method prototype for implementation.
// cannot create the object of an interface.
// no static methods allowed in interface.
//but  Interface variables are static in nature by default.  	
// 100% abstract	
	
	
	
// // No need to great main method in an interface bcoz the methods dont return anything
	// no body in the methods they are just for implementation for child classes.
	// 	
	
	
	int min_bal=100;
	
	
	
	public void Debit();
	public void Credit();
	public void TransferMoney();
	public void Trading();
}