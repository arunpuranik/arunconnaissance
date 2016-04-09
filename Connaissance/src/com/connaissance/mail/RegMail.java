package com.connaissance.mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class RegMail {

	String d_email = "humancapital.in@gmail.com";
	String d_password = "cityland123";
	String d_host = "smtp.gmail.com";
	String d_port = "465";

	// String m_to = "devendra.add@rediffmail.com";
	// String m_subject = "Humancapital Registration Successful.";
	// String m_text = "You are sucessfully registered.";

	// class Mail1 {
	// public Mail1() {
	public void sendIt(String m_to, String m_subject, String m_text) {
		Properties props = new Properties();
		props.put("mail.smtp.user", d_email);
		props.put("mail.smtp.host", d_host);
		props.put("mail.smtp.port", d_port);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		// props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.socketFactory.port", d_port);
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");

		// SecurityManager security = System.getSecurityManager();

		try {
			Authenticator auth = new SMTPAuthenticator();
			Session session = Session.getInstance(props, auth);
			// session.setDebug(true);
			MimeMessage msg = new MimeMessage(session);

			msg.setText(m_text);
			msg.setSubject(m_subject);
			msg.setFrom(new InternetAddress(d_email));
			msg.addRecipient(Message.RecipientType.TO,
					new InternetAddress(m_to));
			msg.setContent(m_text, "text/html");

			Transport.send(msg);
			System.out.println("password sent successfully");
		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

	public void sendIt1(String m_to1, String m_subject1, String m_text1) {
		Properties props = new Properties();
		props.put("mail.smtp.user", d_email);
		props.put("mail.smtp.host", d_host);
		props.put("mail.smtp.port", d_port);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		// props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.socketFactory.port", d_port);
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");

		// SecurityManager security = System.getSecurityManager();

		try {
			Authenticator auth = new SMTPAuthenticator();
			Session session = Session.getInstance(props, auth);
			// session.setDebug(true);
			MimeMessage msg = new MimeMessage(session);
			msg.setText(m_text1);
			msg.setSubject(m_subject1);
			msg.setFrom(new InternetAddress(d_email));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(
					m_to1));
			msg.setContent(m_text1, "text/html");
			Transport.send(msg);
			System.out.println("password sent successfully");
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