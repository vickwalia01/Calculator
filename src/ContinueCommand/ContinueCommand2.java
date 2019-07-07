package ContinueCommand;

public class ContinueCommand2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// how to skip 3, 5, 7 by using ||(or) commmand with continue command
		
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==5 || i==7)
			{
				continue;
			}
		System.out.println(i);		
		
		
		}
	}

}
