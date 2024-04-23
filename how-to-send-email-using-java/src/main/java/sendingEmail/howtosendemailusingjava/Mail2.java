
package sendingEmail.howtosendemailusingjava;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class Mail2
{

	//SETUP MAIL SERVER PROPERTIES
	//DRAFT AN EMAIL
	//SEND EMAIL
		
	Session newSession = null;
	MimeMessage mimeMessage = null;
	public static void main(String args[]) throws AddressException, MessagingException, IOException
	{
		Mail2 mail = new Mail2();
		mail.setupServerProperties();
		mail.draftEmail();
		mail.sendEmail();
	}

	private void sendEmail() throws MessagingException {
		String fromUser = "chaplarbc@gmail.com";  //Enter sender email id
		String fromUserPassword = "hyga lsty rztm dppn";//Enter sender gmail password , this will be authenticated by gmail smtp server
		String emailHost = "smtp.gmail.com";
		
		Transport transport = newSession.getTransport("smtp");
		transport.connect(emailHost, fromUser, fromUserPassword);
		transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
		transport.close();
		System.out.println("Email successfully sent!!!");
	}

	private MimeMessage draftEmail() throws AddressException, MessagingException, IOException {
//		"throwing an exception" in programming, it means that an error or exceptional condition has occurred during the execution of a program.
//		In Java, when an exceptional condition occurs, you can use the throw keyword to throw an exception manually. This signals that something unexpected or erroneous has happened and allows the program to handle the exceptional condition appropriately
		
		String[] emailReceipients = {"baruaagnila7@gmail.com","baruaagnila7@gmail.com"};  //Enter list of email recepients
		String emailSubject = "Test Mail";
		String emailBody = "Hi, this is the body part";
		mimeMessage = new MimeMessage(newSession);
//		The MimeMessage class is part of the JavaMail API and represents an email message in MIME (Multipurpose Internet Mail Extensions) format
		
		for (int i =0 ;i<emailReceipients.length;i++)
		{
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailReceipients[i]));
		}
		mimeMessage.setSubject(emailSubject);
	   
      // CREATE MIMEMESSAGE 
	    // CREATE MESSAGE BODY PARTS 
	    // CREATE MESSAGE MULTIPART 
	    // ADD MESSAGE BODY PARTS ----> MULTIPART 
	    // FINALLY ADD MULTIPART TO MESSAGECONTENT i.e. mimeMessage object 
	    
//	    MimeBodyPart represents a single part of a MIME message. It can contain various types of content, such as plain text, HTML, attachments, etc.
//		It's typically used to represent the body of an email message or individual attachments.
		 MimeBodyPart bodyPart = new MimeBodyPart();
		 bodyPart.setContent(emailBody,"text/html");
		 
		 
//		 MimeMultipart represents a container that holds multiple MimeBodyPart objects. It allows you to create a multipart message by combining multiple body parts.
//		 You can add MimeBodyPart objects to a MimeMultipart using methods like addBodyPart().
		 MimeMultipart multiPart = new MimeMultipart();
		 multiPart.addBodyPart(bodyPart);
		 mimeMessage.setContent(multiPart);
		 return mimeMessage;
	}

	private void setupServerProperties() {
		Properties properties = System.getProperties();
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		newSession = Session.getDefaultInstance(properties,null); // The Session class is responsible for managing the properties and configuration settings needed to establish a connection with an email server.
//Instances of the Session class(here newSession is instance of Session class) are typically created using the javax.mail.Session.getDefaultInstance() method
//Once a Session object is created and configured, it can be passed to other classes and methods in the JavaMail API, such as javax.mail.Transport for sending messages or javax.mail.Store for accessing the user's mailbox.
//here,in  getDefaultInstance() method, (properties, authenticator).  This Authenticator object is responsible for supplying the username and password credentials needed for authentication when connecting to the mail server which is set to null for this
	}
	
}	