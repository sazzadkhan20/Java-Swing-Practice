package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;
import java.text.*;
import java.io.*;
import java.net.*;

public class User implements ActionListener 
{
	public static JTextField text;
	public static JPanel a1;
	public static Box vertical = Box.createVerticalBox();
	public static JFrame f;
	public static DataOutputStream dout;
	public static ServerSocket skt;
	public static Socket s;
	public static DataInputStream din;
	Home home;
	
	User(Home home)
	{
	this.home=home;
	f = new JFrame();
	f.setSize(450,700);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);
	f.setResizable(false);
	f.setLayout(null);
	//setUndecorated(true);
	f.getContentPane().setBackground(Color.WHITE);
	
	JPanel p1 = new JPanel();
	p1.setBackground(new Color(7,94,84));
	p1.setBounds(0,0,450,70);
	p1.setLayout(null);
	f.add(p1);
	
	ImageIcon icon = new ImageIcon("Images/3 (1).png");
	JLabel back = new JLabel(icon);
	back.setBounds(5,20,25,25);
	back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	p1.add(back);
	
	ImageIcon icon2 = new ImageIcon("Images/user (1).png");  
	JLabel l1 = new JLabel(icon2);
	l1.setBounds(40,8,60,60);
	p1.add(l1);
	
	ImageIcon icon3 = new ImageIcon("Images/video (1).png");
	JLabel l2 = new JLabel(icon3);
	l2.setBounds(298,20,30,30);
	l2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	p1.add(l2);
	
	ImageIcon icon4 = new ImageIcon("Images/phone (1).png");
	JLabel l3= new JLabel(icon4);
	l3.setBounds(356,20,35,30);
	l3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	p1.add(l3);
	
	ImageIcon icon5 = new ImageIcon("Images/3icon (1).png");
	JLabel l4 = new JLabel(icon5);
	l4.setBounds(410,20,10,25);
	l4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	p1.add(l4);
	
	JLabel l5 = new JLabel("User");
	l5.setBounds(110,15,100,18);
	l5.setForeground(Color.WHITE);
	l5.setFont(new Font("SAN_SERIF",Font.BOLD,18));
	p1.add(l5);
	
	JLabel l6 = new JLabel("Active Now");
	l6.setBounds(110,35,100,18);
	l6.setForeground(Color.WHITE);
	l6.setFont(new Font("SAN_SERIF",Font.BOLD,14));
	p1.add(l6);
	
    a1 = new JPanel();
	a1.setBounds(5,73,426,543);
	f.add(a1);
	
	text = new JTextField();
	text.setBounds(5,620,305,40);
	text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
	f.add(text);
	
	JButton b1 = new JButton("Send");
	b1.setBounds(312,620,118,38);
	b1.setBackground(new Color(7,94,84));
	b1.setForeground(Color.WHITE);
	b1.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
	b1.setFocusPainted(false);   
	b1.addActionListener(this);
    b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	f.add(b1);
	
	back.addMouseListener(new MouseAdapter()
	{
		public void mouseClicked(MouseEvent ae)
		{
			f.dispose();
			home.setVisible(true);
		}
	});
	
	f.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try{
			
		String out = text.getText();
		
		JPanel p2 = formatLabel(out);
	
		a1.setLayout(new BorderLayout());
		
		JPanel right = new JPanel(new BorderLayout());
		right.add(p2, BorderLayout.LINE_END);
		vertical.add(right);
		vertical.add(Box.createVerticalStrut(15));
		
		a1.add(vertical,BorderLayout.PAGE_START);
		
		dout.writeUTF(out);
		
		text.setText("");
		
		f.repaint();
		f.invalidate();
		f.validate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
	
	public static JPanel formatLabel(String out)
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
	    JLabel output = new JLabel(out);
		output.setFont(new Font("Tahoma", Font.PLAIN, 16));
       	output.setBackground(new Color(37,211,102));
		output.setOpaque(true);
		output.setBorder(new EmptyBorder(15,15,15,50));
		
		panel.add(output);
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		
		JLabel time = new JLabel();
		time.setText(sdf.format(cal.getTime()));
		
		panel.add(time);
		
		return panel;
	}
	
}