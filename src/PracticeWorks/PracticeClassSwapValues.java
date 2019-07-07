package PracticeWorks;

public class PracticeClassSwapValues {

	public static void main(String[] args) {
		
		/// assingment print hello and your name 
		// add two values 74 + 36
		// swap two values a and b   
		
		
      System.out.println("HELLO");
     System.out.println("GURPREET AHLUWALIA");

	
	//int a=74;
	//int b=36; 
	
	//System.out.println(a+b);
	
	
     int a = 10;
     int b = 20;

     System.out.println("value of a and b before swapping a: " + a +" b: " + b);

    

     //swapping value of two numbers without using temp variable
     a = a+ b; //now a is 30 and b is 20
     b = a -b; //now a is 30 but b is 10 (original value of a)
     a = a -b; //now a is 20 and b is 10, numbers are swapped

     System.out.println("value of a and b after swapping a: " + a +" b: " + b);

     }
    		
          }
    
