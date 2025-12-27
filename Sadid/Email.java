import java.lang.*;
import java.util.Scanner;
public class Email
{
	public static void main(String args [])
	{
	 Scanner scStr=new Scanner(System.in);
	 System.out.println("Enter a E-mail address");
     String S1=scStr.nextLine();
	 boolean flag=false;
	 
	 for(int i=0; i<S1.length(); i++)
	 {
		 
		if(S1.charAt(i)=='@')
        {
			for(int j=i+1; j<S1.length(); j++)
			{
				if(S1.charAt(j)=='.')
				{
					flag=true;
					break;
					
				}
				
				
			}
			
		}
         	
	 }
	 if(flag==true)
			{
				System.out.println(S1+" is an valid E-mail address");
			}
			else
			{
				System.out.println(S1+" is an Invalid E-mail Address");
			}
	}
}