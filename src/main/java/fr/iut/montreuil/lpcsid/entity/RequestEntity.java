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

    @Column(nullable = false)
    @OneToOne
    private long UserId;

    @Column(nullable = false)
    @OneToOne
    private long WebsiteId;

    public RequestEntity(){}

    public RequestEntity(Long idRequest, Date date, String link, String reason, String type, long userId, long websiteId) {
        this.idRequest = idRequest;
        this.date = date;
        this.link = link;
        this.reason = reason;
        this.type = type;
        UserId = userId;
        WebsiteId = websiteId;
    }
}
