package abstraction_Class;

public class Test extends Shape{

	
	// creating test class constructor.
	
	Test(){
		System.out.println("Test class constructor");
	}
	
	
	
	public static void main(String[] args) {
		
	//Shape s= new Shape();// cannot create an object of shape class	
		
 Shape s= new Test();// but creating a reference is possible. 

      s.drawing(); // methods of shape class are being called by reference. 
      s.fill();
 
      
      
      
 
	}

	@Override
	void drawing() {
 System.out.println("Test .. Drawing");		
	}

}
