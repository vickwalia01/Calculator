package Questions;
import java.util.Scanner;
public class HomeWorkProblem {

	

	

		// All global Variables
			static java.lang.String nameOfEmployee;
			static double numberOfHourWorked;
			static double hourlyPayRate;
			static double grossPay;
			static double netPay;
			static double tax;
			
			//Module 1
			public static void welcome() {
				System.out.println("*****Emplyee Calculator V1.0******");
				System.out.println("Please Follow the Instruction");
				
			}
			
			//Module 2
			public static void getInput() {
			
		Scanner myscanner = new Scanner(System.in);
				
				System.out.print("Enter Employee Name: ");
				nameOfEmployee = myscanner.nextLine();
				
				System.out.print("Enter Total Hour Worked: ");
				numberOfHourWorked = myscanner.nextDouble();
				
				System.out.print("Enter Hourly Rate: ");
				hourlyPayRate = myscanner.nextDouble();
				
			}
			
			//Module 3
			public static void process() {
				
				grossPay = numberOfHourWorked * hourlyPayRate;
				
			}
			
			
			public static void tax() {
				if (grossPay <= 1500) {
					tax = grossPay * .15;
				}
				else if (grossPay >1500 && grossPay <= 2999) {
					tax = grossPay * .19;
				}
				else if (grossPay >=3000 && grossPay <= 4499) {
					tax = grossPay * .21;			
				}
				else if (grossPay >=4500 && grossPay <= 5999) {
					tax = grossPay * .23;	
				}
				else {
					tax = grossPay * .27;
				}
			}
			
			
			//Module 4
			public static void displayNetPay() {
				if (grossPay <= 1500) {
					netPay = grossPay - (grossPay * .15);
				}
				else if (grossPay >1500 && grossPay <= 2999) {
					netPay = grossPay - (grossPay * .19);
				}
				else if (grossPay >=3000 && grossPay <= 4499) {
					netPay = grossPay - (grossPay * .21);			
				}
				else if (grossPay >=4500 && grossPay <= 5999) {
					netPay = grossPay - (grossPay * .23);	
				}
				else {
					netPay = grossPay - (grossPay * .27);
				}
			}
			
			//Module 5
			public static void displayOutput() {
				
				
				System.out.println("");
				System.out.println("");
				System.out.println("==========Pay Slip====================");

				System.out.println("Employee name is: " + nameOfEmployee);
				System.out.println("Hour Worked: " + numberOfHourWorked);
				System.out.println("Pay Rate: $" + hourlyPayRate);
				System.out.println("======================================");

				System.out.println("Gross Pay: $" + grossPay);
				System.out.println("Tax: $" + tax);
				System.out.println("Net Pay: $" + netPay);
				
			}
			
			//Main Module
			public static void main(String[] args) {
				
				// calling all Modules
				
				int i=1;
				for(int i1=1;i1<10;i1++)
		{	
			welcome();
			getInput();
			process();
		 	displayOutput();
		
			} 	
		
			}
				
				
				//Calling all modules
				welcome();
				
				int employee = 9;
				
				for(int i=1; i<=10; i++) {
					
					System.out.println("Salary for Employee #: " + i);
		
				getInput();
				process();
				tax();
				displayNetPay();
				displayOutput();
				System.out.println("");
				
				Scanner newscan = new Scanner(System.in);
				java.lang.String ifContinue;
				System.out.print("Do you want to continue: \t");
				ifContinue = newscan.nextLine();
				if (ifContinue.equals("No")) {
					break;
				}
			
				}	

			}
}
		
	


