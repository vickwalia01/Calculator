package HomeWork;
//import java.util.ArrayList;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;





public class SalesRecieptArray {
	private static final String BLUE_BACKGROUND = "\u001B[44m";
	private static final String WHITE = "\u001B[37m";
	private static final String RESET = "\u001B[0m";
	private static final String RED = "\u001B[31m";
	private static final String BLUE = "\u001B[34m";
	
	// ALL Global Variables
	static final int maxproducts = 100;
	static int Totalarraycount= 0;
	static int[]productnum=new int[maxproducts];
//	static ArrayList<String>name=new ArrayList(maxproducts);
	public static final String Sales_Reciept = System.getProperty("user.dir") + "/EmployeeSalary.xlsx";
	static String[] ProductName= new String[maxproducts];
	static int []Quantity= new int [maxproducts];
	static double[]Price= new double[maxproducts];
	static double[]Discount= new double[maxproducts];
	static double[]Tax=new double[maxproducts];
	static double[]Subtotal=new double[maxproducts];
	static double[]Total= new double[maxproducts];
    static double[]paid= new double[maxproducts];
    static double[]Change=new double[maxproducts];
	// Module 1
	public static void Greeting() {
		System.out.println("---------Welcome To Target-----------");
		System.out.println("*********Please Input Sale Items********");
	}

	// Module 2
	public static void getinput(int array) {
	boolean name = false;
	

	// Creating Product numbers 
	productnum [array]= array;
	System.out.println("Adding Prouct : " + productnum [array]);

	name=false;
	while(name==false)
	{
	
	
	Scanner myscanner = new Scanner(System.in);
	System.out.print("Product Name: ");
	ProductName[array] = myscanner.nextLine();
	if(!ProductName[array].matches("[a-zA-Z]+")) {
		System.out.println("Invalid Entry. Please Enter A Valid Product Name: \t");
		System.out.println("");
	}
	else {
	name = true;
	}
	}
	
	

	// Quantity limit/ input numbers only
	boolean limit=false;
	while(limit== false)
	{
	try
	{
	Scanner QScanner = new Scanner(System.in);
	System.out.print("Quantity Purchased:");
	Quantity[array] = QScanner.nextInt();
	if (Quantity[array]>=1 && Quantity[array] <=10)
	{
	limit= true;
	}
	else
	{
	limit= false;
	System.out.println("Min or Max Quantity has reached please input[1-10]");
	}
	}
	catch (Exception e)
	{
	System.out.println("Please Input numbers only[0-10]");
	}
	}
	
	
	// Item price limit/ input numbers only
	limit=false;
	while(limit==false)
	{
	try
	{
	@SuppressWarnings("resource")
	Scanner QScanner= new Scanner(System.in);
	System.out.print("Price Per Item:$");
	Price[array] = QScanner.nextDouble();
	if(Price[array]>1 && Price[array]<=500){
	limit=true;
	}
	else {

	limit=false;
	System.out.println("Max unit price cannot Exceed $500");
	}
	}
	catch(Exception e){
	System.out.println("Please Input numbers only[$1-$500]");
	}
	}
	
	
	//amount paid
	Scanner pScanner= new Scanner(System.in);
	System.out.print("Paid Amount:$");
	paid[array] = pScanner.nextDouble();  
	}
	
	// Module #3
	public static void editData(int array ) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(BLUE + "Edit By [ productnum(P#) |Product Name-Search(PNS) : \t" + RESET);
		String PMenuSelect = scanner.nextLine();
		switch(PMenuSelect) {
		case "P#" : 
			System.out.println("");
			System.out.print(BLUE_BACKGROUND + WHITE + " Enter Product No to EDIT : \t" + RESET);
			String productnum1 = scanner.nextLine();
			for(int i=0;i<Totalarraycount;i++) {
				if(productnum[i]==Integer.parseInt(productnum1) )	{
					getinput(i);
					calculatetotal(i);
					displayOutput(i);
					break;
				}
			}
			break;
			
		default:
			
			System.out.println(RED + " [" + PMenuSelect + "] is not a valid Choice correct Action !!!!]" + RESET);
			editData(array) ;
		}
	}
		
	// Module 4 ==Calculator
		public static void calculatetotal(int array ) {
			Subtotal[array] = Subtotal(array);
			Tax[array]= Tax(array);
			Discount[array]= Discount(array);
			Total[array] = Total(array);
			Change[array]= Change(array);

		}
	
	// Module# 5
	public static double Subtotal(int array) {
	
		
	double	subTotal = Quantity[array] * Price[array];	
		
		return subTotal;
		}
	
	//Module # 6
	public static double Discount(int array) {
		double discount;
		if (Subtotal[array] >=1 && Subtotal[array]<=100) {
			discount = 0;
		} else if (Subtotal[array] >=101 && Subtotal[array] <=500) {
			discount = Subtotal[array] * .05;
		} else if (Subtotal[array]>=501 && Subtotal[array] <=1000) {
			discount = Subtotal[array] * .10;
		} else {
			discount = Subtotal[array] * .15;
		}
		return discount;
	}

	// Module # 7
	public static double Tax(int array) {
	
		
	double Tax= (Subtotal[array]- Discount[array])* .08;
		return Tax;

		
	}
