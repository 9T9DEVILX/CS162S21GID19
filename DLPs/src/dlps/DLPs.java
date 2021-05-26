/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author m_nou
 */
public class DLPs {

    
    /**
     * @param args the command line arguments
     */
    
    ///////////////////////////////////// Attributes ///////////////////////////
    private List<Person> person_list;
    private List<Program> Programs_added;
   // private List<Hostels> halls_added;
   // private List<Scholarships> scholarships_added;
    private static DLPs driver;
    
///////////////////////////////////// Singleton Constructors ///////////////////////////
    DLPs()
    {
        this.person_list = new ArrayList<>();
      //  this.halls_added = new ArrayList<>();
        this.Programs_added = new LinkedList<>();
      //  this.scholarships_added = new LinkedList<>();
    }
    public static DLPs driver_instance()
    {
        if( driver == null )
        {
            driver = new DLPs();
        }
        return driver;
    }

///////////////////////////////////// Getters ///////////////////////////    
    public List<Person> getPerson_list() {
        return person_list;
    }

    public List<Program> getPrograms_added() {
        return Programs_added;
    }

///////////////////////////////////// Main Functions ///////////////////////////
    public static void main(String[] args) {
        // TODO code application logic here

          generation.startProgram();
    }
    
//////////////////////////////////// Frame Functions ///////////////////////////
   public Boolean add_teacher(String name,String dep,String phone,String email,String cnic,Date dob,String year)
   {
       if( Person.validate_name(name) && Person.CNIC_Validator(cnic) && Person.Phone_Validator(phone) && Person.email_Validator(email) && Person.validate_name(dep) )
       {
           Person pr = new Teacher(name, cnic, phone, email, dob, dep , year);
               this.person_list.add(pr);      
           return true;
       }
       else{
           return false;
       }
   }
   public void print_table()
   {
       AdminFrame obj = new AdminFrame();
       
   }
}
