/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

//import dlps.Question;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m_nou
 */
public class Assignments {
    ///////////////////////////////////// Attributes ///////////////////////////
     private String assign_name;
    private String assign_ID;
    private List<Question> assign_question;

     Assignments(String assName,String cour)
     {
         this.assign_name = assName;
         this.assign_ID = this.id_generator(cour);
         this.assign_question = new ArrayList<>();
     }

    Assignments() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ///////////////////////////////////// Getters ///////////////////////////
    public String getAssign_name() {
        return assign_name;
    }

    public String getAssign_ID() {
        return assign_ID;
    }

    public List<Question> getAssign_question() {
        return assign_question;
    }

    ///////////////////////////////////// Setters ///////////////////////////
    public void setAssign_name(String assign_name) {
        this.assign_name = assign_name;
    }

    public void setAssign_ID(String assign_ID) {
        this.assign_ID = assign_ID;
    }

    public void setAssign_question(List<Question> assign_question) {
        this.assign_question = assign_question;
    }
    
    ///////////////////////////////////// Simple Functions ///////////////////////////
     public String id_generator(String id)
    {
        String chars = "0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
         for (int i = 0; i < 3; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        String idd = "";
        idd = idd + "ASS" + this.geneate_short_name(id) + sb;
        System.out.println(idd);
        return idd;
    }
      public String geneate_short_name(String name)
    {
        String name_short = "";
        for(int i=0; i < name.length();i++)
        {
          if(name.charAt(i)>= 'A' && name.charAt(i) <= 'Z')
          {
            name_short = name_short + name.charAt(i);    
          }
        }
        
        return name_short.toUpperCase();
    }
    
}
