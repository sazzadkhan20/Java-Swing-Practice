package Classes;

import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.lang.*;
 
public class Addnewuser extends JFrame implements ActionListener
{
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JPasswordField pf1,pf2;
	JCheckBox ch1;
	JButton b,b1,b2,b3;
	private FileWriter FW;
	
	Login ad;
	//Loginmsg login;

	JPanel p1;
	
	
	public Addnewuser(Login ad)
	{	
		super(" Signup Frame ");
		this.ad=ad;
		//this.login=login;
		this.setSize(800,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		p1 = new JPanel();
		p1.setBounds(0,0,800,650);
		this.setLocationRelativeTo(null);
		p1.setBackground(Color.decode("#99eaff"));
		p1.setLayout(null);
		
	//Label
	    l1 = new JLabel("Add New User");
		l1.setBounds(320,100,330,50);
		l1.setForeground(Color.BLACK);
		l1.setFont(new Font("Segoe UI",Font.BOLD,20));
		p1.add(l1);
	
	//name
		l2 = new JLabel("Name");
		l2.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l2.setForeground(Color.BLACK);
		l2.setBounds(120,190,130,30);
		p1.add(l2);
		
		l11 = new JLabel("_____________________________________");
        l11.setBounds(120, 225, 230, 30);
        l11.setForeground(Color.BLACK);
        l11.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l11);
			
		t1 = new JTextField();
		t1.setFont(new Font("Segoe UI",Font.PLAIN,16));
		t1.setBounds(120,215,190,30);
		t1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t1.setCaretColor(Color.BLACK);
		t1.setForeground(Color.BLACK);
        t1.setBorder(null);
        t1.setOpaque(false);
		p1.add(t1);
		
	//Date-of-birth	
		l3 = new JLabel("Date-of-birth");
		l3.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l3.setForeground(Color.BLACK);
		l3.setBounds(470,190,120,30);
		p1.add(l3);
		
		l12 = new JLabel("___________________________________________");
        l12.setBounds(470, 220, 230, 30);
        l12.setForeground(Color.BLACK);
        l12.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l12);
		
		t2 = new JTextField();
		t2.setFont(new Font("Segoe UI",Font.PLAIN,16));
		t2.setBounds(470,215,200,30);setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t2.setCaretColor(Color.BLACK);
		t2.setForeground(Color.BLACK);
        t2.setBorder(null);
        t2.setOpaque(false);
		p1.add(t2);
		
		
	//Email
		JLabel l4 = new JLabel("E-mail");
		l4.setBounds(120,265,200,30);
		l4.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l4.setForeground(Color.BLACK);
		p1.add(l4);
		
		l13 = new JLabel("___________________________________________");
        l13.setBounds(120, 300, 230, 30);
        l13.setForeground(Color.BLACK);
        l13.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l13);
		
		t3 = new JTextField();
		t3.setFont(new Font("Segoe UI",Font.PLAIN,16));
        t3.setBounds(120,290,200,30);
		t3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t3.setCaretColor(Color.BLACK);
		t3.setForeground(Color.BLACK);
        t3.setBorder(null);
        t3.setOpaque(false);
        p1.add(t3);
		
	//NID number 
		JLabel l5 = new JLabel("NID number");
		l5.setBounds(470,265,120,30);
		l5.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l5.setForeground(Color.BLACK);
		p1.add(l5);
		
		l14 = new JLabel("___________________________________________");
        l14.setBounds(470, 300, 230, 30);
        l14.setForeground(Color.BLACK);
        l14.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l14);
		
		t4 = new JTextField();
		t4.setFont(new Font("Segoe UI",Font.PLAIN,16));
        t4.setBounds(470,290,200,30);
		t4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t4.setCaretColor(Color.BLACK);
		t4.setForeground(Color.BLACK);
        t4.setBorder(null);
        t4.setOpaque(false);
        p1.add(t4);
	   
		
	//Phone number 
	    l6 = new JLabel("Phone number");
		l6.setBounds(120,340,130,30);
		l6.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l6.setForeground(Color.BLACK);
		p1.add(l6);
		
		l15 = new JLabel("___________________________________________");
        l15.setBounds(120, 375, 230, 30);
        l15.setForeground(Color.BLACK);
        l15.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l15);
		
		t6 = new JTextField();
		t6.setFont(new Font("Segoe UI",Font.PLAIN,16));
        t6.setBounds(120,365,200,30);
		t6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t6.setCaretColor(Color.BLACK);
		t6.setForeground(Color.BLACK);
        t6.setBorder(null);
        t6.setOpaque(false);
        p1.add(t6);
		
	//Address
		l7 = new JLabel("Address");
		l7.setBounds(470,340,130,30);
		l7.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l7.setForeground(Color.BLACK);
		p1.add(l7);
		
		l16 = new JLabel("___________________________________________");
        l16.setBounds(470, 375, 230, 30);
        l16.setForeground(Color.BLACK);
        l16.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l16);
		
		t7 = new JTextField();
		t7.setFont(new Font("Segoe UI",Font.PLAIN,16));
        t7.setBounds(470,365,200,30);
		t7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t7.setCaretColor(Color.BLACK);
		t7.setForeground(Color.BLACK);
        t7.setBorder(null);
        t7.setOpaque(false);
        p1.add(t7);
		
        
	//Create Password	
		l8 = new JLabel("Create Password");
		l8.setBounds(120,410,150,30);
		l8.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l8.setForeground(Color.BLACK);
		p1.add(l8);
		
		l17 = new JLabel("___________________________________________");
        l17.setBounds(120, 450, 230, 30);
        l17.setForeground(Color.BLACK);
        l17.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l17);
		
		pf1 = new JPasswordField();
		pf1.setBounds(120,440,200,30);
		pf1.setFont(new Font("Segoe UI",Font.PLAIN,16));
		pf1.setEchoChar('*');
		pf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		pf1.setForeground(Color.BLACK);
        pf1.setCaretColor(Color.BLACK);
        pf1.setBorder(null);
        pf1.setOpaque(false);
		p1.add(pf1);
		
	
	//Re-type password	
		JLabel l9 = new JLabel("Re-type Password");
		l9.setBounds(470,410,250,30);
		l9.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l9.setForeground(Color.BLACK);
		p1.add(l9);
		
	    l18 = new JLabel("___________________________________________");
        l18.setBounds(470, 450, 230, 30);
        l18.setForeground(Color.BLACK);
        l18.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l18);
		
		pf2 = new JPasswordField();
		pf2.setBounds(470,440,200,30);
		pf2.setFont(new Font("Segoe UI",Font.BOLD,16));
		pf2.setEchoChar('*');
		pf2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		pf2.setForeground(Color.BLACK);
        pf2.setCaretColor(Color.BLACK);
        pf2.setBorder(null);
        pf2.setOpaque(false);
		p1.add(pf2);
		
