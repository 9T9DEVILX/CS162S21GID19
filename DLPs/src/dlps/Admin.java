/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author m_nou
 */
public class Admin extends Person {
    ///////////////////////////////////// Attributes ///////////////////////////
    private String admin_ID;
    private String admin_password;
    private Queue<String> reqs_For_SchoQueue = new LinkedList<>();
    private Queue<String> reqs_For_hostelsQueue = new LinkedList<>();
    private static Admin admin;
    
    ///////////////////////////////////// Singlaton Constructors ///////////////////////////
    public Admin()
    { 
       
    }
    
    public static Admin admin_instance()
    {
       if(admin == null)
       {
           admin = new Admin();
       }
       return admin;
    }
  ///////////////////////////////////// Getters ///////////////////////////

    public String getAdmin_ID() {
        return admin_ID;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public Queue<String> getReqs_For_SchoQueue() {
        return reqs_For_SchoQueue;
    }

    public Queue<String> getReqs_For_hostelsQueue() {
        return reqs_For_hostelsQueue;
    }
    
    ///////////////////////////////////// Setters ///////////////////////////

    public void setAdmin_ID(String admin_ID) {
        this.admin_ID = admin_ID;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public void setReqs_For_SchoQueue(Queue<String> reqs_For_SchoQueue) {
        this.reqs_For_SchoQueue = reqs_For_SchoQueue;
    }

    public void setReqs_For_hostelsQueue(Queue<String> reqs_For_hostelsQueue) {
        this.reqs_For_hostelsQueue = reqs_For_hostelsQueue;
    }
    
    ///////////////////////////////////// OverLoad Functions ///////////////////////////
   
    //This Function will Tell wheather what kind of Person's Profile it is.
    @Override
    public String getType()
    {
        return "Admin";
    }
}
