//Assignment #: 9
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public class SiblingExt extends Sibling {
	private int height; 
	
	public SiblingExt(String n, int a, int w, int h) {
		super(n, a, w);
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
}