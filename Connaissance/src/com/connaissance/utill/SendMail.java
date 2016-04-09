/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connaissance.utill;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	String d_email = "bageeradhavajja@gmail.com";
	String d_password = "bagee_440432";
	String d_host = "smtp.gmail.com";
	String d_port = "465";

	public void sendIt(String m_to, String m_subject, String m_text) {
		Properties props = new Properties();
		props.put("mail.https.user", d_email);
		props.put("mail.https.host", d_host);
		props.put("mail.https.port", d_port);
		props.put("mail.https.starttls.enable", "true");
		props.put("mail.https.auth", "true");
		// props.put("mail.smtp.debug", "true");
		props.put("mail.https.socketFactory.port", d_port);
		props.put("mail.https.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.https.socketFactory.fallback", "false");
		System.out.println("befor security...");
		SecurityManager security = System.getSecurityManager();
		System.out.println("after security...");
		try {
			System.out.println("inside try...");
			Authenticator auth = new SMTPAuthenticator();
			Session session = Session.getInstance(props, auth);
			// session.setDebug(true);
			System.out.println("after session...");
			MimeMessage msg = new MimeMessage(session);
			msg.setText(m_text);
			msg.setSubject(m_subject);
			msg.setFrom(new InternetAddress(d_email));
			System.out.println("after set");
			msg.addRecipient(Message.RecipientType.TO,
					new InternetAddress(m_to));
			System.out.println("after add recipient");
			Transport.send(msg);
			System.out.println("afetr sent...");
		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

	class SMTPAuthenticator extends javax.mail.Authenticator {

		public PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(d_email, d_password);
		}
	}

}
