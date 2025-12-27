public class BoxList1
{
	private Box1 [] Boxes;
	public BoxList1(int size)
	{
		Boxes=new Box1[size];
	}
	public void insertBox(Box1 b)
	{
		boolean flag=false;
		for(int i=0; i<Boxes.length; i++)
		{
			if(Boxes[i]==null)
			{
				Boxes[i]=b;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Box Successfully inserted ");
		}
		else
		{
			System.out.println("Box List Is Full,Cannot Save Box ");
		}
		
	}
	
	public Box1[] getAllBoxes()
	{
	  return Boxes;	
	}
	
	/*public Box1[] getAllBoxes()
  {
    Box1[] allBoxes = new Box1[Boxes.length];
    for (int i = 0; i < Boxes.length; i++)
    {
		if(Boxes[i]!=null){
        allBoxes[i] = Boxes[i];
		}
    }
    return allBoxes;
  }*/
	
	public void showAllBoxes()
	{
		for(int i=0; i<Boxes.length; i++)
		{
			if(Boxes[i]!=null)
			{
			Boxes[i].showBox();
			}
		}
	
	}
	public void TotalArea()
	{
		double TotalArea=0;
		for(int i=0; i<Boxes.length; i++)
		{
			if(Boxes[i]!=null)
			{
				TotalArea+=Boxes[i].getArea();
			}
		}
		System.out.println("Total Area of All Boxes: "+TotalArea);
		
	}
	public void removeBoxById(int Id)
	{
		boolean flag=false;
		for(int i=0; i<Boxes.length; i++)
		{
			if(Boxes[i]!=null)
			{
			if((Boxes[i].getBoxId())==Id)
			{
				Boxes[i]=null;
				flag=true;
				break;
			}
			}
		}
		if(flag)
		{
		System.out.println("Box Successfully Removed");
		}
		else
		{
			System.out.println("SORRY Input Id Not Match Any Boxes,Please Try one more time");
		}
				
		
	}
}