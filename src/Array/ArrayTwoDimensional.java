package Array;

public class ArrayTwoDimensional {

	public static void main(String[] args) {
		
	/*	int a[][]= new int [3][2];
		// first is [row] second is [column] so [3 row] & [2 column]

		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;   one way to assign values to array rows
		a[1][1]=400;    when you know the size of array use this 
		                   method
		a[2][0]=500;
		a[2][1]=600;  */
		
		// another way to assign same values is 
	
		int a[][]= { {100,200},{300,400},{500,600} }; // shortcut
		// when you dont know exact size of array then use this method 
		
		System.out.println("Number of rows:"+ a.length);
		//to get the number of rows in that array
		System.out.println("Number of columns:"+ a[0].length);
		// to get number of columns in row o use this syntax
		
		// CLASSIC FOR LOOP TO GET VALUE OF ROWS AND COLUMNS
		
	/*for (int i=0;i<a.length;i++)// outer for lopp first will read rows
		                        // assigned row value to i

{
	 for( int j=0;j<a[i].length;j++)// inner for loop will read columns
	 {                              // assigned column value to j
		  
		 System.out.println(a[i][j]); */
		 
		 
// ENHANCED LOOP TO GET VALUE
		 
	for (int r[]:a)
	{
		for(int i:r)
		{
			System.out.println(i);
		}
	}
	 }
	{
		
	}

}
