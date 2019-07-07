package PoiApche;
import java.util.Date;

class Employee {
	
	
	private Date dateOfBirth;
    private double salary;
    private String name;
    private String email;
    
    
    public Employee(String name, String email, Date dateOfBirth, double salary) {
   	 
   	 this.name = name; 
   	 this.email = email; 
   	 this.dateOfBirth = dateOfBirth;
   	 this.salary = salary; }

    
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	/*
	 * public Employee(String name, String email, Date dateOfBirth, double salary) {
	 * 
	 * this.name = name; this.email = email; this.dateOfBirth = dateOfBirth;
	 * this.salary = salary; }
	 */
	 

	// Getters and Setters 
}