import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.*;

class Product extends JFrame 
{
	Container c;
	JLabel l;
	
	Product()
	{
		super("Product");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Home Frame");
		this.setSize(800,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setVisible(true);
		
		ImageIcon img = new ImageIcon("pro.jpg");
		
		JLabel l = new JLabel(img);
		l.setBounds(50,30,150,200);
		c.add(l);
	}
}