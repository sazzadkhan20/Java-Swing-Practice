import java.lang.*;
import java.util.Scanner;
public class Reverse
{
	public static void main(String args [])
	{
	 Scanner scStr=new Scanner(System.in);
	 System.out.println("Enter a String");
     String S1=scStr.nextLine();
	 System.out.println(S1+" String Reverse order is: ");
	 for(int i=S1.length()-1; i>=0; i--)
	 {
		System.out.print(S1.charAt(i)); 
	 }
	}
}