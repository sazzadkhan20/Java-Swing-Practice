package Classes;

import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.table.*;

public class UserInformation extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	private JButton button3,button4,button1,button2;
	private JPanel panel;
	DefaultTableModel model;
	JTable table;
	Admindashboard admindashboard;
	Adminlogin adi;
	int row = -1;
	
	public UserInformation(Admindashboard admindashboard,Adminlogin adi)
	{
		super("User Information");
		this.admindashboard=admindashboard;
		this.adi=adi;
		initializeForm();
		createTable();
		
		this.setVisible(true);
	}
	public void initializeForm()
	{
		this.setSize(800,700);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//this.setUndecorated(true);
	    this.setResizable(false);
	    this.setLayout(null);
		this.setLocationRelativeTo(null);
		
	   panel = new JPanel();
	   panel.setBounds(0,0,800,700);
	   panel.setBackground(Color.WHITE);
	   panel.setLayout(null);
		

      l1 = new JLabel("User Information");
	  l1.setFont(new Font("Segoe UI",Font.BOLD,30));
	  l1.setBounds(20,20,450,32);
	  l1.setForeground(Color.BLACK);	
	 
	 button3 = new JButton("Back");
	 button3.setFont(new Font("Segoe UI",Font.BOLD,15));
	 button3.setBounds(580,30,70,30);
	 button3.setForeground(Color.BLACK);
	 button3.addActionListener(this);
	 
     button4 = new JButton("Sign out");
	 button4.setFont(new Font("Segoe UI",Font.BOLD,20));
     button4.setForeground(Color.BLUE);
	 button4.setFocusPainted(false);
     button4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
     button4.setContentAreaFilled(false);
     button4.setBorder(null);
	 button4.setBounds(670,30,80,28);
	 button4.setFocusable(false);
	 button4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	 button4.addActionListener(this);
	 
	 ImageIcon icon = new ImageIcon("./Images/users-icon.png");
	  l2 = new JLabel(icon);
	  l2.setBounds(335,60,130,125);
		
	 l3 = new JLabel("User Name    : ");
	 l3.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l3.setBounds(25,220,150,25);
	 l3.setForeground(Color.BLACK);
	 
	 l4 = new JLabel();
	 l4.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l4.setBounds(167,220,250,25);
	 l4.setForeground(Color.BLACK);
	 
	 l5 = new JLabel("User NID    : ");
	 l5.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l5.setBounds(430,220,150,25);
	 l5.setForeground(Color.BLACK);
	 
	 l6 = new JLabel();
	 l6.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l6.setBounds(557,220,233,25);
	 l6.setForeground(Color.BLACK);
	 
	 l7 = new JLabel("User E-mail   : ");
	 l7.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l7.setBounds(25,270,150,25);
	 l7.setForeground(Color.BLACK);
	 
	 l8 = new JLabel();
	 l8.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l8.setBounds(167,270,250,25);
	 l8.setForeground(Color.BLACK);
	 
	 l9 = new JLabel("User Dtae of Birth : ");
	 l9.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l9.setBounds(430,270,200,25);
	 l9.setForeground(Color.BLACK);
	 
	 l10 = new JLabel();
	 l10.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l10.setBounds(624,270,170,25);
	 l10.setForeground(Color.BLACK);
	 
	 l11 = new JLabel("User Phone   : ");
	 l11.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l11.setBounds(25,320,150,25);
	 l11.setForeground(Color.BLACK);
	 
	 l12 = new JLabel();
	 l12.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l12.setBounds(167,320,250,25);
	 l12.setForeground(Color.BLACK);
	 
	 l13 = new JLabel("User Address   : ");
	 l13.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l13.setBounds(430,320,180,25);
	 l13.setForeground(Color.BLACK);
	 
	 l14 = new JLabel();
	 l14.setFont(new Font("Segoe UI",Font.BOLD,20));
	 l14.setBounds(587,320,203,25);
	 l14.setForeground(Color.BLACK);
	 
	 l15 = new JLabel("User History");
	 l15.setFont(new Font("Segoe UI",Font.BOLD,23));
	 l15.setBounds(20,380,200,28);
	 l15.setForeground(Color.BLACK);
	 
	 button2 = new JButton("Clear");
	 button2.setFont(new Font("Segoe UI",Font.BOLD,15));
     button2.setForeground(Color.BLUE);
	 button2.setBounds(560,625,90,28);
	 button2.setFocusable(false);
	 button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	 button2.addActionListener(this);
	 
	 button1 = new JButton("Remove");
	 button1.setFont(new Font("Segoe UI",Font.BOLD,15));
     button1.setForeground(Color.BLUE);
	 button1.setBounds(660,625,100,28);
	 button1.setFocusable(false);
	 button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	 button1.addActionListener(this);
	 
	 panel.add(l1);
	 panel.add(l2);
	 panel.add(l3);
	 panel.add(l4);
	 panel.add(l5);
	 panel.add(l6);
	 panel.add(l7);
	 panel.add(l8);
	 panel.add(l9);
	 panel.add(l10);
	 panel.add(l11);
	 panel.add(l12);
	 panel.add(l13);
	 panel.add(l14);
	 panel.add(l15);
	 panel.add(button3);
	 panel.add(button4);
	 panel.add(button1);
	 panel.add(button2);
	 this.add(panel);
	}
	
	 public void createTable()
	{
		model = new DefaultTableModel();
		model.addColumn("User Name");
		model.addColumn("User E-mail");
		model.addColumn("User Phone");
		model.addColumn("User NID");
		model.addColumn("User Birth Date");
		model.addColumn("User Address");
		
		table = new JTable(model);
		table.setFont(new Font("Segoe UI",Font.BOLD,12));
		table.setBackground(new Color(174,247,255));
		table.setRowHeight(25);
		table.setSelectionBackground(new Color(255, 153, 51));
		table.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,15));
		table.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me)
			{
				try
				{
					row = table.getSelectedRow();
					
					String name = model.getValueAt(row,0).toString();
					String email = model.getValueAt(row,1).toString();
					String phone = model.getValueAt(row,2).toString();
					String nid = model.getValueAt(row,3).toString();
					String dateOfBirth = model.getValueAt(row,4).toString();
					String address = model.getValueAt(row,5).toString();
					l4.setText(name);
			        l6.setText(nid);
			        l8.setText(email);
			        l10.setText(dateOfBirth);
			        l12.setText(phone);
			        l14.setText(address);
				}
				catch(Exception exp)
				{
					
				}
				
			}
		});
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(20,415,745,200);
		 try
		{
			Scanner sc = new Scanner(new File("All Text Files/UserInfo.txt"));
			
			while(sc.hasNextLine())
			{
				String sp[] = sc.nextLine().split(",");
				model.addRow(new Object[]{
					sp[2],
					sp[0],
					sp[5],
					sp[4],
					sp[3],
					sp[6]
				});
					
			}
			sc.close();
		}
		catch(Exception ex)
		{
			
		}
		
		panel.add(scroll);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			if(table.getSelectedRow()!=-1)
			{
				int option = JOptionPane.showConfirmDialog(this,"Are you Sure to Confirm Update??");
					if(option==JOptionPane.YES_OPTION){
				
						String email ="";
				      model.removeRow(row);
						
					try
		           {
					    File newfile = new File("All Text Files/UserTempInfo.txt");
						 File oldfile = new File("All Text Files/UserInfo.txt");
						 FileWriter fw = new FileWriter(newfile,true);
			         Scanner sc = new Scanner(oldfile);
			
                    while(sc.hasNextLine())
			        {
				        String sp[] = sc.nextLine().split(",");
						if(sp[0].equals(l8.getText()))
						{
							email = sp[0];
							
						}
						else
						{
							fw.write(sp[0]+","+sp[1]+","+sp[2]+","+sp[3]+","+sp[4]+","+sp[5]+","+sp[6]+"\n");
							
						}
				     }
					 sc.close();
					 fw.close();
					 oldfile.delete();
				     File dump = new File("All Text Files/UserInfo.txt");
				     newfile.renameTo(dump);
				   }
				   catch(IOException ioe)
				   {
					   ioe.printStackTrace();
				   }
				   JOptionPane.showMessageDialog(this,(email+" Using Person Remove Successfull"));
				   table.clearSelection();
			l4.setText("");
			l6.setText("");
			l8.setText("");
			l10.setText("");
			l12.setText("");
			l14.setText("");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this,"You must have to Select a Row First","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		if(e.getSource()==button2)
		{
			table.clearSelection();
			l4.setText("");
			l6.setText("");
			l8.setText("");
			l10.setText("");
			l12.setText("");
			l14.setText("");
		}
		if(e.getSource()==button3)
		{
			this.dispose();
			admindashboard.setVisible(true);
		}
		if(e.getSource()==button4)
		{
			this.dispose();
			adi.setVisible(true);
		}
	}

}