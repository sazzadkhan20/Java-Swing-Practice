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
import java.util.Scanner;
import java.awt.Color;


public class Changepass extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4,l5; 
 JTextField t1,t2;
 JPasswordField p1,p2;
 JButton b1,b2,b3,b4;
 JCheckBox ch1;
 FileReader reader;
 JPanel p;
 Login login;
 Acnt acnt;

 public Changepass(Acnt acnt,Login login)
{
    super(" Change Password ");
    this.setSize(800,600);
	this.acnt=acnt;
	this.login=login;
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setLayout(null);
		
	p = new JPanel();
	p.setBounds(0,0,800,600);
	p.setBackground(Color.WHITE);
	this.setLocationRelativeTo(null);
	p.setLayout(null);
	
//JLabel & JTextField	
	l1 = new JLabel("Change password?");
	l1.setBounds(450,40,330,45);
	l1.setFont(new Font("Segoe UI",Font.BOLD,30));
	p.add(l1);
		
	l4 = new JLabel("*New password");
	l4.setBounds(460,300,120,25);
	//l4.setForeground(Color.WHITE);
	l4.setFont(new Font("Segoe UI",Font.PLAIN,17));
	p.add(l4);
		
	p1 = new JPasswordField();
    p1.setBounds(460, 325, 220, 35);
    p1.setFont(new Font("Segoe UI", Font.PLAIN,15));
	p1.setEchoChar('*');
    p.add(p1);
	
	l5 = new JLabel("*Confirm password");
	l5.setBounds(460,370,150,25);
	//l5.setForeground(Color.WHITE);
	l5.setFont(new Font("Segoe UI",Font.PLAIN,17));
	p.add(l5);
		
    p2 = new JPasswordField();
    p2.setBounds(460, 400, 220, 35);
    p2.setFont(new Font("Segoe UI", Font.PLAIN,15));
	p2.setEchoChar('*');
	p.add(p2);
		
//JButton
    ImageIcon icon1 = new ImageIcon("Images/back.png");
    b1 = new JButton(icon1);
	b1.setBounds(18,20,35,35);
	b1.addActionListener(this);
	b1.setFocusPainted(false);
    b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b1.setContentAreaFilled(false);
	b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    p.add(b1);
  		
    b2 = new JButton("Save password");
	b2.setFont(new Font("Segoe UI",Font.BOLD,15));
	b2.setForeground(Color.BLACK);
	b2.setBounds(490,490,150,30); 
	b2.setFocusable(false);
	b2.addActionListener(this);
	b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p.add(b2);
	
	b4 = new JButton("Sign In");
	b4.setFont(new Font("Segoe UI",Font.BOLD,14));
	b4.setForeground(Color.BLACK);
	b4.setBounds(705,10,63,19); 
	b4.setForeground(Color.BLUE);
	b4.setFocusPainted(false);
    b4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b4.setContentAreaFilled(false);
    b4.setBorder(null);
	b4.addActionListener(this);
	b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p.add(b4);
	
	ch1 = new JCheckBox("Show password");
	ch1.setFont(new Font("Segoe UI",Font.PLAIN,15));
    ch1.setBounds(460, 432, 220, 35);
    ch1.addActionListener(this); 
    ch1.setFocusable(false);
    ch1.setForeground(Color.BLACK);
    ch1.setFocusPainted(false);
    ch1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    ch1.setContentAreaFilled(false);
	ch1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    p.add(ch1);
		
	
//Login icon
	ImageIcon icon = new ImageIcon("Images/pass.jpg");
	JLabel l10 = new JLabel(icon);
	l10.setBounds(25,170,350,276);
	p.add(l10);
		
	this.add(p);
    setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			this.dispose();
			acnt.setVisible(true);
		}
		
		else if (e.getSource() == b2) 
		{
			if(!p1.getText().isEmpty() && !p2.getText().isEmpty() && p1.getText().equals(p2.getText()))
			{
			
			int option = JOptionPane.showConfirmDialog(this,"Are you Sure to Confirm Update??");
					if(option==JOptionPane.YES_OPTION){
				
						String email = "";
			            String password = "";
			            String name = "";
			            String phone = "";
			            String nid = "";
			            String dateOfBirth = "";
			            String address = "";
						
					try
		           {
					    File newfile = new File("All Text Files/UserTempInfo.txt");
						 File oldfile = new File("All Text Files/UserInfo.txt");
						 FileWriter fw = new FileWriter(newfile,true);
			         Scanner sc = new Scanner(oldfile);
			
                    while(sc.hasNextLine())
			        {
				        String sp[] = sc.nextLine().split(",");
						if((acnt.Email).equals(sp[0]))
						{
							email = sp[0];
							password = String.valueOf(p1.getPassword());
							name =sp[2];
							phone =sp[5];
							nid =sp[4];
							dateOfBirth =sp[3];
							address =sp[6];
							
						}
						else
						{
							fw.write(sp[0]+","+sp[1]+","+sp[2]+","+sp[3]+","+sp[4]+","+sp[5]+","+sp[6]+"\n");
							
						}
				     }
					 sc.close();
					 fw.write(email+","+password+","+name+","+dateOfBirth+","+nid+","+phone+","+address+"\n");
					 fw.close();
					 oldfile.delete();
				     File dump = new File("All Text Files/UserInfo.txt");
				     newfile.renameTo(dump);
					 JOptionPane.showMessageDialog(this,"Password Saved Successfully");
					 this.dispose();
					 login.setVisible(true);
				   }
				   catch(IOException ioe)
				   {
					   ioe.printStackTrace();
				   }

			}
		}
			else if(p1.getText().isEmpty() || p2.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Please fill-up all the fields!");
			}
			else if(!p1.getText().equals(p2.getText()))
			{
				JOptionPane.showMessageDialog(this,"New Password & Confirm Password doesn't matched");
			}
		}
		else if(e.getSource()==b4)
		{
			this.dispose();
			login.setVisible(true);

		}
		else if(ch1.isSelected())
		{
			p1.setEchoChar((char) 0);
			p2.setEchoChar((char) 0);
			
		}
		else if(ch1.isSelected()!=true)
		{
			p1.setEchoChar('\u2022');
			p2.setEchoChar('\u2022');
		}
		
	}
	
	
		
}