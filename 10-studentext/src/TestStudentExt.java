//Assignment #: 10
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import javax.swing.*;
import java.util.*;

public class TestStudentExt {
 public static void main(String[] args) {
  String in;
  int nStudents;

  in = JOptionPane.showInputDialog("Enter number of students");
  nStudents = Integer.parseInt(in);

  // Create an array of nStudents references
  StudentExt[] st = new StudentExt[nStudents];

  // Create nStudents objects
  for (int i = 0; i < st.length; i++) {
   // Input one student data
   in = JOptionPane.showInputDialog("Enter one student data");

   // Tokenize student data using StringTokenizer

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

  // Call diaplayResults to display grades
  displayResults(out);
 }


 public static void displayResults(String[] s) {
  //Create a String outAll initialized with an empty string.
  String outAll = "";

  //Accumulate elements of the received String array s into String outAll.
  for (int i = 0; i < s.length; i++) {
   outAll = outAll + "\n" + s[i];
  }
  JOptionPane.showMessageDialog(null, outAll);
  System.exit(0);
 }
}