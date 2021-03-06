//Assignment #: 14
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public class Executive extends Employee {

	double pctBonus;
	double travelExpense;
	int optionsCount;
	
	public Executive(String n, double s, double p, double t, int o) {
		super(n, s);
		pctBonus = p;
		travelExpense = t;
		optionsCount = o;
	}
	
	public double getPctBonus() {
		return pctBonus;
	}

	public double getTravelExpense() {
		return travelExpense;
	}

	public int getOptionsCount() {
		return optionsCount;
	}
	
	public double computeBonus() {
		return (salary * pctBonus) + 1000.00;
	}

}
