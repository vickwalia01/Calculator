package Employee_Table;

public class Employee1 {

	public static void main (String args[]) {
		
// im able to access the method of another class by using
// the name of class Employee and can create multiple 
// objects using same method.
		
		// object is an instance of a class
		Employee emp1= new Employee(); // creating object
		emp1.eid=101;
		emp1.ename="David";
		emp1.sal=25000.00;
		emp1.job="Manager";
		emp1.display();
		
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="John";
		emp2.sal=28000.00;
		emp2.job="Ceo";
		emp2.display();
	}

}
