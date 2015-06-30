package fr.iut.montreuil.lpcsid.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * Created by NIIRO on 30/06/2015.
 */
@Data
@AllArgsConstructor
public class WebsiteDto {

    private Long idWebsite;

    private String siteName;

    private String description;

    private Date onlinesince;

    private String ownerName;

    private String mail;

    private boolean adultContent;

    private String adress;

    private String phone;

    private String language;

    private String city;

    private String country;

    public WebsiteDto(){}

    public WebsiteDto(Long idWebsite, String siteName, Date onlinesince, String phone, String mail, String ownerName, String description, boolean adultContent, String adress, String language, String city, String country) {
        this.idWebsite = idWebsite;
        this.siteName = siteName;
        this.onlinesince = onlinesince;
        this.phone = phone;
        this.mail = mail;
        this.ownerName = ownerName;
        this.description = description;
        this.adultContent = adultContent;
        this.adress = adress;
        this.language = language;
        this.city = city;
        this.country = country;
    }
}
