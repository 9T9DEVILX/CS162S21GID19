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

    ////////////////////Atrributs////////////////
    private List < Program > timetable_program_ids;
    private List < List <TimeTablComponents>> timetable_components;
    
    ////////////////Getters///////////////////
    
    public List get_timetable_program_ids(){
        return this.timetable_program_ids;
    }
    public List get_timetable_components(){
        return this.timetable_components;
    }
    
    //////////////Setters/////////////////////

    public void setTimetable_program_ids(List<Program> timetable_program_ids) {
        this.timetable_program_ids = timetable_program_ids;
    }

    public void setTimetable_components(List<List<TimeTablComponents>> timetable_components) {
        this.timetable_components = timetable_components;
    }

    
   
}
