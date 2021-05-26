/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author m_nou
 */
public class Student extends Person {
    ///////////////////////////////////// Attributes ///////////////////////////
    private String student_ID;
    private String Student_password;
    private String Stu_semester;
    private String Stu_domicel;
    public static int Instance;
    private FEE fee_obj;
    private List<String> stu_Assignment_List;
    private Set<String> stu_Attendence_TreeSet;
    private Set<String> stu_GPA_HashSet;
    
    ///////////////////////////////////// Getters ///////////////////////////

    public String getStudent_ID() {
        return student_ID;
    }

    public String getStudent_password() {
        return Student_password;
    }

    public String getStu_semester() {
        return Stu_semester;
    }

    public String getStu_domicel() {
        return Stu_domicel;
    }

    public FEE getFee_obj() {
        return fee_obj;
    }

    public List<String> getStu_Assignment_List() {
        return stu_Assignment_List;
    }

    public Set<String> getStu_Attendence_TreeSet() {
        return stu_Attendence_TreeSet;
    }

    public Set<String> getStu_GPA_HashSet() {
        return stu_GPA_HashSet;
    }
    
    ///////////////////////////////////// Settters ///////////////////////////

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

    public void setStudent_password(String Student_password) {
        this.Student_password = Student_password;
    }

    public void setStu_semester(String Stu_semester) {
        this.Stu_semester = Stu_semester;
    }

    public void setStu_domicel(String Stu_domicel) {
        this.Stu_domicel = Stu_domicel;
    }

    public void setFee_obj(FEE fee_obj) {
        this.fee_obj = fee_obj;
    }

    public void setStu_Assignment_List(List<String> stu_Assignment_List) {
        this.stu_Assignment_List = stu_Assignment_List;
    }

    public void setStu_Attendence_TreeSet(Set<String> stu_Attendence_TreeSet) {
        this.stu_Attendence_TreeSet = stu_Attendence_TreeSet;
    }

    public void setStu_GPA_HashSet(Set<String> stu_GPA_HashSet) {
        this.stu_GPA_HashSet = stu_GPA_HashSet;
    }
    
     ///////////////////////////////////// OverLoad Functions ///////////////////////////
   
    //This Function will Tell wheather what kind of Person's Profile it is.
    @Override
    public String getType()
    {
        return "Student";
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
        
        for (int i = 0; i < 5; i++)                // This Loop will choose 5 random Digits or characters.
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        String pass = "";
        pass = "stu" + year + sb;
        System.out.println("Student password = " + pass);
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
        id = id + year + "-" + this.geneate_short_name(dep) + "-" + Student.Instance;
        System.out.print(id);
        return id;
    }
}
