import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.encryption.*;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import java.io.IOException;
import java.util.Calendar;

public class PDFDemo {
    public static void main(String[] args) throws IOException {
        PDDocument document = new PDDocument();
        PDPage firstPage = new PDPage();
        document.addPage(firstPage);
        PDDocumentInformation info = document.getDocumentInformation();
        info.setAuthor("Sazzad");
        info.setTitle("MyPDF");
        info.setCreator("Apache PDFBox");
        info.setSubject("PDF Demo");
        info.setCreationDate(Calendar.getInstance());
        info.setKeywords("PDFBox, java PDF, Apache PDFBox");

        final int keyLength = 128;
        AccessPermission accessPermission = new AccessPermission();
		//accessPermission.setAllPermissions(AccessPermission.NO_PERMISSIONS);
        accessPermission.setCanPrint(false);
        accessPermission.setCanModify(false);
		 accessPermission.setCanExtractContent(false);
		 accessPermission.setCanExtractForAccessibility(false);
        accessPermission.setCanFillInForm(false);
        accessPermission.setCanModifyAnnotations(false);
        accessPermission.setCanAssembleDocument(false);
        accessPermission.setCanPrintDegraded(false);

        StandardProtectionPolicy sp = new StandardProtectionPolicy("111222", "208260", accessPermission);
        sp.setEncryptionKeyLength(keyLength);
        sp.setPermissions(accessPermission);
        document.protect(sp);
        
		PDImageXObject image = PDImageXObject.createFromFile("E:\\PDF\\Logo3333.png",document);
        PDPageContentStream pcs = new PDPageContentStream(document,firstPage);
		pcs.drawImage(image,20,650);
        pcs.beginText();
        pcs.setFont(PDType1Font.HELVETICA,18);
		pcs.setLeading(50.0f);
        pcs.newLineAtOffset(100,650);
        String text1 = "MY name is Sazzad Khan";
        String text2 = "MY Home District is Gazipur";
        String text3 = "I Am 25 Years old";
        String text4 = "MY College was Saint Joseph";
        String text5 = "and I am a proud Josephite";

        pcs.showText(text1);
		//pcs.newLine();
        pcs.newLineAtOffset(20,20);
       //pcs.showText(text2);
        pcs.newLineAtOffset(10,-20);
		pcs.newLine();
        pcs.showText(text3);
		//pcs.newLine();
        pcs.newLineAtOffset(10,-20);
        pcs.showText(text4);
        pcs.newLineAtOffset(10,-20);
        pcs.showText(text5);

        pcs.endText();
        pcs.close();

        document.save("E:\\PDF\\mypdf2.pdf");
        System.out.println("PDF Created Successfully");
        document.close();
    }
}