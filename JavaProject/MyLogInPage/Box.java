public class Box
{
   private double length;
   private double	width;
   private double height;
   private int BoxId;
   public static int Boxcount;
   public static int BoxIdseq=10;
   int id;
   
  public  Box()
   {
	   Boxcount++;
   }
   public Box(double length,double width,double height)
   {
	   this.length=length;
	   this.width=width;
	   this.height=height;
	   BoxIdseq+=10;
	   this.BoxId=BoxIdseq;
	   Boxcount++;
	   //this();
   }
   public Box(int id,double length,double width,double height)
   {	this.id = id;
	   this.length=length;
	   this.width=width;
	   this.height=height;
	   this.BoxId=BoxIdseq;
	   BoxIdseq =id;
	   Boxcount++;
	   //this();
   }
  /* public Box(double length,double width,double height,int BoxId)
   {
	   this(length,width,height);
	   this.BoxId=BoxId;
   }*/
   public void setLength(double v){length = v;}
	public void setWidth(double v){width = v;}
	public void setHeight(double v){height = v;}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	public void setBoxId(int i)
	{
		BoxIdseq=i;
	}
	public int getBoxId()
	{
		return BoxId;
	}
	public void showBox()
	{
		System.out.println("-------------------");
		System.out.println("Box ID : "+getBoxId());
		System.out.println("Length : "+getLength());
		System.out.println("Width : "+getWidth());
		System.out.println("Height : "+getHeight());
		System.out.println("-------------------");
	}
	public double getArea(){
		return length*width;
	}
}