package Abstraction_Interface;

public class TestBank {

	public static void main(String[] args) {

// USBank us = new USBank(); // object of an interface in not alloweed.this will show error.		
		
CitiBank citi= new CitiBank();// Creating object of citibank class is alloweed. 		
	
// by creating an object of citibank we can access all the methods in that class.

citi.educationLoan();
citi.HomeLoan();
citi.CarLoan();

citi.Trading();
citi.inscurance();
citi.mutualfunds();


System.out.println(USbank.min_bal);// able to call variable from USBank Interface using class name 
                                 // bcoz all variables are public.


// you cannot create an object of an Interface but you can create a refference of it by doing
//that you can access the methods in that Interface below we didnt create object of USbank but
// we created a refference in this refference we can only access USbank methods not citibank. 


USbank us= new CitiBank(); // us is not an object in this argument its just a reference.
                           // but CitiBank is the object.

 us.Credit();
 us.Debit();
 us.TransferMoney();
 us.Trading();

 System.out.println(us.min_bal);// can also access the variable too from interface.
 
	}

}
