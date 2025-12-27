import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Card extends JFrame  implements ActionListener
{
	JPanel panel;
	
   	CardLayout cl;
	JButton btn1,btn2,btn3;
	String a="2" ;

    public Card() {
        super("My page");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
       this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cl=new CardLayout();
		cl.setHgap(50);
		cl.setVgap(50);

         panel=new JPanel(cl);
		 panel.setBounds(0,0,400,400);
		// panel.setLayout(cl);
		 panel.setBackground(Color.PINK);
		 
		 btn1=new JButton("1");
		 btn1.addActionListener(this);
		 btn2=new JButton("2");
		  btn2.addActionListener(this);
		 btn3=new JButton("3");
		  btn3.addActionListener(this);
		 
		
	    panel.add(btn1,"1");
		panel.add(btn2,"2");
		panel.add(btn3,"3");
		cl.show(panel,"2");
		
		
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		//cl.next(panel);
		//cl.previous(panel);
		//cl.last(panel);
		//cl.first(panel);
		//cl.show(panel,"3");
		cl.show(panel,a);
		}

}




public class CardLayoutDemo
{
	
	public static void main(String [] args)
	{
		Card c=new Card();
	}
}