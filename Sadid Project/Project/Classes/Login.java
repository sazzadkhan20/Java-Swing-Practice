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


public class Login extends JFrame implements ActionListener
{
 private JLabel label,l1,l2,l3,l4,l5,l6,l7,l9,l10,l11; 
 private JTextField tf1;
 private JPasswordField p;
 private JButton l, b,b1,b2,b3,b5,b6,b7;
 private JCheckBox ch1,ch2;
 private JPanel p1;
 public FileReader reader;
 public String email_to_check;
  private Loginmsg loginmsg;
 
 public String get_email()
	{
		return email_to_check;
	}

 
   public Login()
    {
        super(" Login Frame ");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setUndecorated(true);
		this.setResizable(false);
		this.setLayout(null);
		
		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.WHITE);
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
		
	//Message
        l9 = new JLabel ("User Sign In");
		l9.setBounds(525,80,200,50);
		l9.setForeground(Color.BLACK);
		l9.setFont(new Font("Segoe UI",Font.BOLD,30));
		p1.add(l9);
		
		l10 = new JLabel("Hello! Let's get started");
		l10.setBounds(490,120,300,40);
		l10.setForeground(Color.BLACK);
		l10.setFont(new Font("Segoe UI",Font.PLAIN,25));
		p1.add(l10);
		
	//Username
		l1 = new JLabel("Email");
		l1.setBounds(448,200,120,50);
		l1.setForeground(Color.BLACK);
		l1.setFont(new Font("Segoe UI",Font.PLAIN,20));
		p1.add(l1);
		
