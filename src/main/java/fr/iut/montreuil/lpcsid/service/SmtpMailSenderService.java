package fr.iut.montreuil.lpcsid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


@Component
@Service
@Transactional
public class SmtpMailSenderService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void send(String from, String to, String subject, String body) throws MessagingException {
		
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		
		helper = new MimeMessageHelper(message, true); // true indicates

        helper.setFrom(from);											   // multipart message
		helper.setSubject(subject);
		helper.setTo(to);
        // use the true flag to indicate the text included is HTML
		helper.setText("<html><body>"+body+"</body></html>", true); // true indicates html
		// continue using helper object for more functionalities like adding attachments, etc.  
		
		javaMailSender.send(message);
		
		
	}

}
