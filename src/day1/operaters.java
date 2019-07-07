package day1;

public class operaters {

	public static void main(String[] args) {
		{	
	int a=10;
	int b=20;
    
    
    // Arithmetic operators - -  > + - * / %
    
    System.out.println("sum of and b is:" +(a+b)); 
	System.out.println("diff of a and b is:" +(b-a));	
	System.out.println("Mul of a and b is:"+(a*b));
	System.out.println("Div od a and b is:" +(a/b));
	System.out.println("Mod Div of a and b is:"+(a%b));
		
		// Relational operators(comparison operators) - - -> ==  < > <= >= !=
		// comparison operators always return a boolean value true or false
	
	System.out.println(a==b); // false
	System.out.println(a>b);   // false
	System.out.println(a<b); // true
    System.out.println(a>=b);  // false
    System.out.println(a<=b);
    System.out.println(a!=b);
		}
	}	
}