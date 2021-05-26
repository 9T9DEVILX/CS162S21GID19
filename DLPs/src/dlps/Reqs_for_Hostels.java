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
public class Reqs_for_Hostels {
        ///////////////////////////////////// Attributes///////////////////////////
    private String hostel_Type;
    private String app_ID;
    private String Status;
    
        ///////////////////////////////////// Getters ///////////////////////////

    public String getHostel_Type() {
        return hostel_Type;
    }

    public String getApp_ID() {
        return app_ID;
    }

    public String getStatus() {
        return Status;
    }

        ///////////////////////////////////// Setters ///////////////////////////

    public void setHostel_Type(String hostel_Type) {
        this.hostel_Type = hostel_Type;
    }

    public void setApp_ID(String app_ID) {
        this.app_ID = app_ID;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
