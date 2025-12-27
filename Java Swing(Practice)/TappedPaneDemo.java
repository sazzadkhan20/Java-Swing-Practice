import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class tpdemo extends JFrame  
{
	JPanel panel,panel1,panel2,panel3;
	JTabbedPane tp;
	Icon icon1=new ImageIcon("LOGO2.png");
	Icon icon2=new ImageIcon("logo3333.png");

    public tpdemo() {
        super("My page");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
       this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
         panel=new JPanel();
		 panel.setBounds(0,0,400,400);
		panel.setLayout(null);
		 panel.setBackground(Color.PINK);
		 
        tp=new JTabbedPane();
		tp.setBounds(50,50,200,200);
	    
		 panel1=new JPanel();
		 panel1.setBackground(Color.BLUE);
		 
		 panel2=new JPanel();
		 panel2.setBackground(Color.YELLOW);
		 
		 panel3=new JPanel();
		 panel3.setBackground(Color.RED);
		
		tp.addTab("Home",icon1,panel1,"Homepage");
		tp.addTab("Help",icon2,panel2);
		tp.addTab("Edit",panel3);
	
		panel.add(tp);
		this.add(panel);
		this.setVisible(true);
	}

}

public class TappedPaneDemo
{
	
	public static void main(String [] args)
	{
		tpdemo c=new tpdemo();
	}
}