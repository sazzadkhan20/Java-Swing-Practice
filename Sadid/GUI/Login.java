import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import javax.swing.JOptionPane;


class Login extends JFrame implements ActionListener
{

 JLabel l1,l2;

 JTextField t1;

 JPasswordField p1;

 JButton b1,b2;

 Signup signup;
 
 Frame h;

 Container c;

Login()
{

 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 this.setTitle("Login Frame");

this.setSize(500,400);

 this.setLocationRelativeTo(null);

 this.setResizable(false);


 c=this.getContentPane();

 c.setLayout(null);

 c.setVisible(true);

 l1=new JLabel("Username: ");

 l1.setFont(new Font("Times New Roman",Font.PLAIN,20));

 l1.setBounds(50,50,150,50);

 c.add(l1);


 t1= new JTextField();

 t1.setBounds(170,50,200,50);

 t1.setFont(new Font("Times New Roman",Font.PLAIN,20));

 c.add(t1);

 l2=new JLabel("Password: ");

 l2.setFont(new Font("Times New Roman",Font.PLAIN,20));

 l2.setBounds(50,120,150,50);

 c.add(l2);

 p1 = new JPasswordField();

 p1.setBounds(170,120,200,50);

 p1.setFont(new Font("Times New Roman",Font.PLAIN,20));

 p1.setEchoChar('*');

 c.add(l2);

 c.add(p1);

 b1=new JButton("Login");

 b1.setBounds(170,190,90,50);

 b1.setFont(new Font("Times New Roman",Font.BOLD,14));

 b1.addActionListener(this);

 c.add(b1);

 b2= new JButton("Sign up");

 b2.setBounds(280,190,90,50);

 b2.setFont(new Font("Times New Roman",Font.BOLD,14));

 b2.addActionListener(this);

 c.add(b2);

}

 public void actionPerformed(ActionEvent e)
 {

 if(e.getSource() ==b1)
 {
 
 if(t1.getText().equals("") && p1.getText().equals(""))
 {

 JOptionPane.showMessageDialog(null,"Invalid Login!");

 }

 else if(e.getSource()==b1)
 {

    this.setVisible(false);
     h = new Frame();
	
	
 }
 }
 

 else if(e.getSource()==b2)
 {

 this.setVisible(false);

 signup = new Signup();

 signup.setVisible(true);

 }
 }
}