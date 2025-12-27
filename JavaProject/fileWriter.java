import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.FileWriter;
//import java.io.IOException;
public class fileWriter extends JFrame implements ActionListener { 

    JButton b,b1;
	JFrame f;
	final JTextField text;
	final JPasswordField value;
 
    fileWriter() {
		
    f=new JFrame("LogIn Screen");   
	
     final JLabel label = new JLabel();            
     label.setBounds(20,150, 200,50);  
	 
     value = new JPasswordField();   
     value.setBounds(100,75,100,30);
	 
     JLabel l1=new JLabel("Username:");    
     l1.setBounds(20,20, 80,30);  
	 
     JLabel l2=new JLabel("Password:");    
     l2.setBounds(20,75, 80,30);
	 
     b = new JButton("Login");  
     b.setBounds(100,120, 80,30); 
	 b.addActionListener(this);
	 //b.setBackground(Color.CYAN);
	 
	 b1 = new JButton("Sign Up");  
     b1.setBounds(100,180, 80,30); 
	 b1.addActionListener(this);
	 //b.setBackground(Color.CYAN);
	 
     text = new JTextField();  
     text.setBounds(100,20, 100,30); 
	 text.setBorder(null);
	 text.setBackground(Color.CYAN);
	 
	ImageIcon ImageIcon = new ImageIcon("icon.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	JLabel Background;
	ImageIcon img = new ImageIcon("bg.png");
	Background = new JLabel ("",img,JLabel.CENTER);
	Background.setBounds(0,0,300,600);

	 
     f.add(value); 
	 f.add(l1); 
	 f.add(label); 
	 f.add(l2); 
	 f.add(b); 
	 f.add(b1);
	 f.add(text); 
	 f.add(Background);
	 
	f.setSize(300,600);    
	f.setLayout(null);
    f.setLocationRelativeTo(null);     
	f.setVisible(true);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);	
  
}

	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b)
		{
			JOptionPane.showMessageDialog(null, "You have clicked login button ");
			//f.setVisible(false);
			
			
		}
		else if (e.getSource() == b1)
		{
		try{
	    String str =text.getText()+"/"+new String(value.getPassword())+"\n\r";
		
        FileWriter fw=new FileWriter("person.txt",true);
		
        for (int i = 0; i < str.length(); i++){
            fw.write(str.charAt(i));
		}

        fw.close();
		JOptionPane.showMessageDialog(null, "Your id an pass is saved");
		}catch (Exception ex) {}
		}
		
    }

  
} 

/*String str = "Hello\nphp";
		
        FileWriter fw=new FileWriter("pass.txt",true);
		 //FileWriter fw=new FileWriter("pass.txt");
		
        for (int i = 0; i < str.length(); i++){
            fw.write(str.charAt(i));
		}
		fw.close();
		*/
