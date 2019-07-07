package SuperKeyword;

public class Animal {

	String color="white";// parent class variable
  void eating()
  {
	  System.out.println("Eating.........");
  }
  Animal()
  {
	  System.out.println("Animal is ceated");
  }
}

class Dog extends Animal
{
	String color="Black";
	
	Dog()
	{
		System.out.println("Dog is created");
	}
	
	
/*	void displaycolor()
	{
		System.out.println(color);
		System.out.println(super.color);// to invoke parent class variable
	} 
          void eating()
          {
        	  System.out.println("Eating Bread........");
        	  super.eating();  */
          }
			
		
