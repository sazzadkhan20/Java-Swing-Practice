package Classes;

import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.File; 
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException; 
import java.lang.*;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.border.*;
import java.util.*;
import java.text.*;
import java.io.*;
import java.net.*;

public class Home extends JFrame implements ActionListener
{
	//public Frm1 frm1;
	private JLabel l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,sb;
	private JPanel p1,p2;
	private Login login_obj;
	public String Email_Address;
	public ImageIcon icon11,icon1,icon12;
	boolean flag1 = false,flag2 = false;
	
	public static int a=0;
	public static String info [];
	private Loginmsg loginmsg;
	
	
	public Home(Login login_obj)
	{
		super(" Home ");
		this.login_obj=login_obj;
		Email_Address=login_obj.get_email();
		flag1 = true;
		createHomeFrame();
	}
	
	public Home(Loginmsg loginmsg)
	{
		super(" Home ");
		this.loginmsg = loginmsg;
		flag2 = true;
		createHomeFrame();
	}
	public void createHomeFrame()
	{
		this.setSize(900,680);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		
		p1 = new JPanel();
		p1.setBounds(0,0,900,680);
		this.setLocationRelativeTo(null);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		p1.setLayout(null);
		
		p2 = new JPanel();
	    p2.setBounds(0, 0, 900, 130);
	    this.setLocationRelativeTo(null);
		//p2.setBackground(Color.decode("#99eaff"));
		p2.setBackground(Color.WHITE);
	    p2.setLayout(null);
		
    //JLabel	
		l2 = new JLabel("Welcome to our Aquarium shop");
		l2.setBounds(140,8,600,50);
		l2.setFont(new Font("Segoe UI",Font.BOLD,36));
		p2.add(l2);
	
		l3 = new JLabel("All exclusive collection available in our store");
		l3.setBounds(142,55,520,30);
		l3.setFont(new Font("Segoe UI",Font.PLAIN,20));
		p2.add(l3);
		
		l4 = new JLabel("FISH TANK");
		l4.setBounds(115,320,200,15);
		l4.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l4);
		
