package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GContact extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1,b2,b3;
	JPanel p,p1,p2,p3,p4;

	public GContact()
	{
	super(" Contact us ");
	this.setSize(800,400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setLayout(null);
		
	p = new JPanel();
	p.setBounds(0,0,800,400);
	this.setLocationRelativeTo(null);
	//p.setBackground(Color.decode("#99eaff"));
	p.setBackground(Color.WHITE);
	p.setLayout(null);
	
//JPanel	
	p1 = new JPanel();
	p1.setBounds(40,140,150,125);
	this.setLocationRelativeTo(null);
	p1.setBackground(Color.WHITE);
	p1.setLayout(null);
	p.add(p1);
	
	p2 = new JPanel();
	p2.setBounds(225,140,150,125);
	this.setLocationRelativeTo(null);
	p2.setBackground(Color.WHITE);
	p2.setLayout(null);
	p.add(p2);
	
	p3 = new JPanel();
	p3.setBounds(410,140,150,125);
	this.setLocationRelativeTo(null);
	p3.setBackground(Color.WHITE);
	p3.setLayout(null);
	p.add(p3);
	
	p4 = new JPanel();
	p4.setBounds(595,140,150,125);
	this.setLocationRelativeTo(null);
	p4.setBackground(Color.WHITE);
	p4.setLayout(null);
	p.add(p4);
	
//JLabel
    JLabel l = new JLabel("GContact US");
    l.setBounds(290,40,240,30);
	l.setBackground(Color.BLACK);
	l.setFont(new Font("Serif",Font.BOLD,30));
	p.add(l);

    l1 = new JLabel("Office");
    l1.setBounds(53,50,40,25);
	l1.setBackground(Color.BLACK);
	l1.setFont(new Font("Serif",Font.BOLD,15));
	p1.add(l1);
    p.add(p1);	
	
	l2 = new JLabel("Kuratoli, Dhaka");
    l2.setBounds(25,70,120,25);
	l2.setBackground(Color.BLACK);
	l2.setFont(new Font("Serif",Font.BOLD,15));
	p1.add(l2);
    p.add(p1);	
	
	l3 = new JLabel("Phone number");
    l3.setBounds(30,50,110,25);
	l3.setBackground(Color.BLACK);
	l3.setFont(new Font("Serif",Font.BOLD,15));
	p2.add(l3);
    p.add(p2);	
	
	l4 = new JLabel("01625329568");
    l4.setBounds(33,70,110,25);
	l4.setBackground(Color.BLACK);
	l4.setFont(new Font("Serif",Font.BOLD,15));
	p2.add(l4);
    p.add(p2);	
	
	l5 = new JLabel("E-mail");
    l5.setBounds(50,50,80,25);
	l5.setBackground(Color.BLACK);
	l5.setFont(new Font("Serif",Font.BOLD,15));
	p3.add(l5);
    p.add(p3);	
	
	l6 = new JLabel("mrlesnar@gmail.com");
    l6.setBounds(18,70,200,25);
	l6.setBackground(Color.BLACK);
	l6.setFont(new Font("Serif",Font.BOLD,13));
	p3.add(l6);
    p.add(p3);	
	
	l7 = new JLabel("Facebook");
    l7.setBounds(50,50,200,25);
	l7.setBackground(Color.BLACK);
	l7.setFont(new Font("Serif",Font.BOLD,13));
	p4.add(l7);
    p.add(p4);	
	
	l8 = new JLabel("https://www.facebook.com/sadid");
    l8.setBounds(5,70,300,20);
	l8.setBackground(Color.BLACK);
	l8.setFont(new Font("Serif",Font.BOLD,10));
	p4.add(l8);
    p.add(p4);	
	
//JButton
        ImageIcon icon11 = new ImageIcon("Images/back.png");
		b2 = new JButton(icon11);
		b2.setBounds(18,20,35,35);
		b2.addActionListener(this);
		b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);
	    b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p.add(b2);
		
		/*ImageIcon icon22 = new ImageIcon("Images/home button.jpg");
		b3 = new JButton(icon22);
		b3.setBounds(740,15,35,35);
		b3.addActionListener(this);
		b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);
	    b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p.add(b3);**/

//Image
    ImageIcon icon = new ImageIcon("Images/location.jpg");
	JLabel l9 = new JLabel(icon);
	l9.setBounds(58,25,30,30);
	p1.add(l9);
    p.add(p1);	
	
	ImageIcon icon1 = new ImageIcon("Images/phone.jpg");
	JLabel l10 = new JLabel(icon1);
	l10.setBounds(65,25,28,28);
	p2.add(l10);
    p.add(p2);
	
	ImageIcon icon2 = new ImageIcon("Images/mail.jpg");
	JLabel l11 = new JLabel(icon2);
	l11.setBounds(60,30,30,21);
	p3.add(l11);
    p.add(p3);	
	
	ImageIcon icon3 = new ImageIcon("Images/fb.jpg");
	JLabel l12 = new JLabel(icon3);
	l12.setBounds(63,25,28,28);
	p4.add(l12);
    p.add(p4);	
	
	this.add(p);
    setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b2)
		{
		 this.dispose();
         new Guesthome();
		
		}
	}
		
}