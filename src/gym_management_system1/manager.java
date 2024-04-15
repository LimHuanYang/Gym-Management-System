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
import java.awt.print.PrinterException;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class manager extends user{

    public void reg(String name,String password,String phone_no,String email) throws IOException{
        File trainermanager = new File("trainermanager.txt");
        trainermanager.createNewFile();
        boolean exist=false;
        
        FileWriter fw=new FileWriter(trainermanager,true);
        PrintWriter pw=new PrintWriter(fw);
        
        Scanner input=new Scanner(trainermanager);
        while(input.hasNext() && exist==false){
            String record=input.nextLine();
            String[] details=record.split(",");
            System.out.println("Hello");
            if(details[0].equals(name)){
                exist=true;
                JOptionPane.showMessageDialog(null,"User already exist","Error",JOptionPane.WARNING_MESSAGE);
            }
        }
        if (exist==false){       
              pw.println(name+","+password+","+phone_no+","+email);
              JOptionPane.showMessageDialog(null,"Register Successfully","Register",JOptionPane.INFORMATION_MESSAGE);
            }
        input.close();
        fw.close();
        pw.close();
        
        
    }

    public String[] trainer_search(String name) throws FileNotFoundException{
        String[] trainer_info = new String[3];
        
        File trainermanager = new File("trainermanager.txt");
        boolean exist=false;
        Scanner input=new Scanner(trainermanager);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            
            if (details[0].equals(name)){
                trainer_info[0]=details[1];
                trainer_info[1]=details[2];
                trainer_info[2]=details[3];
                exist=true;
            }else if(input.hasNext()==false && exist==false){
                JOptionPane.showMessageDialog(null,"Person doesn't exist", "Search Failed",JOptionPane.WARNING_MESSAGE);
                
            }
        }
        input.close();               
        
        return trainer_info;
    }
    public void update(String name,String password,String phone_no,String email) throws IOException{        
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
    public void trainer_del(String name) throws IOException{
        File trainermanager=new File("trainermanager.txt");
        File temp=new File("temp.txt");
        trainermanager.createNewFile();
        temp.createNewFile();
        FileWriter fw= new FileWriter(temp,true);
        PrintWriter pw=new PrintWriter(fw);
        boolean exist=false;
        Scanner input=new Scanner(trainermanager);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            
            if(details[0].equals(name)){
                JOptionPane.showMessageDialog(null,"Record Deleted","Delete",JOptionPane.INFORMATION_MESSAGE);
                exist=true;
            }else{
                pw.println(details[0]+","+details[1]+","+details[2]+","+details[3]);
            }
            if(!input.hasNext() && exist==false){
                JOptionPane.showMessageDialog(null,"User doesnot exist","Delete",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        fw.close();
        pw.close();
        input.close();
        trainermanager.delete();
        File dump=new File("trainermanager.txt");
        temp.renameTo(dump);
    }
    public String[][] check_ses(String sessionid) throws FileNotFoundException{
        int i = 0;
        String[][] ses_info={}  ;
        
        File session = new File("session.txt");
        boolean exist=false;
        Scanner input=new Scanner(session);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            
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
            
        }

        input.close();   
        return ses_info;
    }
    public String[] pay_report(String session){
        String [] report={};
        ;
        return report;
    }
//    public void view_log() throws FileNotFoundException{
//        //DefaultTableModel tblModel=(DefaultTableModel)tbrecord.getModel();
//        
//        int i=0;
//        String[][] log={};
//        
//        File rec = new File("log.txt");
//        boolean exist=false;
//        Scanner input=new Scanner(rec);
//        while(input.hasNext()){
//            String record=input.nextLine();
//            String[] details=record.split(",");
//            DefaultTableModel model=(DefaultTableModel)tbrecord
//
//            exist=true;
//            i++;
//            
//        }
//
//        input.close();
//    }
    
}
