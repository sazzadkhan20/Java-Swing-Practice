package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GAbout extends JFrame implements ActionListener
{
	JButton b1;
	JPanel p1,p2;
	
	
    public GAbout()
	{
    super(" About us ");
	this.setSize(550,350);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setLayout(null);
		
	p1 = new JPanel();
	p1.setBounds(0,0,550,350);
	p1.setBackground(Color.decode("#99eaff"));
	this.setLocationRelativeTo(null);
	p1.setBackground(Color.WHITE);
	p1.setLayout(null);
	
//JPanel
    p2 = new JPanel();
	p2.setBounds(0, 270, 550, 80);
	this.setLocationRelativeTo(null);
	p2.setBackground(Color.WHITE);
	//p2.setBackground(Color.decode("#99eaff"));
	p2.setLayout(null);
		
		
    JTextArea terms = new JTextArea();
	terms.setBounds(10,0,515,250);
	//terms.setBackground(Color.decode("#99eaff"));
	terms.setBackground(Color.WHITE);
    terms.setText("\n" +
                     "1. Our mission is to help small business owners and entrepreneurs succeed by\n providing them with the tools and resources they need to grow their businesses.\n" +
                     "2. Our team is made up of experienced professionals with a passion for\n supporting small business owners. We understand the challenges of starting \nand running a business, and we're here to help.\n" +
                     "3. At [AQUARIUM AVENGERS], we're committed to providing our users with \nexceptional service and support. If you ever have any questions or concerns, our\n customer service team is always here to help.\n"+
                     "4. Thank you for choosing [AQUARIUM AVENGERS]. We look forward to helping\n you achieve your business goals!");
					 
    terms.setEditable(false);
    terms.setFont(new Font("Segoe UI",Font.PLAIN,14));
    p1.add(terms);
		
//JButton	
    b1 = new JButton("BACK");
	b1.setFont(new Font("Segoe UI",Font.BOLD,15));
	b1.setForeground(Color.BLACK);
	b1.setBounds(220,5,90,30); 
	b1.addActionListener(this);
	b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p2.add(b1);
   	
	
    p1.add(p2);
    this.add(p1);
    setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
         this.dispose();
		 new Guesthome();
		}
	}

 
		
}