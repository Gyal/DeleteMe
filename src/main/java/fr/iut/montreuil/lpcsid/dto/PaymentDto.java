package fr.iut.montreuil.lpcsid.dto;

import java.util.Date;

/**
 * Created by NIIRO on 30/06/2015.
 */
public class PaymentDto {

    //Variables
    private Long idPayment;

    private String status;

    private double amount;

    private Date date;

    private double discount;

    private long UserId;

    private long requestId;

    public PaymentDto(){}

    public PaymentDto(long requestId, Long idPayment, String status, double amount, Date date, double discount, long userId) {
        this.requestId = requestId;
        this.idPayment = idPayment;
        this.status = status;
        this.amount = amount;
        this.date = date;
        this.discount = discount;
        UserId = userId;
    }
}
