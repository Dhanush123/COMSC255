//Assignment #: 4
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public class Rectangle
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
}