import java.lang.*;
import java.util.Scanner;
public class Compareto
{
	public static void main(String args [])
	{
	Scanner scStr=new Scanner(System.in);
	System.out.println("Enter a String");
     String S1=scStr.nextLine();
	 System.out.println("Enter another String");
	 String S2=scStr.nextLine();
	 System.out.println(S1+" and "+S2+" Compare To "+ S1.compareTo(S2));
	}
}