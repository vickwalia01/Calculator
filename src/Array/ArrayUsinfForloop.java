package Array;

public class ArrayUsinfForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {100,200,300,400,500}; //declare an array without specifying size
		
		for (int i=0;i<=a.length;i++) 
/* i=0 means i value is 0 so it will start from 0 block then
 * i<=a means i is less than a so it wont go past in value will end at 
 * last block.  			
 */
		
		{
			System.out.println(a[i]); // 100 200 300 400 500 
		}
	}

}
