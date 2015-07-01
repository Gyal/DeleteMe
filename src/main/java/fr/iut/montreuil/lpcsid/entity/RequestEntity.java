package fr.iut.montreuil.lpcsid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by NIIRO on 30/06/2015.
 */
@Entity
@Table(name = "request")
@Data
@AllArgsConstructor
public class RequestEntity {

    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "request_id")
    private Long idRequest;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private String link;

    @Column(nullable = false)
    private String reason;

    @Column(nullable = false)
    private String type;


    @ManyToOne
    private UserEntity userEntity;

    @ManyToOne
    private WebsiteEntity websiteEntity;

    public RequestEntity(){}

    public RequestEntity(Date date, String link, String reason, String type, UserEntity userEntity) {
        this.date=date;
        this.link=link;
        this.reason=reason;
        this.type=type;
        this.userEntity=userEntity;
    }
}
