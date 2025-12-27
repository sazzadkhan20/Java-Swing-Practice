import javax.swing.*;
import java.awt.*;
import javax.swing.JFormattedTextField.AbstractFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Properties;
import org.jdatepicker.impl.*;

public class datePickerDemo extends JFrame {
    JDatePickerImpl datepicker;
    JPanel panel1;
	Container c;
    int count = 2;

    public datePickerDemo() {
        super("Date Picker");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		c = this.getContentPane();
		
        panel1 = new JPanel();
		panel1.setBounds(50,52,250,34);
        panel1.setBackground(Color.YELLOW);
        panel1.setLayout(new FlowLayout());

        SqlDateModel model = new SqlDateModel();
        Properties p = new Properties();
        p.put("text.day", "Day");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl panel = new JDatePanelImpl(model, p);
        datepicker = new JDatePickerImpl(panel, new AbstractFormatter() {
            public String valueToString(Object value) throws ParseException {
                if (value != null) {
                    Calendar cal = (Calendar) value;
                    SimpleDateFormat format = new SimpleDateFormat("dd MMMM,yyyy");
                    String strDate = format.format(cal.getTime());
					if(count==2){
					System.out.println(strDate);
					count = 0;
					}
                    count++; 
                    return strDate;
					
                } else {
                    return "";
                }
            }

            public Object stringToValue(String text) throws ParseException {
                return "";
            }
        });

        panel1.add(datepicker);
       // c.add(panel1);
		c.add(panel1);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new datePickerDemo();
    }
}
