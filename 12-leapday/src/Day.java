//Assignment #: 12
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public class Day {
	
	private int day;
	protected int month;

	public Day(int d, int m) {
		day = d;
		month = m;
		System.out.println(month + "/" + day);
	}
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int findDayNum(){
		int days = day;
		if(month == 1){
			return days;
		}
		if(month == 2){
			days = days + 31;
		}
		if(month == 3){
			days = days + 31 + 28;
		}
		if(month == 4){
			days = days + 31 + 28 + 31;
		}
		if(month == 5){
			days = days + 31 + 28 + 31 + 30;
		}
		if(month == 6){
			days = days + 31 + 28 + 31 + 30 + 31;
		}
		if(month == 7){
			days = days + 31 + 28 + 31 + 30 + 31 + 30;
		}
		if(month == 8){
			days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31;
		}
		if(month == 9){
			days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		}
		if(month == 10){
			days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		}
		if(month == 11){
			days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		}
		if(month == 12){
			days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		}
		return days;
	}
}
