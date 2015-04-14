package fr.iut.montreuil.lpcsid.controller;

import fr.iut.montreuil.lpcsid.entity.UserEntity;
import fr.iut.montreuil.lpcsid.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by on 09/04/2015.
 */
@RestController
@RequestMapping("api/connexion")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    public
    @ResponseBody
    String userConnexion(@RequestParam(value = "connexionLogin", required = true) String connexionLogin, @RequestParam(value = "password", required = true) String connexionPassword) {

        String login = connexionLogin;
        String password = connexionPassword;

        LOGGER.info("Password {}", password);
        LOGGER.info("Login {}", login);


        Boolean connect = false;
        UserEntity userConnexion = null;
        Iterable<UserEntity> users = userService.getAllUsers();


        for (UserEntity user : users) {
            //  LOGGER.info("login {}", user.getConnexionLogin().toString())test;
            if (user.getConnexionLogin().equals(login)) {

                LOGGER.info("un user trouver avec le login {}", login);
                LOGGER.info("son id est {}", user.getIdUser());

                if (user.getPassword().equals(password)) {
                    LOGGER.info("un user trouver avec le password{}", password);
                    LOGGER.info("son id est {}", user.getIdUser());
                    connect = true;
                    Long idCustomReturn = user.getIdUser();
                    userConnexion = userService.getUserById(idCustomReturn);
                    LOGGER.info("Connecté {}", connect);
                } else {
                    LOGGER.info("Pas connecté {}", connect);
                }
                return "Vous êtes bien connecté";
            }else {
                LOGGER.info("Pas connecté, le Password ou MDP est erroné {}", connect);
                return "La connexion à échoué vérifier votre identifiant et mot de passe";

            }

        }
        return "";
    }


}
