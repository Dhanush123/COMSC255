//Assignment #: 13
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import javax.swing.JOptionPane;

public class Sibling implements Status {
  private String name;
  private int age;
  private int weight;

  public Sibling(String n, int a, int w) {
    name = n;
    age = a;
    weight = w;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public int getWeight() {
    return weight;
  }
  
  public String getStatus()
  {
	return "Sibling\nname=" + name + ", age=" + age + ", weight=" + weight + "\n";
  }
	
  public void displayStatus(){
	JOptionPane.showMessageDialog(null,getStatus());
  }
}