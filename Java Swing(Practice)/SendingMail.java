import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
//import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendingMail
{
	
	public static void sendMail(String to)
	{
		System.out.println("Preparing to send E-mail");
		
		//String to = "mdzohurul223@gmail.com";
		
		final String from = "zohurulsazzad@gmail.com";
		final String password = "uehx rtkv yatt mppn";
		
		String host = "smtp.gmail.com";
		
		Properties properties=new Properties();
		
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.socketFactory.port", "465");
		properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", "465");
		
		
		Session session= Session.getInstance(properties, new Authenticator() {
			@Override
			
			protected PasswordAuthentication getPasswordAuthentication()
			{
				
				return new PasswordAuthentication(from,password);
			}
			
			
		});
		
		try 
		{
			Message message = new MimeMessage(session);
			
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
			
			message.setSubject("My 1st E-mail");
			message.setText("Hellow I'am Sazzad Khan,and This is my First E-mail through JAVA Program");
			
			Transport.send(message);
			
			System.out.println("Successfully sending E-mail");
			
			
		}
		catch(MessagingException me)
		{
			throw new RuntimeException(me);
		}
		
		/*Message message=prepareMessage(session,m,recepient);
		Transport.send(message);
		System.out.println("Message Sent Successfully");*/
	}
	
	/*private static Message prepareMessage()
	{
		try{
		Message message=new MimeMessage(session);
		message.setFrom(new InternetAddress(myAccountEmail));
		message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
		message.setSubject("My First E-mail from Java App");
		message.setText("Hi\nI Am Sazzad Khan");
		return message;

		}
     catch(Exception e)
	 {
        Logger.getLogger(SendingMail.class.getName()).log(Level.SEVERE,null,e);

	 }		 
		return null;
	}*/	
}