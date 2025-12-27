import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import javax.swing.JOptionPane;


class Signup extends JFrame implements ActionListener
{

 JButton b1,b2,b3;

 JTextField t1,t2,t3,t4,t5,t6,t7;

 JLabel l1,l2,l3,l4,l5,l6,l7;

 Container c;

Signup()
{

 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 this.setLayout(null);

 this.setTitle("Signup Frame");

 this.setBounds(500,250,800,600);

 this.setResizable(false);

 this.setLocationRelativeTo(null);

 c=this.getContentPane();
 //c.setBackground(Color.YELLOW);
 c.setVisible(true);


 l1=new JLabel("First Name: ");

 l1.setBounds(20,20,100,25);

 l1.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(l1);

 t1=new JTextField();

 t1.setBounds(140,20,200,25);

 t1.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(t1);

 l2=new JLabel("Last Name: ");

 l2.setBounds(400,20,100,25);

 l2.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(l2);

 t2=new JTextField();

 t2.setBounds(520,20,200,25);

 t2.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(t2);

 l3=new JLabel("Date Of Birth: ");

 l3.setBounds(20,60,100,25);

 l3.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(l3);

 t3=new JTextField();

 t3.setBounds(140,60,200,25);

 t3.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(t3);

 l4=new JLabel("E-mail: ");

 l4.setBounds(400,60,100,30);

 l4.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(l4);

 t4=new JTextField();

 t4.setBounds(520,60,200,25);

 t4.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(t4);

 l5=new JLabel("Mobile No.: ");

 l5.setBounds(20,100,100,20);

 l5.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(l5);

 t5=new JTextField();

 t5.setBounds(140,100,200,25);

 t5.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(t5);

 l6=new JLabel("Username: ");

 l6.setBounds(20,200,100,25);

 l6.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(l6);

 t6=new JTextField();

 t6.setBounds(140,200,200,25);

 t6.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(t6);

 l7=new JLabel("Password: ");

 l7.setBounds(20,250,100,25);

 l7.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(l7);

 t7=new JTextField();

 t7.setBounds(140,250,200,25);

 t7.setFont(new Font("Times New Roman",Font.BOLD,14));

 c.add(t7);


 b1=new JButton("Register");

 b1.setBounds(300,400,200,30);

 b1.setFont(new Font("Times New Roman",Font.BOLD,14));

 b1.addActionListener(this);

 c.add(b1);


 b2=new JButton("Cancel");

 b2.setBounds(600,400,100,30);

 b2.setFont(new Font("Times New Roman",Font.BOLD,14));

 b2.addActionListener(this);

 c.add(b2);

 b3=new JButton("Login");

 b3.setBounds(100,400,100,30);

 b3.setFont(new Font("Times New Roman",Font.BOLD,14));

 b3.addActionListener(this);

 c.add(b3);

}

 public void Cancel()
 {

 t1.setText("");

 t2.setText("");

 t3.setText("");

 t4.setText("");

 t5.setText("");

 t6.setText("");

 t7.setText("");

 }

public void actionPerformed(ActionEvent e)
{

if(e.getSource() == b1)
{
if(t1.getText().equals("") && t2.getText().equals("") && t3.getText().equals("") && t4.getText().equals("") && t5.getText().equals("") && t6.getText().equals("") && t7.getText().equals(""))

 {

 JOptionPane.showMessageDialog(null,"Registration unsuccessful");

}

 else if(e.getSource()==b1)
 {



 JOptionPane.showMessageDialog(null,"Registration Successful.");

}
}

 else if(e.getSource()==b2)
 {

 //Cancel();
 this.setVisible(false);

 }

 else if(e.getSource()==b3)
 {

 this.setVisible(false);

 Login login=new Login();

login.setVisible(true);

 }

 }

}