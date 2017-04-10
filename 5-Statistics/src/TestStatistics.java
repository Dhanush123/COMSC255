//Assignment #: 5
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import javax.swing.JOptionPane;

public class TestStatistics {
	public static void main(String[] args) {
		String in;
		in = JOptionPane.showInputDialog("Enter the Number Of Data Values:");
		int len = Integer.parseInt(in);
		double[] uVals = new double[len];
		for(int i = 0; i < len; i++){
			in = JOptionPane.showInputDialog("Enter Data Value:");
			double inp = Double.parseDouble(in);
			uVals[i] = inp;
		}
		
		Statistics s = new Statistics(uVals);
		double[] rVals = s.getOrigData();
		double[] sVals = s.getSortedData();
		double min = s.findMin();
		double max = s.findMax();
		double mean = s.findMean();
		double median = s.findMedian();
		
		String out = "";
		for(int i=0; i < rVals.length; i++)
		{
			out = out + rVals[i] + " ";
		}
		
		String out2 = "";
		for(int i=0; i < sVals.length; i++)
		{
			out2 = out2 + sVals[i] + " ";
		}
		
		String output = "Original Data:\n"+out+"\nSorted Data:\n"+out2;
		output = output + "\nMin Value: "+min+"\nMax Value: "+max+"\nMean: "+mean+"\nMedian: "+median;
		JOptionPane.showMessageDialog(null,output);
		System.exit(0);
	}
}