import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Contribution extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton l,b;
	JPanel p1;
    Welcome we;
	
	
	public Contribution(Welcome we)
	{	
		super(" Contribution ");
		this.we=we;
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		p1 = new JPanel();
		p1.setBounds(0,0,800,600);
		p1.setBackground(Color.WHITE);
		//p1.setBackground(Color.decode("#99eaff"));
		this.setLocationRelativeTo(null);
		p1.setLayout(null);
	
	//Faculty
		l1 = new JLabel("Md. Nazmul Hossain");
		l1.setBounds(315,185,200,30);
		l1.setFont(new Font("Serif",Font.BOLD,20));
		p1.add(l1);
		
		l2 = new JLabel("Faculty");
		l2.setBounds(370,205,85,30);
		l2.setFont(new Font("Serif",Font.BOLD,20));
		p1.add(l2);
	
	//Mahir	
		l3 = new JLabel("Abrar Hasan Mahir");
		l3.setBounds(70,425,170,30);
		l3.setFont(new Font("Serif",Font.BOLD,20));
		p1.add(l3);
		
		
		l4 = new JLabel("22-48347-3");
		l4.setBounds(97,450,100,30);
		l4.setFont(new Font("Serif",Font.BOLD,20));
		p1.add(l4);
	
	//Mayesha	
		l5 = new JLabel("Mayesha Khurshid");
		l5.setBounds(325,430,170,30);
		l5.setFont(new Font("Serif",Font.BOLD,20));
		p1.add(l5);
		
		l6 = new JLabel("22-48387-3");
		l6.setBounds(358,455,100,30);
		l6.setFont(new Font("Serif",Font.BOLD,20));
		p1.add(l6);
	
	//Me
		l7 = new JLabel("Md. Ibtihazzaman");
		l7.setBounds(565,425,170,30);
		l7.setFont(new Font("Serif",Font.BOLD,20));
		p1.add(l7);
		
		l8 = new JLabel("22-49153-3");
		l8.setBounds(588,445,100,30);
		l8.setFont(new Font("Serif",Font.BOLD,20));
		p1.add(l8);
		
	//Button
        ImageIcon icon4 = new ImageIcon("Images/back.png");
		l = new JButton(icon4);
		l.setBounds(20,15,35,35);
		l.addActionListener(this);
		l.setFocusPainted(false);
        l.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        l.setContentAreaFilled(false);
	    l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(l);	
		
	//Image
		ImageIcon icon = new ImageIcon("Images/faculty.png");
	    JLabel l9 = new JLabel(icon);
	    l9.setBounds(320,20,160,180);
	    p1.add(l9);
		
		ImageIcon icon1 = new ImageIcon("Images/mahir.png");
	    JLabel l10 = new JLabel(icon1);
	    l10.setBounds(80,270,160,160);
	    p1.add(l10);
		
		ImageIcon icon2 = new ImageIcon("Images/mayesha.png");
	    JLabel l11 = new JLabel(icon2);
	    l11.setBounds(327,270,170,170);
	    p1.add(l11);
	   
	    ImageIcon icon3 = new ImageIcon("Images/me.png");
	    JLabel l12 = new JLabel(icon3);
	    l12.setBounds(563,270,160,160);
	    p1.add(l12);
	    
	    this.add(p1);
        setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==l)
		{
			this.dispose();
			we.setVisible(true);
		}
	}
	
	}