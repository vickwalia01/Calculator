package Home_New;
import java.util.Scanner;
public class SalesReceiptV_3 {

	//Color Code
		public static final String reset = "\u001B[0m";
		public static final String black = "\u001B[30m";
		public static final String red = "\u001B[31m";
		public static final String green = "\u001B[32m";
		public static final String yellow = "\u001B[33m";
		public static final String blue = "\u001B[34m";
		public static final String purple = "\u001B[35m";
		public static final String cyan = "\u001B[36m";
		public static final String white = "\u001B[37m";	
		
		
		public static final String highlighted_black = "\u001B[40m";
		public static final String highlighted_red = "\u001B[41m";
		public static final String highlighted_green = "\u001B[42m";
		public static final String highlighted_yellow = "\u001B[43m";
		public static final String highlighted_blue = "\u001B[44m";
		public static final String highlighted_purple = "\u001B[45m";
		public static final String highlighted_cyan = "\u001B[46m";
		public static final String highlighted_white = "\u001B[47m";
		
		//All Global Variables
		static int maxProduct = 5;
		static int totalArray = 0;
		static int [] productNumber = new int [maxProduct];
		static String[] productName = new String [maxProduct];
		static int [] qtyPurchased = new int [maxProduct];
		static double [] productPrice = new double [maxProduct];
		static double[] cash = new double [maxProduct];
		static double [] subTotal = new double [maxProduct];
		static double [] tax = new double [maxProduct];
		static double [] change = new double [maxProduct];
		static double [] total = new double [maxProduct];
		static double [] discount = new double [maxProduct];
		
		
		
		
		//Method Welcome Screen
	public static void welcome() {
			System.out.println("Welcome To Target");
			System.out.println("Please Input Your Sale Items");
			System.out.println("");
		}
		
