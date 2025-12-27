import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener
{
 JButton b1,b2,b3; 
 JPanel p1;
 
 public Frame()
	{
		super(" Home Frame ");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		p1 = new JPanel();
	    //p1.setSize(new Dimension(800,600));
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.BLACK);
		p1.setLayout(null);
		
		
		b1 = new JButton("Account");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setBounds(300,400,100,30);
		b1.addActionListener(this);
		
		
		b2 = new JButton("Product");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setBounds(600,400,100,30);
		b2.addActionListener(this);
		
		
		b3 = new JButton("Cart");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setBounds(100,400,100,30);
		b3.addActionListener(this);

		
		this.add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		this.setVisible(true);
	}
		
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
            JOptionPane.showMessageDialog(this,"It'll work in future!!");
		}
		else if(e.getSource()==b2)
		{
			this.setVisible(false);
			Product p = new Product();
			p.setVisible(true);
		}
		else if(e.getSource()==b3)
		{
			JOptionPane.showMessageDialog(this,"It'll work in future!!");
		}
	}
}