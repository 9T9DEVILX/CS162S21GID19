/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlps;

import dlps.LoginFrame;

/**
 *
 * @author Hamad DEVIL
 */
public class generation {
     public static void buffering(){
          BufferingFrame buf = new BufferingFrame(); 
        buf.setVisible(true);
       try{
           for (int i=0;i<=30;i++)
           {
               
               
               Thread.sleep(90);
               
               if(i==10)
               {
                   
                  buf.bufferingLabel.setText("Loading..");
               }
               if(i==15)
               {
                   
                  buf.bufferingLabel.setText("Loading...");
               }
               if(i==20)
               {
                  buf.bufferingLabel.setText("Loading....");
               }
            
               if(i==25)
               {
                  buf.bufferingLabel.setText("Loading..");
               }
               if(i==29)
               {
                  buf.bufferingLabel.setText("Loading...");
               }
             
                       
               
               if(i==30)
               {
                   
                   buf.setVisible(false);
                   
                   
               }
           }
       }
       catch(Exception e)
       {
           
       }
     }
    public static void startProgram(){
         ProgressBar b = new ProgressBar(); 
        b.setVisible(true);
       try{
           for (int i=0;i<=101;i++)
           {
               Thread.sleep(90);
               
               if(i==20)
               {
                  b.LoadingStatus.setText("Fetching information.");
               }
                if(i==25)
               {
                  b.LoadingStatus.setText("Fetching information..");
                  
               }
                   if(i==30)
               {
                  b.LoadingStatus.setText("Fetching information...");
                  
               }
                if(i==35)
               {
                  b.LoadingStatus.setText("Arranging Information.");
                  
               }
                 if(i==40)
               {
                  b.LoadingStatus.setText("Arranging Information..");
                  
               }
                 if(i==45)
               {
                  b.LoadingStatus.setText("Arranging Information...");
                  
               }
                 if(i==55)
               {
                  b.LoadingStatus.setText("Checking for Updates.");
                  
               }
                 if(i==65)
               {
                  b.LoadingStatus.setText("Checking for Updates..");
                  
               }
                  if(i==75)
               {
                  b.LoadingStatus.setText("Checking for Updates...");
                  
               }
                   if(i==85)
               {
                  b.LoadingStatus.setText("getting ready..");
                  
               }
                    if(i==95)
               {
                  b.LoadingStatus.setText("Thank You for waiting..");
                  
               }
                       
               b.Loading.setText(Integer.toString(i)+"%");
               if(i==101)
               {
                   b.setVisible(false);
                   LoginFrame m = new LoginFrame();
                   m.setVisible(true);
                   
               }
           }
       }
       catch(Exception e)
       {
           
       }
    }
    
    }
