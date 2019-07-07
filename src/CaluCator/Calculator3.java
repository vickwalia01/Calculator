package CaluCator;

import java.util.Scanner;

public class Calculator3 {

	public static void main(String[] args) {

		 String NameOfEmployee;
		 double NumberOfHoursWorked;
		 double HourlyPayRate;
		 double GrossPay;
		 
		 System.out.println("********Employee Calculator*******");
		 System.out.println("Please follow Instructions");

		 Scanner myscanner = new Scanner(System.in);

		 
		 System.out.println("Enter Employee Name:");
		 NameOfEmployee = myscanner.nextLine();
		 System.out.println("Enter Number Hours Worked:");
		 NumberOfHoursWorked = myscanner.nextDouble();
		 System.out.println("Enter hourly pay Rate:");
		 HourlyPayRate = myscanner.nextDouble();
		 
		 GrossPay = NumberOfHoursWorked * HourlyPayRate;
		 
		 System.out.println("");
		 System.out.println("");
		 System.out.println("Employee Name Is:" + NameOfEmployee);
		 System.out.println("Employee Hours Worked Is:" +NumberOfHoursWorked);
		 System.out.println("Employee Rate Is:" +HourlyPayRate);
		 System.out.println("==================================");
		 System.out.println("Employee Gross Pay Is:$" +GrossPay);
		 System.out.println("Thank You Working With Our Company");
				
				
				
				
			}

		}
		
		
		
		
		
		
		
		
		
		
		



