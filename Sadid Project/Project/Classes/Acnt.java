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


public class Acnt extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3,l4,l7,l10,l11,l12,l13,
	Name_Label,Phone_Label, Email_Label, Address_Label, Balance_Label;
	private JButton b1,b2,b12,b10;
	private JPanel p3;
	private Login login_obj;
	private Home home_obj;
	private FileReader reader;
	private BufferedReader bfreader;
	public static String Email ="";
	private String[] Info = new String[6];
	
	
    public Acnt(Login login_obj, Home home_obj)
	{
	super(" User Details ");
	this.setSize(700,600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setLayout(null);
	
	this.login_obj=login_obj;
	this.home_obj=home_obj;
	Email= this.login_obj.get_email();
	
	
	reader = null;
	bfreader = null;
	String line;
		
		try
		{
			reader = new FileReader("All Text Files/UserInfo.txt");
			bfreader = new BufferedReader(reader);

			while ((line = bfreader.readLine()) != null)
			{
				String[] parts = line.split(",");
				String email = parts[0];

				if (Email.equals(email))
				{
					Info = parts;
				}	
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	
		
	p3 = new JPanel();
	p3.setBounds(0,0,700,600);
	this.setLocationRelativeTo(null);
	p3.setBackground(Color.WHITE);
	//p3.setBackground(Color.decode("#99eaff"));
	p3.setLayout(null);
	
//JLabel
    l1 = new JLabel("Name");
	l1.setFont(new Font("Segoe UI",Font.BOLD,20));
	l1.setBounds(100,200,80,30);
	p3.add(l1);
	
	l10 = new JLabel(":");
	l10.setFont(new Font("Segoe UI",Font.BOLD,20));
	l10.setBounds(240,200,10,30);
	p3.add(l10);
	
    l2 = new JLabel("E-mail");
	l2.setFont(new Font("Segoe UI",Font.BOLD,20));
	l2.setBounds(100,250,100,30);
	p3.add(l2);
	
	l11 = new JLabel(":");
	l11.setFont(new Font("Segoe UI",Font.BOLD,20));
	l11.setBounds(240,250,10,30);
	p3.add(l11);
	
	l3 = new JLabel("Phone number");
	l3.setFont(new Font("Segoe UI",Font.BOLD,20));
	l3.setBounds(100,300,150,30);
	p3.add(l3);
	
	l13 = new JLabel(":");
	l13.setFont(new Font("Segoe UI",Font.BOLD,20));
	l13.setBounds(210,300,10,30);
	p3.add(l13);
	
	l4 = new JLabel("Address");
	l4.setFont(new Font("Segoe UI",Font.BOLD,20));
	l4.setBounds(100,350,170,25);
	p3.add(l4);
	
	l12 = new JLabel(":");
	l12.setFont(new Font("Segoe UI",Font.BOLD,20));
	l12.setBounds(240,350,10,30);
	p3.add(l12);
	
	
			Name_Label= new JLabel(Info[2]);
			Name_Label.setBounds(300,200,200,30);
			Name_Label.setFont(new Font("Calibri",Font.BOLD,20));
			p3.add(Name_Label);
			
			
			Email_Label= new JLabel(Info[0]);
			Email_Label.setBounds(300,250,300,30);
			Email_Label.setFont(new Font("Calibri",Font.BOLD,20));
			p3.add(Email_Label);
			
			
			Phone_Label= new JLabel(Info[5]);
			Phone_Label.setBounds(300,300,200,30);
			Phone_Label.setFont(new Font("Calibri",Font.BOLD,20));
			p3.add(Phone_Label);
			
			
			
			Address_Label= new JLabel(Info[6]);
			Address_Label.setBounds(300,350,200,30);
			Address_Label.setFont(new Font("Calibri",Font.BOLD,20));
			p3.add(Address_Label);
	
	
	
	
//JButton	
	b10 = new JButton("Change password");
	b10.setFont(new Font("Segoe UI",Font.BOLD,15));
	b10.setBounds(100,410,170,25);
	b10.addActionListener(this);
	b10.setFocusable(false);
	p3.add(b10);
	
	b12 = new JButton("Order history");
	b12.setFont(new Font("Segoe UI",Font.BOLD,15));
	b12.setBounds(100,460,170,25);
	b12.addActionListener(this);
	b12.setFocusable(false);
	p3.add(b12);
	
    ImageIcon icon1 = new ImageIcon("Images/back.png");
    b1 = new JButton(icon1);
	b1.setBounds(18,20,35,35);
	b1.addActionListener(this);
	b1.setFocusPainted(false);
    b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b1.setContentAreaFilled(false);
	b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    p3.add(b1);	
	
	ImageIcon icon = new ImageIcon("Images/profile 127x127.png");
	JLabel l7 = new JLabel(icon);
	l7.setBounds(305,8,127,127);
	p3.add(l7);
	
	/*ImageIcon ic = new ImageIcon("Images/img1.png");
	JLabel l = new JLabel(ic);
	l.setBounds(0,0,800,600);
    p3.add(l);*/	
	  
	this.add(p3);
    setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
		{
			this.dispose();
            home_obj.setVisible(true);
            
        }
		else if(e.getSource()==b10)
		{
           
			this.setVisible(false);
			new Changepass(this,login_obj);
			
        }
		else if(e.getSource()==b12)
		{
            JOptionPane.showMessageDialog(this,"Not available right now!!");
        }
        
	}
	   
		
}