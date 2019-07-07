package array_HomeWork;
import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_reciept {
	
	
	
	//All Global Variables
	static int maxProduct = 100;
	static int totalArray = 0;
	static int [] productNumber = new int [maxProduct];
	static String[] productName = new String [maxProduct];
	static int [] qtyPurchased = new int [maxProduct];
	static double [] productPrice = new double [maxProduct];
	static double [] cash = new double [maxProduct];
	static Date currentDate = new Date();
	static String [] cashCredit = new String [maxProduct];
	
	static double [] subTotal = new double [maxProduct];
	static double [] tax = new double [maxProduct];
	static double [] change = new double [maxProduct];
	static double [] total = new double [maxProduct];
	static double [] discount = new double [maxProduct];
	
	
	public static String file = System.getProperty("user.dir") + "/SalesReceiptV4_Apache.xlsx";

	
	
	
	//Method Welcome Screen
public static void welcome() {
		System.out.println("Welcom To PIIT");
		System.out.println("Please Enter The Information Below");
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
			Scanner PIIT = new Scanner(System.in);
			System.out.print("Please Enter Product Name: \t");
			productName[array] = PIIT.nextLine();
			
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
		Scanner PIIT1 = new Scanner(System.in);
		System.out.print("Please Enter The Amount Of Products Purchased: \t");
		qtyPurchased [array] = PIIT1.nextInt();
		
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
		Scanner PIIT1 = new Scanner(System.in);
		System.out.print("Please Enter The Price Of The Item: \t");
		productPrice [array]= PIIT1.nextDouble();
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
		
		
		valid=false;
		while(valid==false) {
			Scanner PIIT = new Scanner(System.in);
			System.out.print("Would You Like To Pay Cash(C) Or Credit(R): \t");
			cashCredit[array] = PIIT.nextLine();
			
			if(cashCredit[array].equals("C")) {
				break;
			}
			if(cashCredit[array].equals("c")) {
				break;	
			}
			
			if(cashCredit[array].equals("R")) {
				break;	
			}
			if(cashCredit[array].equals("r")) {
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
		cash[array] = PIIT2.nextDouble();
		if (cash[array] >0 && cash[array] <=10000) {
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
	System.out.print("Edit By [ ProductNo(P) | Name-Search(PN) : \t");
	String selection = editS.nextLine();
	
	switch (selection.toUpperCase())
	{
	case "P" :
		System.out.println("");
		System.out.println("Please Enter Product Number");
		String pNumber = editS.nextLine();
		for (int i=0; i<totalArray; i++) {
			if (productNumber[i] == Integer.parseInt(pNumber)) {
				
				entry(i);
				process(i);
				finalReceipt(i);
				System.out.println("");
				System.out.println("");
				break;
			}
		}
		break;
	
	case "PN":
		
		System.out.println("");
		System.out.println("Please Enter Product Name");
		String pName = editS.nextLine();
			if (productName[array] == (pName.toUpperCase())) {
				
				entry(array);
				process(array);
				finalReceipt(array);
				System.out.println("");
				System.out.println("");
				break;
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
		
		double subtotal = qtyPurchased[array]*productPrice[array];
		
		return subtotal;
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
		double tax = (subTotal[array]-discount(array)) * .0875;
		return tax;
	}
	
	public static double total(int array) {
		double total = (subTotal[array] - discount(array)) + tax[array];
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

		
		System.out.println("Thank You For Shopping At PIIT");
		System.out.println(currentDate);

		System.out.println("           Receipt ("+productNumber[array]+")     ");

		System.out.println("");

		System.out.println("Customer Name: " + productName[array]);
		System.out.println("Amount of Product Purchased: " + qtyPurchased[array]);
		System.out.println("Price of The Items: $" + productPrice[array]);
		System.out.println("Sub Total: $" + subTotal[array]);
		System.out.println("Your Total Discount Is: " + discount[array]);
		System.out.println("Tax: " + tax[array]);
		System.out.println("You Grand Total Is : " + total[array]);
		System.out.println("Cash Received: $" + cash[array]);
		System.out.println("Change: $" + change[array]);
	}
	
	public static void receiptData() {
	    System.out.println("------------------------------------------------------------------------------------------------------------------------------");
	    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s ", "P Number", "Product", "Quantity", "Price", "SubTotal", "Discount", "Tax", "Total", "Cash", "Change");
	    System.out.println();
	    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public static void excell(int array) {
		DecimalFormat f = new DecimalFormat("#.##");
		XSSFWorkbook receipt = new XSSFWorkbook();
		XSSFSheet mysheet = receipt.createSheet("Sales Receipt");
		
		String [] columnHeader = {"P Number", "Product", "Quantity", "Price", "SubTotal", "Discount", "Tax", "Total", "Cash", "Change"};
		Row header = mysheet.createRow(0);
		int firstHeader = 0;
		for(int i=0; i<10;i++) {
			Cell headerSection = header.createCell(firstHeader++);
			headerSection.setCellValue((String) columnHeader[i]);
		}
		
		Object[][] rowData = {
				{productNumber[array], productName[array], "$"+f.format(qtyPurchased[array]), "$"+f.format(productPrice[array]), "$"+f.format(subTotal[array]), "$"+f.format(discount[array]), "$"+f.format(tax[array]), "$"+f.format(total[array]), "$"+f.format(cash[array]), "$"+f.format(change[array])},
		};
		
		int rowPointer = 1;
		for(int m=0; m<rowData.length;m++) {
			Row row = mysheet.createRow(rowPointer++);

			int colPointer = 0;
			for(int x=0; x<10;x++) {
				Cell cell = row.createCell(colPointer++);
				if (rowData[m][x] instanceof Integer) {
					cell.setCellValue((Integer) rowData[m][x]);
				} else if (rowData[m][x] instanceof String) {
					cell.setCellValue((String) rowData[m][x]);
				} else if (rowData[m][x] instanceof Double) {
					cell.setCellValue((Double) rowData[m][x]);
				}
			}

		}
		
		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			receipt.write(outputStream);
			receipt.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
	

	public static void entireReceipt(int array) {
		DecimalFormat f = new DecimalFormat("#.##");
        System.out.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s ", productNumber[array], productName[array], "$"+f.format(qtyPurchased[array]), "$"+f.format(productPrice[array]), "$"+f.format(subTotal[array]), "$"+f.format(discount[array]), "$"+f.format(tax[array]), "$"+f.format(total[array]), "$"+f.format(cash[array]), "$"+f.format(change[array]));
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
		System.out.println("What would you like to do? [Add(A) | Edit (E) | Delet(D): \t");
		String menuSelection = menu.nextLine();
		
		switch (menuSelection.toUpperCase()) {
		case "A":
			System.out.println("");
			System.out.println("Please Enter The Information Below: \t");
			
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
			//System.out.println("[ Option Selected " + cMenueSelection + " is not available !!!!]");
			System.out.println( "[" + menuSelection + "] Is An Invalid Entry.  Please Choose From Below!!!!]" );
			selection(array) ;
		
		
		}
		
	}
	
	public static void main(String[] args) {
		welcome();
		
		do {
		
		selection(totalArray);
		int array = 0;
		excell(array);
		if (Continue()==false) 
			break;
		}
		
		
		
		while (true);


		
		
}
	}
	
	



	
	
	
	
	
	
	
	


