/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_management_system1;

import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laptop
 */
public class Management_Member_reports extends javax.swing.JFrame {

    /**
     * Creates new form Management_Member_reports
     */
    public Management_Member_reports() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBLbck = new javax.swing.JLabel();
        PayTitle = new javax.swing.JLabel();
        LBLClose = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbreport = new javax.swing.JTable();
        btnprint = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(175, 100));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLbck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        LBLbck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBLbckMouseClicked(evt);
            }
        });
        getContentPane().add(LBLbck, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 0, -1, -1));

        PayTitle.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        PayTitle.setForeground(new java.awt.Color(255, 255, 255));
        PayTitle.setText("Management Members Reports");
        getContentPane().add(PayTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        LBLClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close1.png"))); // NOI18N
        LBLClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBLCloseMouseClicked(evt);
            }
        });
        getContentPane().add(LBLClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 0, -1, -1));

        tbreport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trainer", "Customer", "Date", "Time", "Duration", "Price", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbreport);
        if (tbreport.getColumnModel().getColumnCount() > 0) {
            tbreport.getColumnModel().getColumn(0).setResizable(false);
            tbreport.getColumnModel().getColumn(1).setResizable(false);
            tbreport.getColumnModel().getColumn(2).setResizable(false);
            tbreport.getColumnModel().getColumn(3).setResizable(false);
            tbreport.getColumnModel().getColumn(4).setResizable(false);
            tbreport.getColumnModel().getColumn(5).setResizable(false);
            tbreport.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 760, -1));

        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        getContentPane().add(btnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bck1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LBLbckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLbckMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new MainManager().setVisible(true);
    }//GEN-LAST:event_LBLbckMouseClicked

    private void LBLCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LBLCloseMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            view_report();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Management_Member_reports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            tbreport.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Management_Member_reports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnprintActionPerformed
    public void view_report() throws FileNotFoundException{
        DefaultTableModel clear=(DefaultTableModel)tbreport.getModel();
        clear.setRowCount(0);
        int i=0;
        String pay;
        
        File rec = new File("session.txt");
        boolean exist=false;
        Scanner input=new Scanner(rec);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            DefaultTableModel model=(DefaultTableModel)tbreport.getModel();
            if(details[8]=="true"){
                pay="Yes";
            }else{
                pay="No";
            }
            String[] data={details[1],details[2],details[3],details[4],details[5]+" hour","RM "+details[6],"RM "+details[7],pay};
            model.addRow(data);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Management_Member_reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Management_Member_reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Management_Member_reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Management_Member_reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management_Member_reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLClose;
    private javax.swing.JLabel LBLbck;
    private javax.swing.JLabel PayTitle;
    private javax.swing.JButton btnprint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbreport;
    // End of variables declaration//GEN-END:variables
}
