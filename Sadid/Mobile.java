import java.lang.*;
import java.util.Scanner;
public class Mobile
{
	public static void main(String args [])
	{
	 Scanner scStr=new Scanner(System.in);
	 System.out.println("Enter a Mobile Number");
     String S1=scStr.nextLine();
	 if(S1.charAt(2)=='7' || S1.charAt(2)=='3')
     { 
	   System.out.println(S1+" is GP Operator");   
     }
if(S1.charAt(2)=='9' || S1.charAt(2)=='4')
     { 
	   System.out.println(S1+" is BL Operator");   
     }
if(S1.charAt(2)=='8' )
     { 
	   System.out.println(S1+" is Robi Operator");   
     }
if(S1.charAt(2)=='5')
     { 
	   System.out.println(S1+" is Teletalk Operator");   
     }	
if(S1.charAt(2)=='6')
     { 
	   System.out.println(S1+" is Artel Operator");   
     }	 
	}
}