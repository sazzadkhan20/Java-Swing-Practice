import javax.swing.*;


public class Calculator extends JFrame
{
	public Calculator()
	{
		//Creating the Main Window
		/*JFrame jframe=new JFrame("My Calculator");
		jframe.setSize(400,600);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setLocation(300,50);
		jframe.setLayout(null);
		jframe.setResizable(false);
		
		
		//Display the window after all initialization
		jframe.setVisible(true);*/
		//Creating the Main Window
		super("My Calculator");
		this.setSize(400,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(300,50);
		this.setLayout(null);
		this.setResizable(false);
		
		
		
		//Display the window after all initialization
		this.setVisible(true);
		
	}
}