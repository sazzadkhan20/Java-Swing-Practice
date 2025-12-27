public class Person
{
	String name;
	String passportNum;
	
	public Person(String n,String p)
	{
		name=n;
		passportNum=p;
		
	}
	public String getName()
	{
		return name;
		
	}
	public String getPass()
	{
		return passportNum;
		
	}
	public String toString()
	{
		return getName()+";"+getPass()+"\n";
		
	}
	
	
}