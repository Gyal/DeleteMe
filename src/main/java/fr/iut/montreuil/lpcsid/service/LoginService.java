package fr.iut.montreuil.lpcsid.service;

import fr.iut.montreuil.lpcsid.entity.UserEntity;
import fr.iut.montreuil.lpcsid.repository.UserRepository;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mélina on 30/06/2015.
 */
@Service
@Transactional
public class LoginService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Mapper mapper;

    public Long userConnexion(String connexionLogin, String connexionPassword) {

        String login = connexionLogin;
        String password = connexionPassword;

        LOGGER.info("Password {}", password);
        LOGGER.info("Login {}", login);

        Boolean connect = false;
        UserEntity userConnexion = null;
        UserEntity customer = userRepository.findByconnexionLogin(login);
        //  LOGGER.info("login {}", customer.getConnexionLogin().toString());
        if (customer != null) {
            LOGGER.info("un user trouver avec le login {}", login);
            LOGGER.info("son id est {}", customer.getIdUser());

            if (customer.getPassword().equals(password)) {
                LOGGER.info("un user trouver avec le password{}", password);
                LOGGER.info("son id est {}", customer.getIdUser());
                connect = true;
                Long idCustomReturn = customer.getIdUser();
                userConnexion = userRepository.findOne(idCustomReturn);
                LOGGER.info("Connecté {}", connect);
            } else {
                LOGGER.info("Pas connecté {}", connect);
            }
        }else {
            LOGGER.info("aucun user avec ce login {}", login);
        }

        return userConnexion.getIdUser();
    }

}
