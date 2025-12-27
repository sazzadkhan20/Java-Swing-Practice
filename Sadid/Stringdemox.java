import java.lang.*;
import java.util.Scanner;
public class Stringdemox
{
	public static void main(String [] args)
	{
	 Scanner scStr=new Scanner(System.in);
	 System.out.println("Enter a String");
	 String S1=scStr.nextLine();
	 StringBuffer sb=new StringBuffer(S1);
	 System.out.println("Enter another String");
	 String S2=scStr.nextLine();
	 sb.append(S2);
	 System.out.println(sb);
	}
}