		l5 = new JLabel("MAINTENANCE TOOL");
		l5.setBounds(375,315,200,15);
		l5.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l5);
		
		l6 = new JLabel("FISH FOOD");
		l6.setBounds(115,540,150,15);
		l6.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l6);
		
		l7 = new JLabel("FISH");
		l7.setBounds(435,540,100,15);
		l7.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l7);
		
		l8 = new JLabel("MEDICINE");
		l8.setBounds(700,318,130,15);
		l8.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l8);
		
		l9 = new JLabel("ACCESSORIES");
		l9.setBounds(685,540,130,15);
		l9.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l9);
		
		l10 = new JLabel("||");
		l10.setBounds(430,600,20,15);
		l10.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l10);
		
		l11 = new JLabel("||");
		l11.setBounds(525,600,20,15);
		l11.setFont(new Font("Segoe UI",Font.BOLD,15));
		p1.add(l11);
		 
		 if(flag1){
		//JButton(as Image)
        icon1 = new ImageIcon("Images/profile.png");
		b1 = new JButton(icon1);
		b1.setBounds(795,20,30,30);
		b1.addActionListener(this);
		b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);
	    b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b1);		
		
	    icon11 = new ImageIcon("Images/logout.png");
		b2 = new JButton(icon11);
		b2.setBounds(840,20,30,30);
	    b2.addActionListener(this);
	    b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);
	    b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b2);
	  }
	  
	  if(flag2){
		  
	    sb = new JButton("Sign up?");
		sb.setFont(new Font("Segoe UI",Font.BOLD,14));
		sb.setBounds(795,7,100,30);
		sb.addActionListener(this);
		sb.setForeground(Color.BLUE);
		sb.setFocusPainted(false);
        sb.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        sb.setContentAreaFilled(false);
	    sb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(sb);	
		
	    icon12 = new ImageIcon("Images/back.png");
		b13 = new JButton(icon11);
		b13.setBounds(15,595,35,35);
	    b13.addActionListener(this);
	    b13.setFocusPainted(false);
        b13.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b13.setContentAreaFilled(false);
	    b13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b13);
	  }
		
		/*ImageIcon icon2 = new ImageIcon("Images/cart.png");
		b3 = new JButton(icon2);
		b3.setBounds(820,20,30,30);
	    //b3.addActionListener(this);
	    b3.setFocusable(false);
	    b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p2.add(b3);*/
		
		ImageIcon icon3 = new ImageIcon("Images/fishtank.jpg");
		b4 = new JButton(icon3);
		b4.setBounds(40,145,230,170);
	    b4.addActionListener(this);
	    b4.setFocusable(false);
	    b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b4);
		
		ImageIcon icon4 = new ImageIcon("Images/tools.png");
		b5 = new JButton(icon4);
		b5.setBounds(335,140,230,170);
	    b5.addActionListener(this);
	    b5.setFocusable(false);
	    b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b5);
	
		ImageIcon icon6 = new ImageIcon("Images/food.jpg");
		b6 = new JButton(icon6);
		b6.setBounds(40,365,230,170);
	    b6.addActionListener(this);
	    b6.setFocusable(false);
	    b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b6);
		
		ImageIcon icon7 = new ImageIcon("Images/fish.png");
		b7 = new JButton(icon7);
		b7.setBounds(340,360,230,170);
	    b7.addActionListener(this);
	    b7.setFocusable(false);
	    b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b7);
		
		ImageIcon icon8 = new ImageIcon("Images/Medicine.jpg");
		b8 = new JButton(icon8);
		b8.setBounds(620,145,230,170);
	    b8.addActionListener(this);
	    b8.setFocusable(false);
	    b8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b8);
		
		ImageIcon icon9 = new ImageIcon("Images/Accessories.jpg");
		b9 = new JButton(icon9);
		b9.setBounds(620,365,230,170);
	    b9.addActionListener(this);
	    b9.setFocusable(false);
	    b9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b9);
	
    //About & contact
       b10 = new JButton("About us");
	   b10.setFont(new Font("Segoe UI",Font.BOLD,14));
	   b10.setForeground(Color.BLUE);
	   b10.setBorder(null);
	   b10.setBounds(345,600,90,15);
	   b10.addActionListener(this);
	   b10.setFocusable(false);
       b10.setFocusPainted(false);
       b10.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
       b10.setContentAreaFilled(false);
	   b10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   p1.add(b10);
	   
	   b11 = new JButton("Contact us");
	   b11.setFont(new Font("Segoe UI",Font.BOLD,14));
	   b11.setForeground(Color.BLUE);
	   b11.setBorder(null);
	   b11.setBounds(430,600,100,15);
	   b11.addActionListener(this);
	   b11.setFocusable(false);
       b11.setFocusPainted(false);
       b11.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
       b11.setContentAreaFilled(false);
	   b11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   p1.add(b11);
	   
	    b12 = new JButton("Chat with Admin");
	   b12.setFont(new Font("Segoe UI",Font.BOLD,14));
	   b12.setForeground(Color.BLUE);
	   b12.setBorder(null);
	   b12.setBounds(505,600,200,15);
	   b12.addActionListener(this);
	   b12.setFocusable(false);
       b12.setFocusPainted(false);
       b12.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
       b12.setContentAreaFilled(false);
	   b12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   p1.add(b12);
	   
	   info = new String [100000];
	   try
		{
			Scanner sc = new Scanner(new File("All Text Files/ProductInfo.txt"));
			
			while(sc.hasNextLine())
			{
				String stp = sc.nextLine();
				for(int i=0; i<info.length; i++)
				{
					if(info[i]==null)
					{
						info[i]=stp;
						break;
					}
					
				}
			}
			sc.close();
		}
		catch(Exception ex)
		{
			
		}

	
		ImageIcon ic = new ImageIcon("Images/img130.png");
		JLabel l11 = new JLabel(ic);
	    l11.setBounds(0,0,900,130);
        p2.add(l11);
		
		ImageIcon ic2 = new ImageIcon("Images/Logo 130x95.png");
		JLabel l12 = new JLabel(ic2);
	    l12.setBounds(8,4,130,95);
        p2.add(l12);
		
		

		p1.add(p2);
		this.add(p1);
        setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
	    if(e.getSource()==b1)
		{
			new Acnt(login_obj,this);
			this.setVisible(false);
		}	
		else if(e.getSource()==b2)
		{
			
			this.dispose();
			login_obj.setVisible(true);
		}
		else if(e.getSource() == sb)
		{
			this.dispose();
			new Signup();
		}
		else if(e.getSource() == b13)
		{
			this.dispose();
			loginmsg.setVisible(true);
		}
		else if(e.getSource()==b4)
		{
			this.setVisible(false);
			if(flag1)
			        new FTank(this,login_obj);
		    if(flag2)
			        new FTank(this);
		}
		else if(e.getSource()==b5)
		{
			this.setVisible(false);
			if(flag1)
			       new MTool(this,login_obj);
		    if(flag2)
			       new MTool(this);
		}
		else if(e.getSource()==b6)
		{
			this.setVisible(false);
			if(flag1)
			       new Food(this,login_obj);
		    if(flag2)
			       new Food(this);
		}
		else if(e.getSource()==b7)
		{
			this.setVisible(false);
			if(flag1)
			      new Fish(this,login_obj);
		    if(flag2)
			      new Fish(this);
		}
		else if(e.getSource()==b8)
		{
			this.setVisible(false);
			if(flag1)
			      new Medicine(this,login_obj);
		    if(flag2)
			      new Medicine(this);
		}
		else if(e.getSource()==b9)
		{
			this.setVisible(false);
			if(flag1)
			    new Accessories(this,login_obj);
		    if(flag2)
				new Accessories(this);
		}
		else if(e.getSource()==b10)
		{
			this.setVisible(false);
			new About(this,login_obj);
		}
		else if(e.getSource()==b11)
		{
			this.setVisible(false);
			if(flag1)
			        new Contact(this,login_obj);
		    if(flag2)
			        new Contact(this);
		}
		
		else if(e.getSource()==b12)
		{
			JOptionPane.showMessageDialog(this,"Service is not Available right now");
			/*this.setVisible(false);
			User user = new User(this);
		try{
			user.skt = new ServerSocket(6000);
			while(true)
			{
				user.s = user.skt.accept();
				user.din = new DataInputStream(user.s.getInputStream());
				user.dout = new DataOutputStream(user.s.getOutputStream());
				
				while(true)
				{
					String msg = user.din.readUTF();
					JPanel  panel = user.formatLabel(msg);
					
					JPanel left = new JPanel(new BorderLayout());
					left.add(panel,BorderLayout.LINE_START);
					user.vertical.add(left);
					user.f.validate();
					
					
				}
			}
			
			}
			catch (Exception exo)
		   {
			exo.printStackTrace();
		   }
			*/
		}
		
		}
		
	}
	