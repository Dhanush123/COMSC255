//Assignment #: 14
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import javax.swing.JOptionPane;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double salary, pctBonus, bonus, travelExpense;
		int optionsCount;
		
		String in;
		in = JOptionPane.showInputDialog("Enter Number of Workers:");
		int nWorkers = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter Number of Managers:");
		int nManagers = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter Number of Executives:");
		int nExecutives = Integer.parseInt(in);
		
		int sizee = nWorkers + nManagers + nExecutives;
		Employee[] employee = new Employee[sizee];
		
		for(int i = 0; i < nWorkers; i++){
		   in = JOptionPane.showInputDialog("Enter a worker data:");
		   String[] temp = in.split("\\s*,\\s*");
		   employee[i] = new Worker(temp[0].trim(),Double.parseDouble(temp[1].trim()),Double.parseDouble(temp[2].trim()));
		}
		
		for(int i = nWorkers; i < nManagers + nWorkers; i++){
		   in = JOptionPane.showInputDialog("Enter a manager data:");
		   String[] temp = in.split("\\s*,\\s*");
		   employee[i] = new Manager(temp[0].trim(),Double.parseDouble(temp[1].trim()),Double.parseDouble(temp[2].trim()),Integer.parseInt(temp[3].trim()));
		}
		
		for(int i = nWorkers + nManagers; i < sizee; i++){
		   in = JOptionPane.showInputDialog("Enter an executive data:");
		   String[] temp = in.split("\\s*,\\s*");
		   employee[i] = new Executive(temp[0].trim(),Double.parseDouble(temp[1].trim()),Double.parseDouble(temp[2].trim()),Integer.parseInt(temp[3].trim()), Integer.parseInt(temp[4].trim()));
	    }
			
		String out = "";
		String outW = "";
		String outM = "";
		String outE = "";
		
		for (int i=0; i < employee.length; i++)
		{
			//get name and salary
			//To access target object methods that are defined in class Employee, we don’t need type casting.
			name = employee[i].getName();
			salary = employee[i].getSalary();
			 
			//call computeBonus using polymorphic call
			//Since computeBonus is declared in Employee class, we don’t need type casting.
			bonus = employee[i].computeBonus();
			 
			//use name, salary, bonus, pctBonus returned above towards building the summary report
			
			//To access target object methods that are not defined in class Employee, we use down casting.
			//Downcasting (Widening) should be done within an if statement using instanceof
			//Since getPctBonus method is not present in class Employee, it is accessed via down casting.
			//Similarly getTravelExpense, and getOptionsCount are accessed via downcasting.
			//The instanceof clause is used below to ensure a safe down casting (widening).
			if (employee[i] instanceof Worker){
				pctBonus = ((Worker) employee[i]).getPctBonus();
				//accumulate Worker output in outW
				outW += "Name:" + name + "\n";
				outW += "Yearly Salary: $ " + salary + "\n";
				outW += "PercentBonus: " + pctBonus + "\n";
				outW += "Total Bonus: " + bonus + "\n\n";
			}
			else if (employee[i] instanceof Manager) {				
				pctBonus = ((Manager) employee[i]).getPctBonus();
				travelExpense = ((Manager) employee[i]).getTravelExpense();
				//accumulate Manager output in outM
				outM += "Name:" + name + "\n";
				outM += "Yearly Salary: $ " + salary + "\n";
				outM += "PercentBonus: " + pctBonus + "\n";
				outM += "Total Bonus: " + bonus + "\n";
				outM += "Travel Expense: " + travelExpense + "\n\n";
			}
			else if (employee[i] instanceof Executive) {
				pctBonus = ((Executive) employee[i]).getPctBonus();
				travelExpense = ((Executive) employee[i]).getTravelExpense();
				optionsCount = ((Executive) employee[i]).getOptionsCount();
				//accumulate Executive output in outE
				outE += "Name:" + name + "\n";
				outE += "Yearly Salary: $ " + salary + "\n";
				outE += "PercentBonus: " + pctBonus + "\n";
				outE += "Total Bonus: " + bonus + "\n";
				outE += "Travel Expense: " + travelExpense + "\n";
				outE += "Options Count: " + optionsCount + "\n\n";
			}
		}
		//After getting out of the loop
		out = outW + "\n\n" + outM + "\n\n" + outE;
		//display out
		JOptionPane.showMessageDialog(null, out);
		System.exit(0);
	}
}