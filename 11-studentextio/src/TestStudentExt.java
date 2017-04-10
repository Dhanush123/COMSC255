//Assignment #: 11
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import java.io.*;
import java.util.Arrays;
 
public class TestStudentExt
{
  public static void main(String[] args) throws Exception
  {
    String in;
    int studentCount;
    
    //Create a BufferedReader object for inputting from file in.txt
    BufferedReader br = new BufferedReader(new FileReader("in.txt"));
 
    //Create a PrintWriter object for outputting to a file out.txt.
    PrintWriter pw = new PrintWriter (new FileWriter("out.txt"));
 
    //input the first line of the file containing the number of students
    in = br.readLine();
    studentCount = Integer.parseInt(in);
    
    StudentExt[] st = new StudentExt[studentCount];
    //Set up a for loop to input one student data during each pass through loop.
    
    for (int i=0; i<studentCount; i++)
    {
      //read one line containing one student data.
      in = br.readLine();
 
      //Create a StringTokenizer object to tokenize one student data.
	    String[] temp = in.split("\\s*,\\s*");
	    String[] temp2 = Arrays.copyOfRange(temp,3,temp.length-1);
	    int[] temp3 = new int[temp2.length];
	    for(int x = 0;x < temp2.length;x++)
	    {
	      temp3[x] = Integer.parseInt(temp2[x].trim());
	    }
	    // Create Student object
	    st[i] = new StudentExt(Integer.parseInt(temp[0]),temp[1],temp3,temp[temp.length-1]);
	   }
	 
	   // Find student grades
	 
	   // Create an array out of 8 string references
	   String[] out = new String[7];
	 
	   //Create 5 String objects. Initialize each with “”
	   //and store their references in the above array of references.
	   for (int i = 0; i < out.length; i++)
	    out[i] = new String(""); //alternate form: out [i] = “”;
	 
	   //The above two parts can be done with a single statement as below:
	   //String [] out = new String [ ] {“”, “”, “”, “”, “”};
	 
	   //find student grades and accumulate output for each type of student. 
	   String grade;
	   for (int i = 0; i < st.length; i++) {
	    grade = st[i].findGrade();
	    if (grade.equalsIgnoreCase("A")) {
	     //accumulate output in out[0] for A students.
	 	 out[0] += st[i].getId() + " " + st[i].getName() + " ("+grade+")" +"\n";
	    } else if (grade.equalsIgnoreCase("B")) {
	     //accumulate output in out[1] for B students.
	 	out[1] += st[i].getId() + " " + st[i].getName() + " ("+grade+")" +"\n";
	    } else if (grade.equalsIgnoreCase("C")) {
	     //accumulate output in out[2] for C students.
	 	out[2] += st[i].getId() + " " + st[i].getName() + " ("+grade+")" +"\n";
	    } else if (grade.equalsIgnoreCase("D")) {
	     //accumulate output in out[3] for D students.
	 	 out[3] += st[i].getId() + " " + st[i].getName() + " ("+grade+")" +"\n";
	    } else if (grade.equalsIgnoreCase("F")) {
	 	  out[4] += st[i].getId() + " " + st[i].getName() + " ("+grade+")" +"\n";  
	    } else if (grade.equalsIgnoreCase("CR")) {
	 	  out[5] += st[i].getId() + " " + st[i].getName() + " ("+grade+")" +"\n"; 
	    } else {
	 	  out[6] += st[i].getId() + " " + st[i].getName() + " ("+grade+")" +"\n";
	    }
	   } 
	   
	   String outAll = "";
	   //Accumulate elements of the received String array s into String outAll.
	   for (int i = 0; i < out.length; i++) {
	     outAll = outAll + "\n" + out[i];
	   }  
		 
	 System.out.println(outAll);
	 System.out.println("before file out");
    //Output outAll String using using PrintWriter object.
    //make sure to also call flush() after calling println()
    pw.println(outAll);
    pw.flush();
 
    //Call close on File IO objects.
    if (br != null)
      br.close();
    if (pw != null)
      pw.close();
  }
}