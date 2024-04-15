package gym_management_system1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Im_tHe_rEaL_LiM
 */

public class user {
    String name;
    String password;
    String phone_no;
    String email;
    

    public void payment(String sessionid, Double amount) throws IOException{
        boolean payment =false;
        
        File session=new File("session.txt");
        File temp=new File("temp.txt");
        session.createNewFile();
        temp.createNewFile();
        FileWriter fw= new FileWriter(temp,true);
        PrintWriter pw=new PrintWriter(fw);
        
        Scanner input=new Scanner(session);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
                    
            if(details[0].equals(sessionid)){                
                double balance=(Double.parseDouble(details[7]))-amount;
                if(balance<=0){
                    balance=0;
                    payment=true;
                };
                pw.println(details[0]+","+details[1]+","+details[2]+","+details[3]+","+details[4]+","+details[5]+","+details[6]+","+balance+","+payment);
                JOptionPane.showMessageDialog(null,"Payment Successful and the balance is "+balance,"Payment",JOptionPane.INFORMATION_MESSAGE);
            }else{
                pw.println(details[0]+","+details[1]+","+details[2]+","+details[3]+","+details[4]+","+details[5]+","+details[6]+","+details[7]+","+details[8]);
            }
        }
        fw.close();
        pw.close();
        input.close();
        session.delete();
        File dump=new File("session.txt");
        temp.renameTo(dump);
    }
    public String[] cust_search(String name) throws FileNotFoundException{
        String[] cust_info=new String[3];
        File customer = new File("customer.txt");
        boolean exist=false;
        Scanner input=new Scanner(customer);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            if (details[0].equals(name)){
                cust_info[0]=details[0];
                cust_info[1]=details[1];
                cust_info[2]=details[2];
                exist=true;
            }else if(input.hasNext()==false && exist==false){
                JOptionPane.showMessageDialog(null,"Customer not found", "Search Failed",JOptionPane.WARNING_MESSAGE);
            }
        }
        input.close();
        return cust_info;
    }
    public void feedback(String sessionid, String feedback) throws IOException{
        File feed=new File("feedback.txt");
        feed.createNewFile();
        int feedid=1;
        Scanner input=new Scanner(feed);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            if(!input.hasNext()){
                feedid=Integer.parseInt(details[0]);
            }
        }
        FileWriter fw=new FileWriter(feed,true);
        PrintWriter pw=new PrintWriter(fw);
        feedid++;
        pw.println(feedid+","+sessionid+","+feedback);
        JOptionPane.showMessageDialog(null,"The feedback had been submitted.","Feedback",JOptionPane.INFORMATION_MESSAGE);    
        input.close();
        fw.close();
        pw.close();
    }
    public void log_record(String name,String in_out,String status) throws IOException{
        LocalDate date =LocalDate.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm");
        String time=LocalDateTime.now().format(dtf);
        File log=new File("log.txt");
        
        FileWriter fw=new FileWriter(log,true);
        PrintWriter pw=new PrintWriter(fw);
        
        pw.println(name+","+in_out+","+date+","+time+","+status);
        fw.close();
        pw.close();
    }
}
