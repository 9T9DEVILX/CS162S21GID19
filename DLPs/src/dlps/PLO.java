/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.security.SecureRandom;

/**
 *
 * @author m_nou
 */
public class PLO {
    ///////////////////////////////////// Attributes ///////////////////////////
    private String Program_ID;
    private String plo_id;
    private String plo_description;

    ///////////////////////////////////// Constructors ///////////////////////////

    PLO (String pro_id, String plo,String program) {
    this.Program_ID = pro_id;
    this.plo_description = plo;
    this.plo_id =  this.id_generator(program);
    }


    ///////////////////////////////////// Getters ///////////////////////////
    public String getPlo_description() {    
        return plo_description;
    }
    public String getProgram_ID()
    {
        return Program_ID;
    }

    public String getPlo_id() {
        return plo_id;
    }
    ///////////////////////////////////// Setters ///////////////////////////

    public void setProgram_ID(String Program_ID) {
        this.Program_ID = Program_ID;
    }

    public void setPlo_id(String plo_id) {
        this.plo_id = plo_id;
    }

    public void setPlo_description(String plo_description) {
        this.plo_description = plo_description;
    }
    
    
    ///////////////////////////////////// Simple Functions ///////////////////////////
    public String id_generator(String id) {
        String chars = "0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        String idd = "";
        idd = idd + "PLO" + this.geneate_short_name(id) + sb;
        return idd;
    }
    
    public String geneate_short_name(String name)
    {
        String a = "";
        String name_short = "";
        String arr[] = name.split(" ");
        for(int i =0 ; i<arr.length;i++)
        {
            a = arr[i];
            name_short = name_short + a.charAt(0);
        }
//        for(int i=0; i < name.length();i++)
//        {
//          if(name.charAt(i)>= 'A' && name.charAt(i) <= 'Z')
//          {
//            name_short = name_short + name.charAt(i);    
//          }
//        }
        
        return name_short.toUpperCase();
    }
    
}
