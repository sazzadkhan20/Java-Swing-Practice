package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;


public class Adminlogin extends JFrame implements ActionListener
{
 JLabel label,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10; 
 JTextField tf1;
 JPasswordField p;
 JButton l, b,b1,b2,b3,b6;
 JCheckBox ch2;
 JPanel p1;
Loginmsg loginmsg;
 
  public  Adminlogin(Loginmsg loginmsg)
    {
    super(" Admin Login Frame ");
	this.loginmsg=loginmsg;
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
    l9 = new JLabel ("Admin Sign In");
	l9.setBounds(510,80,220,50);
	l9.setForeground(Color.BLACK);
	l9.setFont(new Font("Segoe UI",Font.BOLD,30));
	p1.add(l9);
	
	l10 = new JLabel("Hello! Let's get started");
	l10.setBounds(485,120,300,40);
	l10.setForeground(Color.BLACK);
	l10.setFont(new Font("Segoe UI",Font.PLAIN,25));
	p1.add(l10);
		
//Username
	l1 = new JLabel("User Name");
	l1.setBounds(465,200,120,50);
	l1.setForeground(Color.BLACK);
	l1.setFont(new Font("Segoe UI",Font.PLAIN,20));
	p1.add(l1);
		
	l6 = new JLabel("___________________________________________");
    l6.setBounds(470, 245, 400, 40);
    l6.setForeground(Color.BLACK);
    l6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	p1.add(l6);
		
	tf1 = new JTextField();
    tf1.setBounds(470,240,400,30);
    tf1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
    tf1.setForeground(Color.BLACK);
    tf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    tf1.setCaretColor(Color.BLACK);
    tf1.setBorder(null);
    tf1.setOpaque(false);
	p1.add(tf1);
		
//Password
	l2 = new JLabel("Password");
	l2.setBounds(470,280,130,50);
	l2.setForeground(Color.BLACK);
	l2.setFont(new Font("Segoe UI",Font.PLAIN,20));
	p1.add(l2);
		
	l7 = new JLabel("___________________________________________");
    l7.setBounds(470, 325, 400, 40);
    l7.setForeground(Color.BLACK);
    l7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	p1.add(l7);
	  
	p = new JPasswordField();
	p.setBounds(470,320,400,30);
	p.setEchoChar('*');
	p.setFont(new Font("Segoe UI",Font.PLAIN,17));
	p.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	p.setForeground(Color.BLACK);
    p.setCaretColor(Color.BLACK);
    p.setBorder(null);
    p.setOpaque(false);
	p1.add(p);
		
//Remember me
	ch2 = new JCheckBox("Show password");
    ch2.setFont(new Font("Segoe UI",Font.PLAIN,14));
    ch2.setForeground(Color.black);
    ch2.setBounds(480,370,140,20);
    ch2.addActionListener(this); 
    ch2.setFocusable(false);
	ch2.setForeground(Color.BLACK);
    ch2.setFocusPainted(false);
    ch2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    ch2.setContentAreaFilled(false);
    ch2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    p1.add(ch2);
		
		
//Button
	b1 = new JButton("Sign In");
	b1.setFont(new Font("Segoe UI",Font.BOLD,18));
	b1.setBounds(485,440,250,40);
	b1.addActionListener(this);
	b1.setFocusable(false);
	b1.setFocusPainted(false);
    b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p1.add(b1);	
	
	ImageIcon icon = new ImageIcon("Images/back.png");
	l = new JButton(icon);
	l.setBounds(20,15,35,35);
	l.addActionListener(this);
	l.setFocusPainted(false);
    l.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    l.setContentAreaFilled(false);
    l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p1.add(l);		
	
//Login icon
    ImageIcon i1 = new ImageIcon("Images/350x350.png");
	l8 = new JLabel(i1);
    l8.setBounds(10,100,350,350);
    p1.add(l8);
		
	/*ImageIcon i11 = new ImageIcon("Images/icon.png");
	l9 = new JLabel(i11);
    l9.setBounds(720,240,20,20);
    p1.add(l9);*/
		
    ImageIcon ic = new ImageIcon("Images/400x600.png");
    l4 = new JLabel(ic);
    l4.setBounds(400,0,400,600);
    p1.add(l4);
	   
	    this.add(p1);
        setVisible(true);
	}
	/*public void actionPerformed(ActionEvent ea) 
	{
	    if(ea.getSource()==l)
		{
			this.setVisible(false);
			new Loginmsg();
		}
	}*/
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==ch2) 
		{
			if(ch2.isSelected()) 
			{
				p.setEchoChar((char)0);
			}
			else 
			{
				p.setEchoChar('*');;
			}
		}
	
	if(e.getSource()==b1) 
	{
			String textField1 = tf1.getText(); // User Name 
            String textField2 = p.getText(); // Password

            if (textField1.isEmpty() || textField2.isEmpty()) 
			{
                JOptionPane.showMessageDialog(null, "Please fill up all of the fields.", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
            }
			else
			{
				try
				{
					String userNameS = "User Name  : " + textField1;
					String passwordS = "Password   : " + textField2;
					BufferedReader reader = new BufferedReader(new FileReader("All Text Files/AdminInfo.txt"));

					int totalLines = 0;
					while (reader.readLine() != null)
					{	
						totalLines++;
					}
					reader.close();

					for (int i = 0; i <= totalLines; i++) 
					{
						String line = Files.readAllLines(Paths.get("All Text Files/AdminInfo.txt")).get(i);
						if (line.equalsIgnoreCase(userNameS)) 
						{
							String line2 = Files.readAllLines(Paths.get("All Text Files/AdminInfo.txt")).get((i + 1));
								if (line2.equals(passwordS)) 
								{
									JOptionPane.showMessageDialog(null,"Login Successful!");

									this.setVisible(false);
									new Admindashboard(this,loginmsg);
									break;
								}
						}
					}
				}
				catch (Exception ex) 
				{
						JOptionPane.showMessageDialog(null,"Invalid User Name or Password!");
				}
			}
			
		}
		if (e.getSource() == l)
			{
				this.dispose();
				loginmsg.setVisible(true);
			}
	}

		
}
	

	
    