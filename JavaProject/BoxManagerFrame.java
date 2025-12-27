import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.*;
//import javax.imageio.*;

public class BoxManagerFrame extends JFrame implements ActionListener
{
   JButton jbutt;
	JTextField jtf1,jtf2,jtf3,jtf4;
	JPanel jpanel,panel;
	//JTextArea  //Ei Method ajk Deatails e porbo JTextArea
	DefaultTableModel model;
	JTable table;
	Font font=new Font("cambria",Font.ITALIC,20);
	BoxList1 bl;
	Box1 boxes[];
	public BoxManagerFrame(BoxList1 bl)
	{
		super("My Page");
		this.bl=bl;
		initializeFrom();
		createTable();
		
		
		 //BackGround Example
		ImageIcon image = new ImageIcon("JavaProject/BusReLogo.png");
		//JLabel background = new JLabel(image);//Evabe dileo hobe
		JLabel background = new JLabel("",image,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		//background.setIcon(image);
		//this.add(background);
		
		
		jpanel.add(background);
		
		
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
		
		
	   ImageIcon imageicon = new ImageIcon("JavaProject/TrainLogo.jpg");
       Image img =imageicon.getImage();
       this.setIconImage(img);
		
		
		jtf1=new JTextField();
		jtf1.setBounds(20,20,50,50);
		jtf1.setBackground(Color.YELLOW);
		
		jtf2=new JTextField();
		jtf2.setBounds(80,20,50,50);
		
		jtf3=new JTextField();
		jtf3.setBounds(140,20,50,50);
		
		jtf4=new JTextField();
		jtf4.setBounds(200,20,50,50);
		
		ImageIcon im = new ImageIcon("JavaProject/TrainLogo.jpg");
		jbutt=new JButton();
		jbutt.setBounds(20,90,80,80);
		
		JLabel j=new JLabel("",im,JLabel.CENTER);
		j.setBounds(10,10,30,30);
		jbutt.add(j);
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
		//JOptionPane.showMessageDialog(this, "Invalid User Name or Password", "Error",JOptionPane.ERROR_MESSAGE);
		
		//Box1 boxes[]=bl.getAllBoxes();
		if(jbutt==e.getSource())
		{
			for(int i=0; i<boxes.length; i++){
			if(boxes[i]==null){
			boxes[i]=new Box1(Double.parseDouble(jtf2.getText()),Double.parseDouble(jtf3.getText()),Double.parseDouble(jtf4.getText()));
			model.addRow(new Object[]{
			boxes[i].getBoxId(),
			boxes[i].getLength(),
			boxes[i].getWidth(),
			boxes[i].getHeight()
		});
			break;
			}
			}
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


	/*JPanel jpanel,panel;
	DefaultTableModel model;
	JTable table;
	//Font font=new Font("cambria",Font.ITALIC,20);
	public BoxManagerFrame()
	{
		super("My Page");
		initializeFrom();
		createTable();

	}
	
	public void initializeFrom()
	{
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
		
		jpanel=new JPanel();
		jpanel.setBounds(0,0,800,600);
		jpanel.setLayout(null);
		
		panel=new JPanel();
		panel.setBounds(100,100,300,200);
		panel.setLayout(null);
		
		this.add(jpanel);
		jpanel.add(panel);
	}
	
	public void createTable(){
		//TABLE
		model = new DefaultTableModel();
		table = new JTable(model);
		
		table.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		JScrollPane scrollPane = new JScrollPane(table); 
		
		scrollPane.setBounds(0,0,300,200);
		//scrollPane.setBackground(Color.RED);
		table.setBounds(0,0,300,200);
		table.setBackground(Color.YELLOW);
		
		model.addColumn("ID");
		model.addColumn("Length");
		model.addColumn("Width");
		model.addColumn("Hiegth");
        //model.addColumn("");	
		panel.add(scrollPane);
		//scrollPane.add(table);
		for(int i=1; i<100;i++){
		model.addRow(new Object[]{10,5,20,30
			
		});
		}
	}
	}*/