package fr.iut.montreuil.lpcsid.controller;

import fr.iut.montreuil.lpcsid.entity.CustomerEntity;
import fr.iut.montreuil.lpcsid.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Mélina on 07/03/2015.
 */

@RestController

/*Il est annoté avec RestController .
La différence entre cela et Controller annotation est l'ancien implique également ResponseBody sur chaque méthode,
ce qui signifie qu'il ya moins d'écrire puisque depuis un service Web RESTFUL nous retournons objets JSON de toute façon.
*/


@RequestMapping("api/customer")
public class CustomerController {


    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private CustomerService customerService;

    // GET /customers: Récupération de la liste des utilisateurs
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public  @ResponseBody Iterable<CustomerEntity> list(){
        final Iterable<CustomerEntity> customerEntities = this.customerService.getAllCustomers();
        LOGGER.info("List customer is {}", customerEntities);
        return customerEntities;
    }


    // GET /accountId : Récupération d'un compte par son ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody CustomerEntity getById(@PathVariable long id){
        CustomerEntity customerEntity = customerService.getCustomerById(id);
        LOGGER.info("Customer id is {}, return.", customerEntity);
        return  customerEntity;
    }

    // POST/{id}: crée un compte pour le client
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerEntity createCustomer(@RequestParam(value = "customerCiv", required = false) String customerCiv, @RequestParam(value = "customerLastName", required = true) String customerLastName, @RequestParam(value = "customerFirstName", required = true) String customerFirstName, @RequestParam(value = "customerLogin", required = true) String customerLogin, @RequestParam(value = "customerPassword", required = true) String customerPassword, @RequestParam(value = "customerDateBirth", required = true) String customerDateBirth, @RequestParam(value = "customerMail", required = true) String customerMail, @RequestParam(value = "customerPhone", required = true) String customerPhone, @RequestParam(value = "customerAdresse", required = true) String customerAdresse, @RequestParam(value = "customerVille", required = true) String customerVille, @RequestParam(value = "customerPays", required = true) String customerPays, @RequestParam(value = "customerCP", required = true) String customerCP) {

        Date customerDate = new Date();
        CustomerEntity customerEntity = new CustomerEntity(customerCiv, customerLastName, customerFirstName, customerDateBirth, customerAdresse, customerVille, customerPays, customerCP, customerMail, customerPhone, customerLogin, customerPassword, customerDate);
        LOGGER.info("Customer Creating id is{}, persisting.", customerEntity.getIdCustomer());

        customerService.saveCustomer(customerEntity);
        return customerEntity;
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
    public void deleteCustomer(@PathVariable long id){customerService.deleteCustomer(id);
    }
}
