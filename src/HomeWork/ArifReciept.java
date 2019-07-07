package HomeWork;
import java.util.Date;
import java.util.Scanner;
public class ArifReciept {

	
		
		private static final String CalculatorV5 = null;
		//All Global Variables
		static String productName;
		static int qtyPurchased;
		static double productPrice;
		static double cash;
		static Date currentDate = new Date();
		static String cashCredit;
		
		//Module Welcome Screen
		public static void welcome() {
			System.out.println("Welcom To PIIT");
			System.out.println("Please Enter The Information Below");
			System.out.println("");
		}
		
		//Module Take Input
		public static void entry() {
			boolean valid = false;
			
			valid=false;
			while(valid==false) {
				Scanner PIIT = new Scanner(System.in);
				System.out.print("Please Enter Product Name: \t");

				productName = PIIT.nextLine();
				
				if(!productName.matches("[a-zA-Z]+")) {
					System.out.println("Invalid Entry. Please Enter A Valid Product Name: \t");
					System.out.println("");

						}
					else {
						valid=true;
					}
			}
			
			
			
			
			valid = false;
			while(valid==false) {
			try {
			Scanner PIIT1 = new Scanner(System.in);
			System.out.print("Please Enter The Amount Of Products Purchased: \t");

			qtyPurchased = PIIT1.nextInt();
			if (qtyPurchased >0 && qtyPurchased <=100) {
				valid = true;
			}
			else {
				valid = false;
				System.out.println("Invalid Amount: Please Enter a Quantity Between (1 - 100)");
				System.out.println("");
			}
			}
			catch(Exception e){
				System.out.println("Not a valid entry:  Please Enter a number");
				System.out.println("");
			}
			}
				
			
			valid = false;
			while(valid==false) {
			try {
			Scanner PIIT1 = new Scanner(System.in);
			System.out.print("Please Enter The Price Of The Item: \t");
			productPrice = PIIT1.nextDouble();
			if (productPrice >0 && productPrice <=500) {
				valid = true;
			}
			else {
				valid = false;
				System.out.println("Invalid Amount: Please Enter a Product Amount Between ($1 - $500)");
				System.out.println("");

			}
			}
			catch(Exception e){
				System.out.println("Not a valid entry:  Please Enter a dollar Amount");
				System.out.println("");

			}
			}
			
			
			valid=false;
			while(valid==false) {
				Scanner PIIT = new Scanner(System.in);
				System.out.print("Would You Like To Pay Cash Or Credit: \t");
				cashCredit = PIIT.nextLine();
				
				if(cashCredit.equals("Cash")) {
					break;
				}
				if(cashCredit.equals("cash")) {
					break;	
				}
				
				if(cashCredit.equals("Credit")) {
					break;	
				}
				if(cashCredit.equals("credit")) {
					break;	
				}
				else {
					System.out.println("Invalid Entry. Please Enter Cash Or Credit");
					System.out.println("");
				}
					}
			
			
			
			
			valid = false;
			while(valid==false) {
			try {
			Scanner PIIT2 = new Scanner(System.in);
			System.out.print("Please Enter The Amount Of Cash Or Credit Received: \t");
			System.out.println("");
			cash = PIIT2.nextDouble();
			if (cash >0 && cash <=10000) {
				valid = true;
			}
			else {
				valid = false;
				System.out.println("Invalid Amount: Please Enter a Cash Amount Between ($1 - $10000)");
				System.out.println("");

			}
			}
			catch(Exception e){
				System.out.println("Not a valid entry:  Please Enter a dollar Amount");
				System.out.println("");

			}
			}
			
			
			
		}
		
		//Module Total
		public static double subTotal() {
			
			double total = qtyPurchased*productPrice;
			
			return total;
			}
		
		//Calculate Discount 
		public static double discount() {
			
			double discount;
			
			if (subTotal()>=100 && subTotal() <=250) {
				discount = subTotal()*.10;
			}
			else if (subTotal()>250 && subTotal() <=500) {
				discount = subTotal()*.15;
			}
			else if (subTotal()>500 && subTotal() <=750) {
				discount = subTotal()*.20;
			}
			else if (subTotal()>750 && subTotal() <=1000) {
				discount = subTotal()*.20;
			}
			else if (subTotal() > 1000){
				discount = subTotal()*.25;
			}
			else {
				discount = 0;
			}
			return discount;
		}
		
		public static double tax() {
			double tax = (subTotal()-discount()) * .0875;
			return tax;
		}
		
		public static double total() {
			double total = subTotal() - discount() + tax();
			return total;
		}
		
		//Module Change
		public static double change() {
			
			double change = cash-total();
			
			return change;
		}
		
		//Module Final Receipt
		public static void finalReceipt() {
			System.out.println("");
			System.out.println("");

			
			System.out.println("Thank You For Shopping At PIIT");
			System.out.println(currentDate);

			System.out.println("           Receipt");	

			System.out.println("");

			System.out.println("Customer Name: " + productName);
			System.out.println("Amount of Product Purchased: " + qtyPurchased);
			System.out.println("Price of The Items: $" + productPrice);
			System.out.println("Sub Total: $" + subTotal());
			System.out.println("Your Total Discount Is: " + discount());
			System.out.println("Tax: " + tax());
			System.out.println("You Grand Total Is : " + total());
			System.out.println("Cash Received: $" + cash);
			System.out.println("Change: $" + change());
		}

		public static void main(String[] args) {
			welcome();
			
			
			for(int i=1; i<=5; i++) { 
					System.out.println("Product Number: " +i);
					entry();
					finalReceipt();
					System.out.println("");
					System.out.println("");
					
					Scanner newScan = new Scanner(System.in);
					String ifContinue;
					System.out.print("Do you want to continue: \t");
					ifContinue = newScan.nextLine();
					if (ifContinue.equals("No")) {
						break;
					}


					if (ifContinue.equals("no")) {
						break;

					} 
			}
			
			

			System.out.println("Program Terminated");
			
			

		}
		

	
		
		
		
		
	}


