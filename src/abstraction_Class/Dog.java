package abstraction_Class;

public class Dog extends Animal{

	public static void main(String[] args) {

		
		Dog d = new Dog();
		 d.eat();
	     d.bark();// final method can be called out in another class 
		 
		// final method can be called but not over ridden.
		/* public final void bark() { System.out.println("barking "); }
		 */
	     
	     
	}

}
