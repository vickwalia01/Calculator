package PracticeWorks;

public class Practice21SwappingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively,
		//write two programs to swap the values of the two variables.
		
	
		int a=6;
		int b=8;
		
		b= b-a;
		a= b+a;
		b= b-a;
		System.out.println("After swap a:"+a+ "After sawp b:"+b);
		
		
		
	}	
}
