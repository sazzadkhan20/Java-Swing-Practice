import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practice2 extends JFrame implements ItemListener 
{
	JPanel panel;
	JCheckBox check1,check2;
	ButtonGroup grp;
	 JTextArea area;
	

    public Practice2() {
        super("My page");
        this.setSize(800, 600);
        this.setLocation(300, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

         panel=new JPanel();
		 panel.setBounds(0,0,800,600);
		 panel.setLayout(null);
		
		 
		 check1=new JCheckBox("Java");
		 check1.setBounds(50,50,70,30);
		  check1.addItemListener(this);
		// check1.setSelected(true);
		 //check1.setText("Java");
		 
		  check2=new JCheckBox("C++");
		 check2.setBounds(150,50,50,30);
		 check2.addItemListener(this);
		 //check2.setEnabled(false);
		 //check2.setText("C++");
		 
	    area=new JTextArea();
		area.setBounds(200,200,200,300);
		area.setBackground(Color.PINK);
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		
		grp=new ButtonGroup();
		
		grp.add(check1);
	    grp.add(check2);
		
		panel.add(check1);
		panel.add(check2);
		panel.add(area);
		this.add(panel);
		this.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		/*if(check1.isSelected())
		{
			area.append("You have selected Java\n");
		}
		
		 if(check2.isSelected())
		{
			area.append("You have selected C++\n");
		}*/
		
		if(e.getItem()==check1)
		{
			area.append("You have selected Java\n");
		}
		
		 if(e.getItem()==check2)
		{
			area.append("You have selected C++\n");
		}
	}
       


}