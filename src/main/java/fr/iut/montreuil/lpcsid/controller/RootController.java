package fr.iut.montreuil.lpcsid.controller;

import fr.iut.montreuil.lpcsid.service.SmtpMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class RootController {
	
	@Autowired
	private SmtpMailSender smtpMailSender;

	@RequestMapping("/send-mail")
	public void sendMail() throws MessagingException {
		
		smtpMailSender.send("deleteme.lpcsid@gmail.com","deleteme.lpcsid@gmail.com", "Test mail from Spring", "HELOOOO");

	}
	

}
