/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author m_nou
 */
public class Courses {
    ///////////////////////////////////// Attributes ///////////////////////////
    private String course_name;
    private String course_ID;
    private String course_semester;
    private String course_CH;
    private String pro_ID;
    private String course_alocate_teac;
    private List<CLOs> course_clo_LinkedList;
    private List<Assignments> course_assignment_ArrayList;
    private List<String> stu_register_ArrayList;
    
    
    Courses(String name,String ID,String sem,String hours,String pr_id)
   {
       
       this.course_semester = sem;
       this.course_ID = ID;
       this.course_name = name;
       this.course_CH = hours;
       this.pro_ID = pr_id;
       this.course_assignment_ArrayList= new ArrayList<>();
       this.course_clo_LinkedList = new LinkedList<>(); 
       this.stu_register_ArrayList = new ArrayList<>();
       this.course_alocate_teac = "";
   }
    ///////////////////////////////////// Getters ///////////////////////////

    public String getCourse_name() {
        return course_name;
    }

    public String getCourse_ID() {
        return course_ID;
    }

    public String getCourse_semester() {
        return course_semester;
    }

    public String getCourse_CH() {
        return course_CH;
    }

    public String getCourse_alocate_teac() {
        return course_alocate_teac;
    }

    public List getCourse_clo_LinkedList() {
        return course_clo_LinkedList;
    }

    public List getCourse_assignment_ArrayList() {
        return course_assignment_ArrayList;
    }

    public List getStu_register_ArrayList() {
        return stu_register_ArrayList;
    }
    
    ///////////////////////////////////// Setters ///////////////////////////

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCourse_ID(String course_ID) {
        this.course_ID = course_ID;
    }

    public void setCourse_semester(String course_semester) {
        this.course_semester = course_semester;
    }

    public void setCourse_CH(String course_CH) {
        this.course_CH = course_CH;
    }

    public void setCourse_alocate_teac(String course_alocate_teac) {
        this.course_alocate_teac = course_alocate_teac;
    }

    public void setCourse_clo_LinkedList(List course_clo_LinkedList) {
        this.course_clo_LinkedList = course_clo_LinkedList;
    }

    public void setCourse_assignment_ArrayList(List course_assignment_ArrayList) {
        this.course_assignment_ArrayList = course_assignment_ArrayList;
    }

    public void setStu_register_ArrayList(List stu_register_ArrayList) {
        this.stu_register_ArrayList = stu_register_ArrayList;
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
    
    //This will Validate Course ID in form "PF123" & "PFL123".
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
    else if( x == 6)
    {
      if( courseId.charAt(5) == 'L')
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
      
    }
    
    return flag;
     }
     
     //This will validate integer from 1 to 8
      static boolean sem_validator(String days) {
        boolean flag = false;
        if(days!= "")
        {
          int a = Integer.parseInt(days);
        if(a >= 1 && a <= 8)
        {
            flag = true;
       }
            
        }
        return flag;
    }
      
      //This will validate integer from 1 to 3
      static boolean hourse_validator(String days) {
        boolean flag = false;
        if(days != "")
        {
        int a = Integer.parseInt(days);
        if(a >= 1 && a <= 3)
        {
            flag = true;
       }    
        }
        
        return flag;
    }
      public void add_clo(CLOs clo)
      {
          this.course_clo_LinkedList.add(clo);
      }
       public void update_clo(CLOs clo,String cour_id_old,String clo_id_old)
       {
           DLPs driverr = DLPs.driver_instance();
           for(int k = 0;k<driverr.getPrograms_added().size();k++ )
           {
               Program pr = driverr.getPrograms_added().get(k);
               for(int i =0; i< pr.getCourses_ArrayList().size();i++)
               {
                   if(pr.getCourses_ArrayList().get(i).course_ID.equals(cour_id_old))
                   {
                       for(int j =0;j<pr.getCourses_ArrayList().get(i).course_clo_LinkedList.size();j++)
                       {
                           if(pr.getCourses_ArrayList().get(i).course_clo_LinkedList.get(j).getClo_ID().equals(clo_id_old))
                           {
                               pr.getCourses_ArrayList().get(i).course_clo_LinkedList.set(j, clo);
                           }
                       }
                   }
                       }
           }
       }
}
