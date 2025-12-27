import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;


public class HotelPricing extends JFrame implements ActionListener
{
	private JButton button, button1, button2, button3, button4, button5;
	private JLabel label,label1,label2;
	private JTable table;
	private JScrollPane scroll, scroll1, scroll2;
	private DefaultTableModel model;
	private ImageIcon img;
	private JLabel BackgroundImage;
	public FileReader reader;
    public BufferedReader bfreader;
	public String[] Beds;
    public String[] Quantitys;
    public String[] Days;
    public String[] Breakfasts;
    public String[] Prices;
	private String[] column = {"Bed", "Quantity", "Day", "Breakfast", "Price"};
	private String[] column1 = {"Bed", "Quantity", "Day", "Breakfast", "Price"};
	private String[] column2 = {"Bed", "Quantity", "Day", "Breakfast", "Price"};
	public String[] rows = new String[10000];
	
	public HotelPricing()
	{
		super("Hotel Pricing");
		
		img = new ImageIcon(getClass().getResource("Pic/Background.png"));
		BackgroundImage = new JLabel (img);
		BackgroundImage.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		
		button=new JButton("Balance");
		Color c = new Color(102,102,102);
		button.setBackground(c);
        button.setForeground(Color.WHITE);
		
		button1=new JButton("User List");
		Color c1 = new Color(102,102,102);
		button1.setBackground(c1);
        button1.setForeground(Color.WHITE);
		
		button2=new JButton("Reserved Journey");
		Color c2 = new Color(102,102,102);
		button2.setBackground(c2);
        button2.setForeground(Color.WHITE);
		
		button3=new JButton("Transportation Pricing");
		Color c3 = new Color(102,102,102);
		button3.setBackground(c3);
        button3.setForeground(Color.WHITE);
		
		button4=new JButton("Hotel Pricing");
		Color c4 = new Color(204,204,204);
		Color ct = new Color(0,0,0);
		button4.setBackground(c4);
        button4.setForeground(ct);
		
		button5=new JButton("Logout");
		Color c5 = new Color(102,102,102);
		button5.setBackground(c5);
        button5.setForeground(Color.WHITE);
		
		
		button.setBounds(10,25,180,40);
		button1.setBounds(10,75,180,40);
		button2.setBounds(10,125,180,40);
		button3.setBounds(10,175,180,40);
		button4.setBounds(10,225,180,40);
		button5.setBounds(10,400,180,40);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		
		//table 1
		label = new JLabel("5 Star");
        label.setBounds(480, 5, 200, 30);
		
		// JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setBackground(Color.DARK_GRAY);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(160);
        table.getColumnModel().getColumn(1).setPreferredWidth(160);
        table.getColumnModel().getColumn(2).setPreferredWidth(160);
        table.getColumnModel().getColumn(3).setPreferredWidth(160);
        table.getColumnModel().getColumn(4).setPreferredWidth(160);
		table.setForeground(Color.WHITE);

        scroll1 = new JScrollPane(table);
        scroll1.setBounds(240, 35, 500, 119);
        scroll1.setBackground(Color.WHITE);
		
		
		String line;
        int Number_of_Lines = 0;

        try 
		{
            reader = new FileReader("Data/5StarHotel.txt");
            bfreader = new BufferedReader(reader);

            while ((line = bfreader.readLine()) != null) 
			{
                Number_of_Lines++;
            }

            // initialize arrays with appropriate size
            Beds = new String[Number_of_Lines];
            Quantitys = new String[Number_of_Lines];
            Days = new String[Number_of_Lines];
            Breakfasts = new String[Number_of_Lines];
            Prices = new String[Number_of_Lines];

            // reset reader to start from the beginning
            reader = new FileReader("Data/5StarHotel.txt");
            bfreader = new BufferedReader(reader);

            int i = 0;
            while ((line = bfreader.readLine()) != null) 
			{
                String[] parts = line.split(",");
                Beds[i] = parts[0];
                Quantitys[i] = parts[1];
				Days[i] = parts[2];
				Breakfasts[i] = parts[3];
				Prices[i] = parts[4];
                i++;
            }
            reader.close();
        } 
		catch (Exception E) 
		{

        }

        for (int i = 0; i < Number_of_Lines; i++)
		{
            rows[0] = Beds[i]; // Bed
            rows[1] = Quantitys[i]; // Quantity
            rows[2] = Days[i]; // Day
            rows[3] = Breakfasts[i]; // Breakfast
            rows[4] = Prices[i]; // Price
            model.addRow(rows);
        }
		
		
		//table 2
		label1 = new JLabel("3 Star");
        label1.setBounds(480, 150, 200, 30);
		
		// JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column1);

        table.setModel(model);
        table.setBackground(Color.DARK_GRAY);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(160);
        table.getColumnModel().getColumn(1).setPreferredWidth(160);
        table.getColumnModel().getColumn(2).setPreferredWidth(160);
        table.getColumnModel().getColumn(3).setPreferredWidth(160);
        table.getColumnModel().getColumn(4).setPreferredWidth(160);
		table.setForeground(Color.WHITE);

        scroll2 = new JScrollPane(table);
        scroll2.setBounds(240, 180, 500, 119);
        scroll2.setBackground(Color.WHITE);
		
		String bline;
        int bNumber_of_Lines = 0;

        try 
		{
            reader = new FileReader("Data/3StarHotel.txt");
            bfreader = new BufferedReader(reader);

            while ((bline = bfreader.readLine()) != null) 
			{
                bNumber_of_Lines++;
            }

            // initialize arrays with appropriate size
            Beds = new String[bNumber_of_Lines];
            Quantitys = new String[bNumber_of_Lines];
            Days = new String[bNumber_of_Lines];
            Breakfasts = new String[bNumber_of_Lines];
            Prices = new String[bNumber_of_Lines];

            // reset reader to start from the beginning
            reader = new FileReader("Data/3StarHotel.txt");
            bfreader = new BufferedReader(reader);

            int i = 0;
            while ((bline = bfreader.readLine()) != null) 
			{
                String[] parts = bline.split(",");
                Beds[i] = parts[0];
                Quantitys[i] = parts[1];
				Days[i] = parts[2];
				Breakfasts[i] = parts[3];
				Prices[i] = parts[4];
                i++;
            }
            reader.close();
        } 
		catch (Exception E) 
		{

        }

        for (int i = 0; i < bNumber_of_Lines; i++)
		{
            rows[0] = Beds[i]; // Bed
            rows[1] = Quantitys[i]; // Quantity
            rows[2] = Days[i]; // Day
            rows[3] = Breakfasts[i]; // Breakfast
            rows[4] = Prices[i]; // Price
            model.addRow(rows);
        }
		
		//table 3
		label2 = new JLabel("2 Star");
        label2.setBounds(480, 294, 200, 30);
		
		// JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column2);

        table.setModel(model);
        table.setBackground(Color.DARK_GRAY);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(160);
        table.getColumnModel().getColumn(1).setPreferredWidth(160);
        table.getColumnModel().getColumn(2).setPreferredWidth(160);
        table.getColumnModel().getColumn(3).setPreferredWidth(160);
        table.getColumnModel().getColumn(4).setPreferredWidth(160);
		table.setForeground(Color.WHITE);

        scroll = new JScrollPane(table);
        scroll.setBounds(240, 324, 500, 118);
        scroll.setBackground(Color.WHITE);
		
		String tline;
        int tNumber_of_Lines = 0;

        try 
		{
            reader = new FileReader("Data/2StarHotel.txt");
            bfreader = new BufferedReader(reader);

            while ((tline = bfreader.readLine()) != null) 
			{
                tNumber_of_Lines++;
            }

            // initialize arrays with appropriate size
            Beds = new String[tNumber_of_Lines];
            Quantitys = new String[tNumber_of_Lines];
            Days = new String[tNumber_of_Lines];
            Breakfasts = new String[tNumber_of_Lines];
            Prices = new String[tNumber_of_Lines];

            // reset reader to start from the beginning
            reader = new FileReader("Data/2StarHotel.txt");
            bfreader = new BufferedReader(reader);

            int i = 0;
            while ((tline = bfreader.readLine()) != null) 
			{
                String[] parts = tline.split(",");
                Beds[i] = parts[0];
                Quantitys[i] = parts[1];
				Days[i] = parts[2];
				Breakfasts[i] = parts[3];
				Prices[i] = parts[4];
                i++;
            }
            reader.close();
        } 
		catch (Exception E) 
		{

        }

        for (int i = 0; i < tNumber_of_Lines; i++)
		{
            rows[0] = Beds[i]; // Bed
            rows[1] = Quantitys[i]; // Quantity
            rows[2] = Days[i]; // Day
            rows[3] = Breakfasts[i]; // Breakfast
            rows[4] = Prices[i]; // Price
            model.addRow(rows);
        }
		
		
		add(button);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(scroll);
		add(scroll1);
		add(scroll2);
		add(label);
		add(label1);
		add(label2);
		add(BackgroundImage);
		
		setLayout(null);
		setSize(800,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button)
		{
			setVisible(false);
			new Balance();
		}
		else if(e.getSource()==button1)
		{
			setVisible(false);
			new UserList();
		}
		else if(e.getSource()==button2)
		{
			setVisible(false);
			new ReservedJourney();
		}
		else if(e.getSource()==button3)
		{
			setVisible(false);
			new TransportationPricing();
		}
		else if(e.getSource()==button4)
		{
			setVisible(false);
			new Admin();
		}
		else if(e.getSource()==button5)
		{
			setVisible(false);
			new Logout();
		}
	}
	
	public static void main(String[] args)
	{
		new HotelPricing();
	}
}