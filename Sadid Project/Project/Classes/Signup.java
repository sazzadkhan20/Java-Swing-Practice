package Classes;

import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.regex.Pattern;
 
public class Signup extends JFrame implements ActionListener,iSingupFunction
{
	private JLabel label,l1,l2,l3,l4,l5,l6,l7,l8,l9,l0,l10,
	l11,l12,l13,l14,l15,l16,l17,l18,
	l19,l20,l21,l22,l23,l24,l25,l26,
	l27,l28,l29,l30,l31,l32;
	private JTextField t1,t2,t3,t4,t5,t6,t8;
	private JPasswordField pf1,pf2;
	private JButton l,b,b1,b2,b3;
	private JCheckBox cb1,ch1;
	private JPanel p1;
	private FileWriter FW;
	
	
	

	public Signup() 
	{
		super("Sign up frame");
		
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
		label = new JLabel("Already have an account?");
		label.setFont(new Font("Segoe UI",Font.PLAIN,14));
		label.setForeground(Color.BLACK);
		//label.setForeground(Color.decode("#001a33"));
		label.setBounds(545,10,168,18);
		p1.add(label);
		
		
	    l1 = new JLabel("CREATE NEW ACCOUNT");
		l1.setBounds(280,125,330,50);
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
		
		l20 = new JLabel("Don't use @,#,%,*!,+,^,& etc");
		l20.setForeground(Color.BLACK);
		l20.setBounds(120,250,160,15);
		p1.add(l20);
		
		l21 = new JLabel();
		l21.setForeground(Color.RED);
		l21.setBounds(290,248,75,20);
		p1.add(l21);
		
	//D-O-B
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
		t2.setBounds(470,215,200,30);
		t2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t2.setCaretColor(Color.BLACK);
		t2.setForeground(Color.BLACK);
        t2.setBorder(null);
        t2.setOpaque(false);
		p1.add(t2);
		
		l22 = new JLabel("Type[xx(month)/xx(date)/xxxx(year)]");
		l22.setForeground(Color.BLACK);
		l22.setBounds(470,250,212,15);
		p1.add(l22);
		
		l23 = new JLabel();
		l23.setForeground(Color.RED);
		l23.setBounds(700,248,75,20);
		p1.add(l23);
		
		
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
		
		l24 = new JLabel("Type[xxxx123@gmail.com]");
		l24.setForeground(Color.BLACK);
		l24.setBounds(120,325,160,15);
		p1.add(l24);
		
		l25 = new JLabel();
		l25.setForeground(Color.RED);
		l25.setBounds(290,323,75,20);
		p1.add(l25);
		
	//NID
		JLabel l5 = new JLabel("NID number ");
		l5.setBounds(470,265,150,30);
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
		
		l26 = new JLabel("Type[0123456789]");
		l26.setForeground(Color.BLACK);
		l26.setBounds(470,325,212,15);
		p1.add(l26);
		
		l27 = new JLabel();
		l27.setForeground(Color.RED);
		l27.setBounds(700,323,75,20);
		p1.add(l27);
	   
		
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
		
		l31 = new JLabel();
		l31.setForeground(Color.RED);
		l31.setBounds(120,400,200,20);
		p1.add(l31);
		
		
	//Address  
		JLabel l0 = new JLabel("Address");
		l0.setBounds(470,340,230,30);
		l0.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l0.setForeground(Color.BLACK);
		p1.add(l0);
		
	    l19 = new JLabel("___________________________________________");   
		l19.setBounds(470,375, 230, 30);
        l19.setForeground(Color.BLACK);
        l19.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l19);
		
		t8 = new JTextField();
		t8.setBounds(470,365,200,30);
		t8.setFont(new Font("Segoe UI",Font.PLAIN,16));
		t8.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		t8.setForeground(Color.BLACK);
        t8.setCaretColor(Color.BLACK);
        t8.setBorder(null);
        t8.setOpaque(false);
		p1.add(t8);
		
		   
	//Create Password	
		l8 = new JLabel("Create Password");
		l8.setBounds(120,420,250,30);
		l8.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l8.setForeground(Color.BLACK);
		p1.add(l8);
		
