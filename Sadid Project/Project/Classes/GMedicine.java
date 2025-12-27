package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GMedicine extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b11;
	JScrollBar sb1;
	JPanel p1;
	Home h;
	
	public GMedicine()
	{
		super(" Fish Medicine ");
		this.setSize(800,630);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		p1 = new JPanel();
		p1.setBounds(0,0,800,630);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
	
    //JLabel	
		l2 = new JLabel("EXCLUSIVE COLLECTION -> MEDICINE");
		l2.setBounds(18,65,500,25);
		l2.setFont(new Font("Segoe UI",Font.BOLD,20));
		p1.add(l2);
		
		l3 = new JLabel("Blue");
		l3.setBounds(215,290,500,19);
		l3.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l3);
		
		l4 = new JLabel("BDT 40tk(per bottle)");
		l4.setBounds(180,315,310,19);
		l4.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l4);
		
		l5 = new JLabel("100 gold");
		l5.setBounds(535,295,120,19);
		l5.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l5);
		
		l8 = new JLabel("BDT 40tk(per bottle)");
		l8.setBounds(505,315,300,19);
		l8.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l8);
		
		l6 = new JLabel("Water care");
		l6.setBounds(210,535,100,19);
		l6.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l6);
		
		l9 = new JLabel("BDT 40tk(per bottle)");
		l9.setBounds(180,560,300,19);
		l9.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l9);
		
		l7 = new JLabel("Vitamin");
		l7.setBounds(535,535,80,18);
		l7.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l7);
		
		l1 = new JLabel("BDT 40tk(per bottle)");
		l1.setBounds(500,560,310,19);
		l1.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l1);
	
		
	//JButton(as Image)
		ImageIcon icon1 = new ImageIcon("Images/back.png");
		b1 = new JButton(icon1);
		b1.setBounds(18,20,35,35);
		b1.addActionListener(this);
		b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);
	    b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b1);	
		
		ImageIcon icon3 = new ImageIcon("Images/blue.png");
		b4 = new JButton(icon3);
		b4.setBounds(140,110,200,180);
	    b4.addActionListener(this);
	    b4.setFocusable(false);
	    b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b4);
		
		ImageIcon icon4 = new ImageIcon("Images/100 gold.jpg");
		b5 = new JButton(icon4);
		b5.setBounds(460,110,200,180);
	    b5.addActionListener(this);
	    b5.setFocusable(false);
	    b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b5);
	
		ImageIcon icon6 = new ImageIcon("Images/vitamin.jpg");
		b6 = new JButton(icon6);
		b6.setBounds(140,350,200,180);
	    b6.addActionListener(this);
	    b6.setFocusable(false);
	    b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b6);
	
	    ImageIcon icon7 = new ImageIcon("Images/water care.png");
		b7 = new JButton(icon7);
		b7.setBounds(460,350,200,180);
	    b6.addActionListener(this);
	    b7.setFocusable(false);
	    b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b7);
		
		b11 = new JButton("Sign up?");
		b11.setFont(new Font("Segoe UI",Font.BOLD,14));
		b11.setBounds(795,7,100,30);
		b11.addActionListener(this);
		b11.setForeground(Color.BLUE);
		b11.setFocusPainted(false);
        b11.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b11.setContentAreaFilled(false);
	    b11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b11);
		
		
		this.add(p1);
        setVisible(true);
	}
	
		public void actionPerformed(ActionEvent e) 
	{
	    if(e.getSource()==b1)
		{
			this.setVisible(false);
			new Guesthome();
		}	
		else if(e.getSource()==b4)
		{
			JOptionPane.showMessageDialog(this,"For purchasing any products you need to create an account!!");
		}
		else if(e.getSource()==b5)
		{
			JOptionPane.showMessageDialog(this,"For purchasing any products you need to create an account!!");
		}
		else if(e.getSource()==b6)
		{
			JOptionPane.showMessageDialog(this,"For purchasing any products you need to create an account!!");
		}
		else if(e.getSource()==b7)
		{
			JOptionPane.showMessageDialog(this,"For purchasing any products you need to create an account!!");
		}
		else if(e.getSource()==b11)
		{
			this.setVisible(false);
			new Signup();
		}
	}
   
    public static void main(String [] args)
	{
	 new GMedicine();
	
	}
		
}