package This_Keyword;

public class ThisKeyword {

	int a,b;// instance variables or class variables
	
	void getvalues(int a, int b)// method variables
	{
//	a=a; by printing this program is not able to diffrenciate
//	b=b; variables between class or method so output comes 0
// to execute our program we can use (this) keyword.
  
   this.a=a;// by using this we told program that this.a
   this.b=b;// belongs to class
	}
	
	void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {

		ThisKeyword th=new ThisKeyword();
		th.getvalues(10, 20);
		th.printvalues();
	}

}
