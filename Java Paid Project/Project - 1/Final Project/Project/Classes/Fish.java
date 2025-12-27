package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Fish extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JPanel p1;
	private Home home;
	private Login login;
	boolean flag1 = false,flag2 = false;
	
	public Fish(Home home, Login login)
	{
		super(" Fish Food ");
		this.home=home;
	    this.login=login;
		flag1 = true;
		createFishFrame();
		
	}
	
	public Fish(Home home)
	{
		super(" Fish Food ");
		this.home=home;
		flag2 = true;
		createFishFrame();
		
	}
	
	public void createFishFrame()
	{
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
	
    //JLabel	
		l2 = new JLabel("EXCLUSIVE COLLECTION -> FISH FOOD");
		l2.setBounds(18,73,500,25);
		l2.setFont(new Font("Segoe UI",Font.BOLD,22));
		p1.add(l2);
		
		l3 = new JLabel();
		l3.setBounds(185,285,80,17);
		l3.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l3);
		
		l4 = new JLabel();
		l4.setBounds(175,305,200,15);
		l4.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l4);
		
		l5 = new JLabel();
		l5.setBounds(515,285,100,18);
		l5.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l5);
		
		l8 = new JLabel();
		l8.setBounds(515,305,200,15);
		l8.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l8);
		
		l6 = new JLabel();
		l6.setBounds(175,495,100,15);
		l6.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l6);
		
		l9 = new JLabel();
		l9.setBounds(165,515,120,15);
		l9.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l9);
		
		l7 = new JLabel();
		l7.setBounds(515,500,120,15);
		l7.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l7);
	    
		l1 = new JLabel();
		l1.setBounds(505,520,130,15);
		l1.setFont(new Font("Segoe UI",Font.PLAIN,15));
		p1.add(l1);
		
		
	//JButton(as Image)
		ImageIcon icon1 = new ImageIcon("Images/back.png");
		b1 = new JButton(icon1);
		b1.setBounds(18,20,35,35);
	    b1.addActionListener(this);
		b1.setFocusPainted(false);
        //b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);
	    b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b1);		
		
		/*ImageIcon icon2 = new ImageIcon("Images/cart.png");
		b3 = new JButton(icon2);
		b3.setBounds(720,25,30,30);
	    b3.addActionListener(this);
	    b3.setFocusable(false);
	    b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b3);*/
		
		ImageIcon icon3 = new ImageIcon("Images/Guppy.jpg");
		b4 = new JButton(icon3);
		b4.setBounds(110,150,200,130);
	    b4.addActionListener(this);
	    b4.setFocusable(false);
	    b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b4);
		
		ImageIcon icon4 = new ImageIcon("Images/Molly_Fish.jpg");
		b5 = new JButton(icon4);
		b5.setBounds(450,150,200,133);
	    b5.addActionListener(this);
	    b5.setFocusable(false);
	    b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b5);
	
		ImageIcon icon6 = new ImageIcon("Images/Goldfish.jpg");
		b6 = new JButton(icon6);
		b6.setBounds(110,360,200,126);
	    b6.addActionListener(this);
	    b6.setFocusable(false);
	    b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b6);
	
	    ImageIcon icon7 = new ImageIcon("Images/Betta-Fish.jpg");
		b7 = new JButton(icon7);
		b7.setBounds(450,360,200,133);
	    b7.addActionListener(this);
	    b7.setFocusable(false);
	    b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b7);
		
		for(int i=0; i<home.info.length; i++)
				{
					
					if(home.info[i]!=null)
					{
						 String sp[] = home.info[i].split("/");
						 if(sp[1].equals("1"))
						 {
						    l3.setText(sp[0]);
							l4.setText("BDT "+sp[2]+"tk");
							
						 }
						else if(sp[1].equals("2"))
						 {
						    l5.setText(sp[0]);
							l8.setText("BDT "+sp[2]+"tk");
							
						 }
						 else if(sp[1].equals("3"))
						 {
						    l6.setText(sp[0]);
							l9.setText("BDT "+sp[2]+"tk");
							
						 }
						  else if(sp[1].equals("4"))
						 {
						    l7.setText(sp[0]);
							l1.setText("BDT "+sp[2]+"tk");
							
						 }
					}
					
				}
		
		this.add(p1);
        setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
         this.dispose();
		 home.setVisible(true);
		}
		if(e.getSource()==b4)
		{ 
	        if(flag1){
			   home.a=1;
               this.setVisible(false);
			   new Buy(this,home,login);
		   }
		   if(flag2)  JOptionPane.showMessageDialog(this,"For purchasing any products you need to create an account!!");
		}
		if(e.getSource()==b5)
		{
           if(flag1){
			   home.a=2;
               this.setVisible(false);
			   new Buy(this,home,login);
		   }
		   if(flag2)  JOptionPane.showMessageDialog(this,"For purchasing any products you need to create an account!!");
		}
		if(e.getSource()==b6)
		{
            if(flag1){
			   home.a=3;
               this.setVisible(false);
			   new Buy(this,home,login);
		   }
		   if(flag2)  JOptionPane.showMessageDialog(this,"For purchasing any products you need to create an account!!");
		}
		if(e.getSource()==b7)
		{
            if(flag1){
			   home.a=4;
               this.setVisible(false);
			   new Buy(this,home,login);
		   }
		   if(flag2)  JOptionPane.showMessageDialog(this,"For purchasing any products you need to create an account!!");
		}
	}
		
}