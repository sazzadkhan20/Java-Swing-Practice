package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Buy extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b4,b5,b6,b7;
	JComboBox cb1;
	JPanel p1,p2,p3,p4,p5,p6;
	
	CardLayout cd;
	Fish f;
	Home home;
	Food food;
	Medicine medicine;
	Accessories accessories;
	MTool mtool;
	FTank ftank;
	Login login;
	int b=0;
	int c=0;
	public static String name="";
	public static String priceOfProduct = "";
	
   public Buy(Fish f,Home home,Login login)
	{
		super(" Buy ");
		this.f=f;
		this.home=home;
		this.login = login;
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		setVisible(true);

		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
		cd = new CardLayout();
		
		p2 = new JPanel();
		p2.setBounds(30,100,300,250);
		p2.setBackground(Color.WHITE);
		//p2.setBackground(Color.decode("#99eaff"));
		p2.setLayout(cd);
		p1.add(p2);
		
		p3 = new JPanel();
		p3.setBounds(30,100,300,250);
		p3.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p3.setLayout(null);
		p2.add(p3);
		
		p4 = new JPanel();
		p4.setBounds(30,100,300,250);
		p4.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p4.setLayout(null);
		p2.add(p4);
		
		p5 = new JPanel();
		p5.setBounds(30,100,300,250);
		p5.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p5.setLayout(null);
		p2.add(p5);
		
		
		p6 = new JPanel();
		p6.setBounds(30,100,300,250);
		p6.setBackground(Color.WHITE);
		//p6.setBackground(Color.decode("#99eaff"));
		p6.setLayout(null);
		p2.add(p6);
		
	//JButton
        ImageIcon icon1 = new ImageIcon("./Images/back.png");
		b1 = new JButton(icon1);
		b1.setBounds(18,25,35,35);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent av)
			{
				dispose();
				f.setVisible(true);
			}
		});
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);	
		p1.add(b1);
		
		//ImageIcon icon2 = new ImageIcon("Images/buy-now-button.png");
		b2 = new JButton("Buy Now");
		b2.setBounds(520,450,150,35);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addActionListener(this);
        b2.setFocusPainted(false);
		p1.add(b2);
		
		ImageIcon icon3 = new ImageIcon("./Images/Guppy.jpg");
		b4 = new JButton(icon3);
        b4.setBounds(20,30,250,200);
	    //b4.addActionListener(this);
	    p3.add(b4);
		
		ImageIcon icon4 = new ImageIcon("./Images/Molly_Fish.jpg");
		b5 = new JButton(icon4);
		b5.setBounds(20,30,250,200);
	    p4.add(b5);
	
		ImageIcon icon6 = new ImageIcon("./Images/Goldfish.jpg");
		b6 = new JButton(icon6);
		b6.setBounds(20,30,250,200);
	    p5.add(b6);
		
		ImageIcon icon7 = new ImageIcon("./Images/Betta-Fish.jpg");
		b7 = new JButton(icon7);
		b7.setBounds(20,30,250,200);
	    p6.add(b7);
		
		cd.addLayoutComponent(p3,"1");
		cd.addLayoutComponent(p4,"2");
		cd.addLayoutComponent(p5,"3");
		cd.addLayoutComponent(p6,"4");
		
	
		
		
				for(int i=0; i<home.info.length; i++)
				{
					
					if(home.info[i]!=null)
					{
						 String sp[] = home.info[i].split("/");
						 b = Integer.parseInt(sp[1]);
						 if(home.a==b)
						 {
						 name=sp[0];
						 c = Integer.parseInt(sp[2]);
						break;
						 }
					}
					
				}
		
		
		String quantity[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        cb1 = new JComboBox(quantity);
        cb1.setBounds(500, 241, 75, 26);
		cb1.addActionListener(this);
		p1.add(cb1);
		
	//JLabel
        l1 = new JLabel("Quantity");
        l1.setBounds(420, 230, 240, 40);
        l1.setFont(new Font("Serif", Font.BOLD, 18));
		p1.add(l1);
		
		
		l2= new JLabel();
		l2.setBounds(380,170,200,40);
		l2.setFont(new Font("Serif", Font.BOLD, 35));
		p1.add(l2);
		
		l3= new JLabel();
		l3.setBounds(80,380,150,30);
		l3.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l3);
		
		l4= new JLabel();
		l4.setBounds(80,430,220,30);
		l4.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l4);

		if(home.a==b)
		{
			l2.setText(name);
			l3.setText("Quantity : "+cb1.getSelectedItem().toString());
			l4.setText("Price : "+c+" TK");
			cd.show(p2,String.valueOf(home.a));
			
		}
		
		
		this.add(p1);
        
	}
	
	 public Buy(Food food,Home home,Login login)
	{
		super(" Buy ");
		this.food=food;
		this.home=home;
		this.login = login;
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		setVisible(true);

		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
		cd = new CardLayout();
		
		p2 = new JPanel();
		p2.setBounds(30,100,300,250);
		p2.setBackground(Color.WHITE);
		//p2.setBackground(Color.decode("#99eaff"));
		p2.setLayout(cd);
		p1.add(p2);
		
		p3 = new JPanel();
		p3.setBounds(30,100,300,250);
		p3.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p3.setLayout(null);
		p2.add(p3);
		
		p4 = new JPanel();
		p4.setBounds(30,100,300,250);
		p4.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p4.setLayout(null);
		p2.add(p4);
		
		p5 = new JPanel();
		p5.setBounds(30,100,300,250);
		p5.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p5.setLayout(null);
		p2.add(p5);
		
		
		p6 = new JPanel();
		p6.setBounds(30,100,300,250);
		p6.setBackground(Color.WHITE);
		//p6.setBackground(Color.decode("#99eaff"));
		p6.setLayout(null);
		p2.add(p6);
		
	//JButton
        ImageIcon icon1 = new ImageIcon("./Images/back.png");
		b1 = new JButton(icon1);
		b1.setBounds(18,25,35,35);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent av)
			{
				dispose();
				food.setVisible(true);
			}
		});
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);	
		p1.add(b1);
		
		//ImageIcon icon2 = new ImageIcon("Images/buy-now-button.png");
		b2 = new JButton("Buy Now");
		b2.setBounds(520,450,150,35);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addActionListener(this);
        b2.setFocusPainted(false);
		p1.add(b2);
		
		ImageIcon icon3 = new ImageIcon("./Images/optimum.jpg");
		b4 = new JButton(icon3);
        b4.setBounds(20,30,250,200);
	    //b4.addActionListener(this);
	    p3.add(b4);
		
		ImageIcon icon4 = new ImageIcon("./Images/osaka.jpg");
		b5 = new JButton(icon4);
		b5.setBounds(20,30,250,200);
	    p4.add(b5);
	
		ImageIcon icon6 = new ImageIcon("./Images/aquaris.jpg");
		b6 = new JButton(icon6);
		b6.setBounds(20,30,250,200);
	    p5.add(b6);
		
		ImageIcon icon7 = new ImageIcon("./Images/nova.jpg");
		b7 = new JButton(icon7);
		b7.setBounds(20,30,250,200);
	    p6.add(b7);
		
		cd.addLayoutComponent(p3,"5");
		cd.addLayoutComponent(p4,"6");
		cd.addLayoutComponent(p5,"7");
		cd.addLayoutComponent(p6,"8");
		
	
		
		
				for(int i=0; i<home.info.length; i++)
				{
					
					if(home.info[i]!=null)
					{
						 String sp[] = home.info[i].split("/");
						 b = Integer.parseInt(sp[1]);
						 if(home.a==b)
						 {
						 name=sp[0];
						 c = Integer.parseInt(sp[2]);
						break;
						 }
					}
					
				}
		
		
		String quantity[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        cb1 = new JComboBox(quantity);
        cb1.setBounds(500, 241, 75, 26);
		cb1.addActionListener(this);
		p1.add(cb1);
		
	//JLabel
        l1 = new JLabel("Quantity");
        l1.setBounds(420, 230, 240, 40);
        l1.setFont(new Font("Serif", Font.BOLD, 18));
		p1.add(l1);
		
		
		l2= new JLabel();
		l2.setBounds(380,170,200,40);
		l2.setFont(new Font("Serif", Font.BOLD, 35));
		p1.add(l2);
		
		l3= new JLabel();
		l3.setBounds(80,380,150,30);
		l3.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l3);
		
		l4= new JLabel();
		l4.setBounds(80,430,220,30);
		l4.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l4);

		if(home.a==b)
		{
			l2.setText(name);
			l3.setText("Quantity : "+cb1.getSelectedItem().toString());
			l4.setText("Price : "+c+" TK");
			cd.show(p2,String.valueOf(home.a));
			
		}
		
		
		this.add(p1);
        
	}
	
	 public Buy(Medicine medicine,Home home,Login login)
	{
		super(" Buy ");
		this.medicine=medicine;
		this.home=home;
		this.login = login;
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		setVisible(true);

		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
		cd = new CardLayout();
		
		p2 = new JPanel();
		p2.setBounds(30,100,300,250);
		p2.setBackground(Color.WHITE);
		//p2.setBackground(Color.decode("#99eaff"));
		p2.setLayout(cd);
		p1.add(p2);
		
		p3 = new JPanel();
		p3.setBounds(30,100,300,250);
		p3.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p3.setLayout(null);
		p2.add(p3);
		
		p4 = new JPanel();
		p4.setBounds(30,100,300,250);
		p4.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p4.setLayout(null);
		p2.add(p4);
		
		p5 = new JPanel();
		p5.setBounds(30,100,300,250);
		p5.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p5.setLayout(null);
		p2.add(p5);
		
		
		p6 = new JPanel();
		p6.setBounds(30,100,300,250);
		p6.setBackground(Color.WHITE);
		//p6.setBackground(Color.decode("#99eaff"));
		p6.setLayout(null);
		p2.add(p6);
		
	//JButton
        ImageIcon icon1 = new ImageIcon("./Images/back.png");
		b1 = new JButton(icon1);
		b1.setBounds(18,25,35,35);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent av)
			{
				dispose();
				medicine.setVisible(true);
			}
		});
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);	
		p1.add(b1);
		
		//ImageIcon icon2 = new ImageIcon("Images/buy-now-button.png");
		b2 = new JButton("Buy Now");
		b2.setBounds(520,450,150,35);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addActionListener(this);
        b2.setFocusPainted(false);
		p1.add(b2);
		
		ImageIcon icon3 = new ImageIcon("./Images/blue.png");
		b4 = new JButton(icon3);
        b4.setBounds(20,30,250,200);
	    //b4.addActionListener(this);
	    p3.add(b4);
		
		ImageIcon icon4 = new ImageIcon("./Images/100 gold.jpg");
		b5 = new JButton(icon4);
		b5.setBounds(20,30,250,200);
	    p4.add(b5);
	
		ImageIcon icon6 = new ImageIcon("./Images/water care.png");
		b6 = new JButton(icon6);
		b6.setBounds(20,30,250,200);
	    p5.add(b6);
		
		ImageIcon icon7 = new ImageIcon("./Images/vitamin.jpg");
		b7 = new JButton(icon7);
		b7.setBounds(20,30,250,200);
	    p6.add(b7);
		
		cd.addLayoutComponent(p3,"9");
		cd.addLayoutComponent(p4,"10");
		cd.addLayoutComponent(p5,"11");
		cd.addLayoutComponent(p6,"12");
		
	
		
		
				for(int i=0; i<home.info.length; i++)
				{
					
					if(home.info[i]!=null)
					{
						 String sp[] = home.info[i].split("/");
						 b = Integer.parseInt(sp[1]);
						 if(home.a==b)
						 {
						 name=sp[0];
						 c = Integer.parseInt(sp[2]);
						break;
						 }
					}
					
				}
		
		
		String quantity[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        cb1 = new JComboBox(quantity);
        cb1.setBounds(500, 241, 75, 26);
		cb1.addActionListener(this);
		p1.add(cb1);
		
	//JLabel
        l1 = new JLabel("Quantity");
        l1.setBounds(420, 230, 240, 40);
        l1.setFont(new Font("Serif", Font.BOLD, 18));
		p1.add(l1);
		
		
		l2= new JLabel();
		l2.setBounds(380,170,200,40);
		l2.setFont(new Font("Serif", Font.BOLD, 35));
		p1.add(l2);
		
		l3= new JLabel();
		l3.setBounds(80,380,150,30);
		l3.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l3);
		
		l4= new JLabel();
		l4.setBounds(80,430,220,30);
		l4.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l4);

		if(home.a==b)
		{
			l2.setText(name);
			l3.setText("Quantity : "+cb1.getSelectedItem().toString());
			l4.setText("Price : "+c+" TK");
			cd.show(p2,String.valueOf(home.a));
			
		}
		
		
		this.add(p1);
        
	}
	
	public Buy(Accessories accessories,Home home,Login login)
	{
		super(" Buy ");
		this.accessories=accessories;
		this.home=home;
		this.login = login;
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		setVisible(true);

		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
		cd = new CardLayout();
		
		p2 = new JPanel();
		p2.setBounds(30,100,300,250);
		p2.setBackground(Color.WHITE);
		//p2.setBackground(Color.decode("#99eaff"));
		p2.setLayout(cd);
		p1.add(p2);
		
		p3 = new JPanel();
		p3.setBounds(30,100,300,250);
		p3.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p3.setLayout(null);
		p2.add(p3);
		
		p4 = new JPanel();
		p4.setBounds(30,100,300,250);
		p4.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p4.setLayout(null);
		p2.add(p4);
		
		p5 = new JPanel();
		p5.setBounds(30,100,300,250);
		p5.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p5.setLayout(null);
		p2.add(p5);
		
		
		p6 = new JPanel();
		p6.setBounds(30,100,300,250);
		p6.setBackground(Color.WHITE);
		//p6.setBackground(Color.decode("#99eaff"));
		p6.setLayout(null);
		p2.add(p6);
		
	//JButton
        ImageIcon icon1 = new ImageIcon("./Images/back.png");
		b1 = new JButton(icon1);
		b1.setBounds(18,25,35,35);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent av)
			{
				dispose();
				accessories.setVisible(true);
			}
		});
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);	
		p1.add(b1);
		
		//ImageIcon icon2 = new ImageIcon("Images/buy-now-button.png");
		b2 = new JButton("Buy Now");
		b2.setBounds(520,450,150,35);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addActionListener(this);
        b2.setFocusPainted(false);
		p1.add(b2);
		
		ImageIcon icon3 = new ImageIcon("./Images/stone.png");
		b4 = new JButton(icon3);
        b4.setBounds(20,30,250,200);
	    //b4.addActionListener(this);
	    p3.add(b4);
		
		ImageIcon icon4 = new ImageIcon("./Images/tree.jpg");
		b5 = new JButton(icon4);
		b5.setBounds(20,30,250,200);
	    p4.add(b5);
	
		ImageIcon icon6 = new ImageIcon("./Images/salt.jpg");
		b6 = new JButton(icon6);
		b6.setBounds(20,30,250,200);
	    p5.add(b6);
		
		ImageIcon icon7 = new ImageIcon("./Images/heater.png");
		b7 = new JButton(icon7);
		b7.setBounds(20,30,250,200);
	    p6.add(b7);
		
		cd.addLayoutComponent(p3,"13");
		cd.addLayoutComponent(p4,"14");
		cd.addLayoutComponent(p5,"15");
		cd.addLayoutComponent(p6,"16");
		
	
		
		
				for(int i=0; i<home.info.length; i++)
				{
					
					if(home.info[i]!=null)
					{
						 String sp[] = home.info[i].split("/");
						 b = Integer.parseInt(sp[1]);
						 if(home.a==b)
						 {
						 name=sp[0];
						 c = Integer.parseInt(sp[2]);
						break;
						 }
					}
					
				}
		
		
		String quantity[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        cb1 = new JComboBox(quantity);
        cb1.setBounds(500, 241, 75, 26);
		cb1.addActionListener(this);
		p1.add(cb1);
		
	//JLabel
        l1 = new JLabel("Quantity");
        l1.setBounds(420, 230, 240, 40);
        l1.setFont(new Font("Serif", Font.BOLD, 18));
		p1.add(l1);
		
		
		l2= new JLabel();
		l2.setBounds(380,170,300,40);
		l2.setFont(new Font("Serif", Font.BOLD, 35));
		p1.add(l2);
		
		l3= new JLabel();
		l3.setBounds(80,380,150,30);
		l3.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l3);
		
		l4= new JLabel();
		l4.setBounds(80,430,220,30);
		l4.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l4);

		if(home.a==b)
		{
			l2.setText(name);
			l3.setText("Quantity : "+cb1.getSelectedItem().toString());
			l4.setText("Price : "+c+" TK");
			cd.show(p2,String.valueOf(home.a));
			
		}
		
		
		this.add(p1);
        
	}
	
	public Buy(MTool mtool,Home home,Login login)
	{
		super(" Buy ");
		this.mtool=mtool;
		this.home=home;
		this.login = login;
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		setVisible(true);

		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
		cd = new CardLayout();
		
		p2 = new JPanel();
		p2.setBounds(30,100,300,250);
		p2.setBackground(Color.WHITE);
		//p2.setBackground(Color.decode("#99eaff"));
		p2.setLayout(cd);
		p1.add(p2);
		
		p3 = new JPanel();
		p3.setBounds(30,100,300,250);
		p3.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p3.setLayout(null);
		p2.add(p3);
		
		p4 = new JPanel();
		p4.setBounds(30,100,300,250);
		p4.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p4.setLayout(null);
		p2.add(p4);
		
		p5 = new JPanel();
		p5.setBounds(30,100,300,250);
		p5.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p5.setLayout(null);
		p2.add(p5);
		
		
		p6 = new JPanel();
		p6.setBounds(30,100,300,250);
		p6.setBackground(Color.WHITE);
		//p6.setBackground(Color.decode("#99eaff"));
		p6.setLayout(null);
		p2.add(p6);
		
	//JButton
        ImageIcon icon1 = new ImageIcon("./Images/back.png");
		b1 = new JButton(icon1);
		b1.setBounds(18,25,35,35);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent av)
			{
				dispose();
				mtool.setVisible(true);
			}
		});
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);	
		p1.add(b1);
		
		//ImageIcon icon2 = new ImageIcon("Images/buy-now-button.png");
		b2 = new JButton("Buy Now");
		b2.setBounds(520,450,150,35);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addActionListener(this);
        b2.setFocusPainted(false);
		p1.add(b2);
		
		ImageIcon icon3 = new ImageIcon("./Images/filter.jpg");
		b4 = new JButton(icon3);
        b4.setBounds(20,30,250,200);
	    //b4.addActionListener(this);
	    p3.add(b4);
		
		ImageIcon icon4 = new ImageIcon("./Images/net set.jpg");
		b5 = new JButton(icon4);
		b5.setBounds(20,30,250,200);
	    p4.add(b5);
	
		ImageIcon icon6 = new ImageIcon("./Images/pipe.jpg");
		b6 = new JButton(icon6);
		b6.setBounds(20,30,250,200);
	    p5.add(b6);
		
		ImageIcon icon7 = new ImageIcon("./Images/net.jpg");
		b7 = new JButton(icon7);
		b7.setBounds(20,30,250,200);
	    p6.add(b7);
		
		cd.addLayoutComponent(p3,"21");
		cd.addLayoutComponent(p4,"22");
		cd.addLayoutComponent(p5,"23");
		cd.addLayoutComponent(p6,"24");
		
	
		
		
				for(int i=0; i<home.info.length; i++)
				{
					
					if(home.info[i]!=null)
					{
						 String sp[] = home.info[i].split("/");
						 b = Integer.parseInt(sp[1]);
						 if(home.a==b)
						 {
						 name=sp[0];
						 c = Integer.parseInt(sp[2]);
						break;
						 }
					}
					
				}
		
		
		String quantity[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        cb1 = new JComboBox(quantity);
        cb1.setBounds(500, 241, 75, 26);
		cb1.addActionListener(this);
		p1.add(cb1);
		
	//JLabel
        l1 = new JLabel("Quantity");
        l1.setBounds(420, 230, 240, 40);
        l1.setFont(new Font("Serif", Font.BOLD, 18));
		p1.add(l1);
		
		
		l2= new JLabel();
		l2.setBounds(380,170,300,40);
		l2.setFont(new Font("Serif", Font.BOLD, 35));
		p1.add(l2);
		
		l3= new JLabel();
		l3.setBounds(80,380,150,30);
		l3.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l3);
		
		l4= new JLabel();
		l4.setBounds(80,430,220,30);
		l4.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l4);

		if(home.a==b)
		{
			l2.setText(name);
			l3.setText("Quantity : "+cb1.getSelectedItem().toString());
			l4.setText("Price : "+c+" TK");
			cd.show(p2,String.valueOf(home.a));
			
		}
		
		
		this.add(p1);
        
	}
	
	public Buy(FTank ftank,Home home,Login login)
	{
		super(" Buy ");
		this.ftank=ftank;
		this.home=home;
		this.login = login;
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		setVisible(true);

		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
		
		cd = new CardLayout();
		
		p2 = new JPanel();
		p2.setBounds(30,100,300,250);
		p2.setBackground(Color.WHITE);
		//p2.setBackground(Color.decode("#99eaff"));
		p2.setLayout(cd);
		p1.add(p2);
		
		p3 = new JPanel();
		p3.setBounds(30,100,300,250);
		p3.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p3.setLayout(null);
		p2.add(p3);
		
		p4 = new JPanel();
		p4.setBounds(30,100,300,250);
		p4.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p4.setLayout(null);
		p2.add(p4);
		
		p5 = new JPanel();
		p5.setBounds(30,100,300,250);
		p5.setBackground(Color.WHITE);
		//p3.setBackground(Color.decode("#99eaff"));
		p5.setLayout(null);
		p2.add(p5);
		
		
		p6 = new JPanel();
		p6.setBounds(30,100,300,250);
		p6.setBackground(Color.WHITE);
		//p6.setBackground(Color.decode("#99eaff"));
		p6.setLayout(null);
		p2.add(p6);
		
	//JButton
        ImageIcon icon1 = new ImageIcon("./Images/back.png");
		b1 = new JButton(icon1);
		b1.setBounds(18,25,35,35);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent av)
			{
				dispose();
				ftank.setVisible(true);
			}
		});
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);	
		p1.add(b1);
		
		//ImageIcon icon2 = new ImageIcon("Images/buy-now-button.png");
		b2 = new JButton("Buy Now");
		b2.setBounds(520,450,150,35);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addActionListener(this);
        b2.setFocusPainted(false);
		p1.add(b2);
		
		ImageIcon icon3 = new ImageIcon("./Images/set1.jpg");
		b4 = new JButton(icon3);
        b4.setBounds(20,30,250,200);
	    //b4.addActionListener(this);
	    p3.add(b4);
		
		ImageIcon icon4 = new ImageIcon("./Images/set2.jpg");
		b5 = new JButton(icon4);
		b5.setBounds(20,30,250,200);
	    p4.add(b5);
	
		ImageIcon icon6 = new ImageIcon("./Images/set5.jpg");
		b6 = new JButton(icon6);
		b6.setBounds(20,30,250,200);
	    p5.add(b6);
		
		ImageIcon icon7 = new ImageIcon("./Images/set6.jpg");
		b7 = new JButton(icon7);
		b7.setBounds(20,30,250,200);
	    p6.add(b7);
		
		cd.addLayoutComponent(p3,"17");
		cd.addLayoutComponent(p4,"18");
		cd.addLayoutComponent(p5,"19");
		cd.addLayoutComponent(p6,"20");
		
	
		
		
				for(int i=0; i<home.info.length; i++)
				{
					
					if(home.info[i]!=null)
					{
						 String sp[] = home.info[i].split("/");
						 b = Integer.parseInt(sp[1]);
						 if(home.a==b)
						 {
						 name=sp[0];
						 c = Integer.parseInt(sp[2]);
						break;
						 }
					}
					
				}
		
		
		String quantity[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        cb1 = new JComboBox(quantity);
        cb1.setBounds(500, 241, 75, 26);
		cb1.addActionListener(this);
		p1.add(cb1);
		
	//JLabel
        l1 = new JLabel("Quantity");
        l1.setBounds(420, 230, 240, 40);
        l1.setFont(new Font("Serif", Font.BOLD, 18));
		p1.add(l1);
		
		
		l2= new JLabel();
		l2.setBounds(380,170,350,40);
		l2.setFont(new Font("Serif", Font.BOLD,30));
		p1.add(l2);
		
		l3= new JLabel();
		l3.setBounds(80,380,150,30);
		l3.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l3);
		
		l4= new JLabel();
		l4.setBounds(80,430,220,30);
		l4.setFont(new Font("Serif", Font.BOLD, 25));
		p1.add(l4);

		if(home.a==b)
		{
			l2.setText(name);
			l3.setText("Quantity : "+cb1.getSelectedItem().toString());
			l4.setText("Price : "+c+" TK");
			cd.show(p2,String.valueOf(home.a));
			
		}
		
		
		this.add(p1);
        
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==cb1)
		{
		     int count = Integer.parseInt(cb1.getSelectedItem().toString());
			 int price = c*count;
		     l4.setText("Price : "+price+" TK");
			 l3.setText("Quantity : "+cb1.getSelectedItem().toString());
		}
		
		if(e.getSource()==b2)
		{
			this.setVisible(false);
			priceOfProduct = String.valueOf(c);
			new Payment(this,login);
		}
		
	}
   
 
}
		
		
		
		