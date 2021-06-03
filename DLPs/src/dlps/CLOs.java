/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m_nou
 */
public class CLOs {
    ///////////////////////////////////// Attributes ///////////////////////////
     private String clos;
    private String clo_ID;
    private List<Rubrics> rubric_list;

    public CLOs(String clo) {
           this.clos = clo;
           this.clo_ID = id_generator();
           this.rubric_list = new ArrayList<>();
    }

    
    
    
    ///////////////////////////////////// Getters ///////////////////////////
    public String getClos() {
        return clos;
    }

    public String getClo_ID() {
        return clo_ID;
    }

    public List<Rubrics> getRubric_list() {
        return rubric_list;
    }

    
    ///////////////////////////////////// Setters ///////////////////////////
    
    public void setClos(String clos) {
        this.clos = clos;
    }

    public void setClo_ID(String clo_ID) {
        this.clo_ID = clo_ID;
    }

    public void setRubric_list(List<Rubrics> rubric_list) {
        this.rubric_list = rubric_list;
    }
    
    ///////////////////////////////////// Simple Functions ///////////////////////////
    public String id_generator()
    {
        String chars = "0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
         for (int i = 0; i < 4; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        String idd = "";
        idd = idd + "CLO"  + sb;
        return idd;
    }
    
}
