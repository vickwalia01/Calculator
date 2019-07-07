package abstraction_Class;

public abstract class Shape {

// creating this class must check on the abstract option while creating this class.	
// creating a constructor off the class is possible in an abstract class 	
	
	
	Shape(){
		System.out.println("shape class constructor");
	}
	

	int color;
	
	abstract void drawing();
	
	public void fill() {
	System.out.println("shape ... filling");	
		
		
	}
	
	
	
	
}
