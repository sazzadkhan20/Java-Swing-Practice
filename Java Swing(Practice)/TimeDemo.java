import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo
{
	public static void main(String [] args)
	{
		
		LocalTime time=LocalTime.now();
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss");
		String st=time.format(formatter);
		System.out.println(st);
		//System.out.println(time);
	}
	
}