package HomeWork;
import java.util.Scanner;
public class MyCalculator {

   static String EmpName;
	static double HourlyRate;
	static double HoursWorked;
	static double TotalPay;
	
	
	static void Greeting() {
	
	System.out.println("========== Welcome to the Employee Calculator");
	System.out.println("Please make a selection");
	
	}
	
	static void GetInput() {
		Scanner myscanner=new Scanner(System.in);
	   System.out.print("Enter Employee name:");
	   EmpName = myscanner.nextLine();
	   System.out.print("Enter hourly Rate:");
	   HourlyRate = myscanner.nextDouble();
	   System.out.print("Enter Total Hours Worked:");
	   HoursWorked = myscanner.nextDouble();
	}
	
	static void Process() {
		Scanner pscanner=new Scanner(System.in);
		TotalPay = HourlyRate * HoursWorked;
		
		}
	
	static void DisplayOutPut() {
		System.out.println("Wage Calculator");
		System.out.println("=====================================");
		System.out.println("");
		System.out.println("");
		System.out.println("Employee Name:"+ EmpName);
		System.out.println("Hourly pay Rate:"+ HourlyRate);
		System.out.println("Total hours Worked:"+ HoursWorked);
		System.out.println("Total Pay Due:"+TotalPay);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		for(int i=0; i <=5;++i)
		{	
		Greeting();
		GetInput();
		Process();
		DisplayOutPut();
		
		System.out.println("Thank For working");
	
	}
}
}