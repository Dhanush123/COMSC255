//Assignment #: 3
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import java.lang.*;
import javax.swing.*;
import java.text.*;

public class RectangleProc {
	public static void main(String[] args){
		double len, wid;
		String in, out;
		in = JOptionPane.showInputDialog ("Enter the length:");
		len = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter the width:");
		wid = Double.parseDouble (in);
		DecimalFormat format = new DecimalFormat("0.#");
		out = "Length: " + format.format(len) + "\nWidth: " + format.format(wid) + "\nPerimeter: " + format.format(computePerim(len,wid)) + "\nArea: " + format.format(computeArea(len,wid));
		JOptionPane.showMessageDialog(null, out);
		System.exit(0);
	}

	public static double computeArea (double len, double wid){
		return len * wid;
	}
	
	public static double computePerim (double len, double wid){
		return (2 * len) + (2 * wid);
	}
}