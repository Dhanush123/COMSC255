//Assignment #: 12
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import javax.swing.JOptionPane;

public class TestLeapDay {
	
	public static void main(String args[]){
		  String in;
		  in = JOptionPane.showInputDialog("Enter day");
		  int day = Integer.parseInt(in);
		  in = JOptionPane.showInputDialog("Enter month");
		  int month = Integer.parseInt(in);
		  in = JOptionPane.showInputDialog("Enter year");
		  int year = Integer.parseInt(in);
		  LeapDay d = new LeapDay(day,month,year);
		  JOptionPane.showMessageDialog(null, "Day Number for " + d.getMonth()+"/"+d.getDay()+"/"+d.getYear() + " is " + d.findDayNum());
		  System.exit(0);
	}
	
}
