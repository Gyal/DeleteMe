package fr.iut.montreuil.lpcsid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by NIIRO on 30/06/2015.
 */

@Entity
@Table(name = "payment")
@Data
@AllArgsConstructor
public class PaymentEntity {

    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_id")
    private Long idPayment;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private double discount;

    @Column(nullable = false)
    @OneToOne
    private long UserId;

    @Column(nullable = false)
    @OneToOne
    private long requestId;

    public PaymentEntity(){}

    public PaymentEntity(Long idPayment, String status, double amount, Date date, double discount, long userId, long requestId) {
        this.idPayment = idPayment;
        this.status = status;
        this.amount = amount;
        this.date = date;
        this.discount = discount;
        UserId = userId;
        this.requestId = requestId;
    }
}
