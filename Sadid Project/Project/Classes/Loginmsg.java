package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Loginmsg extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JButton l,b1,b2,b3;
	JPanel p1;
	
	
	public Loginmsg()
	{
		super(" Welcome frame ");
		this.setSize(610,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		p1 = new JPanel();
		p1.setBounds(0,0,610,400);
		//p1.setBackground(Color.decode("#99eaff"));
		p1.setBackground(Color.WHITE);
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
	//JLabel	
		l1 = new JLabel("Welcome to");
		l1.setFont(new Font("Turtles",Font.BOLD,30));
		l1.setBounds(280,30,500,120);
		p1.add(l1);
		
		l2 = new JLabel("AQUARIUM");
		l2.setFont(new Font("Cooper Black",Font.BOLD,50));
		l2.setBounds(265,85,500,100);
		p1.add(l2);
		
		l3 = new JLabel("AVENGERS");
		l3.setFont(new Font("Cooper Black",Font.BOLD,50));
		l3.setBounds(260,145,500,100);
		p1.add(l3);
	
		
	//JButton	
		b1 = new JButton("Guest Sign In");
	    b1.setFont(new Font("Segoe UI",Font.BOLD,15));
	    b1.setForeground(Color.BLACK);
	    b1.setBounds(30,290,150,30); 
	    b1.addActionListener(this);
	    b1.setFocusable(false);
	    b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b1);
		
		b2 = new JButton("Sign In");
	    b2.setFont(new Font("Segoe UI",Font.BOLD,15));
	    b2.setForeground(Color.BLACK);
	    b2.setBounds(220,290,150,30); 
	    b2.addActionListener(this);
	    b2.setFocusable(false);
	    b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b2);
		
		b3 = new JButton("Admin Sign In");
	    b3.setFont(new Font("Segoe UI",Font.BOLD,15));
	    b3.setForeground(Color.BLACK);
	    b3.setBounds(400,290,150,30); 
	    b3.addActionListener(this);
	    b3.setFocusable(false);
	    b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b3);
		
		ImageIcon icon1 = new ImageIcon("Images/back.png");
		l = new JButton(icon1);
		l.setBounds(10,10,35,35);
		l.addActionListener(this);
		l.setFocusPainted(false);
        l.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        l.setContentAreaFilled(false);
	    l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(l);	
	
		
	//Logo
        ImageIcon icon = new ImageIcon("Images/logo 240x240.png");
	    JLabel l3 = new JLabel(icon);
	    l3.setBounds(5,25,240,240);
	    p1.add(l3);	
		
		this.add(p1);
        setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			this.setVisible(false);
			new  Guesthome();
			
		}
		if(e.getSource()==b2)
		{
			
			this.setVisible(false);
			new  Login();
			
		}
		if(e.getSource()==b3)
		{
			this.setVisible(false);
			new  Adminlogin(this);
			
		}
		
		if(e.getSource()==l)
		{
			this.dispose();
			new Welcome();
			
		}
	}
	   
		
}
