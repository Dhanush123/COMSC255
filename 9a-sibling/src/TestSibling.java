//Assignment #: 9a
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import javax.swing.*;
public class TestSibling
{
  public static void main(String[] args)
  {
    String in, out;
    String name;
    int age;
    int weight;

    in = JOptionPane.showInputDialog("Enter name of sibling 1");
    name = in.trim();
    in = JOptionPane.showInputDialog("Enter age of sibling 1");
    age = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter weight of sibling 1");
    weight = Integer.parseInt(in);
    Sibling sib1 = new Sibling (name,age,weight);

    in = JOptionPane.showInputDialog("Enter name of sibling 2");
    name = in.trim();
    in = JOptionPane.showInputDialog("Enter age of sibling 2");
    age = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter weight of sibling 2");
    weight = Integer.parseInt(in);
    Sibling sib2 = new Sibling (name,age,weight);
    
    in = JOptionPane.showInputDialog("Enter name of sibling 3");
    name = in.trim();
    in = JOptionPane.showInputDialog("Enter age of sibling 3");
    age = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter weight of sibling 3");
    weight = Integer.parseInt(in);
    Sibling sib3 = new Sibling (name,age,weight);
    
    Sibling lightest=null;

    if ( (sib1.getWeight() < sib2.getWeight()) && (sib1.getWeight() < sib3.getWeight()) )
    {
      //sib1 is the lightest
      lightest = sib1;

    }
    else if ( (sib2.getWeight() < sib1.getWeight()) && (sib2.getWeight() < sib3.getWeight()) )
    {
      //sib2 is the lightest
      lightest = sib2;
    }
    else if ( (sib3.getWeight() < sib1.getWeight()) && (sib3.getWeight() < sib2.getWeight()) )
    {

      //sib3 is the lightest
      lightest = sib3;
    }

    out = "The Lightest Sibling: " + lightest.getName()+ " " +
                                     lightest.getAge() + " " +
                                     lightest.getWeight() + "\n";

    //--------------------------------------
    Sibling youngest=null;

    if ( (sib1.getAge() < sib2.getAge()) && (sib1.getAge() < sib3.getAge()) )
    {
      //sib1 is the youngest
      youngest = sib1;

    }
    else if ( (sib2.getAge() < sib1.getAge()) && (sib2.getAge() < sib3.getAge()) )
    {
      //sib2 is the youngest
      youngest = sib2;
    }
    else if ( (sib3.getAge() < sib1.getAge()) && (sib3.getAge() < sib2.getAge()) )
    {

      //sib3 is the youngest
      youngest = sib3;
    }

    out += "The Youngest Sibling: " + youngest.getName()+ " " +
                                      youngest.getAge() + " " +
                                      youngest.getWeight() + "\n";
    //--------------------------------------
    JOptionPane.showMessageDialog(null,out);
    System.exit(0);
  }
}

