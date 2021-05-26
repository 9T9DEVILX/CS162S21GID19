/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author m_nou
 */
public class FEE {
    ///////////////////////////////////// Attributes ///////////////////////////
    private String fee_amount;
    private String fee_ID;
    private Boolean payment;
    private List<Fee_Distrbution> Fee_distributionLinkedList;
    
    ///////////////////////////////////// Getters ///////////////////////////

    public String getFee_amount() {
        return fee_amount;
    }

    public String getFee_ID() {
        return fee_ID;
    }

    public Boolean getPayment() {
        return payment;
    }

    public List<Fee_Distrbution> getFee_distributionLinkedList() {
        return Fee_distributionLinkedList;
    }
    
    ///////////////////////////////////// Setters ///////////////////////////

    public void setFee_amount(String fee_amount) {
        this.fee_amount = fee_amount;
    }

    public void setFee_ID(String fee_ID) {
        this.fee_ID = fee_ID;
    }

    public void setPayment(Boolean payment) {
        this.payment = payment;
    }

    public void setFee_distributionLinkedList(List<Fee_Distrbution> Fee_distributionLinkedList) {
        this.Fee_distributionLinkedList = Fee_distributionLinkedList;
    }
    
}
