

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Images.;


public class Cpass extends JFrame 
{
 private JLabel l0,l9,l1,l2; 
 private JTextField t1;
private  JPasswordField p,p2;
 private JButton b,b1,b2,b3;
 private JPanel p1;
 

 
  public  Cpass()
    {
        super(" Change Password ");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		
		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.WHITE);
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
		l0 = new JLabel("Update your password");
		l0.setBounds(370,50,330,50);
		//l0.setForeground(Color.WHITE);
		l0.setFont(new Font("Segoe UI",Font.BOLD,30));
		p1.add(l0);
		
		l9 = new JLabel("Please enter your existing password and your new password");
		l9.setBounds(280,100,500,50);
		l9.setFont(new Font("Segoe UI",Font.BOLD,17));
		p1.add(l9);
		
	 //Current Password
		l1 = new JLabel("*CURRENT PASSWORD");
		l1.setBounds(450,200,220,50);
		l1.setFont(new Font("Segoe UI",Font.BOLD,18));
		p1.add(l1);
		
		p = new JPasswordField();
		p.setBounds(450,250,230,35);
		p.setEchoChar('*');
		p.setFont(new Font("Segoe UI",Font.PLAIN,18));
		p1.add(p);
		
	  //New Password
		l2 = new JLabel("*NEW PASSWORD");
		l2.setBounds(450,290,220,50);
		l2.setFont(new Font("Segoe UI",Font.BOLD,18));
		p1.add(l2);
	  
		p2 = new JPasswordField();
		p2.setBounds(450,335,230,35);
		p2.setEchoChar('*');
		p2.setFont(new Font("Segoe UI",Font.PLAIN,18));
		p1.add(p2);
		
	 //Button
		b1 = new JButton("Change Password");
		b1.setFont(new Font("Segoe UI",Font.BOLD,16));
		b1.setBounds(450,410,230,35);
		//b1.addActionListener(this);
		p1.add(b1);
		
	    ImageIcon icon1 = new ImageIcon(".Images/back.png");
		b2 = new JButton(icon1);
		b2.setBounds(18,20,35,35);
		//b2.addActionListener(this);
		b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);
	    b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b2);
		
		ImageIcon icon2 = new ImageIcon(".Images/home button.jpg");
		b3 = new JButton(icon2);
		b3.setBounds(740,15,35,35);
		//b3.addActionListener(this);
		b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);
	    b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b3);

	//Login icon
	    ImageIcon icon = new ImageIcon(".Images/pass.jpg");
	    JLabel l10 = new JLabel(icon);
	    l10.setBounds(30,160,350,276);
	    p1.add(l10);
		
	    this.add(p1);
        setVisible(true);
	}
	
    public static void main(String [] args)
	{
	    new Cpass();
	
	}
		
}