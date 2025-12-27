import java.util.Random;

public class RandomNumberGenerate
{
	public static void main(String [] args)
	{
		Random rand=new Random();
		
		int randomNum1= rand.nextInt(1000)+7000;
		int randomNum2= rand.nextInt(1000)+8000;
		int randomNum3= rand.nextInt(1000)+6000;
		System.out.println(randomNum1);
		System.out.println(randomNum2);
		System.out.println(randomNum3);
		
		/*int randomNum= (int)(Math.random()*1000)+1000;
		System.out.println(randomNum);*/
	}
	
}