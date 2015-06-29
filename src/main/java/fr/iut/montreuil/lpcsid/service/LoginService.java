package fr.iut.montreuil.lpcsid.service;

import fr.iut.montreuil.lpcsid.entity.UserEntity;
import fr.iut.montreuil.lpcsid.repository.UserRepository;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by juliana on 12/04/15.
 */
@Service
@Transactional
@Component
public class LoginService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Mapper mapper;

    public String userConnexion( String connexionLogin, String connexionPassword) {

        String login = connexionLogin;
        String password = connexionPassword;

        LOGGER.info("Password {}", password);
        LOGGER.info("Login {}", login);

        Boolean connect = false;
        UserEntity customerConnexion = null;
        UserEntity customer = userRepository.findByconnexionLogin(login);
        if (customer != null) {
            LOGGER.info("un customer trouver avec le login {}", login);
            LOGGER.info("son id est {}", customer.getIdUser());

            if (customer.getPassword().equals(password)) {
                LOGGER.info("un customer trouver avec le password{}", password);
                LOGGER.info("son id est {}", customer.getIdUser());
                connect = true;
                Long idCustomReturn = customer.getIdUser();
                customerConnexion = userRepository.findOne(idCustomReturn);
                LOGGER.info("Connecté {}", connect);
            } else {
                LOGGER.info("Pas connecté {}", connect);
            }
            return "Vous êtes bien connecté";
        }else {
            LOGGER.info("aucun customer avec ce login {}", login);
            LOGGER.info("Pas connecté, le Password ou MDP est erroné {}", connect);
            return "La connexion à échoué vérifier votre identifiant et mot de passe";
        }
    }
}
