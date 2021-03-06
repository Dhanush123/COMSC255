//Assignment #: 17
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306
 
import java.awt.*;
import java.net.URL;

import javax.swing.*;

public class DrawArea extends JPanel {
   private String pType;
   private int n;
   public DrawArea() {
      super();
      pType = "";
   }

   public void paintComponent(Graphics g) {
       super.paintComponent(g);
		System.out.println(pType);
	   if(pType.equals("Happy")) {
		   g.drawOval(0, 0, 100, 100);
		   g.fillOval(25, 25, 10, 10);
		   g.fillOval(65, 25, 10, 10);
		   g.drawArc(25, 25, 50, 50, 0, -180);   
	   }
	   if(pType.equals("Sad")) {
		   g.drawOval(0,0,100,100);
		   g.fillOval(25,25,10,10);
		   g.fillOval(65,25,10,10);
		   g.drawArc(25,50,50,50,0,180);
	   }
	   if(pType.equals("Picture")) {
		   URL url = getClass().getResource ("gip"+n+".gif");
		   ImageIcon imageIcon = new ImageIcon (url);
           Image image = imageIcon.getImage();
           g.drawImage (image,0,0,this.getWidth(), this.getHeight() , this);
	   }
   }
   
   public void setPictureType(String picture) {
	   if(picture.equals("Happy")) {
		   pType = "Happy";
		   
	   }
	   if(picture.equals("Sad")) {
		   pType = "Sad";
	   }
	   if(picture.equals("Picture")) {
		   pType = "Picture";
		   n = ((int) (Math.random() * 4)) + 1;
	   }
	   this.repaint();
   }
}