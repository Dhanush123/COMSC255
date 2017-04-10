//Assignment #: 6
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;

public class STS {
	public static void main(String args[]){
		//Create a String in for inputting data values.
		String in = "";
	
		//Create a String delim for specifying the delimiter (separator).
		String delim = ", ";
	
		//Create an int count to get token count from StringTokenizer.
		int count = 0;
	
		//Create a String token to get token value from the StringTokenizer.
		String token = "";
	
		//Get user input in String in
		in = JOptionPane.showInputDialog("Enter data values separated by spaces and / or commas");
	
		//Create StringTokenizer and supply it with String in and String delim
		StringTokenizer st = new StringTokenizer(in,delim);
	
		//Get token count from StringTokenizer
		count = st.countTokens();
	
		//Create an array data of size count.
		double[] data = new double[count];
	
		//Set up a for loop to go around count times.
		//In each pass through the loop, get the next token from StringTokenizer.
		//Convert token into a double and store it in corresponding array element.
		for (int i = 0; i < count; i++) {
		 //trim the token
		 //trim removes all leading and trailing spaces.
		 token = st.nextToken().trim();
		 data[i] = Double.parseDouble(token);
		}
		//-------------------------------------------------------------------------
		in = JOptionPane.showInputDialog("Enter the Number of Places For Decimal Output");
		int placesCount = Integer.parseInt(in);
		 
		//Build pattern string
		String pattern = "0.0";
		for (int i = 0; i < placesCount; i++){
	        pattern = pattern + "0";
		}
		 
		//Create a DecimalFormat object. Pass it the pattern string.
		DecimalFormat df = new DecimalFormat("0.000");
		
		Statistics s = new Statistics(data);
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
		output = output + "\nMin Value: "+df.format(min)+"\nMax Value: "+df.format(max)+"\nMean: "+df.format(mean)+"\nMedian: "+df.format(median);
		JOptionPane.showMessageDialog(null,output);
		System.exit(0);
	}
}