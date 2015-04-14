package fr.iut.montreuil.lpcsid.test.dtoTest;

import fr.iut.montreuil.lpcsid.config.DozerConfig;
import fr.iut.montreuil.lpcsid.dto.UserDto;
import fr.iut.montreuil.lpcsid.entity.UserEntity;
import fr.iut.montreuil.lpcsid.service.UserService;
import org.dozer.Mapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * UserDto Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>avr. 14, 2015</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {DozerConfig.class})
public class UserDtoTest {
    @Autowired
    Mapper mapper;
    UserService userService;

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testPojoOnDto() throws Exception {
        Long idUser = 1L;
        String civility = "Mme";
        String lastname = "MER";

        String firstName = "MER";

        String dateOfBirth = " 000000";

        String street = "MERStreet";

        String city = "MERCity";

        String country = "MERCountry";

        String zipCode = "MERCP";

        String mail = "MERMail@";

        String phoneNumber = "MERTel0000";

        String connexionLogin = "mel";

        String password = "mel";

        Date dateCreated = new Date();

        UserEntity userEntity = new UserEntity(idUser, civility, lastname, firstName, dateOfBirth, street, city, country, zipCode, mail, phoneNumber, connexionLogin, password, dateCreated);


        UserDto userDto = mapper.map(userEntity, UserDto.class);

        assertThat(userDto, notNullValue());
        assertThat(userDto.getIdUser(), is(idUser));
        assertThat(userDto.getCivilities(), is(civility));
        assertThat(userDto.getLastname(), is(lastname));
        assertThat(userDto.getFirstName(), is(firstName));
        assertThat(userDto.getDateOfBirth(), is(dateOfBirth));
        assertThat(userDto.getStreet(), is(street));
        assertThat(userDto.getCity(), is(city));
        assertThat(userDto.getCountry(), is(country));
        assertThat(userDto.getZipCode(), is(zipCode));
        assertThat(userDto.getMail(), is(mail));
        assertThat(userDto.getPhoneNumber(), is(phoneNumber));
        assertThat(userDto.getConnexionLogin(), is(connexionLogin));
        assertThat(userDto.getPassword(), is(password));
        assertThat(userDto.getDateCreated(), is(dateCreated));

    }
    @Test
    public void testDtoOnPojo() throws Exception {
        Long idUser = 2L;
        String civility = "Mme";
        String lastname = "MER";

        String firstName = "MER";

        String dateOfBirth = " 000000";

        String street = "MERStreet";

        String city = "MERCity";

        String country = "MERCountry";

        String zipCode = "MERCP";

        String mail = "MERMail@";

        String phoneNumber = "MERTel0000";

        String connexionLogin = "mel";

        String password = "mel";

        Date dateCreated = new Date();

        UserDto userDto = new UserDto(idUser, civility, lastname, firstName, dateOfBirth, street, city, country, zipCode, mail, phoneNumber, connexionLogin, password, dateCreated);


        UserEntity userEntity = mapper.map(userDto, UserEntity.class);

        assertThat(userEntity, notNullValue());
        assertThat(userEntity.getIdUser(), is(idUser));
        assertThat(userEntity.getCivilities(), is(civility));
        assertThat(userEntity.getLastname(), is(lastname));
        assertThat(userEntity.getFirstName(), is(firstName));
        assertThat(userEntity.getDateOfBirth(), is(dateOfBirth));
        assertThat(userEntity.getStreet(), is(street));
        assertThat(userEntity.getCity(), is(city));
        assertThat(userEntity.getCountry(), is(country));
        assertThat(userEntity.getZipCode(), is(zipCode));
        assertThat(userEntity.getMail(), is(mail));
        assertThat(userEntity.getPhoneNumber(), is(phoneNumber));
        assertThat(userEntity.getConnexionLogin(), is(connexionLogin));
        assertThat(userEntity.getPassword(), is(password));
        assertThat(userEntity.getDateCreated(), is(dateCreated));

    }

}


