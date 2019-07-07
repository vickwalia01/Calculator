package Calculation;

public class ConstructorDemo {

	int x;
	int y;
	
	ConstructorDemo()// default constructor
	{ 
	x=10;
	y=20;
	}
	ConstructorDemo(int a,int b)// parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
	
	
		
ConstructorDemo cm1= new ConstructorDemo();//invokes default constructor		
ConstructorDemo cm2=new ConstructorDemo(100,200);// invokes parameterized constructor
	cm1.display();//30
	cm2.display();// 300
	
	 {

	}

	}
}