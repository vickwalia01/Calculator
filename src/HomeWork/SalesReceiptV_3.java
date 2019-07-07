package HomeWork;
import java.util.Scanner;
public class SalesReceiptV_3 {
// global variables
static int MaxProducts=10;
static int totalarray=0;
static int [] productNumber=new int[MaxProducts];
static String [] ProductName= new String[MaxProducts];	
static int[] Quantity= new int [MaxProducts];
static double[] Price= new double[MaxProducts];
static double[] Subtotal= new double[MaxProducts];
static double[] Total= new double[MaxProducts];
static double[] Tax= new double[MaxProducts];
static double[] Discount= new double[MaxProducts];
static double[] Change= new double[MaxProducts];
static double[] Paid= new double [MaxProducts];

// Method Welcome Screen
public static void Welcome() {
	System.out.println("Welome To Target");
	System.out.println("Please Input Your Sale");
	System.out.println("");
}
	
// Module#1 Take Input
public static void Entry(int array) {
	boolean valid= false;
	
	productNumber[array]=array;
	System.out.println("Adding Product       :" + productNumber[array]);
	
	valid =false;
	while (valid==false) {
		Scanner ent= new Scanner(System.in);
		System.out.println("Please Enter Product Name: \t");
		ProductName[array]= ent.nextLine();
		
	if (!ProductName[array].matches("[A-z]+")) {
		System.out.println("Invalid Input Please Enter a Valid Product Name:    ");
		System.out.println("");
		
	}
	else { valid=true;
	}
		
	}


	valid = false;
	while(valid= false) {
		try {
	Scanner qscanner= new Scanner(System.in);
	System.out.print("Please Enter the Quantity Purchased:  ");
	Quantity[array]= qscanner.nextInt();
	
	if (Quantity[array]>= 1 && Quantity[array] <=10) {
		valid=true;
	}
	else {valid=false;
	System.out.println("Minimum or Maximum Quantity Reached Please input [1-10]  ");
	System.out.println("");
	}
	}
		catch(Exception e) {
			System.out.println("InValid Entry Please Input[1-10]");
		}
	}

	valid= false;
	while(valid= false) {
	try {
		Scanner pscanner= new Scanner(System.in);
		System.out.print("Please Enter The Item Price:    ");
		Price[array]= pscanner.nextDouble();
		if(Price[array]>=0 && Price[array]<=500) {
			valid=true;
		}
		else {valid= false;
		System.out.println("Invalid Price. Please Input Price[$1 - $500]");
		System.out.println("");
		}
		}
	catch(Exception e) {
		System.out.println("Invalid Entry Please Enter Valid a Price");
		System.out.println("");
	}
	}
	
	//amount paid
	
			Scanner pScanner= new Scanner(System.in);
			System.out.print("Paid Amount:$");
			Paid[array] = pScanner.nextDouble();
			
			
		public static void Edit (int array) {
			Scanner escanner= new Scanner(System.in);
			System.out.println("Edit by [Product Number(P#) | Product Name-Search(PNS) ] : \t ");
			String selection= escanner.nextLine();
			
			switch(selection)
			{
			case "P#" :
				System.out.println("");
				System.out.println("Please Enter Product Number:");
			    String ProductNum = escanner.nextLine();
			    for(int i=0;i<totalarray;i++) {
			    	if (productNumber[i]== Integer.parseInt(ProductNum)) {
			    		
			    		Entry(i);
			    		Calculation(i);
			    		Finalreceipt(i);
			    		System.out.println("");
			    		System.out.println("");
			    		break;
			    	}
			    }
			    break;
			    default:
			    	System.out.println("Invalid Input. Please Check Entry ");
			    	Edit(array);
			    
			}
		}
public static Calculation(int array) {
	
	Subtotal[array]= subtotal(array);
	Discount[array]= discount(array);
	Tax[array]= tax(array);
	Total[array]= total(array);
	Change[array]= change(array);	
}
	// Module #2 Subtotal
public static double subtotal(int array) {
	
	double subtotal1= Quantity[array]* Price[array];
	return subtotal1;
	
}
	// Module #3 Discount
public static double discount(int array) {
	double discount;
	if (Subtotal[array] >= 1 && Subtotal[array]<= 100) {
		discount = 0;
	} else if (Subtotal[array] >= 101 && Subtotal[array] <= 500) {
		discount = Subtotal[array] * .05;
	} else if (Subtotal[array]>= 501 && Subtotal[array] <= 1000) {
		discount = Subtotal[array] * .10;
	} else {
		discount = Subtotal[array] * .15;
	}
	return discount;
}
	public static double tax(int array) {
		double tax= (Subtotal[array]* .0875);
		return tax;
}
	public static total(int array) {
	double total= Subtotol[array]- Discount[array]+ Tax[array];
	return total;
	}
	
	public static double change(int array) {
		double change= Paid[array]- total(array);
		return change;
	}
	
	public static boolean Continue() {
	Scanner cscan= new Scanner(System.in);
	String ifContinue;
	System.out.println("Do You Want To Continue: [Yes or No] \t");
	ifContinue = cscan.nextLine();
	if (ifContinue.contentEquals("No")) {
		return false;
	}
	else if (ifContinue.contentEquals("no")) {
	
		return false;
	}
	return true;
		
	}
	// Final Receipt OutPut
	public static void Finalreceipt(int array) {
		
	System.out.println("");
	System.out.println("");
	System.out.println("===============Thank you for Shopping At Target============");
	System.out.println("              Receipt("+ productNumber[array]+")       " );
	System.out.println("");
	System.out.println("Product Name:"+ProductName[array] );
	System.out.println("Quantity of Products Purchased:"+ Quantity[array]);	
	System.out.println("Price Per Item"+ Price[array]);	
	System.out.println("SubTotal"+ Subtotal[array]);
	System.out.println("Discount Recieved"+Discount[array]);
	System.out.println("Tax Charged"+ Tax[array]);
	System.out.println("Total Amount Due "+ Total[array]);
	System.out.println("Amount Paid "+Paid[array]);
	System.out.println("Change Due Customer"+ Change[array]);
	System.out.println("");
	System.out.println("");
	System.out.println("================================================================");
	}
	
	public static void ReceiptData() {
		
	System.out.println("==============================================================================================================================================================");
	System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s ","P Number","Product","Quantity","Price","Subtotal","Subtotal","Discount","Tax","Total","Paid","Change");
	System.out.println("");	
	System.out.println("===============================================================================================================================================================");
	}
		
	public static void  EntireReceipt(int array) {
		
	System.out.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s ", productNumber[array], ProductName[array],Quantity[array],Price[array],Subtotal[array],Discount[array], Tax[array], Total[array], Paid[array], Change[array]);
	System.out.println("");
	}
	public static void Table() {
		
		RecieptData();
		for(int i=0; i<=totalarray;i++) {
			if(ProductName[i]!= null) {
				EntireReciept(i);
			}
		}
	}
	
	public static void Selection(int array) {
		
		Scanner menu= new Scanner(System.in);
		System.out.println("What would you like to do? [ADD(A)] | Edit(E)  | Delete(D) ]: \t ");
		String menuselection = menu.nextLine();
		
		switch(menuselection) {
		case"A":
			System.out.println("");
			System.out.println("Please Enter The Information below: \t");
			
			Entry(array);
			Process(array);
			Finalreciept(array);
			Table();
			totalarray++;
			System.out.println("");
			System.out.println("");
			break;
			
		case"E": 
			System.out.println("Edit Information...");
			Edit(array);
			Table();
			
			break;
			
		case"D":
		System.out.println("DELETE Information.....");
	
		break;
		
		default:
			System.out.println("[" + menuselection + "] [ Is an Invalid Entry. Please Choose From Below!!!!]");
			Selection(array);
		}
	}
	public static void main(String[] args) {		
		Welcome();
		
		do {
			Selection(totalarray);
			if (Continue()== false)
				break;
			
		}
	
      while (true);
	

	
	
}
	



}

}