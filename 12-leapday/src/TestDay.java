//Assignment #: 12
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import javax.swing.JOptionPane;

public class TestDay {

	public static void main(String args[]){
		  String in;
		  in = JOptionPane.showInputDialog("Enter day");
		  int day = Integer.parseInt(in);
		  in = JOptionPane.showInputDialog("Enter month");
		  int month = Integer.parseInt(in);
		  Day d = new Day(day,month);
		  JOptionPane.showMessageDialog(null, "Day Number for " + d.getMonth()+"/"+d.getDay() + " is " + d.findDayNum());
		  System.exit(0);
	}
}
