//Assignment #: 5
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import java.util.Arrays;

public class Statistics {
	private double[] data;
	private double[] sdata;
	
	public Statistics(double[] idata){
		data = idata.clone();
		sdata = new double[data.length];
	}
	
	public double[] getOrigData(){
		return data;
	}
	
	public double[] getSortedData(){
		sdata = data.clone();
		Arrays.sort(sdata);
		return sdata;
	}
	
	public double findMin(){
		double min = sdata[0];
		for(double x : sdata){
			if(x < min){
				min = x;
			}
		}
		return min;
	}
	
	public double findMax(){
		double max = sdata[0];
		for(double x : sdata){
			if(x > max){
				max = x;
			}
		}
		return max;	
	}
	
	public double findMean(){
		double total = 0.0;
		double count = sdata.length;
		for(double x : sdata){
			total += x;
		}
		return total/count;
	}
	
	public double findMedian(){
		int index = 0;
		if (sdata.length % 2 != 0){
			index = sdata.length/2;
			return sdata[index];
		}
		else{
			int mid = sdata.length/2; 
			return (sdata[mid]+sdata[mid-1])/2;
		}
	}
}