package HomeWork;

import java.util.Scanner;

public class SalesRecieptifElse {

	static final int maxquantity = 5;
	static int totalarraycounter = 0;
	
	
	
	// ALL Global Variables 
	static java.lang.String[] CustomerName = new String [maxquantity];
	static int[] Quantity, Serialno = new int [maxquantity];
	static	double[] Price,Tax,Total,Paid,Change,Subtotal = new double[maxquantity];
	
	// Module 1
	 public static void Greeting() {
		System.out.println("---------Welcome To Target-----------");
		System.out.println("*********Please  Input Sale Items********");
	}
	
//	 Data Entry input[add,edit,delete] system
	 
	// Module 2
	public static void getinput(int arraycounter) {
		boolean name = false;
		
		Serialno[arraycounter] = arraycounter;
		System.out.println("Adding Product  :" + Serialno [arraycounter]);

		
		name=false;
		while(name==false) 
		{
		try
		{
			Scanner myscanner = new Scanner(System.in);
			System.out.print("Customer Name: ");
			CustomerName [arraycounter]= myscanner.nextLine();
		if (!CustomerName[arraycounter].matches("[a-zA-Z]+")) {
			System.out.println("Pleas enter a valid Custmoner Name:\t");
			System.out.println("");
		}
			else {
				name = true;
			}
			}
		
			catch (Exception e)
			{
				System.out.println("Please enter a valid name");
			}
		
	}
		// Quantity limit/ input numbers only
	boolean limit=false;
		while(limit==false)
		{
			try
		{
				
		Scanner QScanner = new Scanner(System.in);
		System.out.print("Quantity Purchased:");
		Quantity[arraycounter]=QScanner.nextInt();
	if (Quantity[arraycounter]>=1 && Quantity[arraycounter]<=10)
		{
			limit=true;
		}
		else 
		{
			limit=false;
			System.out.println("Min or Max Quantity has reached please input[1-10]");
		}
		}
			catch (Exception e)
			{
				System.out.println("Please Input numbers only[1-10]");
			}
			}
		
		// Item price limit/ input numbers only
		
		boolean limit1=false;
		while(limit1==false)
		{
			try
		{
				
		Scanner PriceScanner= new Scanner(System.in);
		System.out.print("Price Per Item:$");
		Price[arraycounter] = PriceScanner.nextDouble();
		if(Price [arraycounter]>=1 && Price[arraycounter]<=500)
		{
			limit1=true;
		}
		else
		{
			limit1=false;
			System.out.println("Max unit price cannot Exceed $500");
		}
		}
			catch(Exception e)
			{
				System.out.println("Please Input numbers only[1-500]");
			}
		
			}
		
		//amount paid
		
		Scanner pScanner= new Scanner(System.in);
		System.out.print("Paid Amount:$");
		Paid[arraycounter] = pScanner.nextDouble();
		
		
		}	
	
	
	public static double Discount(int arraycounter) {
	  double discount;
	 
		if(Subtotal[arraycounter] >=1 && Subtotal[arraycounter] <=100) {
			discount = 0;
		}
		else if (Subtotal[arraycounter] >=101 && Subtotal[arraycounter] <=500) {
			discount = Subtotal[arraycounter] * .05;
		}
		else if(Subtotal[arraycounter] >=501 && Subtotal[arraycounter] <=1000) {
			discount = Subtotal[arraycounter] * .10;
		}
		else {
			discount = Subtotal[arraycounter] * .15;
		}
		return discount;
	}

	// Module 3
	public static double process(int arraycounter) {
	
		Subtotal[arraycounter] = Quantity[arraycounter] * Price[arraycounter];
		Tax[arraycounter] = 0.08 * Subtotal[arraycounter];
		Total[arraycounter] = Subtotal[arraycounter] - Discount(0)  + Tax[arraycounter];
		Change[arraycounter] = Paid[arraycounter] - Total[arraycounter];	
		
		return Change[arraycounter];
		}
	


	// Module 4
	public static void displayOutput(int arraycounter) {
		
		System.out.println("-------------Sales Reciept---------------");
		System.out.println("");
		System.out.println("");
		System.out.println("Name:"+ CustomerName[arraycounter]);
		System.out.println("Quantity Purchased:" + Quantity[arraycounter]);
		System.out.println("Unit Price:$"+ Price[arraycounter] );
		System.out.println("Discount Recieved:$"+ Discount(0));
		System.out.println("Tax Charged:$"+ Tax[arraycounter]);
		System.out.println("Subtotal $" + Subtotal[arraycounter]);
		System.out.println("Amount Due:$" +Total[arraycounter]);
		System.out.println("Change Due Customer:$"+ Change[arraycounter]);
		System.out.println("");
		System.out.println("");
		System.out.println("Thank You For Shopping Please Come Again :)");	
		System.out.println("");
		System.out.println("");
		System.out.println("============================================");
	}	
			
			
		public static void main(java.lang.String[] args) {	
		
			// calling all Modules
			
			Greeting();
			for(int x=0;x<5;x++)
			{System.out.println("Product Number: " +x);
			getinput(totalarraycounter);
			process(totalarraycounter);
			displayOutput(totalarraycounter);
			System.out.println("");
			System.out.println("");
			
				
				
				
		
			
			Scanner newScan = new Scanner(System.in);
			java.lang.String ifContinue;
			System.out.print("Do you want to continue: \t");
			ifContinue = newScan.nextLine();
		
			if (ifContinue.equals("No")) {
				System.out.println("Sale Ended");break;
			}
			if (ifContinue.equals("no")) {
				System.out.println("Sale Ended");break;
			
				 
			
		

		}
}
			
		
		}
}

