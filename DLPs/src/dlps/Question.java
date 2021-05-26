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
public class Question {
    ///////////////////////////////////// Attributes ///////////////////////////
    private String ques_name;
    private String quest_id;
    private String ques_total_marks;
    private String clo_associated;
    private String ruric_associated;
    private String obtained_marks;

    ///////////////////////////////////// Getters ///////////////////////////
    public String getQues_name() {
        return ques_name;
    }

    public String getQuest_id() {
        return quest_id;
    }

    public String getQues_total_marks() {
        return ques_total_marks;
    }

    public String getClo_associated() {
        return clo_associated;
    }

    public String getRuric_associated() {
        return ruric_associated;
    }

    public String getObtained_marks() {
        return obtained_marks;
    }

    ///////////////////////////////////// Setters ///////////////////////////
    public void setQues_name(String ques_name) {
        this.ques_name = ques_name;
    }

    public void setQuest_id(String quest_id) {
        this.quest_id = quest_id;
    }

    public void setQues_total_marks(String ques_total_marks) {
        this.ques_total_marks = ques_total_marks;
    }

    public void setClo_associated(String clo_associated) {
        this.clo_associated = clo_associated;
    }

    public void setRuric_associated(String ruric_associated) {
        this.ruric_associated = ruric_associated;
    }

    public void setObtained_marks(String obtained_marks) {
        this.obtained_marks = obtained_marks;
    }
    
    ///////////////////////////////////// Simple Functions ///////////////////////////
    public String id_generator() {
        String chars = "0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        String idd = "";
        idd = idd + "QUE" + sb;
        return idd;
    }
    
}
