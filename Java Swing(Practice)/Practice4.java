import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practice4 extends JFrame implements KeyListener 
{
	JPanel panel;
	JLabel label;
	JTextField text;
	int a=0;
   	
	

    public Practice4() {
        super("My page");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

         panel=new JPanel();
		 panel.setBounds(0,0,800,600);
		 panel.setLayout(null);
		 panel.setBackground(Color.PINK);
	
		text=new JTextField();
		text.setBounds(50,50,300,40);
		text.setHorizontalAlignment(JTextField.CENTER);
		text.addKeyListener(this);
		
		
		label=new JLabel();
		label.setBounds(300,255,250,50);
		label.setForeground(Color.RED);
		

		panel.add(label);
		panel.add(text);
		this.add(panel);
		this.setVisible(true);
	}
       
    public void keyPressed(KeyEvent ke)
	{
		if(ke.getSource()==text)
		{
			if(ke.VK_A==ke.getKeyCode())
			{
				a++;
			}
			if(ke.VK_E==ke.getKeyCode())
			{
				a++;
			}
			if(ke.VK_I==ke.getKeyCode())
			{
				a++;
			}
			if(ke.VK_O==ke.getKeyCode())
			{
				a++;
			}
			if(ke.VK_U==ke.getKeyCode())
			{
				a++;
			}
			label.setText("Total vowel Count: "+a);
			
		}
	}
	public void keyTyped(KeyEvent ke)
	{
		
	}
	public void keyReleased(KeyEvent ke)
	{
		
	}

}