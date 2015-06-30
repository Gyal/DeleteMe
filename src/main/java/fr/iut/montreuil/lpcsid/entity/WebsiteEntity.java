package fr.iut.montreuil.lpcsid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by NIIRO on 30/06/2015.
 */
@Entity
@Table(name = "website")
@Data
@AllArgsConstructor
public class WebsiteEntity {
    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "website_id")
    private Long idWebsite;

    @Column(nullable = false)
    private String siteName;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Date onlinesince;

    @Column(nullable = false)
    private String ownerName;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false)
    private boolean adultContent;

    @Column(nullable = false)
    private String adress;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;

    public WebsiteEntity(){}

    public WebsiteEntity(Long idWebsite, String country, String siteName, String description, Date onlinesince, String ownerName, String mail, boolean adultContent, String adress, String phone, String language, String city) {
        this.idWebsite = idWebsite;
        this.country = country;
        this.siteName = siteName;
        this.description = description;
        this.onlinesince = onlinesince;
        this.ownerName = ownerName;
        this.mail = mail;
        this.adultContent = adultContent;
        this.adress = adress;
        this.phone = phone;
        this.language = language;
        this.city = city;
    }
}
