package Over_Loading;
// can have multiple main methods in a class but execution 
// will always begin after the public static void main 
public class  MainMethodOL {

public void main (int x)//1
{
	System.out.println(x);
}
public void main (int x, int y)	//2
{
	System.out.println(x+y);
}
	
public static void main(String[] args) {
	
	MainMethodOL om=new MainMethodOL();
	
	om.main(100);// 1
    om.main(100,200);// 2
	
	}

}
