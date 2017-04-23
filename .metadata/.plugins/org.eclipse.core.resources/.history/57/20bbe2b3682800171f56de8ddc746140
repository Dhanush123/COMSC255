//Assignment #: 15
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Calculator extends JFrame implements ActionListener{
   private JPanel jpMain = new JPanel();
   private JPanel jpOne = new JPanel();
   private JPanel jpTwo = new JPanel();
   private JPanel jpResult = new JPanel();
   private JPanel jpOp = new JPanel();
   private JLabel jlbOne = new JLabel("Number 1");
   private JLabel jlbTwo = new JLabel ("Number 2");
   private JLabel jlbResult = new JLabel ("Result");
   private JTextField jtfOne = new JTextField(10);
   private JTextField jtfTwo = new JTextField(10);
   private JTextField jtfResult = new JTextField(10);
   private JButton jbtAdd = new JButton("Add");
   private JButton jbtSub = new JButton("Sub");
   private JButton jbtMult = new JButton("Mult");
   private JButton jbtDiv = new JButton("Div");
   private JButton jbtClear = new JButton("Clear");
  
  
   public Calculator (){
     setTitle ("Calculator Application");
     setSize(400, 200);
     setVisible(true);
     //set jpMain layout
     GridLayout gl = new GridLayout (4,1);
     jpMain.setLayout(gl);
     //add panels to jpMain
     jpMain.add(jpOne);
     jpMain.add(jpTwo);
     jpMain.add(jpResult);
     jpMain.add(jpOp);
     jpOne.setBackground(Color.red);
     jpTwo.setBackground(Color.green);
     jpResult.setBackground(Color.magenta);
     jpOp.setBackground(Color.cyan);
     //Make jpMain as the content pane
     this.setContentPane(jpMain);
     //add components to panels
     jpOne.add(jlbOne);
     jpOne.add(jtfOne);
     jpTwo.add(jlbTwo);
     jpTwo.add(jtfTwo);
     jpResult.add(jlbResult);
     jpResult.add(jtfResult);
     jtfResult.setEditable(false);
     jpOp.add(jbtAdd);
     jpOp.add(jbtSub);
     jpOp.add(jbtMult);
     jpOp.add(jbtDiv);
     jpOp.add(jbtClear);
     //register this object as a listener with buttons
     jbtAdd.addActionListener(this);
     jbtSub.addActionListener(this);
     jbtMult.addActionListener(this);
     jbtDiv.addActionListener(this);
     jbtClear.addActionListener(this);
   }
   //Listener method
   public void actionPerformed(ActionEvent ev) {
     String sOne,sTwo;
     double dOne, dTwo;
     sOne = jtfOne.getText().trim();
     sTwo = jtfTwo.getText().trim();
     dOne = Double.parseDouble(sOne);
     dTwo = Double.parseDouble(sTwo);
     
     if(ev.getSource() == jbtAdd){
    	 jtfResult.setText(""+(dOne+dTwo));
     }
     if(ev.getSource() == jbtSub){
    	 jtfResult.setText(""+(dOne-dTwo));
     }
     if(ev.getSource() == jbtMult){
    	 jtfResult.setText(""+(dOne*dTwo));
     }
     if(ev.getSource() == jbtDiv){
    	 jtfResult.setText(""+(dOne/dTwo));
     }
     if(ev.getSource() == jbtClear){
    	 jtfOne.setText("");
    	 jtfTwo.setText("");
     }
   }
}
 