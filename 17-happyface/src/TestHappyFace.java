//Assignment #: 17
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestHappyFace {
	
	JButton jbtHappy = new JButton("Happy");
	JButton jbtSad = new JButton("Sad");
	JButton jbtPic = new JButton("Picture");
	
	public static void main(String args[]) {
		JFrame frame = new JFrame("");
		frame.setSize(500, 500);
		frame.setVisible(true);
	    GridLayout gl = new GridLayout (2,1);
	    
	    DrawArea da = new DrawArea();
	    da.setSize(500,500);
	    da.setBackground(Color.YELLOW);
	    da.setVisible(true);
	    
	    
		JPanel jpMain = new JPanel();
		jpMain.setLayout(gl);
		JPanel jpBtns = new JPanel();
		jpMain.add(da);
		jpMain.add(jpBtns);
		jpBtns.setBackground(Color.GREEN);
	    frame.setContentPane(jpMain);
		JButton jbtHappy = new JButton("Happy");
		JButton jbtSad = new JButton("Sad");
		JButton jbtPic = new JButton("Picture");
		jpBtns.add(jbtHappy);
		jpBtns.add(jbtSad);
		jpBtns.add(jbtPic);
	    jpBtns.setSize(300,100);
	    frame.add(jpBtns);
	    
	    ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == jbtHappy) {
					da.setPictureType("Happy");
				}
				if(ae.getSource() == jbtSad) {
					da.setPictureType("Sad");					
				}
				if(ae.getSource() == jbtPic) {
					da.setPictureType("Picture");					
				}	
			}
	    };
	    
	    jbtHappy.addActionListener(al);
	    jbtSad.addActionListener(al);
	    jbtPic.addActionListener(al);
	}
}