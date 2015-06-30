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

    @ManyToOne
    private PaymentEntity paymentEntity;

    public BillEntity(){}


}
