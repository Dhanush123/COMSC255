//Assignment #: 14
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public abstract class Employee {
	String name;
	double salary;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	abstract double computeBonus();
}
