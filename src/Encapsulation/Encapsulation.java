package Encapsulation;

public class Encapsulation {

	// private data variables.
	// private data variables so that they cannot be acessed directly from outside the class
	private int ssn;
	private String empname;
	private int empAge;
	
//	getter and setter methods
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method created to access variables to outside class through this method
		Encapsulation emp= new Encapsulation();
		emp.setEmpname("tom");
		emp.setEmpAge(25);
		emp.setSsn(00026777);
		
		
		
		
		
		System.out.println("Employee name is :"+ emp.getEmpname());
		System.out.println("Employee age is:"+ emp.getEmpAge());
		System.out.println("Employee ssn:"+ emp.getSsn());
		
		
	}

	
	
	
	
	// getter and setter methods created to set and get the values of the private variables so the private variables can be 
	// called through in outside class through these methods.
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
