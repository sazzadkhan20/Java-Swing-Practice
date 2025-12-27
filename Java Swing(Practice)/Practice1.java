import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practice1 extends JFrame implements ActionListener 
{
	JPanel panel;
	JRadioButton male,female;
	ButtonGroup grp;
	JButton btn;
	 JTextArea area;
	

    public Practice1() {
        super("My page");
        this.setSize(800, 600);
        this.setLocation(300, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

         panel=new JPanel();
		 panel.setBounds(0,0,800,600);
		 panel.setLayout(null);
		 
		 male=new JRadioButton();
		 male.setText("male");
		 male.setBounds(30,30,100,40);
		 //male.setSelected(true);
		 male.addActionListener(this);
		 
		  female=new JRadioButton();
		 female.setText("female");
		 female.setBounds(150,30,100,40);
		// female.setEnabled(false);
		 female.addActionListener(this);
		
		 btn=new JButton();
		 btn.setBounds(100,120,40,40);
		 btn.addActionListener(this);
		  
	    area=new JTextArea();
		area.setBounds(200,200,100,300);
		area.setBackground(Color.PINK);
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		panel.add(area);
		
		grp=new ButtonGroup();
		grp.add(male);
		grp.add(female);
		
		panel.add(area);
		panel.add(male);
		panel.add(female);
		panel.add(btn);
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn)
		{
			area.append("You have selected male\n");
			if(male.isSelected()){
			System.out.println(male.getText());
			}
		}
		
		if(e.getSource()==btn)
		{
			area.append("You have selected female\n");
			if(female.isSelected()){
			System.out.println(female.getText());
			}
		}
	}
       


}