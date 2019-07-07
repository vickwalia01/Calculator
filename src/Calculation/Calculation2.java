package Calculation;

public class Calculation2 {

	
		int x=10;
		int y=20;
		
		
		
		int sum()
		{
			return (x+y);

	}
		public static void main(String[] args) {
			Calculation2 cal=new Calculation2();

// this variable can be avoided by simply used system.out.println(cal.sum());			
			int res=cal.sum(); 
			System.out.println(res);
			System.out.println(cal.sum());
			// example 2 for this syntax
			
			
		}
}
