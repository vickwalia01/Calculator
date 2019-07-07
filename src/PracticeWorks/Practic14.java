package PracticeWorks;

public class Practic14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".*/
		
	int  age=25;
	char sex='M';
	char ms='Y';
	
	
	if((age<20)&&(age>60))
	{
		System.out.println("Error");
	}
	else if((age>20)&&(age<40))
	{
		System.out.println("May work Anywhere");
	
	}
	else if ((age>40)&&(age<60))
	{
		System.out.println("May work in Urban area only");
	}
	else if(sex=='F')
	{
		System.out.println("May work in Urban area only");
	}
		
	else
	{
		System.out.println("Error");
	}
			
		
	}

}
