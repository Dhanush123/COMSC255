//Assignment #: 13
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import javax.swing.JOptionPane;

public class Rectangle implements Status
{        
	private double length, width;

	public Rectangle(double l, double w)
	{
		length = l;
		width = w;	
	}
	
    public double getLength()
    {
    	return length;
    }

    public double getWidth()
    {
    	return width;
    }

    public double compArea()
    {
    	return length * width;
    }

	public double compPerimeter()
	{
		return (2 * length) + (2 * width);
	}
	
	public String getStatus()
	{
		return "Rectangle\nlength=" + length + ", width=" + width + "\n";
	}
	
	public void displayStatus(){
		JOptionPane.showMessageDialog(null,getStatus());
	}
}