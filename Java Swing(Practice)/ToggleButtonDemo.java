import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class tbdemo extends JFrame  implements ActionListener
{
	JPanel panel;
	JToggleButton tb;
	Icon icon1=new ImageIcon("LOGO2.png");
	Icon icon2=new ImageIcon("logo3333.png");

    public tbdemo() {
        super("My page");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
       this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
         panel=new JPanel();
		 panel.setBounds(0,0,400,400);
		panel.setLayout(null);
		 panel.setBackground(Color.PINK);
		 
        tb=new JToggleButton(icon1);
		tb.setBounds(100,60,80,50);
		tb.addActionListener(this);
		 
		
	
		panel.add(tb);
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==tb){
		if(tb.isSelected())
		{
			tb.setIcon(icon2);
		}
		else
		{
			tb.setIcon(icon1);
		}
		}
	}

}




public class ToggleButtonDemo
{
	
	public static void main(String [] args)
	{
		tbdemo c=new tbdemo();
	}
}