		l6 = new JLabel("_____________________________________________");
        l6.setBounds(450, 248, 400, 40);
        l6.setForeground(Color.BLACK);
        l6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l6);
		
		tf1 = new JTextField();
        tf1.setBounds(450,242,400,30);
        tf1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf1.setForeground(Color.BLACK);
        tf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tf1.setCaretColor(Color.BLACK);
        tf1.setBorder(null);
        tf1.setOpaque(false);
		p1.add(tf1);
		
	//Password
		l2 = new JLabel("Password");
		l2.setBounds(450,280,130,50);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("Segoe UI",Font.PLAIN,20));
		p1.add(l2);
		
		l7 = new JLabel("_____________________________________________");
        l7.setBounds(450, 325, 400, 30);
        l7.setForeground(Color.BLACK);
        l7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l7);
	  
		p = new JPasswordField();
		p.setBounds(450,320,260,25);
		p.setEchoChar('*');
		p.setFont(new Font("Segoe UI",Font.PLAIN,17));
		p.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p.setForeground(Color.BLACK);
        p.setCaretColor(Color.BLACK);
        p.setBorder(null);
        p.setOpaque(false);
		p1.add(p);
	
		
	//Show Password
		ch1 = new JCheckBox("Show password");
	    ch1.setFont(new Font("Segoe UI",Font.PLAIN,14));
	    ch1.setForeground(Color.black);
	    ch1.setBounds(460,380,140,20);
	    ch1.addActionListener(this); 
	    ch1.setFocusable(false);
		ch1.setForeground(Color.BLACK);
        ch1.setFocusPainted(false);
        ch1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        ch1.setContentAreaFilled(false);
	    ch1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(ch1);
		
		
	//Forgot password?
		b3 = new JButton("Forgot password?");
	    b3.setFont(new Font("Segoe UI",Font.BOLD,14));
	    b3.setForeground(Color.BLUE);
	    b3.setBorder(null);
	    b3.setBounds(630,380,125,18);
		b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);
	    b3.setBorder(null);
	    b3.addActionListener(this);
	    b3.setFocusable(false);
	    b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b3);
		
	 //Button
		b1 = new JButton("Sign In");
		b1.setFont(new Font("Segoe UI",Font.BOLD,18));
		b1.setBounds(485,440,250,40);
		b1.addActionListener(this);
		b1.setFocusable(false);
		b1.setFocusPainted(false);
	    b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b1);
		
	/*//password icon	
		ImageIcon icon1 = new ImageIcon("Images/icon2.png");
		b5 = new JButton(icon1);
        b5.setBounds(740,315,25,20);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);
		b5.addActionListener(this);
        b5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b5.setContentAreaFilled(false);
		p1.add(b5);
		
		ImageIcon icon2 = new ImageIcon("Images/icon3.png");
		b6 = new JButton(icon2);
        b6.setBounds(740,315,25,20);
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setFocusPainted(false);
		b6.addActionListener(this);
        b6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b6.setContentAreaFilled(false);
		p1.add(b6);*/
		
	//Don't have an account?
		l3 = new JLabel("Don't have an account?");
        l3.setBounds(505,500,175,15);
        l3.setFont(new Font("Segoe UI",Font.PLAIN,15));
		l3.setForeground(Color.BLACK);
        p1.add(l3);
	
	//Signup	
	    b = new JButton("Sign Up");
	    b.setFont(new Font("Segoe UI",Font.BOLD,14));
	    b.setForeground(Color.BLUE);
		b.setFocusPainted(false);
        b.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b.setContentAreaFilled(false);
	    b.setBorder(null);
	    b.setBounds(665,500,80,17);
	    b.addActionListener(this);
	    b.setFocusable(false);
	    b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b);
		
	//Back Button
		ImageIcon icon = new ImageIcon("Images/back.png");
		l = new JButton(icon);
		l.setBounds(20,15,35,35);
		l.addActionListener(this);
		l.setFocusPainted(false);
        l.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        l.setContentAreaFilled(false);
	    l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(l);		
	
	//Images
	    ImageIcon i1 = new ImageIcon("Images/350x350.png");
		JLabel l7 = new JLabel(i1);
	    l7.setBounds(10,100,350,350);
        p1.add(l7);
		
		/*ImageIcon i11 = new ImageIcon("Images/icon.png");
	    l11 = new JLabel(i11);
        l11.setBounds(740,240,20,20);
        p1.add(l11);*/
		
	    ImageIcon ic = new ImageIcon("Images/400x600.png");
	    JLabel l4 = new JLabel(ic);
	    l4.setBounds(400,0,400,600);
        p1.add(l4);
	   
	    this.add(p1);
        setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			 String email=tf1.getText();
			 String password=p.getText();
			 
			 
			 String LoginInfo =email+","+password;
			 
			 String AmdinLoginInfo ="admin"+","+"admin";
			 
			BufferedReader bfreader=null;
			String line;
			int count=0;
			try
			{
				reader=new FileReader("All Text Files/UserInfo.txt");
				bfreader=new BufferedReader(reader);
				
				while((line=bfreader.readLine())!=null)
				{
					String[] parts = line.split(",");
					String Email = parts[0];
					String Password = parts[1];
					
					String User_login_info= Email+","+Password;

					if(LoginInfo.equals(User_login_info))
					{
						count++;
					}				
				}
				
				if(email.isEmpty() || password.isEmpty())
				{
					JOptionPane.showMessageDialog(this,"Please fill up all the fields");
				}
				
				else if(count==1)
				{
					email_to_check= tf1.getText();
					setVisible(false);
					new Home(this);
				}
				
				
				else
				{
					JOptionPane.showMessageDialog(this,"Enter Correct ID & Password");
				}
				
								
				reader.close();
				bfreader.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	
	
		else if(e.getSource()==b)
		{
			this.setVisible(false);
			new Signup();
		}
		
		else if(e.getSource()==b3)
		{
			this.setVisible(false);
			new Forgot(this);
		}
		
		else if(e.getSource()==l)
		{
			this.dispose();
			 new Loginmsg();
		}
		
		else if(ch1.isSelected())
		{
			p.setEchoChar((char) 0);
			
		}
		else if(ch1.isSelected()!=true)
		{
			p.setEchoChar('\u2022');
		}
	}
    
		
}
