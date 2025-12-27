package Classes;

import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.lang.*;
import javax.swing.border.*;
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.net.*;
import java.io.*;


public class Admindashboard extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4,l5,l6; 
 JButton b,b1,b2,b3,b4,b5;
 JPanel p1;
  Adminlogin adi;
  Loginmsg loginmsg;
 
   public Admindashboard(Adminlogin adi,Loginmsg loginmsg)
    {
    super(" Admin dashboard ");
	this.adi=adi;
	this.loginmsg=loginmsg;
	this.setSize(850,600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//this.setUndecorated(true);
	this.setResizable(false);
	this.setLayout(null);
		
	p1 = new JPanel();
	p1.setBounds(0,0,850,600);
	p1.setBackground(Color.WHITE);
	this.setLocationRelativeTo(null);
	p1.setLayout(null);
		
//JLabel
   /* l1 = new JLabel("User:");
	l1.setFont(new Font("Segoe UI",Font.BOLD,15));
	l1.setBounds(18,10,200,35);
	l1.setForeground(Color.BLACK);
	p1.add(l1);*/	
		
	l2 = new JLabel("Admin Dashboard");
	l2.setFont(new Font("Segoe UI",Font.BOLD,30));
	l2.setBounds(420,25,400,35);
	l2.setForeground(Color.WHITE);
	p1.add(l2);	
	
	l3 = new JLabel("User information");
	l3.setFont(new Font("Segoe UI",Font.BOLD,16));
	l3.setBounds(450,250,400,30);
	l3.setForeground(Color.WHITE);
	p1.add(l3);	
	
	l4 = new JLabel("Add user");
	l4.setFont(new Font("Segoe UI",Font.BOLD,16));
	l4.setBounds(690,250,400,30);
	l4.setForeground(Color.WHITE);
	p1.add(l4);	
	
	l5 = new JLabel("Update Products");
	l5.setFont(new Font("Segoe UI",Font.BOLD,16));
	l5.setBounds(440,470,400,30);
	l5.setForeground(Color.WHITE);
	p1.add(l5);	
	
	l6 = new JLabel("Chat Application");
	l6.setFont(new Font("Segoe UI",Font.BOLD,16));
	l6.setBounds(660,460,400,30);
	l6.setForeground(Color.WHITE);
	p1.add(l6);	
	
//JButton
    b = new JButton("Sign out");
	b.setFont(new Font("Segoe UI",Font.BOLD,15));
    b.setForeground(Color.BLUE);
	b.setFocusPainted(false);
    b.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b.setContentAreaFilled(false);
    b.setBorder(null);
    b.setBounds(750,10,70,30);
    b.addActionListener(this);
    b.setFocusable(false);
    b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    p1.add(b);


    ImageIcon icon2 = new ImageIcon("Images/userinfo.jpg");
	b1 = new JButton(icon2);
	b1.setBounds(430,120,170,130);
	b1.addActionListener(this);
	b1.setFocusPainted(false);
    b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b1.setContentAreaFilled(false);
	b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p1.add(b1);	
	
	ImageIcon icon3 = new ImageIcon("Images/adduser.jpg");  
	b2 = new JButton(icon3);
	b2.setBounds(640,120,170,130);
	b2.addActionListener(this);
	b2.setFocusPainted(false);
    b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b2.setContentAreaFilled(false);
	b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p1.add(b2);	
	
	
	ImageIcon icon4 = new ImageIcon("Images/adminInfo.jpg");
	b3 = new JButton(icon4);
	b3.setBounds(430,340,170,130);
	b3.addActionListener(this);
	b3.setFocusPainted(false);
    b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b3.setContentAreaFilled(false);
	b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p1.add(b3);	
	
	ImageIcon icon5 = new ImageIcon("Images/addadmin2.png");
	b4 = new JButton(icon5);
	b4.setBounds(640,320,170,140);
	b4.addActionListener(this);
	b4.setFocusPainted(false);
    b4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b4.setContentAreaFilled(false);
	b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p1.add(b4);	
	
	
	
//Image
    ImageIcon i1 = new ImageIcon("Images/admin.png");
	JLabel l7 = new JLabel(i1);
    l7.setBounds(30,170,320,283);
    p1.add(l7);
		
    ImageIcon ic = new ImageIcon("Images/500x680.jpg");
    JLabel l8 = new JLabel(ic);
    l8.setBounds(400,0,500,660);
    p1.add(l8);
	   
    this.add(p1);
    setVisible(true);
	}
    
	public void actionPerformed(ActionEvent e) 
	{
	    if(e.getSource()==b)
		{
			this.dispose();
			adi.setVisible(true);
		}
		
		else if(e.getSource()==b1)
		{
			this.setVisible(false);
			new UserInformation(this,adi);
		}
		else if(e.getSource()==b3)
		{
			this.setVisible(false);
			new AdminUpdateProducts(this,adi);
		}
		
		else if(e.getSource()==b2)
		{
			this.setVisible(false);
			new Addnewuser(adi,loginmsg);
		}
		else if(e.getSource()==b4)
		{
			this.setVisible(false);
			Admin ad = new Admin(this);
		try
		{
			
			ad.s = new Socket("127.0.0.1",6000);
			ad.din = new DataInputStream(ad.s.getInputStream());
			ad.dout = new DataOutputStream(ad.s.getOutputStream());
			
			while(true)
				{
					ad.a1.setLayout(new BorderLayout());
					String msg = ad.din.readUTF();
					JPanel  panel = ad.formatLabel(msg);
					
					JPanel left = new JPanel(new BorderLayout());
					left.add(panel, BorderLayout.LINE_START);
					ad.vertical.add(left);
					
					ad.vertical.add(Box.createVerticalStrut(15));
					ad.a1.add(ad.vertical, BorderLayout.PAGE_START);
					
					
					ad.f.validate();
	
					
				}
		}
		catch (Exception exp)
		{
			exp.printStackTrace();
		}
		}
	}
	
		
}
		