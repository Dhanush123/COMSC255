//Assignment #: 13
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;

public class TestStatus {
	
	public static void main(String[] args) {
		
		Status[] status = new Status[6];
		
		//-----------------------------------------------------------------
		double len, wid, len2, wid2, len3, wid3;
		String in, out1, out2;
		DecimalFormat format = new DecimalFormat("0.#");
		
		in = JOptionPane.showInputDialog("Enter the 1st rectangle length:");
		len = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter the 1st rectangle width:");
		wid = Double.parseDouble(in);
        Rectangle r1 = new Rectangle(len, wid);
        status[0] = r1;
		
		in = JOptionPane.showInputDialog("Enter the 2nd rectangle length:");
		len2 = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter the 2nd rectangle width:");
		wid2 = Double.parseDouble(in);
        Rectangle r2 = new Rectangle(len2, wid2);
	    status[1] = r2;
	    
		in = JOptionPane.showInputDialog("Enter the 3nd rectangle length:");
		len3 = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter the 3nd rectangle width:");
		wid3 = Double.parseDouble(in);
        Rectangle r3 = new Rectangle(len3, wid3);
	    status[2] = r3;
	  //-----------------------------------------------------------------
	    String name;
	    int age;
	    int weight;

	    in = JOptionPane.showInputDialog("Enter name of sibling 1");
	    name = in;
	    in = JOptionPane.showInputDialog("Enter age of sibling 1");
	    age = Integer.parseInt(in);
	    in = JOptionPane.showInputDialog("Enter weight of sibling 1");
	    weight = Integer.parseInt(in);
	    Sibling sib1 = new Sibling(name,age,weight);
	    status[3] = sib1;
	    
	    in = JOptionPane.showInputDialog("Enter name of sibling 2");
	    name = in;
	    in = JOptionPane.showInputDialog("Enter age of sibling 2");
	    age = Integer.parseInt(in);
	    in = JOptionPane.showInputDialog("Enter weight of sibling 2");
	    weight = Integer.parseInt(in);
	    Sibling sib2 = new Sibling(name,age,weight);
	    status[4] = sib2;
	  //-----------------------------------------------------------------
	    // Create nStudents objects
	    // Input one student data
	    in = JOptionPane.showInputDialog("Enter one student data");

	    // Tokenize student data using StringTokenizer

	    String[] temp = in.split("\\s*,\\s*");
	    String[] temp2 = Arrays.copyOfRange(temp,3,temp.length);
	    int[] temp3 = new int[temp2.length];
	    for(int x = 0;x < temp2.length;x++)
	    {
	      temp3[x] = Integer.parseInt(temp2[x].trim());
	    }
	    // Create Student object
	    status[5] = new Student(Integer.parseInt(temp[0]),temp[1],temp3);
	  //-----------------------------------------------------------------
		for (int index=0; index < status.length; index++) {
		     status[index].displayStatus();
		}
		
		String out = "";

		for (int index=0; index < status.length; index++) {
			out = out + status[index].getStatus() + "\n";
		}

		JOptionPane.showMessageDialog(null, out);
		System.exit(0);
	}
	
}
