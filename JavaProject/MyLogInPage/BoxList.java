import java.io.*; 


 public class BoxList
{
	private Box [] Boxes;
	private FileReader reader;	
	private BufferedReader bfr;
	LogInFrame li;
	String phone;
	public BoxList(int size)
	{
		Boxes=new Box[size];
		this.loadFromFile();
	}
	public void insertBox(Box b)
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
	
	public Box[] getAllBoxes()
	{
	  return Boxes;	
	}
	
	/*public Box[] getAllBoxes()
  {
    Box[] allBoxes = new Box[Boxes.length];
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
	public void loadFromFile(){
		li=new LogInFrame(10);
		phone=li.getUserPhone();
		
		try
		{
			File file = new File("UserBox.txt");
			reader = new FileReader(file);			
			bfr = new BufferedReader(reader);
            String singleLine;
			
			while((singleLine=bfr.readLine())!=null)
			{
				
				 String sp[] = singleLine.split("/");
		         if(sp[0].equals(phone))
				 {
				 double length = Double.parseDouble(sp[1]);
				 double width = Double.parseDouble(sp[2]);
				 double height = Double.parseDouble(sp[3]);
				
				Box b = new Box(length,width,height);
				this.insertBox(b);
				 }
				
			}
			
			reader.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}