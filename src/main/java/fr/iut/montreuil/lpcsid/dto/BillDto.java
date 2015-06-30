package fr.iut.montreuil.lpcsid.dto;

/**
 * Created by NIIRO on 30/06/2015.
 */
public class BillDto {

    //Variables

    private Long idBill;

    private double amount;

    private double taxe;

    private double discount;

    private Long userId;

    private Long requestId;

    private Long paymentId;

    public BillDto(){}

    public BillDto(Long idBill, double amount, double taxe, double discount, Long userId, Long requestId, Long paymentId) {
        this.idBill = idBill;
        this.amount = amount;
        this.taxe = taxe;
        this.discount = discount;
        this.userId = userId;
        this.requestId = requestId;
        this.paymentId = paymentId;
    }
}
