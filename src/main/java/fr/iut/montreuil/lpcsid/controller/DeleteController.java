package fr.iut.montreuil.lpcsid.controller;

import fr.iut.montreuil.lpcsid.entity.RequestEntity;
import fr.iut.montreuil.lpcsid.entity.UserEntity;
import fr.iut.montreuil.lpcsid.repository.RequestRepository;
import fr.iut.montreuil.lpcsid.repository.UserRepository;
import fr.iut.montreuil.lpcsid.service.RequestService;
import fr.iut.montreuil.lpcsid.service.SmtpMailSenderService;
import fr.iut.montreuil.lpcsid.service.UserService;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.util.Date;
import java.util.List;

/**
 * Created by juliana on 24/06/15.
 */
@RestController
@RequestMapping("api/deleteRequest")
public class DeleteController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeleteController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private RequestService requestService;
    @Autowired
    private RequestRepository requestRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SmtpMailSenderService smtpMailSenderService;

    @Autowired
    private Mapper mapper;

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    public
    @ResponseBody
    void deleteRequest(@RequestParam(value = "emailFrom", required = true) String emailFrom,@RequestParam(value = "objectReq", required = true) String object, @RequestParam(value = "commentReq", required = true) String comment, @RequestParam(value = "linkReq", required = true) String link) throws MessagingException {
        UserEntity user = userRepository.findBymail(emailFrom);
        Date date=new Date();
        RequestEntity requestEntity = new RequestEntity(date,link,"la raison","le type",user);
        requestRepository.save(requestEntity);
        smtpMailSenderService.send(emailFrom, "deleteme.lpcsid@gmail.com", "Demande de suppression  no° 11",
                "<h3><i>Expéditeur</i> : </h3> "+ emailFrom+"<br>"  +"<h3><i>Sujet</i> : </h3> "+ object +"<br>"+ " <h3><i>Commentaire </i>: </h3> "+comment+"<br>" +" <h3><i>Lien :</i> </h3> "+ link+"<br>");

    }

    // Récupération des requêtes d'un utilisateur
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<RequestEntity> getRequestByUser(@PathVariable(value = "id") Long userId){
       return requestService.getRequestUser(userId);
    }


}
