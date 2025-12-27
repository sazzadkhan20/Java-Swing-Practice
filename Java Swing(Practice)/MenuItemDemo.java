import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class menu extends JFrame implements ActionListener 
{
	JPanel panel;
	
	Icon icon1=new ImageIcon("LOGO2.png");
	Icon icon2=new ImageIcon("logo3333.png");
    JMenuBar menubar;
	JMenu file,edit,help;
	JMenuItem newitem,open,exit,cut,copy,paste,selectAll;
    public menu() {
        super("My page");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menubar=new JMenuBar();
		//menubar.setBounds(20,100,100,100);
		this.setJMenuBar(menubar);
		
		file=new JMenu("File");
		edit=new JMenu("Edit");
		help=new JMenu("Help");
		
		newitem =new JMenuItem("new");
		newitem.setIcon(icon1);
		newitem.addActionListener(this);
		open =new JMenuItem("open");
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.ALT_MASK));
		open.addActionListener(this);
		exit =new JMenuItem("exit");
		exit.addActionListener(this);
		cut =new JMenuItem("cut");
		copy =new JMenuItem("copy");
		paste =new JMenuItem("paste");
		selectAll =new JMenuItem("Select All");
		
		file.add(newitem);
		file.addSeparator();
		file.add(open);
		file.addSeparator();
		file.add(exit);
		edit.add(cut);
		edit.addSeparator();
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		
		
		menubar.add(file);
		menubar.add(edit);
		menubar.add(help);
		
		
		
		
         panel=new JPanel();
		 panel.setBounds(0,0,400,400);
		panel.setLayout(null);
		 panel.setBackground(Color.PINK);
		 
        
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==newitem)
		{
			
			
		}
		if(e.getSource()==open)
		{
			JFrame f=new JFrame("MY lost");
			f.setSize(200,200);
	  f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
			f.setVisible(true);
		}
		if(e.getSource()==exit)
		{
			
			System.exit(0);
		}
		
	}

}

public class MenuItemDemo
{
	
	public static void main(String [] args)
	{
		menu c=new menu();
	}
}