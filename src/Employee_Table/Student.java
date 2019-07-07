package Employee_Table;

public class Student {

	int sid;
	String sname;
	char grade;
	
	Student(int id, String name, char g)// constructor
	{
		sid=id;
		sname=name;
		grade=g;
	}

		void getvalues(int id, String name, char g)// method
	{ // assign values by using getvalues method
		sid=id;
		sname=name;
		grade=g;
	}
	void display()
	{
		System.out.println(sid+" "+sname+" "+grade);	
	}

}


/* We can assign values to variables in 3 ways ....
 * 1: By using reference variables eg: sid, sname, grade
 * 2: By using method eg: getvalues
 * 3: by using constructor eg:in this class Student is constructor

/* Contructor......
 * 1: Constructer is a special type of method.
 * 2: Constructor used for initilizing the class variables.
 * 3: Constructor name should be same as class name.
 * 4: Constructor will not return any value(not even void)
 * 5: Constructor will be invoked at the time of object creation */
 */
 * 
