import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.*;


class Welcome extends JFrame implements ActionListener
{
    
	JButton b1;
	Container c;
	ImageIcon icon;
	
	Welcome()
	{
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Welcome Frame");
		this.setSize(700,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		//this.setVisible(true);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setVisible(true);
		c.setSize(700,600);
		
		b1 = new JButton("Welcome");
		b1.setBounds(300,500,100,35);
		b1.setForeground(Color.BLUE);
		b1.setFocusable(false);
		b1.setFont(new Font("Serif",Font.BOLD,15));
		b1.addActionListener(this);
		c.add(b1);
		

	    icon = new ImageIcon("pic.png");
        JLabel label = new JLabel(icon);
        label.setBounds(0,0,700,600);
        this.add(label);
	}
		
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==b1)
		{
			
			this.setVisible(false);
			Login login = new Login();
			login.setVisible(true);
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Invalid");
		}
	}
}