package gym_management_system1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Im_tHe_rEaL_LiM
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class trainer extends user{
    
    public void check_own_ses(String name) throws FileNotFoundException{
        int i = 0;
        String[][] ses_info={}  ;
        
        File session = new File("session.txt");
        boolean exist=false;
        Scanner input=new Scanner(session);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            System.out.println(ses_info.getClass().getSimpleName());
            if (details[1].equals(name)){
                ses_info[i][0]=details[1];
                ses_info[i][1]=details[2];
                ses_info[i][2]=details[3];
                ses_info[i][3]=details[4];
                ses_info[i][4]=details[5];
                ses_info[i][5]=details[6];
                ses_info[i][6]=details[7];
                ses_info[i][7]=details[8];
                System.out.print("1");
                exist=true;
                i++;
            }else if(input.hasNext()==false && exist==false){
                JOptionPane.showMessageDialog(null,"Session not found", "Search Failed",JOptionPane.WARNING_MESSAGE);
            }
        }

        input.close();               
    }
    public void book_train_ses(String name,String cust_name,LocalDate date,String time,String duration,double price) throws IOException{
        File session = new File("session.txt");
        session.createNewFile();
        int sesid=1;
        boolean payment=false;
        Scanner input=new Scanner(session);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            if(!input.hasNext()){
                sesid=Integer.parseInt(details[0]);
            }
        }
        FileWriter fw=new FileWriter(session,true);
        PrintWriter pw=new PrintWriter(fw);
        double balance=price;
        sesid++;
        pw.println(sesid+","+name+","+cust_name+","+date+","+time+","+duration+","+price+","+balance+","+payment);
        JOptionPane.showMessageDialog(null,"Appointment had been made successfully. The session ID is "+sesid+".","Training Session",JOptionPane.INFORMATION_MESSAGE);    
        input.close();
        fw.close();
        pw.close();
    }
    public void update_info(String name,String password, String phone_no,String email) throws IOException{
        File trainermanager=new File("trainermanager.txt");
        File temp=new File("temp.txt");
        trainermanager.createNewFile();
        temp.createNewFile();
        FileWriter fw= new FileWriter(temp,true);
        PrintWriter pw=new PrintWriter(fw);
        
        Scanner input=new Scanner(trainermanager);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            
            if(details[0].equals(name)){
                pw.println(details[0]+","+password+","+phone_no+","+email);
                JOptionPane.showMessageDialog(null,"Update Successful","Update",JOptionPane.INFORMATION_MESSAGE);
            }else{
                pw.println(details[0]+","+details[1]+","+details[2]+","+details[3]);
            }
        }
        fw.close();
        pw.close();
        input.close();
        trainermanager.delete();
        File dump=new File("trainermanager.txt");
        temp.renameTo(dump);
    }
}
