/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author m_nou
 */
public class TimeTable {
    ///////////////////////////////////// Attributes ///////////////////////////
    private String course_name;
    private List days_LinkedList;
    private List hours_LinkedList;
    private List professor_LinkedList;
    
    ///////////////////////////////////// Getters ///////////////////////////

    public String getCourse_name() {
        return course_name;
    }

    public List getDays_LinkedList() {
        return days_LinkedList;
    }

    public List getHours_LinkedList() {
        return hours_LinkedList;
    }

    public List getProfessor_LinkedList() {
        return professor_LinkedList;
    }
    
    ///////////////////////////////////// setters ///////////////////////////

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setDays_LinkedList(List days_LinkedList) {
        this.days_LinkedList = days_LinkedList;
    }

    public void setHours_LinkedList(List hours_LinkedList) {
        this.hours_LinkedList = hours_LinkedList;
    }

    public void setProfessor_LinkedList(List professor_LinkedList) {
        this.professor_LinkedList = professor_LinkedList;
    }
 
}
