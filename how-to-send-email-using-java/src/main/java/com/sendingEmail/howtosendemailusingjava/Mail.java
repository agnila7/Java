package com.sendingEmail.howtosendemailusingjava;

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

public class Mail {
	
	public static void main (String[] agrgs) throws MessagingException, IOException {
		
		//SETUP MAIL SERVER PROPERTIES
		//DRAFT AN EMAIL
		//SEND EMAIL
	Mail email = new Mail();
	email.setupServerProperties();
	email.draftEmail();
	email.sendEmail();

	}

	Session newSession= null;
	 MimeMessage mimeMessage = null;

	private void sendEmail() throws MessagingException {
		// TODO Auto-generated method stub
		String emailSender ="**@gmail.com"; // //Enter sender email id
		String accountPassword = "***";
		String smtpHost ="smtp.gmail.com";
		
		Transport transport = newSession.getTransport("smtp");
		transport.connect(smtpHost, emailSender, accountPassword); //(host,user,password)
		transport.sendMessage(mimeMessage,mimeMessage.getAllRecipients());
		transport.close();
		
		System.out.println("Email sent successfully!");
	
	}

	private MimeMessage draftEmail() throws AddressException, MessagingException, IOException{
		// TODO Auto-generated method stub
		String emailRecipent = "***@gmail.com";
		String emailSubject = " Subject";
		String emailBody = "Hi, This is an test email body.";
		mimeMessage  = new MimeMessage(newSession);
		
		mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailRecipent)); // (Recipient type,email Address). here, RecipientType include To field, s creates a new InternetAddress object, which represents an email address and takes email Recipient as parametera
		mimeMessage.setSubject(emailSubject);
		
		MimeBodyPart bodyPart = new MimeBodyPart();
		bodyPart.setContent(emailBody,"html/text");
		
		MimeMultipart multipart = new MimeMultipart();
		multipart.addBodyPart(bodyPart);
		mimeMessage.setContent(multipart);
		return mimeMessage;
		
	}

	private void setupServerProperties() {
		// TODO Auto-generated method stub
		Properties properties = System.getProperties();
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com"); // this is fixed, don't use email object inside
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		newSession = Session.getDefaultInstance(properties, null);
	}

}
