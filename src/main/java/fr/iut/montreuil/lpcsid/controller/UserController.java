package fr.iut.montreuil.lpcsid.controller;

import fr.iut.montreuil.lpcsid.dto.UserDto;
import fr.iut.montreuil.lpcsid.entity.UserEntity;
import fr.iut.montreuil.lpcsid.service.UserService;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

/**
 * Created on 07/03/2015.
 */

@RestController

/*Il est annoté avec RestController .
La différence entre cela et Controller annotation est l'ancien implique également ResponseBody sur chaque méthode,
ce qui signifie qu'il ya moins d'écrire puisque depuis un service Web RESTFUL nous retournons objets JSON de toute façon.
*/


@RequestMapping("api/user")
public class UserController {


    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private Mapper mapper;

    // GET /customers: Récupération de la liste des utilisateurs
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public  @ResponseBody Iterable<UserDto> list(){
        Iterable<UserEntity> userEntities = this.userService.getAllUsers();
        LOGGER.info("List user is {}", userEntities);
        List<UserDto> userDtos = newArrayList();
        mapper.map(userEntities, userDtos);
        return userDtos;
    }


    // GET /accountId : Récupération d'un compte par son ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody
    UserEntity getById(@PathVariable long id){
        UserEntity userEntity = userService.getUserById(id);
        LOGGER.info("user id is {}, return.", userEntity);
        return userEntity;
    }

    // POST/{id}: crée un compte pour le client
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity createUser(@RequestParam(value = "userCiv", required = false) String userCiv, @RequestParam(value = "userLastName", required = true) String userLastName, @RequestParam(value = "userFirstName", required = true) String userFirstName, @RequestParam(value = "userLogin", required = true) String userLogin, @RequestParam(value = "userPassword", required = true) String userPassword, @RequestParam(value = "userDateBirth", required = true) String userDateBirth, @RequestParam(value = "userMail", required = true) String userMail, @RequestParam(value = "userPhone", required = true) String userPhone, @RequestParam(value = "userAdresse", required = true) String userAdresse, @RequestParam(value = "userVille", required = true) String userVille, @RequestParam(value = "userPays", required = true) String userPays, @RequestParam(value = "userCP", required = true) String userCP) {

        Date userDate = new Date();
        UserEntity userEntity = new UserEntity(userCiv, userLastName, userFirstName, userDateBirth, userAdresse, userVille, userPays, userCP, userMail, userPhone, userLogin, userPassword, userDate);
        LOGGER.info("user Creating id is{}, persisting.", userEntity.getIdUser());

        userService.saveUser(userEntity);
        return userEntity;
    }
    /*CustomerDto customerDto = mapper.map(customerEntity, CustomerDto.class);

  CustomerEntity savedCustomer;




  try {
      //savedCustomer = customerService.saveCustomer(customerEntity);
      LOGGER.info("Customer Creating id is{}, persisting.", customerEntity.getIdCustomer());
  } catch (DataIntegrityViolationException e) {
      throw new DataIntegrityException(WRONG_ENTITY_INFORMATION);
  }
  return mapper.map(savedCustomer, CustomerDto.class);
}
*/
    // Supression d'un utilisateur
    @RequestMapping(value = "/{customer-id", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }
}
