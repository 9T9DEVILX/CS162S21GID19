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
public class Rubric_Level {
    
    /////////////////////////////////////Attributes///////////////////////////
   private String poor_level;
   private String average_level;
   private String good_level;
   private String excellent_level;

   /////////////////////////////////////Getters///////////////////////////
    public String getPoor_level() {
        return poor_level;
    }

    public String getAverage_level() {
        return average_level;
    }

    public String getGood_level() {
        return good_level;
    }

    public String getExcellent_level() {
        return excellent_level;
    }

    /////////////////////////////////////Setters///////////////////////////
    public void setPoor_level(String poor_level) {
        this.poor_level = poor_level;
    }

    public void setAverage_level(String average_level) {
        this.average_level = average_level;
    }

    public void setGood_level(String good_level) {
        this.good_level = good_level;
    }

    public void setExcellent_level(String excellent_level) {
        this.excellent_level = excellent_level;
    }
   
   
}
