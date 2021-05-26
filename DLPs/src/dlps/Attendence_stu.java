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
public class Attendence_stu {
    ///////////////////////////////////// Attributes ///////////////////////////
        private String attendence_Status;
    private String course_code;
    
    ///////////////////////////////////// Getters ///////////////////////////

    public String getAttendence_Status() {
        return attendence_Status;
    }

    public String getCourse_code() {
        return course_code;
    }
    
    ///////////////////////////////////// Setters ///////////////////////////

    public void setAttendence_Status(String attendence_Status) {
        this.attendence_Status = attendence_Status;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }
    
}

