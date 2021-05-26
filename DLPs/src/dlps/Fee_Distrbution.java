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
public class Fee_Distrbution {
    ///////////////////////////////////// Attributes ///////////////////////////
    
    private String type_name;
    private String type_amount;
    
    ///////////////////////////////////// Getters ///////////////////////////

    public String getType_name() {
        return type_name;
    }

    public String getType_amount() {
        return type_amount;
    }
    
    ///////////////////////////////////// Setters ///////////////////////////

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public void setType_amount(String type_amount) {
        this.type_amount = type_amount;
    }
    
}
