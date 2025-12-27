// Reading data from a file using FileReader
//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.IOException;
class fileReader
{
public static void main(String[] args) //throws IOException
{
   // variable declaration
   String ch;
  // String info[]=new String [5];
    // check if File exists or not
    FileReader fr=null;
   try
   {
   fr = new FileReader("person.txt");

   // read from FileReader till the end of file
    while ((ch=fr.readLine())!=null)
	{
     System.out.print(ch);
	 //char s=(char)ch;
	 //info=s.split("/");
	 

     }
	 // close the file
    fr.close();
}
  catch (Exception fe)
  {
    System.out.println("File not found");
  }
}

}
