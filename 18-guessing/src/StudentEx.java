//Assignment #: 18
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306



import javax.swing.JOptionPane;
 
public class StudentEx{

	public static void main(String[] args) throws IdNotAWholeNumberException, IdOutOfRangeException, NotSpecifiedException, NotAlphabeticException{
		int numStudents;
		while(true){
			try {
			    numStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter student count").trim());
			    break;
			}
			catch (NumberFormatException nfe) {
			    throw new NumberFormatException("Input not a whole number");
			}
		}
		
		String studentList = "Student List\n";
		for(int i = 0; i < numStudents; i++){
			int stuNum = validateId(JOptionPane.showInputDialog("Enter student id").trim());
			String stuNam = validateName(JOptionPane.showInputDialog("Enter student first name").trim());
			studentList += stuNum + " " + stuNam + "\n";
		}
		JOptionPane.showMessageDialog(null, studentList);
		System.exit(0);
	}
	
	public static int validateId(String idd) throws IdNotAWholeNumberException, IdOutOfRangeException{
		int id;
		try {
	        id = Integer.parseInt(idd);
		}
		catch (NumberFormatException ex) {
			throw new IdNotAWholeNumberException();
		}
		if (id < 1 || id > 999) {
			throw new IdOutOfRangeException();
		}
		else {
			return id;
		}
	}
	
	public static String validateName(String name) throws NotSpecifiedException, NotAlphabeticException{
		if (name.equals("")){
	        throw new NotSpecifiedException();  
		}
		else if(!name.matches("[a-zA-Z]+")){
	        throw new NotAlphabeticException();
		}
		else {
	        return name;
		}
	}
}