package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class Guesthome extends JFrame implements ActionListener
{
	//public Frm1 frm1;
	private JLabel l2,l3,l4,l5,l6,l7,l8,l9,l10;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	private JPanel p1,p2;
	

	
	public Guesthome()
	{
		super(" Guesthome ");
		
		this.setSize(900,680);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		//this.frm1=frm1;
		
		p1 = new JPanel();
		p1.setBounds(0,0,900,680);
		this.setLocationRelativeTo(null);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		p1.setLayout(null);
		
		p2 = new JPanel();
	    p2.setBounds(0, 0, 900, 130);
	    this.setLocationRelativeTo(null);
	    p2.setBackground(Color.WHITE);
		//p2.setBackground(Color.decode("#99eaff"));
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

	//JButton(as Image)
        
		b1 = new JButton("Sign up?");
		b1.setFont(new Font("Segoe UI",Font.BOLD,14));
		b1.setBounds(795,7,100,30);
		b1.addActionListener(this);
		b1.setForeground(Color.BLUE);
		b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);
	    b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b1);		
		
	    ImageIcon icon11 = new ImageIcon("Images/back.png");
		b2 = new JButton(icon11);
		b2.setBounds(15,595,35,35);
	    b2.addActionListener(this);
	    b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);
	    b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b2);
		
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
			this.setVisible(false);
			
			new Signup();
		}	
		else if(e.getSource()==b2)
		{
			this.dispose();
			new Loginmsg();
			
		}
		else if(e.getSource()==b4)
		{
			this.setVisible(false);
			new GFTank();
		}
		else if(e.getSource()==b5)
		{
			this.setVisible(false);
			new GMTool();
		}
		else if(e.getSource()==b6)
		{
			this.setVisible(false);
			new GFood();
		}
		else if(e.getSource()==b7)
		{
			this.setVisible(false);
			new GFish();
		}
		else if(e.getSource()==b8)
		{
			this.setVisible(false);
			new GMedicine();
		}
		else if(e.getSource()==b9)
		{
			this.setVisible(false);
			new GAccessories();
		}
		else if(e.getSource()==b10)
		{
			this.setVisible(false);
			new GAbout();
		}
		else if(e.getSource()==b11)
		{
			this.setVisible(false);
			new GContact();
		}
		
	}
		
}
	