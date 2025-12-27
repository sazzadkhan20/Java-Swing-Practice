import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.*;
import java.io.*;
//import javax.imageio.*;

public class BoxManagerFrame extends JFrame implements ActionListener
{
   JButton jbutt,butt;
	JTextField jtf1,jtf2,jtf3,jtf4;
	JPanel jpanel,panel;
	//JTextArea  //Ei Method ajk Deatails e porbo JTextArea
	DefaultTableModel model;
	JTable table;
	Font font=new Font("cambria",Font.ITALIC,20);
	BoxList bl;
	Box boxes[];
	LogInFrame li;
	public BoxManagerFrame(BoxList bl)
	{
		super("My Page");
		this.bl=bl;
		initializeFrom();
		createTable();
		
		
		/* //BackGround Example
		ImageIcon image = new ImageIcon("JavaProject/BusReLogo.png");
		//JLabel background = new JLabel(image);//Evabe dileo hobe
		JLabel background = new JLabel("",image,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		//background.setIcon(image);
		//this.add(background);
		
		
		jpanel.add(background);*/
		
		
       this.setVisible(true);

	}
	
	public void initializeFrom()
	{
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		jpanel=new JPanel();
		jpanel.setBounds(0,0,800,800);
		jpanel.setOpaque(false);
		jpanel.setLayout(null);
		
		/*  //BackGround Example
		ImageIcon image = new ImageIcon("JavaProject/BusReLogo.png");
		//JLabel background = new JLabel(image);//Evabe dileo hobe
		JLabel background = new JLabel("",image,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		//background.setIcon(image);
		jpanel.add(background);  */
		
		JLabel text=new JLabel("MY PAGE");
		text.setBounds(350,40,300,100);
		text.setFont(new Font("cmbria",Font.ITALIC,50));
		
		
	  /* ImageIcon imageicon = new ImageIcon("JavaProject/TrainLogo.jpg");
       Image img =imageicon.getImage();
       this.setIconImage(img);*/
		
		
		jtf1=new JTextField();
		jtf1.setBounds(20,20,50,50);
		jtf1.setBackground(Color.YELLOW);
		
		jtf2=new JTextField();
		jtf2.setBounds(80,20,50,50);
		
		jtf3=new JTextField();
		jtf3.setBounds(140,20,50,50);
		
		jtf4=new JTextField();
		jtf4.setBounds(200,20,50,50);
		
		/*ImageIcon im = new ImageIcon("JavaProject/TrainLogo.jpg");
		jbutt=new JButton();
		jbutt.setBounds(20,90,80,80);*/
		
		//JLabel j=new JLabel("",im,JLabel.CENTER);
		jbutt=new JButton("Submit");
		jbutt.setBounds(50,90,100,40);
		//jbutt.add(j);
		jbutt.addActionListener(this);
	   
		
		
		this.add(jpanel);
		//jpanel.add(panel);
		jpanel.add(jtf1);
		jpanel.add(jtf2);
		jpanel.add(jtf3);
		jpanel.add(jtf4);
		jpanel.add(jbutt);
		jpanel.add(text);
		//jpanel.add(background);
		
		
	}
	
	public  void actionPerformed(ActionEvent e)
	{
		li=new LogInFrame(5);
		//Box boxes[]=bl.getAllBoxes();
		if(jbutt==e.getSource())
		{
			try{
	    String str =li.getUserPhone()+"/"+jtf2.getText()+"/"+jtf3.getText()+"/"+jtf4.getText()+"\n";
		
        FileWriter fw=new FileWriter("UserBox.txt",true);
		
        for (int i = 0; i < str.length(); i++){
            fw.write(str.charAt(i));
		}

        fw.close();
		JOptionPane.showMessageDialog(null, "Your Box Information Saved");
		}catch (IOException ioex) {
			ioex.printStackTrace();
		}
		
			for(int i=0; i<boxes.length; i++){
			if(boxes[i]==null){
			boxes[i]=new Box(Double.parseDouble(jtf2.getText()),Double.parseDouble(jtf3.getText()),Double.parseDouble(jtf4.getText()));
			model.addRow(new Object[]{
			boxes[i].getBoxId(),
			boxes[i].getLength(),
			boxes[i].getWidth(),
			boxes[i].getHeight()
		});
			break;
			}
			}
			butt=new JButton("Done");
		butt.setBounds(50,150,80,40);
		jpanel.add(butt);
			//JOptionPane.showMessageDialog(this,"Submit Successfull");
			JOptionPane.showMessageDialog(this,"Submit Successfull","Information",JOptionPane.INFORMATION_MESSAGE);
		    
		}
	}
	
	public void createTable(){
		boxes=bl.getAllBoxes();
		//TABLE
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setFont(new Font("Times New Roman", Font.BOLD, 13));
		JScrollPane scrollPane = new JScrollPane(table); 
		
		scrollPane.setBounds(40,250,200,100);
		//table.setBounds(0,0,200,100);
		table.setBackground(Color.YELLOW);
		table.setRowHeight(20);
		//table.setColumnWidth(20);
		//table.setColumnHeight(20);
		table.setSelectionBackground(new Color(120, 150, 50));
		table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		model.addColumn("Box ID");
		model.addColumn("Length");
		model.addColumn("Width");
		model.addColumn("Hiegth");		
		for(int i=0; i<boxes.length; i++){
			if(boxes[i]!=null){
		model.addRow(new Object[]{
			boxes[i].getBoxId(),
			boxes[i].getLength(),
			boxes[i].getWidth(),
			boxes[i].getHeight()
		});
		}
		}
		jpanel.add(scrollPane);
		
		
	}

} 