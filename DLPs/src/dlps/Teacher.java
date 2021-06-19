/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author m_nou
 */
public class Teacher extends Person {
    ///////////////////////////////////// Attributes ///////////////////////////
    private String department;
    private String qualification;
    private String Teacher_ID;
    private String teacher_password;
    private String bank_acc;
    private String monthly_pay;
     public static int Instance;
    private Stack st;
    private Set<String> tea_Attendence_TreeSet;

    Teacher(String name,String  cnic,String phone,String email,Date dob,String dep,String yearr)
    {
        this.setName(name);
        this.setCnic(cnic);
        this.setNumber(phone);
        this.setEmail(email);
        Timestamp sts =Timestamp.valueOf(dob.toString()); 
        this.setDOB(sts);
        this.department = dep;
        this.setYear(yearr);
        this.setAddress("Please Edit To Chnage");
        this.qualification = "Please Edit To Chnage";
        this.bank_acc = "Please Edit To Chnage";
        this.monthly_pay = "";
        Instance++;
        st = new Stack();
        tea_Attendence_TreeSet = new TreeSet<>();
        this.Teacher_ID = this.ID_Generator(dep,yearr );
        this.teacher_password = this.Password_generator(yearr);
        this.setPerson_type(this.getType());
    }
    ///////////////////////////////////// Getters ///////////////////////////

    public String getDepartment() {
        return department;
    }

    public String getQualification() {
        return qualification;
    }

    public String getTeacher_ID() {
        return Teacher_ID;
    }

    public String getTeacher_password() {
        return teacher_password;
    }

    public String getBank_acc() {
        return bank_acc;
    }

    public String getMonthly_pay() {
        return monthly_pay;
    }

    public Stack getSt() {
        return st;
    }

    public Set<String> getTea_Attendence_TreeSet() {
        return tea_Attendence_TreeSet;
    }
    
    ///////////////////////////////////// Setters ///////////////////////////

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setTeacher_ID(String Teacher_ID) {
        this.Teacher_ID = Teacher_ID;
    }

    public void setTeacher_password(String teacher_password) {
        this.teacher_password = teacher_password;
    }

    public void setBank_acc(String bank_acc) {
        this.bank_acc = bank_acc;
    }

    public void setMonthly_pay(String monthly_pay) {
        this.monthly_pay = monthly_pay;
    }

    public void setSt(Stack st) {
        this.st = st;
    }

    public void setTea_Attendence_TreeSet(Set<String> tea_Attendence_TreeSet) {
        this.tea_Attendence_TreeSet = tea_Attendence_TreeSet;
    }

     ///////////////////////////////////// OverLoad Functions ///////////////////////////
   
    //This Function will Tell wheather what kind of Person's Profile it is.
    @Override
    public String getType()
    {
        return "Teacher";
    }
    
     //This will Generate a Randome Password.
    //Firstly will contain the Person Type.
    //Secondly will contain the Year
    //Thirdly will contain the special characters.
    //Fourth will be the Five random digits or charactors.
    @Override
    public String Password_generator(String year)
    {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String spe = "@#%^&*_-";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        
        int randomm = random.nextInt(spe.length()); // to choose a special character from SPE.
        sb.append(spe.charAt(randomm));
        
        for (int i = 0; i < 5; i++)                 // This Loop will choose 5 random Digits or characters.
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        
        String pass = "";
        pass = "tea" + year + sb;
        System.out.println("Teacher Password = "+pass);
        return pass;
    }
    
     //This will generate ID depending that will contain
    //Firstly Year of admission
    //Secondly the Department in which they are.
    //Thirdly the Number of instances of Admission.
    @Override
    public String ID_Generator(String dep,String year)
    {
        String id = "";
        id = id + year + "-" + this.geneate_short_name(dep) + "-" + Teacher.Instance;
        System.out.print(id);
        return id;
    }
}
