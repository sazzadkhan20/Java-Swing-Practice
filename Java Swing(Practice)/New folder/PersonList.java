public class PersonList
{
	private Person [] personList;
	
	public PersonList(int s)
	{
		personList=new Person[s];
	}
	public void insertPerson(Person p)
	{
		boolean flag =false;
		for(int i=0; i<personList.length; i++)
		{
			if(personList[i]!=null)
			{
				personList[i]=p;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Person Insert");
			
		}
		else
		{
			System.out.println("Person does not Insert");
		}
	}
	public Person[] getAllPerson()
	{
		
		return personList;
	}
}