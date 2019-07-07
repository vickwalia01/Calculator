package Questions;


import java.util.Scanner;


public class Home_Work1 {

		public static void main(String[] args) {	
	   
			java.lang.String NameOfCustomer;
			int QuantityPurchased;
			double UnitPrice;
			double TotalAmountDue;
			
		
		System.out.println("***********Sales Reciept*************");
		System.out.println("Please follow Instructions");
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Customer Name:  ");
		NameOfCustomer = myscanner.nextLine();
		
		System.out.println("Quantity Purchased :  ");
		QuantityPurchased = myscanner.nextInt();
		
		System.out.println("Unit Price:   ");
		UnitPrice = myscanner.nextDouble();
		
		TotalAmountDue = QuantityPurchased * UnitPrice;
		
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("--------------Sales Reciept--------------");
		System.out.println("Customer Name is" + NameOfCustomer);
		System.out.println("Quantity Purchased is" + QuantityPurchased);
		System.out.println("Unit Price is "+ UnitPrice);
		System.out.println("============================================");
		System.out.println("Total Amout Due" + TotalAmountDue);
		
		
		
		
		
		
	}
	}

