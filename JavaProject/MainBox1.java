import java.lang.*;

import java.util.Scanner;

public class MainBox1
{
	public static void main(String [] args)
	{
		BoxList1 boxlist=new BoxList1(100);
		
		
		
		boxlist.insertBox(new Box1(12,10,5));
		boxlist.insertBox(new Box1(124,45,45));
		boxlist.insertBox(new Box1(55,10,36));
		boxlist.insertBox(new Box1(120,100,58));
		boxlist.insertBox(new Box1(11,36,22));
		
		//boxlist.showAllBoxes();
		
		//BoxManagerFrame bmf=new BoxManagerFrame();
		BoxManagerFrame bmf=new BoxManagerFrame(boxlist);
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scNum=new Scanner(System.in);
		Scanner scStr=new Scanner(System.in);
		System.out.println("Please Enter Boxes number");
		BoxList1 boxlist=new BoxList1(scNum.nextInt());
		/*Box1 b1=new XBox(1,2,3);
		Box1 b2=new XBox(2,2,4);*/
		/*System.out.println("Please Enter a Box Length,Width,Hight ");
		boxlist.insertBox(new Box1(scNum.nextDouble(),scNum.nextDouble(),scNum.nextDouble()));
		System.out.println("Please Enter another Box Length,Width,Hight ");
		boxlist.insertBox(new Box1(scNum.nextDouble(),scNum.nextDouble(),scNum.nextDouble()));
		System.out.println("Please Enter another Box Length,Width,Hight ");
		boxlist.insertBox(new Box1(scNum.nextDouble(),scNum.nextDouble(),scNum.nextDouble()));
		System.out.println("Please Enter another Box Length,Width,Hight ");
		boxlist.insertBox(new Box1(scNum.nextDouble(),scNum.nextDouble(),scNum.nextDouble()));
		boxlist.showAllBoxes();
		boxlist.TotalArea();
		System.out.println("Please Enter Box Id Number,which you want to delete or remove your Box list");
		boxlist.removeBoxById(scNum.nextInt());
		System.out.println("Please Enter another Box Length,Width,Hight ");
		boxlist.insertBox(new Box1(scNum.nextDouble(),scNum.nextDouble(),scNum.nextDouble()));
		boxlist.showAllBoxes();*/
	}
}