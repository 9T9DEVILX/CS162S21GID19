/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
          DLPs L = DLPs.driver_instance();
          L.loadAdmin();
          L.LoadStudents();
          L.loadTeacher();
          generation.startProgram();
          
    }
    
//////////////////////////////////// Frame Functions ///////////////////////////
    static void addadmin(Person add)
    {
        
    }
   public void add_teacher(Person pr)
   {
               this.person_list.add(pr);     
   }
   public void update_person(Person pr,String id)
   {
        for (int i = 0; i < this.person_list.size(); i++) {
                        if (this.person_list.get(i).getPerson_type().equals("Teacher")) {
                            Teacher tr = (Teacher) this.person_list.get(i);
                            if (tr.getTeacher_ID().equals(id)) {
                                this.person_list.set(i, pr);
                                break;
                            }
                        }
                            }
   }
   public void add_program(Program pro)
   {
      this.Programs_added.add(pro);
   }
   public void update_Program(Program pr,String id)
   {
        for (int i = 0; i < this.Programs_added.size(); i++) {
                       
                           Program p = this.Programs_added.get(i);
                            if (p.getProgram_id().equals(id)) {
                                this.Programs_added.set(i, pr);
                                break;
                            }
                        
                            }
   }
   
   public void loadAdmin()
   {
       
        try {
            FileReader read = new FileReader("admin.txt");
            BufferedReader cin = new BufferedReader(read);
            String input = "-1";
            
                input = cin.readLine();
               
                String arr[] = input.split(",");
                
                Person ad = new Admin(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8],arr[9]);
                
                this.person_list.add(ad);
               
            
        } catch (Exception ex) {
System.out.println("exception");
        }
   }
   public void LoadStudents()
   {
       
        try {
           FileReader read = new FileReader("student.txt");
           BufferedReader cin = new BufferedReader(read);
           String in = "-1";
           in = cin.readLine();
            System.out.println(in);
            while (in != null) {       
                System.out.println(".");
               String[] xx = in.split(",");
               Student s = new Student();
               s.setName(xx[0]);
               s.setNumber(xx[1]);
               s.setEmail(xx[2]);
               s.setCnic(xx[3]);
               Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(xx[4]);
               s.setDOB(date1);
               s.setYear(xx[5]);
               s.setAddress(xx[6]);
               s.setPerson_type(xx[7]);
               s.setStudent_ID(xx[8]);
               s.setStudent_password(xx[9]);
               s.setStu_semester(xx[10]);
               s.setStu_domicel(xx[11]);
               s.setProgram(xx[12]);
               Person pr = s;
               this.person_list.add(pr);
               in = cin.readLine();
            }
           
        } catch (IOException | ParseException ex) {
            Logger.getLogger(DLPs.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   }
   public void loadTeacher()
   {
       try {
           FileReader read = new FileReader("Teacher.txt");
           BufferedReader cin = new BufferedReader(read);
           String in = "-1";
           in = cin.readLine();
            System.out.println(in);
            while (in != null) {       
                System.out.println(".");
               String[] xx = in.split(",");
               Teacher s = new Teacher();
               s.setName(xx[0]);
               s.setNumber(xx[1]);
               s.setEmail(xx[2]);
               s.setCnic(xx[3]);
               Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(xx[4]);
               s.setDOB(date1);
               s.setYear(xx[5]);
               s.setAddress(xx[6]);
               s.setPerson_type(xx[7]);
               s.setTeacher_ID(xx[8]);
               s.setTeacher_password(xx[9]);
               s.setDepartment(xx[10]);
               s.setQualification(xx[11]);
               s.setBank_acc(xx[12]);
               s.setMonthly_pay(xx[13]);
               Person pr = s;
               this.person_list.add(pr);
               in = cin.readLine();
            }
           
        } catch (IOException | ParseException ex) {
            Logger.getLogger(DLPs.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
