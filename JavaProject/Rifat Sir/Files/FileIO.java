package Files;
import java.io.*;
import java.util.Scanner;
import Entity.*;
import EntityList.*;

public class FileIO{
	
	public static void readFromFile(String fname,BoxList boxList){
		try{
			Scanner sc=new Scanner(new File(fname)); 
			while(sc.hasNextLine()){
				String data[] = sc.nextLine().split(";");

				int boxId = Integer.parseInt(data[0]);
				double length = Double.parseDouble(data[1]);
				double width = Double.parseDouble(data[2]);
				double height = Double.parseDouble(data[3]);

				Entity.Box b = new Entity.Box(boxId,length,width,height);
				boxList.insertBox(b);
			}
			sc.close();
		}
		catch(Exception e){
			System.out.println("Cannot Read the File");
		}
	}
	
	public static void writeInFile(String line, String fname, boolean append){
		try {
		FileWriter writer = new FileWriter(fname,append);
		writer.write(line+"\n");
		writer.close();
		} catch (IOException e) {
			System.out.println("Cannot Write in File");
		}
	}
	public static void saveBoxListInFile(BoxList boxList, String fname, boolean append){
		try {
		FileWriter writer = new FileWriter(fname,append);
		Box boxes[] = boxList.getAllBox();
		
		for(int i=0;i<boxes.length;i++){
			if(boxes[i]!=null){
				writer.write(boxes[i].toString()+"\n");
			}
		}
		
		writer.close();
		} catch (IOException e) {
			System.out.println("Cannot Write in File");
		}
	}
}
