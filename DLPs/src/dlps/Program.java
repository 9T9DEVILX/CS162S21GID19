/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m_nou
 */
public class Program {
    ///////////////////////////////////// Attributes ///////////////////////////
    private String program_Name;
    private String program_id;
    private List<Courses> courses_ArrayList;
    private List<Courses> plo_ArrayList;
    private List<TimeTable> time_table_ArrayList;
    
    ///////////////////////////////////// Setters ///////////////////////////

    public void setProgram_Name(String program_Name) {
        this.program_Name = program_Name;
    }

    public void setProgram_id(String program_id) {
        this.program_id = program_id;
    }

    public void setCourses_ArrayList(List<Courses> courses_ArrayList) {
        this.courses_ArrayList = courses_ArrayList;
    }

    public void setPlo_ArrayList(List<Courses> plo_ArrayList) {
        this.plo_ArrayList = plo_ArrayList;
    }

    public void setTime_table_ArrayList(List<TimeTable> time_table_ArrayList) {
        this.time_table_ArrayList = time_table_ArrayList;
    }
    
    ///////////////////////////////////// Getters ///////////////////////////

    public String getProgram_Name() {
        return program_Name;
    }

    public String getProgram_id() {
        return program_id;
    }

    public List<Courses> getCourses_ArrayList() {
        return courses_ArrayList;
    }

    public List<Courses> getPlo_ArrayList() {
        return plo_ArrayList;
    }

    public List<TimeTable> getTime_table_ArrayList() {
        return time_table_ArrayList;
    }
     
        ///////////////////////////////////// Validators Function ///////////////////////////
    
    //This will validate name with alphabets and space. No integers or special charactors are allowed in Name.
    static boolean validate_course_name(String name) {
        boolean flag = true;

        for (int i = 0; i < name.length(); i++) {
            if (!((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) == ' '))) {
                flag = false;
                break;
            }

        }

        return flag;
    }
    
    //This will Validate Course ID in form "CS123".
     static boolean validate_courseID(String courseId)
     {
          int x = courseId.length();
    boolean flag = true;
    if (x == 5)
    {
      
      for (int i = 0; i < 2; i++)
      {
        if (!(courseId.charAt(i) >= 'A' && courseId.charAt(i) <= 'Z'))
        {
          flag = false;
          break;
        }
      }
      
      for (int i = 2; i < 5 && flag; i++)
      {
        if (!(courseId.charAt(i) >= '0' && courseId.charAt(i) <= '9'))
        {
          flag = false;
          break;
        }
      }
    }
    
    return flag;
  }
      
}
