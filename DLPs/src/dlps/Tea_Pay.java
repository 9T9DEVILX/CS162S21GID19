/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

/**
 *
 * @author m_nou
 */
public class Tea_Pay {
    ///////////////////////////////////// Attributes ///////////////////////////
    private String pay_amount;
    private String trans_detail;
    
    ///////////////////////////////////// Getters ///////////////////////////

    public String getPay_amount() {
        return pay_amount;
    }

    public String getTrans_detail() {
        return trans_detail;
    }
    
    ///////////////////////////////////// Setters ///////////////////////////

    public void setPay_amount(String pay_amount) {
        this.pay_amount = pay_amount;
    }

    public void setTrans_detail(String trans_detail) {
        this.trans_detail = trans_detail;
    }
    
}
