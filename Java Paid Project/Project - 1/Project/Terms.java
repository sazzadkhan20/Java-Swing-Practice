import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Terms extends JFrame implements ActionListener
{
	JButton b1;
	JPanel p1,p2;
	private Signup signup;
	
   public Terms(Signup signup)
	{
    super(" Terms & Conditions ");
	this.signup=signup;
	this.setSize(550,400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setLayout(null);
		
	p1 = new JPanel();
	p1.setBounds(0,0,550,400);
	this.setLocationRelativeTo(null);
	p1.setBackground(Color.WHITE);
	//p1.setBackground(Color.decode("#99eaff"));
	p1.setLayout(null);
	
//JPanel
    p2 = new JPanel();
	p2.setBounds(0, 300, 550, 150);
	this.setLocationRelativeTo(null);
	p2.setBackground(Color.WHITE);
	//p2.setBackground(Color.decode("#99eaff"));
	p2.setLayout(null);
		
		
    JTextArea terms = new JTextArea();
	terms.setBounds(10,0,515,300);
	terms.setBackground(Color.decode("#99eaff"));
    terms.setText("\n" +
                     "1. You must agree to these terms and conditions in order to use this \napplication.\n" +
                     "2. To access certain features of this application, you may be required to\n create an  account.\n" +
                     "3. You are responsible for maintaining the confidentiality of your account \ninformation,  including your username and password.\n" +
                     "4. When you place an order through this application,\n  you are making an offer to purchase the products in your order.\n"+
                     "5. We reserve the right to refuse or cancel any order for any reason at any\n time.\n"+
                     "6. All payments made through this application are processed by\n  a third-party payment processor.");
					 
    terms.setEditable(false);
    terms.setFont(new Font("Segoe UI",Font.PLAIN,15));
    p1.add(terms);
		
//JButton	
    b1 = new JButton("AGREE");
	b1.setFont(new Font("Segoe UI",Font.BOLD,15));
	b1.setForeground(Color.BLACK);
	b1.setBounds(210,15,90,30); 
	b1.addActionListener(this);
	p2.add(b1);
   	
	
		
    p1.add(p2);
    this.add(p1);
    setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
	    if(e.getSource()==b1)
		{
			this.dispose();
			signup.setVisible(true);
		}
	}
		
}
	