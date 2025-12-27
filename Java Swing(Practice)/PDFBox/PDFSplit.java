/* import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.multipdf.Splitter;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class PDFSplit
{
	public static void main(String [] args) throws IOException
	{
		File oldfile = new File("E:\\PDF\\sample.pdf");
		PDDocument document = PDDocument.load(oldfile);
		
		Splitter splitter = new Splitter();
		List<PDDocument> splitpages = splitter.split(document);
		
		int num =1;
		for(PDDocument mydoc : splitpages)
		{
			mydoc.save("E:\\PDF\\Extraction\\example 0"+num+".pdf");
			num++;
			mydoc.close();
		}
		System.out.println("PDF Created Successfully");
	}
} */

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.multipdf.Splitter;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class PDFSplit
{
	public static void main(String [] args) throws IOException
	{
		File oldfile = new File("E:\\PDF\\sample.pdf");
		PDDocument document = PDDocument.load(oldfile);
		
		File newFile = new File("E:\\PDF\\Extraction");
		newFile.mkdirs();
		
		Splitter splitter = new Splitter();
		splitter.setStartPage(5);
		splitter.setEndPage(28);
		
		List<PDDocument> splitpages = splitter.split(document);
		
		PDDocument newDoc = new PDDocument();
		for(PDDocument mydoc : splitpages)
		{
			newDoc.addPage(mydoc.getPage(0));
		}
		newDoc.save(newFile+"\\split.pdf");
		newDoc.close();
		System.out.println("PDF Created Successfully");
		
	}
} 

