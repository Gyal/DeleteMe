package fr.iut.montreuil.lpcsid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by NIIRO on 30/06/2015.
 */
@Entity
@Table(name = "bill")
@Data
@AllArgsConstructor
public class BillEntity {

    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bill_id")
    private Long idBill;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private double taxe;

    @Column(nullable = false)
    private double discount;

    @Column(nullable = false)
    @OneToOne
    private Long userId;

    @Column(nullable = false)
    @OneToOne
    private Long requestId;

    @Column(nullable = false)
    @OneToOne
    private Long paymentId;

    public BillEntity(){}

    public BillEntity(Long idBill, double amount, double taxe, double discount, Long userId, Long requestId, Long paymentId) {
        this.idBill = idBill;
        this.amount = amount;
        this.taxe = taxe;
        this.discount = discount;
        this.userId = userId;
        this.requestId = requestId;
        this.paymentId = paymentId;
    }
}
