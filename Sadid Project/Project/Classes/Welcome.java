package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Welcome extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JButton b1,b2,b3,b5;
	JPanel p1;

	
	public Welcome()
	{
		super(" Welcome frame ");
		this.setSize(800,515);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
		
	//JButton	
		b3 = new JButton("Get Started");
        b3.setBounds(40, 370, 250, 35);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 20));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b3.addActionListener(this);
        b3.setFocusPainted(false);
		p1.add(b3);
		
		b5 = new JButton("Contribution");
        b5.setBounds(40, 430, 250, 35);
        b5.setFont(new Font("Segoe UI", Font.BOLD, 20));
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b5.addActionListener(this);
        b5.setFocusPainted(false);
		p1.add(b5);
		
	//Logo
        ImageIcon icon = new ImageIcon("Images/nemo.gif");
	    JLabel l3 = new JLabel(icon);
	    l3.setBounds(0,0,853,480);
	    p1.add(l3);	
		
		this.add(p1);
        setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b3)
		{
			this.setVisible(false);
			new  Loginmsg();
			
		}
		else if(e.getSource()==b5)
		{
			this.setVisible(false);
			new  Contribution(this);
			
		}
	}
	   
		
}
