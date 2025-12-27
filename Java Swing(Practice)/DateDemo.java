import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateDemo
{
	public static void main(String [] args)
	{
		Date date=new Date();
		
		//DateFormat dateformat=new SimpleDateFormat("dd MMM,yyy|E");
		DateFormat dateformat=new SimpleDateFormat("hh:mm:ss");
		
		String currdate=dateformat.format(date);
		System.out.println(currdate);
		//System.out.println(date);
		
	}
	
}