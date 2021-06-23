/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.util.List;

/**
 *
 * @author Hamad DEVIL
 */
public class TimeTablComponents {
    
    ///////////Attributes//////////////
    private  Courses timetable_course ;
    private  String timetable_time;
    
    ///////////getter////////////
    
    
    public Courses get_timetable_course(){
        return timetable_course;
    }
    public String get_timetable_time(){
        return timetable_time;
    }
    ///////////setter///////////////////
    
    
    public void set_timetable_course(Courses s )
    {
        this.timetable_course= s;
    }
    public void set_timetable_time(String time )
    {
         this.timetable_time=time;
    }
    
    ////////////constructors///////////////
    public TimeTablComponents(){
        //default constructors
    }
    public TimeTablComponents( String time , Courses s)
    {
        this.timetable_course= s;
        this.timetable_time= time;
    }
}
