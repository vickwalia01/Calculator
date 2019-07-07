package Questions;

import java.util.Scanner;

public class Calculator1 {
	
	
		// ALL Global Variables 
	static java.lang.String ProductName;
	static int Quantity;
	static	double Price,Tax,Total,Paid,Change,Subtotal;
	
	// Module 1
	 public static void Greeting() {
		System.out.println("---------Reciept Genetrator-----------");
		System.out.println("Please Follow Instructions");
	}
	
	// Module 2
	public static void getinput() {
		
      Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Item Name:");
		ProductName = myscanner.nextLine();
		
		System.out.println("Quantity Purchased:");
		Quantity = myscanner.nextInt();
		
		System.out.println("Price Per Item:");
		Price = myscanner.nextDouble();
		
		System.out.println("Paid Amount");
		Paid = myscanner.nextDouble();
			
	}
	// Module 3
	public static void process() {
		
		Subtotal = Quantity * Price;
		Tax = 0.0865 * Subtotal;
		Total = Subtotal + Tax;
		Change = Paid - Total;	
		
	}
	// Module 4
	public static void displayOutput() {
		
		System.out.println("-------------Sales Reciept---------------");
		System.out.println("");
		System.out.println("");
		System.out.println("Name:"+ ProductName);
		System.out.println("Quantity Purchased:" + Quantity);
		System.out.println("Unit Price:$"+ Price );
		System.out.println("Tax Charged:$"+ Tax);
		System.out.println("Subtotal $" + Subtotal);
		System.out.println("Amount Due:$"+ Total);
		System.out.println("Change Due Customer:$"+ Change);
		System.out.println("");
		System.out.println("");
		System.out.println("Thank You For Shopping With Us");	
		
	}	
			
			
		public static void main(java.lang.String[] args) {	
		
			// calling all Modules
			
			int i=1;
			for(int i1=1;i1<10;i1++)
	{	
		Greeting();
		getinput();
		process();
	 	displayOutput();
	
		} 	
	
		}
}
