//Assignment #: 8
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public class Student {
 private int id;
 private String name;
 private int[] exams;

 public Student(int id, String n, int[] ex) {
  //Below id refers to local variable.
  //this.id refers to the instance variable. 
  this.id = id;
  name = n;
  exams = ex;
 }

 public String findGrade() {
	 double result = 0;
	 for(int x : exams){
		 result += x;
	 }
	 result = result/exams.length;
	 if(result >= 90){
		 return "A";
	 }
	 else if(result < 90 && result >= 80){
		 return "B";
	 }
	 else if(result < 80 && result >= 70){
		 return "C";
	 }
	 else if(result < 70 && result >= 60){
		 return "D";
	 }
	 else{
		 return "F";
	 }
 }

 public int getId() {
  return id;
 }

 public String getName() {
  return name;
 }

}