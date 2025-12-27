import java.lang.*;
import java.util.Scanner;
public class concat
{
	public static void main(String args [])
	{
	Scanner scStr=new Scanner(System.in);
	System.out.println("Enter a String");
     String S1=scStr.nextLine();
	 System.out.println("Enter another String");
	 String S2=scStr.nextLine();
	 System.out.println(S1.concat(S2));//S1.concat("   ").concat("Vore dibo ").concat(S2)
	}
}