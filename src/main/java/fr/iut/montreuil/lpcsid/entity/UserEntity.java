package fr.iut.montreuil.lpcsid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created on  20/03/2015.
 */

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
public class UserEntity implements Serializable {

    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long idUser;

    @Column(nullable = false)
    private String civilities;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String dateOfBirth;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String zipCode;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String connexionLogin;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Date dateCreated;


    public UserEntity(){}
}

