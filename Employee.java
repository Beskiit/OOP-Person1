package OOPactivity;

class Employee extends Person{
	private double salary;
	private String department;
	
	public Employee() {
		this.salary = salary;
		this.department = department;
	}
	
	public void setSalary(double s) {
		this.salary = s;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setDepartment(String d) {
		this.department = d;
	}
	
	public String getDepartment() {
		return department;
	}
}
