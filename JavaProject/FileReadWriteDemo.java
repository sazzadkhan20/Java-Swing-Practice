/* import java.lang.*;
import java.io.*;

class FileReadWriteDemo
{
	//private File file;			//to create a File
	private FileWriter writer;		//to write in a file
	private FileReader reader;		//to read from a file
	private BufferedReader bfr;		//to read file content

			
	/*public void writeInFile(String s, String fname)
	{
		/*
			creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		  
		/*try
		{
			File file = new File(fname);	//Declaring a file named named History.txt for creating.
			file.createNewFile();					//If the file does not exists, creates and opens the file. else, just opens the file
			writer = new FileWriter(file,true);	//creating the writer object to write in the file.
			writer.write(s+"\r\n");				//writing a string s in the file. the "\r" and "\n" has been concat to go to a newline.
			writer.flush();							//After writing, we need to flush to indicate that we have completed writing.
			writer.close();							//After flushing, we need to close the file to save our writing.
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}*/
	
	/*public void readFromFile(String fname) 
	{
		/*
			reading from a file genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		
	/*	try
		{
			File file = new File(fname);
			reader = new FileReader(file);			//creating the reader object to read from a file.
			bfr = new BufferedReader(reader);		//creating the BufferedReader object using the reader object to read the file content.
			String fullText="", singleLine;					//declaring two string variables to store the content after reading.
			
			while((singleLine=bfr.readLine())!=null)		//reading one line from the file, storing it in the variable temp and checking whether it is null or not. It will be null at the end of reading from the file.
			{
				 String sp[] = singleLine.split("/");
				 System.out.println(sp[0]);
				 System.out.println(sp[1]);
				 /*System.out.println("Name : "+sp[0]);
				 System.out.println("Price: "+(Double.parseDouble(sp[1])+(Double.parseDouble(sp[1])*0.15))+" With 15% VAT");
				 System.out.println("Date : "+sp[2]);*/
				
				/*fullText=fullText+singleLine+"\n\r";			//storing the singleLine string in text by concating it with text and "n" and "\r" is used to go to a newline.
			}
			
			//System.out.println(fullText);				//printing the whole string in console.
			reader.close();							//closing the file.
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
} */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileReadWriteDemo {
    private FileReader reader;
    private BufferedReader bfr;

    public void readFromFile(String fname) {
        try {
            File file = new File(fname);
            reader = new FileReader(file);
            bfr = new BufferedReader(reader);
            String fullText="", singleLine; 
            while((singleLine=bfr.readLine())!=null) {
				 //reader.close();   
                String sp[] = singleLine.split("/");
                System.out.println(sp[0]);
				 //reader.close();   
                System.out.println(sp[1]);
				 //reader.close();   
            }
            reader.close();        
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }   
}
