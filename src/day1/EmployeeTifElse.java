package day1;

import java.util.Scanner;

public class EmployeeTifElse {

	
		// TODO Auto-generated method stub
		// All global Variables
					static java.lang.String nameOfEmployee;
					static double numberOfHourWorked;
					static double hourlyPayRate;
					static double grossPay;
					static double netPay;
					static double tax;
					
					//Module 1
					public static void wellcome() {
						System.out.println("*****Emplyee Calculator******");
						System.out.println("Please Follow the Instruction");
						
					}
					
					//Module 2
					public static void getInput() {
						
					// Taking Input 1 - Employee name
				Scanner namescanner = new Scanner(System.in);
			    System.out.print("Enter Employee Name: ");
					nameOfEmployee = namescanner.nextLine();
				  
					
					// Taking Input 2 - Total hour

					boolean isValid= false;
					while (isValid==false)	

					{	
						try	
						{
							Scanner HourScanner = new Scanner(System.in);
							System.out.print("Enter Total Hour Worked: ");
							numberOfHourWorked = HourScanner.nextDouble();
							if ( numberOfHourWorked>= 0 && numberOfHourWorked <=80)
							{
								isValid =true;
							}
							else
							{
								isValid= false;
								System.out.println("The value is not valid please input[0-80]");
							}
						}
						catch(Exception e)
						{
							System.out.println("Input should be only Number[0-80]");

						}


					}
					// Taking Hourly Rate
					isValid=false;
					while(isValid==false)
					{
						try
						{
							Scanner HrScanner= new Scanner(System.in);
							System.out.print("Enter Hourly Rate: ");
							hourlyPayRate= HrScanner.nextDouble();
							if(hourlyPayRate >=10 && hourlyPayRate<=50)	
							{
								isValid = true;
							}
							else
							{
								isValid = false;
								System.out.println("The value is not valid please input[10-50]");
							}
						}
						catch(Exception e)
						{
							System.out.println("Input should be only Number[10-50]");
						}
					}
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
						System.out.println("Hours Worked: " + numberOfHourWorked);
						System.out.println("Pay Rate: $" + hourlyPayRate);
						System.out.println("======================================");

						System.out.println("Gross Pay: $" + grossPay);
						System.out.println("Tax: $" + tax);
						System.out.println("Net Pay: $" + netPay);
						
					}
					
					//Main Module
					public static void main(java.lang.String[] args) {
						// TODO Auto-generated method stub
			 

						//Calling all modules
						
						wellcome();
						getInput();
						process();
						tax();
						displayNetPay();
						displayOutput();
						System.out.println("");
						
						

					}
	
				
	

	}


