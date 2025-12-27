import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.*;

public class ForgetPassword extends JFrame implements ActionListener
{
	private JPanel panel;
	 private JButton button1,button2,button3;
	private JTextField text;
	private JPasswordField password;
	private JLabel label1,label2,label3;
	Font font1=new Font("cambria",Font.ITALIC,20);
	Font font2=new Font("cambria",Font.BOLD,10);
	private FileReader fr;
	private BufferedReader bfr;
	
	public ForgetPassword()
	{
		super("Password Re-set");
		initializeForm();
		
		this.setVisible(true);
	}
	
	public void initializeForm()
	{
		this.setSize(350,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		panel=new JPanel();
		panel.setBounds(0,0,350,450);
	    panel.setLayout(null);
		panel.setBackground(Color.PINK);
		
		label1=new JLabel("Password Re-Set");
		label1.setBounds(20,30,200,50);
		label1.setFont(font1);
		
		label2=new JLabel("PhoneNumber");
		label2.setBounds(10,100,100,50);
		label2.setFont(new Font("cambria",Font.BOLD,15));
		
		label3=new JLabel("New Password");
		label3.setBounds(10,170,120,50);
		label3.setFont(new Font("cambria",Font.BOLD,15));
		
		text=new JTextField();
		text.setBounds(140,110,150,30);
		text.setFont(font2);
		
		password=new JPasswordField();
		password.setBounds(140,180,150,30);
		password.setEchoChar('*');
		password.setFont(font2);
		
		button1=new JButton("Reset");
		button1.setBounds(20,250,80,50);
		button1.setFont(font2);
		button1.addActionListener(this);
		
		button2=new JButton("Confirm");
		button2.setBounds(150,250,80,50);
		button2.setFont(font2);
		button2.addActionListener(this);
		
		button3=new JButton("LogIn");
		button3.setBounds(250,250,80,50);
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
		//boolean flag=false;
		if(button1==e.getSource())
		{
			text.setText("");
			password.setText("");
		}
		if(button2==e.getSource())
		{

			try
			{
				File oldfile=new File("Info.txt");
				File newfile=new File("temp.txt");
				newfile.createNewFile();
				FileWriter fw=new FileWriter("temp.txt",true);
				//BufferedWriter bw=new BufferedWriter(fw);
				//PrintWriter pw=new PrintWriter(bw);
				
				
				fr=new FileReader(oldfile);
				bfr=new BufferedReader(fr);
				String singleLine;
				
				while((singleLine=bfr.readLine())!=null)
				{
					String sp[]=singleLine.split("/");
					if(!sp[0].equals(text.getText()))
					{
						//pw.println(sp[0]+"/"+sp[1]);
						fw.write(singleLine+"\n");
					}
						
				}
				fr.close();
				fw.flush();
				fw.close();
				//pw.flush();
				//pw.close();
				oldfile.delete();
				File dump=new File("Info.txt");
				newfile.renameTo(dump);
				
				String s=text.getText()+"/"+new String(password.getPassword())+"\n";
				FileWriter fw1=new FileWriter("Info.txt",true);
		      for (int i = 0; i < s.length(); i++)
			 {
                fw1.write(s.charAt(i));
	         }
            fw1.close(); 
			}
			catch(IOException ioe)
		    {
				ioe.printStackTrace();
			}
		}
		if(button3==e.getSource())
		{
			this.setVisible(false);
			LogInFrame LIF=new LogInFrame();
		}
		
	}
}