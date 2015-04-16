package fr.iut.montreuil.lpcsid.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * Created by juliana on 14/04/15.
 */

@Data
@AllArgsConstructor
public class UserDto {

    //Variables
    private Long idUser;

    private String civilities;

    private String lastname;

    private String firstName;

    private String dateOfBirth;

    private String street;

    private String city;

    private String country;

    private String zipCode;

    private String mail;

    private String phoneNumber;

    private String connexionLogin;

    private String password;

    private Date dateCreated;

    public UserDto(){

    }


}
