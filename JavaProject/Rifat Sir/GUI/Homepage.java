package GUI;
import EntityList.*;
import Files.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Homepage extends JFrame implements ActionListener
{	
	JButton btnBoxManager,logout;
	BoxList boxList;
	Font font = new Font("cambria", Font.PLAIN, 20);
	Login login;
	public Homepage(Login login){
		super("Homepage");
		this.login = login;
		//this.boxList = boxList;
        this.setSize(400, 300);
        this.setLocation(300, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnBoxManager = new JButton("Box Manager");
        btnBoxManager.setBounds(100, 20, 200, 35);
        btnBoxManager.setFont(font);
        btnBoxManager.addActionListener(this);
        this.add(btnBoxManager);
		
		logout = new JButton("Logout");
        logout.setBounds(240, 220, 120, 30);
        logout.setFont(font);
		logout.setBackground(new Color(255,0,0));
		logout.setForeground(new Color(255,255,255));
        logout.addActionListener(this);
        this.add(logout);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
        if(btnBoxManager == e.getSource()){
			BoxList boxList = new BoxList(100);
			FileIO.readFromFile("files/BoxInfo.txt",boxList);
			BoxManagerFrame bmf = new BoxManagerFrame(this,boxList);
			this.setVisible(false);
		}
		if(logout == e.getSource()){
			int option = JOptionPane.showConfirmDialog(this,"You will be Logged Out?");
			System.out.println(option);
			if(option == JOptionPane.YES_OPTION){
				this.dispose();
				login.setVisible(true);
			}
		}
    }
}