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
import java.util.Scanner;

public class Login extends JFrame implements ActionListener
{
	public JFrame MainLoginFrame;
	public JButton Login_Button, Sign_up_Button,Forget_Password_Button;
	public JTextField UserName;
	public JPasswordField Password;
	public SignUP signup;
	public ForgetPassword forgetpassword;
	public ImageIcon BackgroundImage;
	public String checkPass, checkusername;
	public FileReader reader;
	private Cursor cursor;
	public String email_to_check;
	
	public String get_email()
	{
		return email_to_check;
	}
	
	public Login()
	{
		MainLoginFrame =new JFrame("Login Frame");
		
		//Cursor for JButtons
		 cursor = new Cursor(Cursor.HAND_CURSOR);
		
	
		JLabel BackgroundImage_label;
		ImageIcon img = new ImageIcon("Graphics/1x/Cover 1.jpg");
		BackgroundImage_label = new JLabel ("",img,JLabel.CENTER);
		BackgroundImage_label.setBounds(0,0,800,500);
			
		
		
		JLabel userLabel =new JLabel("Username");
		userLabel.setBounds(300, 50,80,30);
		userLabel.setForeground(Color.white);
		userLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		UserName =new JTextField();
		UserName.setBounds(400,50,150,25);
		UserName.setBorder(null);
		
		JLabel passwordLable = new JLabel("Password");
		passwordLable.setBounds(300,80,80,30);
		passwordLable.setForeground(Color.white);
		passwordLable.setFont(new Font("SansSerif", Font.BOLD, 15));
		
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
		
		
			
		
					// Login Frame Properties 
		MainLoginFrame.setSize(800,500);
		MainLoginFrame.setLayout(null);
		MainLoginFrame.setLocationRelativeTo(null);
		MainLoginFrame.setVisible(true);
		MainLoginFrame.setResizable(false);
		MainLoginFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
					//Adding Properties in Frame
		
		MainLoginFrame.add(userLabel);
		MainLoginFrame.add(passwordLable); 
		MainLoginFrame.add(UserName); 
		MainLoginFrame.add(Password); 
		MainLoginFrame.add(Login_Button);
		MainLoginFrame.add(Sign_up_Button);
		MainLoginFrame.add(Forget_Password_Button);
		MainLoginFrame.add(Sign_Up_Lable);
		
		
		MainLoginFrame.add(BackgroundImage_label);
		
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==Login_Button)
		{
			 String username=UserName.getText();
			 String password=Password.getText();
			 String LoginInfo ="Username: "+username+", "+"Password: "+password;
			 String AmdinLoginInfo ="Username: "+"admin"+", "+"Password: "+"admin";
			 String Hotel_5_Star_LoginInfo ="Username: "+"h5admin"+", "+"Password: "+"h5admin";
			 String Hotel_3_Star_LoginInfo ="Username: "+"h3admin"+", "+"Password: "+"h3admin";
			 String Hotel_2_Star_LoginInfo ="Username: "+"h2admin"+", "+"Password: "+"h2admin";
			 String Bus_provider_LoginInfo ="Username: "+"adminBus"+", "+"Password: "+"adminBus";
			 String Air_Provider_LoginInfo ="Username: "+"adminAir"+", "+"Password: "+"adminAir";
			 
			BufferedReader bfreader=null;
			String line;
			int count=0;
			try
			{
				reader=new FileReader("All Text Files/UserInfo.txt");
				bfreader=new BufferedReader(reader);
				
				while((line=bfreader.readLine())!=null)
				{
					if(line.equals(LoginInfo))
					{
						count++;
					}				
				}
				if(count==1)
				{
					//signup= new SignUP();
					email_to_check= UserName.getText();
					Admin admin = new Admin(this);
				}
				else if (LoginInfo.equals(AmdinLoginInfo))
				{
					//Admin admin = new Admin();
				}
				else if (LoginInfo.equals(Hotel_5_Star_LoginInfo))
				{
					MainLoginFrame.setVisible(false);
					Hotel_5_Star H5S =new Hotel_5_Star(this);
				}
				else if (LoginInfo.equals(Hotel_3_Star_LoginInfo))
				{
					MainLoginFrame.setVisible(false);
					Hotel_3_Star H3S = new Hotel_3_Star(this);
				}
				else if (LoginInfo.equals(Hotel_2_Star_LoginInfo))
				{
					MainLoginFrame.setVisible(false);
					Hotel_2_Star H2S =new Hotel_2_Star(this);
				}
				else if (LoginInfo.equals(Bus_provider_LoginInfo))
				{
					MainLoginFrame.setVisible(false);
					Bus_Service_Provider H2S =new Bus_Service_Provider(this);
				}
				else if (LoginInfo.equals(Air_Provider_LoginInfo))
				{
					MainLoginFrame.setVisible(false);
					Air_Service_Provider H2S =new Air_Service_Provider(this);
				}
				else if(username.isEmpty() || password.isEmpty())
				{
					JOptionPane.showMessageDialog(this,"Please fill up all the fields");
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Enter Correct ID & Password");
				}
								
				reader.close();			
			}
			catch(Exception ex)
			{
				
			}
			
				
		}
		else if(e.getSource()==Sign_up_Button)
		{
			MainLoginFrame.setVisible(false);
			signup= new SignUP();
		}
		
		else if(e.getSource()==Forget_Password_Button)
		{
			MainLoginFrame.setVisible(false);
			forgetpassword= new ForgetPassword();
		}
	}
	
	public static void main(String [] args)
	{
		new Login();
	}
}