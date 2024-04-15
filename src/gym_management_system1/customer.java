package gym_management_system1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
public class customer {
    String name;
    String phone_no;
    String email;
    
    
    public void cust_reg(String name,String phone_no, String email) throws IOException{
        File customer = new File("customer.txt");
        customer.createNewFile();
        boolean exist=false;
        
        FileWriter fw=new FileWriter(customer,true);
        PrintWriter pw=new PrintWriter(fw);
        
        Scanner input=new Scanner(customer);
        while(input.hasNext() && exist==false){
            String record=input.nextLine();
            String[] details=record.split(",");
            
            if(details[0].equals(name)){
                exist=true;
                JOptionPane.showMessageDialog(null,"User already exist","Error",JOptionPane.WARNING_MESSAGE);
                
            } 
        }
        if (exist==false){
                pw.println(name+","+phone_no+","+email);
                JOptionPane.showMessageDialog(null,"Customer registered successfully","Register",JOptionPane.INFORMATION_MESSAGE);
            }
        input.close();
        
        fw.close();
        pw.close();
        System.out.print(name);
    }
    public void cust_update(String name, String phone_no, String email) throws IOException{
        File customer=new File("customer.txt");
        File temp=new File("temp.txt");
        customer.createNewFile();
        temp.createNewFile();
        FileWriter fw= new FileWriter(temp,true);
        PrintWriter pw=new PrintWriter(fw);
        
        Scanner input=new Scanner(customer);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            
            if(details[0].equals(name)){
                pw.println(details[0]+","+phone_no+","+email);
                JOptionPane.showMessageDialog(null,"Update Successful","Update",JOptionPane.INFORMATION_MESSAGE);
            }else{
                pw.println(details[0]+","+details[1]+","+details[2]);
            }
        }
        fw.close();
        pw.close();
        input.close();
        customer.delete();
        File dump=new File("customer.txt");
        temp.renameTo(dump);
    }
    
    public void cust_del(String name) throws IOException{
        File customer=new File("customer.txt");
        File temp=new File("temp.txt");
        customer.createNewFile();
        temp.createNewFile();
        FileWriter fw= new FileWriter(temp,true);
        PrintWriter pw=new PrintWriter(fw);
        
        Scanner input=new Scanner(customer);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            
            if(details[0].equals(name)){
                JOptionPane.showMessageDialog(null,"Record Deleted","Delete",JOptionPane.INFORMATION_MESSAGE);
            }else{
                pw.println(details[0]+","+details[1]+","+details[2]);
            }
        }
        fw.close();
        pw.close();
        input.close();
        customer.delete();
        File dump=new File("customer.txt");
        temp.renameTo(dump);
    }
}
