package com.guthrie.menu.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mail {
	public void mail() {
		
	}
	
	public void sendMailWithAuth(String host, String user, String password, String port, String mailTo,
		     String htmlBody, String subject) throws Exception {

		    Properties props = System.getProperties();

		    props.put("mail.smtp.user",user); 
		    props.put("mail.smtp.password", password);
		    props.put("mail.smtp.host", host); 
		    props.put("mail.smtp.port", port); 
		    //props.put("mail.debug", "true"); 
		    props.put("mail.smtp.auth", "true"); 
		    props.put("mail.smtp.starttls.enable","true"); 
		    props.put("mail.smtp.EnableSSL.enable","true");

		    Session session = Session.getInstance(props, null);
		    //session.setDebug(true);

		    MimeMessage message = new MimeMessage(session);
		    message.setFrom(new InternetAddress(user));

		    // To get the array of addresses
		    //for (String to: toList) {
		    //    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		    //}
		    message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailTo));
		    message.setSubject(subject);
		    message.setContent(htmlBody, "text/html");

		    Transport transport = session.getTransport("smtp");
		    try {
		        transport.connect(host, user, password);
		        transport.sendMessage(message, message.getAllRecipients());
		    } finally {
		        transport.close();
		    }
	}

}
