//Assignment #: 4
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TestRectangle
{
	public static void main(String [] args)
	{
		double len, wid, len2, wid2;
		String in, out1, out2;
		DecimalFormat format = new DecimalFormat("0.#");
		
		in = JOptionPane.showInputDialog("Enter the 1st length:");
		len = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter the 1st width:");
		wid = Double.parseDouble(in);
        Rectangle r1 = new Rectangle(len, wid);
		out1 = "Values for the first object:\nLength: " + format.format(r1.getLength()) + "\nWidth: " + format.format(r1.getWidth()) + "\nPerimeter: " + format.format(r1.compPerimeter()) + "\nArea: " + format.format(r1.compArea());
		
		in = JOptionPane.showInputDialog("Enter the 2nd length:");
		len2 = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter the 2nd width:");
		wid2 = Double.parseDouble(in);
        Rectangle r2 = new Rectangle(len2, wid2);
		out2 = "\n\nValues for the second object:\nLength: " + format.format(r2.getLength()) + "\nWidth: " + format.format(r2.getWidth()) + "\nPerimeter: " + format.format(r2.compPerimeter()) + "\nArea: " + format.format(r2.compArea());
	
		JOptionPane.showMessageDialog(null, out1 + out2);
		System.exit(0);
	}
}