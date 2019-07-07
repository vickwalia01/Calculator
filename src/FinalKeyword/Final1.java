package FinalKeyword;

final class Bike { // when u use final with class that class cannot extend to more child classes.
	
 // final int speed=40; // final variable cant change the value below
	
	final void run() { // this is example of final method we cannot use below run() again.
		System.out.println("running.......");
	}
	
	
	class Honda extends Bike{
		
	//	void run()// this child class cannot use same method run() above from parent class.
		{
		System.out.println("started.......");

	}
	

	}

	public static void main(String[] args) {
		
//		Final1 fm= new Final1();
		
	//	fm.speed=100; wont change value here bcoz its already assigned above 40.
	
	//	System.out.println(fm.speed);
		
		
		
		

	}

}
