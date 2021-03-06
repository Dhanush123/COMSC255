//Assignment #: 14
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public class Worker extends Employee {
	double pctBonus;
	
	public Worker(String n, double s, double d) {
		super(n, s);
		pctBonus = d;
	}
	
	public double getPctBonus() {
		return pctBonus;
	}
	
	public double computeBonus() {
		return (salary * pctBonus);
	}
}
