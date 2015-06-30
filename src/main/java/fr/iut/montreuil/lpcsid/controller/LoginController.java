package fr.iut.montreuil.lpcsid.controller;

import fr.iut.montreuil.lpcsid.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by juliana on 09/05/2015.
 */
@RestController
@RequestMapping("api/connexion")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody Long userConnexion(@RequestParam(value = "connexionLogin", required = true) String connexionLogin, @RequestParam(value = "connexionPassword", required = true) String connexionPassword) {
        return loginService.userConnexion(connexionLogin,connexionPassword);
    }

}
