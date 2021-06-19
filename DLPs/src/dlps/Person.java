/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import java.sql.Timestamp;
import java.util.*;

/**
 *
 * @author m_nou
 */
abstract public class Person {
///////////////////////////////////// Attributes ///////////////////////////
    private String name;
    private String Number;
    private String email;
    private String cnic;
    private Timestamp DOB;
    private String year;
    private String address;
    private String person_type;

///////////////////////////////////// Getters ///////////////////////////
    public String getName() {
        return name;
    }

    public String getNumber() {
        return Number;
    }

    public String getEmail() {
        return email;
    }

    public String getCnic() {
        return cnic;
    }

    public Timestamp getDOB() {
        return DOB;
    }

    public String getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public String getPerson_type() {
        return person_type;
    }
    
    
///////////////////////////////////// Setters ///////////////////////////
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void setDOB(Timestamp DOB) {
        this.DOB = DOB;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPerson_type(String person_type) {
        this.person_type = person_type;
    }
    
///////////////////////////////////// Validators ///////////////////////////
      
//This will validate name with alphabets and space. No integers or special charactors are allowed in Name.
    static boolean validate_name(String name)
    {
        boolean flag = true;

        for (int i = 0; i < name.length(); i++) {
            if (!((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) == ' '))) {
                flag = false;
            }

        }

        return flag;
    }

    //This will validate all integers values.
    static boolean integar_validator(String days) {
        boolean flag = false;
        int size = days.length();

        for (short i = 0; i < size; i++) {
            if (days.charAt(i) >= '0' && days.charAt(i) <= '9') {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    //This will validate Phone Number is the two forms "03021618280" & also "0302-1618280"
    static boolean Phone_Validator(String phone_number) {
        boolean flag = false;
        int size = phone_number.length();

        if (size == 12 && phone_number.charAt(4) == '-') {

            for (short i = 0; i < size; i++) {
                if ((phone_number.charAt(i) >= '0' && phone_number.charAt(i) <= '9') || phone_number.charAt(i) == '-') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }

            }
        } else if (size == 11) {
            for (short i = 0; i < size; i++) {
                if ((phone_number.charAt(i) >= '0' && phone_number.charAt(i) <= '9')) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }

            }
        }
        return flag;

    }

    //This will validate Email Addres containing "@" & at the end ".com".Also "@ should not be at the start."
    static boolean email_Validator(String e_mail) {
        boolean flag = false;
        int email_size;

        email_size = e_mail.length();

        if (e_mail.charAt(0) != '@' && e_mail.charAt(email_size - 4) == '.' && e_mail.charAt(email_size - 3) == 'c' && e_mail.charAt(email_size - 2) == 'o' && e_mail.charAt(email_size - 1) == 'm') {

            for (int i = 0; i < email_size; i++) {
                if (e_mail.charAt(i) == '@') {
                    flag = true;

                }
            }
        }
        return flag;

    }

    //This will validate CNIC in the form "34101-9164416-2".
    static boolean CNIC_Validator(String CNIC) {
        boolean flag = false;
        int cinc_size;

        cinc_size = CNIC.length();

        if (cinc_size == 15) {
            if (CNIC.charAt(5) == '-' && CNIC.charAt(13) == '-') {
                for (int n = 0; n < 5; n++) {
                    if (CNIC.charAt(n) >= '0' && CNIC.charAt(n) <= '9') {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    for (int n = 6; n < 13; n++) {
                        if (CNIC.charAt(n) >= '0' && CNIC.charAt(n) <= '9') {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }

                    if (flag == true) {
                        if (CNIC.charAt(14) >= '0' && CNIC.charAt(14) <= '9') {
                            flag = true;
                        } else {
                            flag = false;
                        }
                    }
                }
            }
        }
        return flag;
    }
    
    //This will validate Password which is longer than 8 digits containing atleast
    // 1 Capital Alphabet, 1 Special CHaracters.
    static boolean password_validator(String enter_password)
{
    boolean flag = false;

    int len = enter_password.length();

    if( len >= 8)
    {
       for (short i = 0; i < len; i++)
       {
           if ( enter_password.charAt(i) >= 'A' && enter_password.charAt(i) <= 'Z')
           {
               flag = true;
               break;
           }  
       }
       if( flag == true )
       {
           for (short j = 0; j < len; j++)
           {
               if ( (enter_password.charAt(j) >=33 && enter_password.charAt(j) <=47) || (enter_password.charAt(j) >=58 && enter_password.charAt(j)<=64) || (enter_password.charAt(j) >=91 && enter_password.charAt(j)<=96) || (enter_password.charAt(j) >=123 && enter_password.charAt(j)<=126))
               {
                   flag = true;
                   break;
               }
               else
               {
                   flag = false;
               }
           }
       }
    }
    return flag;
}
    
     ///////////////////////////////////// Simple Functions ///////////////////////////
    
    //This Function will get a CNIC From the Profile
    //and will Provide the Gender based on the last Digit.
    static String get_gender(String cnic)
    {
        int len = cnic.length();
        String gen = "";
        if( cnic.charAt(len-1) % 2 == 0)
        {
            gen = "Female";
        }
        else if (cnic.charAt(len-1) % 2 != 0)
        {
            gen =  "Male";
        }
       return gen; 
    }
    
    //This Function will Generate Short Name of the Department
    //to put it into the Username ID of the Profile.
    static public String geneate_short_name(String name)
    {
        String name_short = "";
        String []arr = name.split(" ");
        for (int i=0 ; i< arr.length ; i++) {
            name_short = name_short + arr[i].charAt(0);
        }
        
        return name_short.toUpperCase();
    }
    
    ///////////////////////////////////// OverLoad Functions ///////////////////////////
    
    //This Function will Tell wheather what kind of Person's Profile it is.
    public String getType()
    {
        return "";
    }
    
    //This will Generate a Randome Password.
    //Firstly will contain the Person Type.
    //Secondly will contain the Year
    //Thirdly will contain the special characters.
    //Fourth will be the Five random digits or charactors.
    public String Password_generator(String year)
    {
        return "";
    }
    
    //This will generate ID depending that will contain
    //Firstly Year of admission
    //Secondly the Department in which they are.
    //Thirdly the Number of instances of Admission.
    public String ID_Generator(String dep,String year)
    {
        return "";
    }
}
