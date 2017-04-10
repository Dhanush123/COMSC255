//Assignment #: 2
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import java.lang.*;
import javax.swing.*;
public class Average
{
	public static void main (String [] args)
	{
		double n1, n2, n3, avg, sum;

		String in, out;
		in = JOptionPane.showInputDialog ("Enter the first number:");
		//convert the String into a double.
		n1 = Double.parseDouble (in);

		in = JOptionPane.showInputDialog("Enter the second number:");
		n2 = Double.parseDouble (in);
		
		in = JOptionPane.showInputDialog("Enter the third number:");
		n3 = Double.parseDouble (in);

		sum = n1 + n2 + n3;
		avg = (n1 + n2 + n3)/3.0;

		//Build the out String
		out = "The sum of " + n1 + ", " + n2 + " and " + n3 + " is " + sum;
		out = out + "\nThe average of " + n1 + ", " + n2 + " and " + n3 + " is " + avg;

		JOptionPane.showMessageDialog(null, out);
		System.exit (0);
	}
}