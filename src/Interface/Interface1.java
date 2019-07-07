package Interface;

interface A {

	int a =10;  // by default variables in interface are static and final
	
	void m1(); // abstract method is default public
	
	
public class Interface implements A
{

	
	public	void m1()   // access this method you must add public otherwise it restricted
		{
			System.out.println(a);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
	
	
		Interface t=new Interface();
	
		t.m1();
}
}