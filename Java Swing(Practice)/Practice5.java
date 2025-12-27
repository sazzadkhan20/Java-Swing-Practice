import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practice5 extends JFrame  
{
	JPanel panel;
	
   	FlowLayout fLayout;
	JButton buttons[];

    public Practice5() {
        super("My page");
        this.setSize(200, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		fLayout=new FlowLayout(FlowLayout.LEFT);
		fLayout.setHgap(10);
		fLayout.setVgap(10);

         panel=new JPanel();
		 panel.setBounds(0,0,200,200);
		 panel.setLayout(fLayout);
		 panel.setBackground(Color.PINK);
		 
		 buttons=new JButton[9];
		 for(int i=0; i<buttons.length; i++)
		 {
			 buttons[i]=new JButton(""+(i+1));
			 panel.add(buttons[i]);
			 
		 }
	
	
		
		this.add(panel);
		this.setVisible(true);
	}

}