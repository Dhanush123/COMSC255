//Assignment #: 12
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public class LeapDay extends Day {
	
	private int year;

	public LeapDay(int d, int m, int y) {
		super(d,m);
		year = y;
	}
	
	public int getYear() {
		return year;
	}
	
	public int findDayNum(){
		if (((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0)) && month >= 2) {
			 //Leap year
			return super.findDayNum() + 1;
		} 
		else {
			return super.findDayNum();
			 //Not a leap year
		}		
	}

}
