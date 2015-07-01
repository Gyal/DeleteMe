package fr.iut.montreuil.lpcsid.controller;

import fr.iut.montreuil.lpcsid.service.SmtpMailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class RootController {
	
	@Autowired
	private SmtpMailSenderService smtpMailSenderService;

	@RequestMapping("/send-mail")
	public void sendMail() throws MessagingException {
		
		smtpMailSenderService.send("deleteme.lpcsid@gmail.com","deleteme.lpcsid@gmail.com", "Test mail from Spring", "HELOOOO");

	}
	

}
