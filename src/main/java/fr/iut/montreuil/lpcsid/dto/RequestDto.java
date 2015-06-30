package fr.iut.montreuil.lpcsid.dto;

import java.util.Date;

/**
 * Created by NIIRO on 30/06/2015.
 */
public class RequestDto {

    //Variables

    private Long idRequest;

    private Date date;

    private String link;

    private String reason;

    private String type;

    private long UserId;

    private long WebsiteId;

    public RequestDto(){}

    public RequestDto(Long idRequest, Date date, String link, String reason, String type, long userId, long websiteId) {
        this.idRequest = idRequest;
        this.date = date;
        this.link = link;
        this.reason = reason;
        this.type = type;
        UserId = userId;
        WebsiteId = websiteId;
    }
}
