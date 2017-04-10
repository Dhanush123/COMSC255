//Assignment #: 10
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public class StudentExt extends Student {

	private String gradeType;
	
	public StudentExt(int id, String n, int[] ex, String s) {
		super(id, n.trim(), ex);
		gradeType = s.trim();
	}

	@Override
	public String findGrade() {
		String s = super.findGrade();
		if(gradeType.equals("Credit")) {
			if(s.equals("A") || s.equals("B") || s.equals("C")) {
				return "CR";
			}
			else {
				return "NCR";
			}
		}
		else {
			return s;
		}
	}

}
