import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInFrame extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel label1,label2,label3;
	JTextArea textArea;
	 JTextField text;
	 JPasswordField password;
	JButton button;
	Font font=new Font("cambria",Font.ITALIC,20);
	
	LogInFrame()
	{
		super("LogIn Screen");
		initialForm();
		
		this.setVisible(true);
	}
	public void initialForm()
	{
		this.setSize(600,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		panel=new JPanel();
		panel.setBounds(0,0,600,800);
		//panel.setBackground(new Color(125,50,132));
		panel.setLayout(null);
		
		label1=new JLabel("LogIn Screen");
		label1.setBounds(10,20,120,80);
		label1.setFont(font);
		
		label2=new JLabel("UserName");
		label2.setBounds(10,120,120,80);
		label2.setFont(font);
		
		label3=new JLabel("Password");
		label3.setBounds(10,220,120,80);
		label3.setFont(font);
		
		text =new JTextField();
		text.setBounds(135,145,100,30);
		text.setFont(font);
		
		password=new JPasswordField();
		password.setBounds(135,245,100,30);
		password.setEchoChar('*');
		password.setFont(font);
		
		
		button=new JButton("LogIn");
		button.setBounds(125,300,100,40);
		button.setBackground(Color.BLUE);
		button.setFont(font);
		button.addActionListener(this);
		
		textArea=new JTextArea();
		textArea.setBounds(40,370,350,30);
		textArea.setFont(font);
		textArea.setBackground(Color.YELLOW);
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(text);
		panel.add(password);
		panel.add(button);
		panel.add(textArea);
		this.add(panel);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(button==e.getSource())
		{
			
			//String data="UserName "+text.getText()+",Password "+String.valueOf(password.getPassword());
			String data="UserName "+text.getText()+",Password "+new String(password.getPassword());
			textArea.setText(data);
		}
	}
	
}