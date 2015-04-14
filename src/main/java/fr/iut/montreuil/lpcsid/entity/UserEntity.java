package fr.iut.montreuil.lpcsid.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created on  20/03/2015.
 */

@Entity
@Table(name = "user")
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


    public UserEntity(){

    }

    // Par l'utilisateur

    public UserEntity(String civilities, String lastname, String firstName, String dateOfBirth, String street, String city, String country, String zipCode, String mail, String phoneNumber, String connexionLogin, String password, Date dateCreated) {
        this.civilities = civilities;
        this.lastname = lastname;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.connexionLogin = connexionLogin;
        this.password = password;
        this.dateCreated = dateCreated;

    }

    public UserEntity(Long idUser, String civilities, String lastname, String firstName, String dateOfBirth, String street, String city, String country, String zipCode, String mail, String phoneNumber, String connexionLogin, String password) {
        this.idUser = idUser;
        this.civilities = civilities;
        this.lastname = lastname;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.connexionLogin = connexionLogin;
        this.password = password;
    }

    //getter & setters
    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long id) {
        this.idUser = id;
    }

    public String getName() {
        return lastname;
    }
    public void setName(String name) {
        this.lastname = name;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateBirthDay) {
        this.dateOfBirth = dateBirthDay;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String ville) {
        this.city = ville;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCivilities() {
        return civilities;
    }
    public void setCivilities(String civilities) {
        this.civilities = civilities;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }


    public String getConnexionLogin() {
        return connexionLogin;
    }

    public void setConnexionLogin(String connexionLogin) {
        this.connexionLogin = connexionLogin;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

}

