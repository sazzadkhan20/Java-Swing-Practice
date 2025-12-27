import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.*;



public class LogInFrame extends JFrame implements ActionListener
{
	private JPanel panel;
	 private JButton button1,button2,button3;
	private JTextField text;
	private JPasswordField password;
	private JLabel label1,label2,label3;
	Font font1=new Font("cambria",Font.ITALIC,40);
	Font font2=new Font("cambria",Font.BOLD,20);
	private FileReader fr;
	private BufferedReader bfr;
	
	private static String userphone="",pass="";
	
	public LogInFrame(int a)
	{
		
	}
	public LogInFrame()
	{
		super(" BMW ");
		intializeForm();
		
		 this.setVisible(true);
	}
	
	public void intializeForm()
	{
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		ImageIcon imag=new ImageIcon("BMW.png");
		Image img=imag.getImage();
		this.setIconImage(img);
		
		
		panel=new JPanel();
		panel.setBounds(0,0,600,600);
	    panel.setLayout(null);
		panel.setBackground(new Color(119,252,3));
		
		label1=new JLabel("MY Car Package");
		label1.setBounds(20,40,300,100);
		label1.setFont(font1);
		
		label2=new JLabel("PhoneNumber");
		label2.setBounds(60,200,140,60);
		label2.setFont(font2);
		
		label3=new JLabel("Password");
		label3.setBounds(60,280,100,60);
		label3.setFont(font2);
		
		text=new JTextField();
		text.setBounds(210,210,140,50);
		text.setFont(font2);
		
		password=new JPasswordField();
		password.setBounds(170,290,130,50);
		password.setEchoChar('*');
		password.setFont(font2);
		
		button1=new JButton("LogIn");
		button1.setBounds(200,400,100,50);
		button1.setFont(font2);
		button1.addActionListener(this);
		
		button2=new JButton("SignUp");
		button2.setBounds(380,400,100,50);
		button2.setFont(font2);
		button2.addActionListener(this);
		
		button3=new JButton("Forget Password");
		button3.setBounds(200,500,200,50);
		button3.setFont(font2);
		button3.addActionListener(this);
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(text);
		panel.add(password);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		this.add(panel);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		boolean flag=false;
		if(button1==e.getSource())
		{
			userphone=text.getText();
			pass=new String(password.getPassword());
			try
			{
				File file=new File("Info.txt");
				fr=new FileReader(file);
				bfr=new BufferedReader(fr);
				String singleLine;
				
				while((singleLine=bfr.readLine())!=null)
				{
					String s[]=singleLine.split("/");
					if(s[0].equals(text.getText()) && s[1].equals(new String(password.getPassword())))
					{

						BoxList boxlist=new BoxList(500);
						BoxManagerFrame bmf=new BoxManagerFrame(boxlist);
						this.setVisible(false);
						flag=true;
					}
						
				}
				if(!flag)
				{
					JOptionPane.showMessageDialog(this,"Information Not Match","Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
			catch(IOException ioe)
		    {
				ioe.printStackTrace();
			}
		}
		if(button2==e.getSource())
		{
			this.setVisible(false);
			SignUp su=new SignUp();
		}
		if(button3==e.getSource())
		{
			//this.setVisible(false);
			ForgetPassword p=new ForgetPassword();
		}
	}
	
	public String getUserPhone()
	{
		return userphone;
	}
	public String getPass()
	{
		return pass;
	}
	
		
}
	