//Buttons	
	ImageIcon icon1 = new ImageIcon("Images/back.png");
	b1 = new JButton(icon1);
	b1.setBounds(20,15,35,35);
	b1.addActionListener(this);
	b1.setFocusPainted(false);
    b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b1.setContentAreaFilled(false);
    b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p1.add(b1);		
	   
	   
    b2 = new JButton("Add user");
    b2.setFont(new Font("Segoe UI",Font.BOLD,20));
    b2.setForeground(Color.BLACK);
    b2.setBounds(250,538,180,35); 
    b2.addActionListener(this);
    b2.setFocusable(false);
    b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    p1.add(b2);
	   

	
	ch1 = new JCheckBox("Show password");
	ch1.setFont(new Font("Segoe UI",Font.PLAIN,14));
    ch1.setBounds(120,488,150,17);
    ch1.addActionListener(this); 
    ch1.setFocusable(false);
    ch1.setForeground(Color.BLACK);
    ch1.setFocusPainted(false);
    ch1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    ch1.setContentAreaFilled(false);
    ch1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    p1.add(ch1);
	   
	   
    ImageIcon icon = new ImageIcon("Images/Grausers-icon.png");
    JLabel l10 = new JLabel(icon);
    l10.setBounds(330,2,127,127);
    p1.add(l10);
	   
    /*ImageIcon ic = new ImageIcon("Images/800x650.jpg");
    JLabel l = new JLabel(ic);
    l.setBounds(0,0,800,650);
    p1.add(l);*/
	   
	   
    this.add(p1);
    setVisible(true);
	}
	
	public void ClearAll()
	{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t6.setText("");
			t7.setText("");
			pf1.setText("");
			pf2.setText("");
			
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
	    if(e.getSource()==b1)
		{
			this.dispose();
			new Admindashboard(ad);	
		} 	
		else if(e.getSource()==b2)
		{
			if(t1.getText().isEmpty() || t2.getText().isEmpty() ||
			t3.getText().isEmpty() || t4.getText().isEmpty() || t7.getText().isEmpty() ||
			t6.getText().isEmpty()|| pf1.getText().isEmpty()||
      		pf2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(this,"Please fill up all the fields!");
				}
			
			else
			{
				String Pass = pf1.getText();
				String CPass = pf2.getText();	
				if(Pass.equals(CPass))
				{
					try
					{
					String Str = t3.getText()+","+
								 pf1.getText()+","+
								 t1.getText()+","+
								 t2.getText()+","+
								 t4.getText()+","+
								 t6.getText()+","+
								 t7.getText()+"\n";
					
					
					
					FW= new FileWriter("All Text Files/UserInfo.txt",true);
					
					FW.write(Str);

					FW.close();
					}
					catch(Exception E)
				{
					
				}
					ClearAll();
					JOptionPane.showMessageDialog(null,"Adding User Successfull");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Password doesn't macthed");
				}
			}			
		}
		else if(ch1.isSelected())
			{
				pf1.setEchoChar((char) 0);
				pf2.setEchoChar((char) 0);
			}
		else if(ch1.isSelected()!=true)
			{
				pf1.setEchoChar('\u2022');
				pf2.setEchoChar('\u2022');
			}	
	}
	
		
	}
		
