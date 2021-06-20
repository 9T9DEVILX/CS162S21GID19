/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.io.IOException;
import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author mahta
 */
public class javaMailUtil {
     Session newSession = null;
	MimeMessage mimeMessage = null;
	public static void main(String args[]) throws AddressException, MessagingException, IOException
	{
		javaMailUtil mail = new javaMailUtil();
		mail.setupServerProperties();
		mail.draftEmail();
		mail.sendEmail();
	}

	private void sendEmail() throws MessagingException {
		String fromUser = "nkzatb2050@gmail.com";  //Enter sender email id
		String fromUserPassword = "hamad_lora001";  //Enter sender gmail password , this will be authenticated by gmail smtp server
		String emailHost = "smtp.gmail.com";
		Transport transport = newSession.getTransport("smtp");
		transport.connect(emailHost, fromUser, fromUserPassword);
		transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
		transport.close();
		System.out.println("Email successfully sent!!!");
	}

	private MimeMessage draftEmail() throws AddressException, MessagingException, IOException {
		String[] emailReceipients = {"m_nouman@hotmail.com","xyz@gmail.com"};  //Enter list of email recepients
		String emailSubject = "Test Mail";
		String emailBody = "Test Body of my email";
		mimeMessage = new MimeMessage(newSession);
		
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
	    
	    
		 MimeBodyPart bodyPart = new MimeBodyPart();
		 bodyPart.setContent(emailBody,"html/text");
		 MimeMultipart multiPart = new MimeMultipart();
		 multiPart.addBodyPart(bodyPart);
		 mimeMessage.setContent(multiPart);
		 return mimeMessage;
	}

	private void setupServerProperties() {
		Properties properties = System.getProperties();
		properties.put("mail.smtp.port", "547");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		newSession = Session.getDefaultInstance(properties,null);
	}
}
