import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import java.io.*;
import java.io.IOException;

public class PDFLoad
{
	public static void main(String [] args) throws IOException
	{
		File oldfile = new File("E:\\PDF\\sample.pdf");
		PDDocument document = PDDocument.load(oldfile);
		document.addPage(new PDPage());
		document.save("E:\\PDF\\mypdf.pdf");
		System.out.println("PDF Created Successfully");
		document.close();
	}
}