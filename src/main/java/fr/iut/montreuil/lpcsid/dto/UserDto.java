package fr.iut.montreuil.lpcsid.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by youniik-nana on 14/04/15.
 */
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

    public static UserDto newUserDto(){
        return newUserDto();
    }

    // Par l'utilisateur

    public UserDto(String civilities, String lastname, String firstName, String dateOfBirth, String street, String city, String country, String zipCode, String mail, String phoneNumber, String connexionLogin, String password, Date dateCreated) {
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

    public UserDto(Long idUser, String civilities, String lastname, String firstName, String dateOfBirth, String street, String city, String country, String zipCode, String mail, String phoneNumber, String connexionLogin, String password) {
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
