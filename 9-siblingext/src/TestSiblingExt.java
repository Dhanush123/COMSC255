//Assignment #: 9
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import javax.swing.*;
public class TestSiblingExt
{
  public static void main(String[] args)
  {
    String in, out;
    String name;
    int age;
    int weight;
    int height;

    in = JOptionPane.showInputDialog("Enter name of sibling 1");
    name = in;
    in = JOptionPane.showInputDialog("Enter age of sibling 1");
    age = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter weight of sibling 1");
    weight = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter height of sibling 1");
    height = Integer.parseInt(in);
    SiblingExt sib1 = new SiblingExt (name,age,weight,height);

    in = JOptionPane.showInputDialog("Enter name of sibling 2");
    name = in;
    in = JOptionPane.showInputDialog("Enter age of sibling 2");
    age = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter weight of sibling 2");
    weight = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter height of sibling 2");
    height = Integer.parseInt(in);
    SiblingExt sib2 = new SiblingExt (name,age,weight,height);
    
    in = JOptionPane.showInputDialog("Enter name of sibling 3");
    name = in;
    in = JOptionPane.showInputDialog("Enter age of sibling 3");
    age = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter weight of sibling 3");
    weight = Integer.parseInt(in);
    in = JOptionPane.showInputDialog("Enter height of sibling 3");
    height = Integer.parseInt(in);
    SiblingExt sib3 = new SiblingExt (name,age,weight,height);
    
    SiblingExt lightest=null;

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
                                     lightest.getWeight() + " " +
                                     lightest.getHeight() + "\n";

    //--------------------------------------
    SiblingExt youngest=null;

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
                                      youngest.getWeight() + " " +
                                      youngest.getHeight() + "\n";
    //--------------------------------------
    SiblingExt tallest=null;

    if ( (sib1.getHeight() > sib2.getHeight()) && (sib1.getHeight() > sib3.getHeight()) )
    {
      //sib1 is the tallest
      tallest = sib1;

    }
    else if ( (sib2.getHeight() > sib1.getHeight()) && (sib2.getHeight() > sib3.getHeight()) )
    {
      //sib2 is the tallest
      tallest = sib2;
    }
    else if ( (sib3.getHeight() > sib1.getHeight()) && (sib3.getHeight() > sib2.getHeight()) )
    {

      //sib3 is the tallest
      tallest = sib3;
    }

    out += "The Tallest Sibling: " + tallest.getName()+ " " +
                                    tallest.getAge() + " " +
                                    tallest.getWeight() + " " +
                                    tallest.getHeight();

    JOptionPane.showMessageDialog(null,out);
    System.exit(0);
  }
}

