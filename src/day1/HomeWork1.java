package day1;
import java.util.Scanner;

public class HomeWork1 {
	
		static String ProductName;
		static int Quantity;
		static	double Price;
		static	double Tax;
		static	double Total;
		static	double Paid;
		static	double Change;
		static	double Subtotal;
		static String PaymentType;	
		static String Cash;
		static String Credit;
		
		// Module 1
		 public static void Greeting() {
			System.out.println("---------Welcome to Food Bazaar-----------");
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
				
				System.out.println("Payment Type");
				PaymentType = myscanner.nextLine();		
				
		       }
		
			public static void process() {
				
				
			
				
				
				Subtotal = Quantity * Price;
				Tax = 0.0865 * Subtotal;
				Total = Subtotal + Tax;
			if(PaymentType== Credit)
			{System.out.println("Thank you");
			
			}  
			else if (PaymentType== Cash);
			{ System.out.println("Please pay now");
			}
				}


			
			
			
			
			
			
		
			public static void main(String[] args) {
	
				Greeting();
				getinput();
				process();
			 	
			
			
			
			}

}
