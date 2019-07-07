package Over_Loading;

public class Construtor {

	Construtor(int a, int b)// Construtor 1
	{
		System.out.println(a+b);
	}
	Construtor(int a, double b)// Construtor 2
	{
		System.out.println(a+b);
	}
	Construtor(double a, int b)// Construtor 3
	{
		System.out.println(a+b);
	}
	Construtor(int a, int b, int c)// Construtor 4
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		

//Construtor co=new Construtor();
// this logic wont work as it did in method OL 
// so me must add some parameters in this case of Constructor OL		
Construtor co=new Construtor(10,20);// will call Constructor 1	
Construtor co1=new Construtor(10,20,30);// 	4
Construtor co2=new Construtor(10.5,20);//3
Construtor co3=new Construtor(10,20.5);// 2
	}

}
