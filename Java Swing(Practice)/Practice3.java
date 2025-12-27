import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practice3 extends JFrame implements ActionListener 
{
	JPanel panel;
	private JComboBox cb;
	JLabel label;
	JButton button;
	private String programlang [] ={"C","C++","Java","Javascript","PHP","Kotlin","Python"};
   	
	

    public Practice3() {
        super("My page");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

         panel=new JPanel();
		 panel.setBounds(0,0,800,600);
		 panel.setLayout(null);
		 panel.setBackground(Color.PINK);
		
		cb=new JComboBox(programlang);
		cb.setBounds(100,250,150,30);
		cb.setEditable(true);
		cb.setForeground(Color.BLUE);
		cb.setBackground(new Color(255,255,255));
		//cb.setSelectedIndex(3);
		//cb.setSelectedItem("PHP");
		//cb.setSelectedItem("");
		cb.addItem("Laravel");
		cb.addActionListener(this);
	 System.out.println(cb.getSelectedItem());
		
		System.out.println("Item is: "+cb.getItemCount());
		
		label=new JLabel();
		label.setBounds(300,255,250,50);
		label.setForeground(Color.YELLOW);
		label.setBackground(Color.RED);
		
		button=new JButton("Done");
		button.setBounds(200,300,80,40);
		//button.addActionListener(this);
	    panel.add(cb);
		panel.add(label);
		
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
	}
       
    public void actionPerformed(ActionEvent e)
	{
		String s=cb.getSelectedItem().toString();
		label.setText("You are Selected "+s);
		int count=10;
		System.out.println(count);
		
	}

}