package StaticVariables_Methods;

public class StaticExample {
// static keyword stores values of addressed variable
// that can be accessed by using the class name without 
// creating new objects. 	
	
		
	static int a=10;// static variable	
		   int b=20;
		   
   static void m1()// static method
   {
	   System.out.println("this is m1 - static method");
   }
    void m2()// non static
    {		
    System.out.println("this is m2- non static method");
	}
	void m3()// non static method can access static and non static variables.
	{       // using se class
	System.out.println("This m3 ");
	System.out.println(a);
	System.out.println(b);
	m1();
	m2();
	}
  public static void main(String[] args) {
// static methods can access only static stuff		

System.out.println(a);// output is 10 bcoz its accessible 
m1();// will print lane bcoz its static 

//System.out.println(b);not accessible will give you error
 // m2();// wont print bcoz its non static
  
// we can directly access static variables using this class  
// Ex: System.out.println(StaticExample.a);
// Ex: StaticExample.m1();


// static methods can access non static stuff but throught object.
  StaticExample se=new StaticExample();
  System.out.println(se.b);// non static variable through object
  se.m2();
  se.m3();
  }

}