		l17 = new JLabel("___________________________________________");
        l17.setBounds(120, 460, 230, 30);
        l17.setForeground(Color.BLACK);
        l17.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l17);
		
		pf1 = new JPasswordField();
		pf1.setBounds(120,450,200,30);
		pf1.setFont(new Font("Segoe UI",Font.PLAIN,16));
		pf1.setEchoChar('*');
		pf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		pf1.setForeground(Color.BLACK);
        pf1.setCaretColor(Color.BLACK);
        pf1.setBorder(null);
        pf1.setOpaque(false);
		p1.add(pf1);
		
		l28 = new JLabel("Password must Contain an uppercase,a lowercase,a digit and one special charactar");
		l28.setForeground(Color.BLACK);
		l28.setBounds(120,485,500,15);
		p1.add(l28);
		
		l30 = new JLabel("Password must Contain minimum 8 digit,Type[aAsghsx@12]");
		l30.setForeground(Color.BLACK);
		l30.setBounds(120,503,500,15);
		p1.add(l30);
		
		l29 = new JLabel();
		l29.setForeground(Color.RED);
		l29.setBounds(630,483,110,20);
		p1.add(l29);
	
	//Re-type password	
		JLabel l9 = new JLabel("Re-type Password");
		l9.setBounds(470,420,250,30);
		l9.setFont(new Font("Segoe UI",Font.PLAIN,18));
		l9.setForeground(Color.BLACK);
		p1.add(l9);
		
	    l18 = new JLabel("___________________________________________");
        l18.setBounds(470, 458, 230, 30);
        l18.setForeground(Color.BLACK);
        l18.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		p1.add(l18);
		
		pf2 = new JPasswordField();
		pf2.setBounds(470,450,200,30);
		pf2.setFont(new Font("Segoe UI",Font.PLAIN,16));
		pf2.setEchoChar('*');
		pf2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		pf2.setForeground(Color.BLACK);
        pf2.setCaretColor(Color.BLACK);
        pf2.setBorder(null);
        pf2.setOpaque(false);
		p1.add(pf2);
		
	//JButtons	
	    ImageIcon icon = new ImageIcon("Images/back.png");
		l = new JButton(icon);
		l.setBounds(20,15,35,35);
		l.addActionListener(this);
		l.setFocusPainted(false);
        l.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        l.setContentAreaFilled(false);
	    l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(l);	
	
	   ch1 = new JCheckBox("Show password");
	   ch1.setFont(new Font("Segoe UI",Font.PLAIN,14));
	   ch1.setBounds(120,520,150,17);
	   ch1.addActionListener(this); 
	   ch1.setFocusable(false);
	   ch1.setForeground(Color.BLACK);
       ch1.setFocusPainted(false);
       ch1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
       ch1.setContentAreaFilled(false);
	   ch1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   p1.add(ch1);
		
	   cb1 = new JCheckBox ("I,accept all");
	   cb1.setFont(new Font("Segoe UI",Font.PLAIN,14));
	   cb1.setBounds(263,540,110,15);
	   cb1.addActionListener(this); 
	   cb1.setFocusable(false);
	   cb1.setForeground(Color.BLACK);
       cb1.setFocusPainted(false);
       cb1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
       cb1.setContentAreaFilled(false);
	   cb1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   p1.add(cb1); 
	   
	    b = new JButton("Sign In");
	    b.setFont(new Font("Segoe UI",Font.BOLD,14));
	    b.setForeground(Color.BLUE);
		b.setFocusPainted(false);
        b.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b.setContentAreaFilled(false);
	    b.setBorder(null);
	    b.setBounds(705,10,63,19);
	    b.addActionListener(this);
	    b.setFocusable(false);
	    b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    p1.add(b);
	  
	   
	   b1 = new JButton("Terms & Conditions");
	   b1.setFont(new Font("Segoe UI",Font.BOLD,14));
	   b1.setForeground(Color.BLUE);
	   b1.setBorder(null);
	   b1.setBounds(355,540,150,15);
	   b1.addActionListener(this);
	   b1.setFocusable(false);
       b1.setFocusPainted(false);
       b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
       b1.setContentAreaFilled(false);
	   b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   p1.add(b1);
	   
	   b2 = new JButton("Create Account");
	   b2.setFont(new Font("Segoe UI",Font.BOLD,20));
	   b2.setForeground(Color.BLACK);
	   b2.setBounds(280,570,210,35); 
	   b2.addActionListener(this);
	   b2.setFocusable(false);
	   b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   p1.add(b2);
	   
	   
	   ImageIcon icon1 = new ImageIcon("Images/users-icon.png");
	   JLabel l10 = new JLabel(icon1);
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
			t8.setText("");
			pf1.setText("");
			pf2.setText("");
			
	}
	
	public boolean checkingNameEntry()
	{
		if(!t1.getText().equals(""))
		{
			if(Pattern.matches("^(?=.*[a-z])[a-zA-Z\\.\s]*$",t1.getText()))
			{
				l21.setText("");
			   return true;
			}
			else
			{
				l21.setText("Invalid Name");
				return false;
			}
		}
		else
		{
			l21.setText("");
			JOptionPane.showMessageDialog(this,"Please fill up Name field!");
			return false;
		}
	}
	public boolean checkingDateOfBirthEntry()
	{
		if(!t2.getText().equals(""))
		{
			boolean match = Pattern.matches("^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2\\d|3[01])/((19|20)\\d{2})$",t2.getText());
			if(match)
			{
				l23.setText("");
			   return true;
			}
			else
			{
				l23.setText("Invalid Date");
				return false;
			}
		}
		else
		{
			l23.setText("");
			JOptionPane.showMessageDialog(this,"Please fill up Date-of-birth field!");
			return false;
		}
	}
	public boolean checkingEmailEntry()
	{
		if(!t3.getText().equals(""))
		{
			if(Pattern.matches("^(?=.*[a-z])(?=.*[\\.])(?=.*[@])[a-zA-Z0-9\\.@]*$",t3.getText()))
			{
				l25.setText("");
			   return true;
			}
			else
			{
				l25.setText("Invalid E-mail");
				return false;
			}
		}
		else
		{
			l25.setText("");
			JOptionPane.showMessageDialog(this,"Please fill up E-mail field!");
			return false;
		}
	}
	public boolean checkingNIDEntry()
	{
		if(!t4.getText().equals(""))
		{
			if(Pattern.matches("^\\d+",t4.getText()))
			{
				l27.setText("");
			   return true;
			}
			else
			{
				l27.setText("Invalid NID");
				return false;
			}
		}
		else
		{
			l27.setText("");
			JOptionPane.showMessageDialog(this,"Please fill up NID field!");
			return false;
		}
	}
	public boolean checkingPhoneNumberEntry()
	{
		if(!t6.getText().equals(""))
		{
			if(Pattern.matches("^\\d+",t6.getText()))
			{
				l31.setText("");
			   return true;
			}
			else
			{
				l31.setText("Invalid Phone Number");
				return false;
			}
		}
		else
		{
			l31.setText("");
			JOptionPane.showMessageDialog(this,"Please fill up Phone number field!");
			return false;
		}
	}
	public boolean checkingAddressEntry()
	{
		if(!t8.getText().equals(""))
		{
		   return true;
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Please fill up Address field!");
			return false;
		}
	}
	public boolean checkingPasswordEntry()
	{
		if(!(String.valueOf(pf1.getText())).equals(""))
		{
			if(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&*+=]).{8,}$",String.valueOf(pf1.getText())))
			{
				l29.setText("");
			   return true;
			}
			else
			{
				l29.setText("Invalid Password");
				return false;
			}
		}
		else
		{
			l29.setText("");
			JOptionPane.showMessageDialog(this,"Please fill up Create Password field!");
			return false;
		}
	}
	public boolean checkingPasswordMatching()
	{
		if(!(String.valueOf(pf2.getText())).equals(""))
		{
			if((String.valueOf(pf1.getText())).equals(String.valueOf(pf2.getText())))
			{
			   return true;
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Password Not Matching!");
				return false;
			}
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Please fill up Re-type Password field with Same Password!");
			return false;
		}
	}
	
	public void actionPerformed(ActionEvent e) 
	{
	    if(e.getSource()==l)
		{
			this.dispose();
			new Login();
			
		} 
		
		else if(e.getSource()==b)
		{
			this.dispose();
			new Login();
		}
		
		else if(e.getSource()==b1)
		{
			this.setVisible(false);
			new Terms(this);
		}
		
		else if(e.getSource()==b2)
		{
			if(checkingNameEntry() && checkingDateOfBirthEntry() && 
			checkingEmailEntry() && checkingNIDEntry() && 
			checkingPasswordEntry() && checkingPasswordMatching() && 
			checkingAddressEntry() && checkingPhoneNumberEntry() && cb1.isSelected())
				{
					try{
					
					
					String Str = t3.getText()+","+
								 (String.valueOf(pf1.getPassword()))+","+
								 t1.getText()+","+
								 t2.getText()+","+
								 t4.getText()+","+
								 t6.getText()+","+
								 t8.getText()+"\n";
					
					
					
					FW= new FileWriter("All Text Files/UserInfo.txt",true);
					
					FW.write(Str);

					FW.close();
					}
					catch(Exception E)
				{
					
				}
					ClearAll();
					JOptionPane.showMessageDialog(null,"Registration Successfull");
					
				}
			else if(!cb1.isSelected())
			{
				JOptionPane.showMessageDialog(this,"Accept all the Terms & Condition for create an account");
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