import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.*;


public class SignUp extends JFrame implements ActionListener
{
	JPanel panel;
	JButton button1,button2;
	JTextField text1,text2;
	JPasswordField password;
	JLabel label1,label2,label3,label4;
	Font font1=new Font("cambria",Font.ITALIC,20);
	Font font2=new Font("cambria",Font.BOLD,15);
	
	 FileWriter fw;
	
	public SignUp()
	{
		super(" SignUp ");
		intializeForm();
		
		 this.setVisible(true);
	}
	
	public void intializeForm()
	{
		this.setSize(500,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		
		panel=new JPanel();
		panel.setBounds(0,0,500,600);
	    panel.setLayout(null);
		panel.setBackground(new Color(125,145,40));
		
		label1=new JLabel("Please Fillup Information");
		label1.setBounds(20,40,300,80);
		label1.setFont(font1);
		
		label2=new JLabel("UserName");
		label2.setBounds(60,150,100,60);
		label2.setFont(font2);
		
		label3=new JLabel("PhoneNumber");
		label3.setBounds(60,240,130,60);
		label3.setFont(font2);
		
		label4=new JLabel("Password");
		label4.setBounds(60,330,100,60);
		label4.setFont(font2);
		
		text1=new JTextField();
		text1.setBounds(210,160,140,50);
		text1.setFont(font2);
		
		text2=new JTextField();
		text2.setBounds(210,250,140,50);
		text2.setFont(font2);
		
		password=new JPasswordField();
		password.setBounds(210,340,140,50);
		password.setEchoChar('*');
		password.setFont(font2);
		
		button1=new JButton("LogInFrame");
		button1.setBounds(150,400,160,50);
		button1.setFont(font2);
		button1.addActionListener(this);
		
		button2=new JButton("Confirm");
		button2.setBounds(330,400,120,50);
		button2.setFont(font2);
		button2.addActionListener(this);
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(text1);
		panel.add(text2);
		panel.add(password);
		panel.add(button1);
		panel.add(button2);
		this.add(panel);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			this.setVisible(false);
			LogInFrame l=new LogInFrame();
		}
		if(e.getSource()==button2)
		{
			try{
			String str=text2.getText()+"/"+new String(password.getPassword())+"\n";
			
			fw=new FileWriter("Info.txt",true);
			
			for(int i=0; i<str.length(); i++)
			{
				fw.write(str.charAt(i));
			}
			fw.close();
			JOptionPane.showMessageDialog(this,"Your Information Saved","Information",JOptionPane.INFORMATION_MESSAGE);
			text1.setText("");
			text2.setText("");
			password.setText("");
			}
			catch (IOException ioe)
			{
				ioe.printStackTrace();
			}
		}
	}
	
}