		//Module Take Input
	@SuppressWarnings("resource")
	public static void entry(int array) {
			boolean valid = false;
			
			productNumber [array]=array;
			System.out.println("Adding Product	    : " + productNumber [array]);

			
			valid=false;
			while(valid==false) {
				Scanner nscanner = new Scanner(System.in);
				System.out.print("Please Enter Product Name: \t");
				productName[array] = nscanner.nextLine();
				
				if(!productName[array].matches("[A-z]+")) {
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
			Scanner nscanner = new Scanner(System.in);
			System.out.print("Please Enter The Quantity of Purchase: \t");
			qtyPurchased [array] = nscanner.nextInt();
			
			if (qtyPurchased [array] >0 && qtyPurchased [array] <=100) {
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
			Scanner pscanner = new Scanner(System.in);
			System.out.print("Please Enter The Price Of The Item: \t");
			productPrice [array]= pscanner.nextDouble();
			if (productPrice[array] >0 && productPrice[array] <=500) {
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
			
	
			
			valid = false;
			while(valid==false) {
			try {
			Scanner pscanner = new Scanner(System.in);
			System.out.print("Please Enter The Amount Of Cash Or Credit Received: \t");
			System.out.println("");
			cash[array] = pscanner.nextDouble();
			if (cash[array] >=0 && cash[array] <=10000) {
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
	


		
	@SuppressWarnings("resource")
	public static void edit(int array) {
		Scanner editS = new Scanner(System.in);
		System.out.print("Edit By [ ProductNo(P#) | Product Name-Search(PNS) : \t");
		String selection = editS.nextLine();
		
		switch (selection)
		{
		case "P" :
			System.out.println("");
			System.out.println("Please Enter Product Number");
			String sNumber = editS.nextLine();
			for (int i=0; i<totalArray; i++) {
				if (productNumber[i] == Integer.parseInt(sNumber)) {
					
					entry(i);
					process(i);
					finalReceipt(i);
					System.out.println("");
					System.out.println("");
					break;
				}
			}
			break;
			
		default: 
			System.out.println("Not A Proper Input.  Please Enter Correct Information");
			edit(array);
		}
	}
	public static void process (int array) {
			
			subTotal[array] = subTotal(array);
			tax [array] = tax(array);
			change [array] = change(array);
			total [array] = total(array);
			discount [array] = discount(array);
			
		}
		
		//Module Total
	public static double subTotal(int array) {
			
			double total = qtyPurchased[array]*productPrice[array];
			
			return total;
			}
		
		//Calculate Discount 
		public static double discount(int array) {
			
			double discount;
			
			if (subTotal[array] >=100 && subTotal[array] <=250) {
				discount = subTotal[array]*.10;
			}
			else if (subTotal[array]>250 && subTotal[array] <=500) {
				discount = subTotal[array]*.15;
			}
			else if (subTotal[array]>500 && subTotal[array] <=750) {
				discount = subTotal[array]*.20;
			}
			else if (subTotal[array]>750 && subTotal[array] <=1000) {
				discount = subTotal[array]*.20;
			}
			else if (subTotal[array] > 1000){
				discount = subTotal[array]*.25;
			}
			else {
				discount = 0;
			}
			return discount;
		}
		
		public static double tax(int array) {
			double tax = (subTotal[array]-discount[array]) * .0875;
			return tax;
		}
		
		public static double total(int array) {
			double total = subTotal[array] - discount[array]+ tax[array];
			return total;
		}
		
		//Module Change
		public static double change(int array) {
			
			double change = cash[array]-total(array);
			
			return change;
		}
		
		@SuppressWarnings("resource")
		public static boolean Continue() {
			Scanner newScan = new Scanner(System.in);
			String ifContinue;
			System.out.print("Do you want to continue: [Yes Or No] \t");
			ifContinue = newScan.nextLine(); 
			if (ifContinue.equals("No")) {
				return false;
			}
			else if (ifContinue.equals("no")) {
				return false;
			}
			
			
			return true;
		}
		
		//Module Final Receipt
		public static void finalReceipt(int array) {
			System.out.println("");
			System.out.println("");

			
			System.out.println("Thank You For Shopping At Target");
		
			System.out.println("           Receipt ("+productNumber[array]+")     ");

			System.out.println("");

			System.out.println("Product Name: " + productName[array]);
			System.out.println("Quantity Purchased: " + qtyPurchased[array]);
			System.out.println("Price of The Items: $" + productPrice[array]);
			System.out.println("Sub Total: $" + subTotal[array]);
			System.out.println("Your Total Discount Is: " + discount[array]);
			System.out.println("Tax: " + tax[array]);
			System.out.println("Your Total Is : $" + total[array]);
			System.out.println("Cash Received: $" + cash[array]);
			System.out.println("Change: $" + change[array]);
			System.out.println("");
			System.out.println("");
			
		}
		
		public static void receiptData() {
		    System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s ", "P Number", "Product", "Quantity", "Price", "SubTotal", "Discount", "Tax", "Total", "Cash", "Change");
		    System.out.println();
		    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		}
		
		public static void entireReceipt(int array) {
	        System.out.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s ", productNumber[array], productName[array], qtyPurchased[array], productPrice[array], subTotal[array], discount[array], tax[array], total[array], cash[array], change[array]);
	        System.out.println();
		}

		
		public static void table() {
			receiptData();
			for(int i=0; i<=totalArray; i++) {
				if(productName[i]!= null) {
					entireReceipt(i);
				}
			}
		}
		@SuppressWarnings("resource")
		public static void selection(int array) {
			
			Scanner menu = new Scanner(System.in);
			System.out.print("What would you like to do? [Add(A) | Edit (E) | Delet(D) ] : \t");
			String menuSelection = menu.nextLine();
			
			switch (menuSelection) {
			case "A":
				System.out.println("");
				System.out.println("Please Input Sale Items Below :  \t");
				
				entry(array);
				process(array);
				finalReceipt(array);
				table();
				totalArray++;
				System.out.println("");
				System.out.println("");
				break;
				
			case "E":
				System.out.println(" Edit Infomration .. ");
				edit(array);
				table();
				
				break;
				
			case "D":	
				System.out.println(" Delete Infomration .. ");
				break;
				
			default:
				
				System.out.println( "[" + menuSelection + "] Is An Invalid Entry.  Please Choose From Below!!!!]" );
				selection(array) ;
			
			
			
			}
			
		}
		
		public static void main(String[] args) {
			welcome();
			
			do {
			
			selection(totalArray);
			if (Continue()==false) 
				break;
			}
			
			
			
			while (true);


			
			
	}
		}
		
		


	
	
	
	
	

