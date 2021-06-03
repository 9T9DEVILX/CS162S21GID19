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
public class Rubrics {
   ///////////////////////////////////// Attributes ///////////////////////////
     private Rubric_Level levels;
   private String name;
   private String rubric_ID;

    public Rubrics(String name) {
        this.name = name;
        this.rubric_ID = this.id_generator();
        this.levels = null;
    }

   
   ///////////////////////////////////// Getters ///////////////////////////
    public Rubric_Level getLevels() {
        return levels;
    }

    public String getName() {
        return name;
    }

    public String getRubric_ID() {
        return rubric_ID;
    }

    ///////////////////////////////////// Setters ///////////////////////////
    public void setLevels(Rubric_Level levels) {
        this.levels = levels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRubric_ID(String rubric_ID) {
        this.rubric_ID = rubric_ID;
    }
   
     ///////////////////////////////////// Simple Functions ///////////////////////////
    public String id_generator()
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
        idd = idd + "RUB"  + sb;
        return idd;
    }
     
}
