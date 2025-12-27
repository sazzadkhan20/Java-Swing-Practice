public class RomanNumberDemo
{
	public static void main(String [] args)
	{
		RomanNumberDemo romanNumberDemo = new RomanNumberDemo();
		System.out.println(romanNumberDemo.convertRomanNum(10005));
		
	}
	public String convertRomanNum(int number)
	{
		int [] values ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String [] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		StringBuilder str = new StringBuilder();
		
		for(int i=0; i<values.length; i++)
		{
			while(number>=values[i])
			{
				number -=values[i];
				str.append(romanLiterals[i]);
			}
		}
		return str.toString();
	}
}