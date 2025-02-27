/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_management_system1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Laptop
 */
public class LoginRecords extends javax.swing.JFrame {

    /**
     * Creates new form LoginRecords
     */
    public LoginRecords() throws FileNotFoundException {
        manager manager=new manager();
        initComponents();
        String[] columns={"User","Log In or Out","Date","Time","Status"};
        view_log();
        
    }
    public void view_log() throws FileNotFoundException{
        
        
        int i=0;
        String[][] log={};
        
        File rec = new File("log.txt");
        boolean exist=false;
        Scanner input=new Scanner(rec);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            DefaultTableModel model=(DefaultTableModel)tbrecord.getModel();
            model.addRow(details);
            exist=true;
            i++;
            
        }

        input.close();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        MemberListLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbrecord = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(175, 100));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MemberListLbl.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        MemberListLbl.setForeground(new java.awt.Color(255, 255, 255));
        MemberListLbl.setText("Login Records");
        getContentPane().add(MemberListLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        tbrecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Log In or Out", "Date", "Login Records", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbrecord);
        if (tbrecord.getColumnModel().getColumnCount() > 0) {
            tbrecord.getColumnModel().getColumn(0).setResizable(false);
            tbrecord.getColumnModel().getColumn(1).setResizable(false);
            tbrecord.getColumnModel().getColumn(2).setResizable(false);
            tbrecord.getColumnModel().getColumn(3).setResizable(false);
            tbrecord.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 600, 340));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close1.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bck1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new MainManager().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginRecords().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LoginRecords.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MemberListLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbrecord;
    // End of variables declaration//GEN-END:variables
}

