package Over_Loading;

public class Method_Overloading {

// Data types can't be duplicate in methods when overloading. 
// must use all different data types
	
	void add(int a, int b)// method 1
	{
		System.out.println(a+b);
	}
	void add(int a, double b)// method 2
	{
		System.out.println(a+b);
	}
	void add(double a, double b)// method 3
	{
		System.out.println(a+b);
	}
	void add(int a, int b, int c)// method 4
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// must use the class name to refer to method		
 Method_Overloading	 mo=new Method_Overloading();
mo.add(10, 20);// will automatically search for method 1 once we gave 2 int values
mo.add(10, 20,30);// will call method 4	
mo.add(10, 20.5);// will call method 2
mo.add(10.5, 20.5);// will call method 3
	
	}

}
