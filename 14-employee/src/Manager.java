//Assignment #: 14
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public class Manager extends Employee {
	double pctBonus;
	double travelExpense;

	public Manager(String n, double s, double p, int t) {
		super(n, s);
		pctBonus = p;
		travelExpense = t;
		// TODO Auto-generated constructor stub
	}

	double computeBonus() {
		return (salary * pctBonus) + 500.00;
	}

	public double getPctBonus() {
		return pctBonus;
	}

	public double getTravelExpense() {
		return travelExpense;
	}
	
}
