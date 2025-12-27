import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;


public class Logout extends JFrame implements ActionListener
{
	private JButton button, button1, button2, button3, button4, button5,Login_Button, Sign_up_Button,Forget_Password_Button;
	private JTextField UserName;
	private JPasswordField Password;
	private ImageIcon img;
	private Cursor cursor;
	//private ForgetPassword forgetpassword;
	private JLabel BackgroundImage;
	
	public Logout()
	{
		super("Log In");
		
		img = new ImageIcon(getClass().getResource("Pic/Background.png"));
		BackgroundImage = new JLabel (img);
		BackgroundImage.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		
		button=new JButton("Balance");
		Color c = new Color(102,102,102);
		button.setBackground(c);
        button.setForeground(Color.WHITE);
		
		button1=new JButton("User List");
		Color c1 = new Color(102,102,102);
		button1.setBackground(c1);
        button1.setForeground(Color.WHITE);
		
		button2=new JButton("Reserved Journey");
		Color c2 = new Color(102,102,102);
		button2.setBackground(c2);
        button2.setForeground(Color.WHITE);
		
		button3=new JButton("Transportation Pricing");
		Color c3 = new Color(102,102,102);
		button3.setBackground(c3);
        button3.setForeground(Color.WHITE);
		
		button4=new JButton("Hotel Pricing");
		Color c4 = new Color(102,102,102);
		button4.setBackground(c4);
        button4.setForeground(Color.WHITE);
		
		button5=new JButton("Logout");
		Color c5 = new Color(204,204,204);
		Color ct = new Color(0,0,0);
		button5.setBackground(c5);
        button5.setForeground(ct);
		
		
		//Cursor for JButtons
		 cursor = new Cursor(Cursor.HAND_CURSOR);
		
		
		JLabel userLabel =new JLabel("Username");
		userLabel.setBounds(300, 50,80,30);
		userLabel.setForeground(Color.white);
		//userLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		UserName =new JTextField();
		UserName.setBounds(400,50,150,25);
		UserName.setBorder(null);
		
		JLabel passwordLable = new JLabel("Password");
		passwordLable.setBounds(300,80,80,30);
		passwordLable.setForeground(Color.white);
		//passwordLable.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		Password =new JPasswordField();
		Password.setBounds(400,80,150,25);
		Password.setBorder(null);
		
		
		Login_Button = new JButton("Login");
		Login_Button.setBounds(300,120,100,30);
		Login_Button.addActionListener(this);
		Login_Button.setBorder(null);
		Login_Button.setCursor(cursor);
	
		
		Forget_Password_Button = new JButton("Forget Password");
		Forget_Password_Button.setBounds(420,120,150,30);
		Forget_Password_Button.setBorder(null);
		Forget_Password_Button.addActionListener(this);
		Forget_Password_Button.setBorder(null);
		Forget_Password_Button.setCursor(cursor);
		
		
		JLabel Sign_Up_Lable = new JLabel("Don't Have any account?");
		Sign_Up_Lable.setBounds(200,420,200,30);
		Sign_Up_Lable.setForeground(Color.white);
		Sign_Up_Lable.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		Sign_up_Button = new JButton("Sign Up");
		Sign_up_Button.setBounds(400,420,100,30);
		Sign_up_Button.setBorder(null);
		Sign_up_Button.addActionListener(this);
		Sign_up_Button.setCursor(cursor);
		
		button.setBounds(10,25,180,40);
		button1.setBounds(10,75,180,40);
		button2.setBounds(10,125,180,40);
		button3.setBounds(10,175,180,40);
		button4.setBounds(10,225,180,40);
		button5.setBounds(10,400,180,40);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		
		
		add(button);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		
		add(userLabel);
		add(passwordLable); 
		add(UserName); 
		add(Password); 
		add(Login_Button);
		add(Sign_up_Button);
		add(Forget_Password_Button);
		add(Sign_Up_Lable);
		
		add(BackgroundImage);
		
		setLayout(null);
		setSize(800,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button)
		{
			setVisible(false);
			new Balance();
		}
		else if(e.getSource()==button1)
		{
			setVisible(false);
			new UserList();
		}
		else if(e.getSource()==button2)
		{
			setVisible(false);
			new ReservedJourney();
		}
		else if(e.getSource()==button3)
		{
			setVisible(false);
			new TransportationPricing();
		}
		else if(e.getSource()==button4)
		{
			setVisible(false);
			new HotelPricing();
		}
		else if(e.getSource()==button5)
		{
			setVisible(false);
			new Admin();
		}
	}
	
	public static void main(String[] args)
	{
		new Logout();
	}
}