//Module # 7
	public static double Total(int array) {
		
		double Total= Subtotal[array]- Discount[array] + Tax[array];
		return Total;
	}
	
//	Module #8
	public static double Change(int array) {
		
		
	double Change=  paid[array] - Total[array];
		return Change;
	}
	
	// Module 9
	public static void displayOutput(int array) {
	System.out.println("-------------Sales Reciept---------------");
	System.out.println("");
	System.out.println("");
	System.out.println(" Receipt"+productnum[array]);
	System.out.println("");
	System.out.println("Name:"+ ProductName[array]);
	System.out.println("Quantity Purchased:" + Quantity[array]);
	System.out.println("Unit Price:$"+ Price[array] );
	System.out.println("Subtotal $" + Subtotal[array]);
    System.out.println("Discount Recieved:$"+ Discount[array]);
	System.out.println("Tax Charged:$"+ Tax[array]);
	System.out.println("Amount Due:$" +Total[array]);
	System.out.println("Change Due Customer:$"+ Change[array]);
	System.out.println("");
	System.out.println("");
	System.out.println("Thank You For Shopping Please Come Again :)");
	System.out.println("");
	System.out.println("");
//	System.out.println("============================================");
	}
	
	//Module # 10
	public static void displayTableHead() {
	    System.out.println("------------------------------------------------------------------------------------------------");
	    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s" , "productnum","Product Name", "Quantity", "Price", "Subtotal","Discount","Tax","Total","Change");
	    System.out.println();
	    System.out.println("---------------------------------------------------------------------------------------------------");
	}
	
	// Module # 11
	public static void displayTableData(int array) {
        System.out.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s",productnum[array],ProductName[array], Quantity[array], Price[array], Subtotal[array],Discount[array],Tax[array], Total[array],Change[array]);
        System.out.println();
	}
	// Module # 12
	public static void displayTable() {
		displayTableHead();
		for(int i=0; i<=Totalarraycount;i++) {
			if(ProductName[i]!=null) {
				displayTableData(i);
	
			}
		}
	}
	
	//Module # 13
	@SuppressWarnings("resource")
	public static void displayMenu(int array) {		
		
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.print(BLUE + "Select an Action [ Add(A) | Edit(E) | Delete(D) ] : \t" +RESET);
		String PMenuSelect = scan.nextLine();

		switch(PMenuSelect) {

		case "A" : 
			System.out.println("");
//			System.out.println(BLUE_BACKGROUND + WHITE + " Product  Name, Quantity Purchased & Price per Item" + RESET);

			getinput(array);
			calculatetotal(array);
			displayOutput(array);
			displayTable();
			Totalarraycount++;
		
			break;

		case "E" : 
			System.out.println(BLUE_BACKGROUND + WHITE + " Edit Infomration .. " + RESET);
			editData(array);
			displayTable();
			break;
			

		case "D" : 
			System.out.println(BLUE_BACKGROUND + WHITE + " Delete Infomration .. " + RESET);
			break;

		default:
			
			System.out.println(BLUE + " [" + PMenuSelect + "] is not a valid Select correct Action !!!!]" + RESET);
			displayMenu(array) ;
		}
	}
	
	//Module # 14
	@SuppressWarnings("resource")

public static boolean doYouWantToContinue() {
		
		Scanner scan;
		scan = new Scanner(System.in);

		System.out.println("");
		System.out.print(BLUE + "Do you want to continue [No(N) | Yes(Y)] : \t" + RESET );
		char cContinue = scan.next().charAt(0);
		if(Character.toUpperCase(cContinue)=='Y') {
			return true;
		}

		return false;
	}
	
// Module # 15 Main Module
	@SuppressWarnings({ "resource", "unused" })

	public static void main(String[] args) {
		// calling all Modules

		Greeting();
		
	
		
		do {
			displayMenu(Totalarraycount);
			if(doYouWantToContinue()==false) break;
			} while (true);
		
		
		
		System.out.println("Sale Ended ....!!!");


			
			}
		}

	

