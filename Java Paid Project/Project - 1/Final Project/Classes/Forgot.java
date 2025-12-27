package Classes;

import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.File; 
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException; 
import java.awt.Color;


public class Forgot extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4,l5; 
 JTextField t1,t2;
 JPasswordField p1,p2;
 JButton b1,b2,b3,b4;
 JCheckBox ch1;
 FileReader reader;
 JPanel p,panel;
 Login login;

 public Forgot(Login login)
{
    super(" Forgot Password ");
	this.login=login;
    this.setSize(800,600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setLayout(null);
		
	p = new JPanel();
	p.setBounds(0,0,800,600);
	p.setBackground(Color.WHITE);
	this.setLocationRelativeTo(null);
	p.setLayout(null);
	
	panel = new JPanel();
	panel.setBounds(440,290,300,270);
	panel.setBackground(Color.WHITE);
	panel.setLayout(null);
	panel.setVisible(false);
	
//JLabel & JTextField	
	l1 = new JLabel("Forgot password?");
	l1.setBounds(450,40,330,45);
	l1.setFont(new Font("Segoe UI",Font.BOLD,30));
	p.add(l1);
		
	l2 = new JLabel("*Your E-mail");
	l2.setBounds(460,100,200,25);
	l2.setFont(new Font("Segoe UI",Font.PLAIN,17));
	p.add(l2);
		
	t1 = new JTextField();
    t1.setBounds(460, 125, 220, 35);
    t1.setFont(new Font("Segoe UI", Font.PLAIN,15 ));
	t1.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent mv)
		{
			p1.setText("");
			p2.setText("");
			panel.setVisible(false);
		}
	});
	p.add(t1);
	
	l3 = new JLabel("*NID number");
	l3.setBounds(460,165,130,25);
	l3.setFont(new Font("Segoe UI",Font.PLAIN,17));
	p.add(l3);
		
	t2 = new JTextField();
    t2.setBounds(460, 195, 220, 35);
    t2.setFont(new Font("Segoe UI", Font.PLAIN,15 ));
	t2.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent mv)
		{
			p1.setText("");
			p2.setText("");
			panel.setVisible(false);
		}
	});
	p.add(t2);
		
	l4 = new JLabel("*New password");
	l4.setBounds(20,10,120,25);
	//l4.setForeground(Color.WHITE);
	l4.setFont(new Font("Segoe UI",Font.PLAIN,17));
	panel.add(l4);
		
	p1 = new JPasswordField();
    p1.setBounds(20, 35, 220, 35);
    p1.setFont(new Font("Segoe UI", Font.PLAIN,15));
	p1.setEchoChar('*');
    panel.add(p1);
	
	l5 = new JLabel("*Confirm password");
	l5.setBounds(20,80,150,25);
	//l5.setForeground(Color.WHITE);
	l5.setFont(new Font("Segoe UI",Font.PLAIN,17));
	panel.add(l5);
		
    p2 = new JPasswordField();
    p2.setBounds(20, 110, 220, 35);
    p2.setFont(new Font("Segoe UI", Font.PLAIN,15));
	p2.setEchoChar('*');
	panel.add(p2);
		
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
	b2.setBounds(50,200,150,30); 
	b2.setFocusable(false);
	b2.addActionListener(this);
	b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	panel.add(b2);
	
	b3 = new JButton("Check");
	b3.setFont(new Font("Segoe UI",Font.BOLD,15));
	b3.setForeground(Color.BLACK);
	b3.setFocusable(false);
	b3.setBounds(500,250,120,30); 
	b3.addActionListener(this);
	b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	p.add(b3);
	
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
    ch1.setBounds(20, 142, 220, 35);
    ch1.addActionListener(this); 
    ch1.setFocusable(false);
    ch1.setForeground(Color.BLACK);
    ch1.setFocusPainted(false);
    ch1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    ch1.setContentAreaFilled(false);
	ch1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    panel.add(ch1);
		
	
//Login icon
	ImageIcon icon = new ImageIcon("Images/forgot.jpg");
	JLabel l10 = new JLabel(icon);
	l10.setBounds(25,170,350,244);
	p.add(l10);

    p.add(panel);	
	this.add(p);
    setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			this.dispose();
			login.setVisible(true);
		}
		else if(e.getSource()==b3)
		{ 
	        if(!t1.getText().equals("") && !t2.getText().equals("")){
			String T_email = t1.getText();
			String T_nid=t2.getText();
			String Email ="";
			String NID ="";
			boolean flag = false;
			try
			{
				Scanner sc = new Scanner(new File("All Text Files/UserInfo.txt"));
			  while(sc.hasNextLine())
				{
					String sp[] = sc.nextLine().split(",");
					if(t1.getText().equals(sp[0]) && t2.getText().equals(sp[4]))
					{
						Email =sp[0];
						NID =sp[4];
						flag = true;
						break;
					}
				}
				sc.close();
			}
			catch(Exception ex)
			{
				
			}
			if(flag)
			{
			  JOptionPane.showMessageDialog(this,"Verified User!");
			  panel.setVisible(true);
			}
			else 
			{
				JOptionPane.showMessageDialog(this,"Please enter the correct E-mail and NID number");
			}
				
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Please provide your E-mail & NID number");
		}
	
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
						if(t1.getText().equals(sp[0]) && t2.getText().equals(sp[4]))
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