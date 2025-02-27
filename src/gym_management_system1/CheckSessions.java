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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laptop
 */
public class CheckSessions extends javax.swing.JFrame {

    /**
     * Creates new form CheckSessions
     */
    public CheckSessions(String name) {
        
        initComponents();
        lbltrainer.setText(name);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbsession = new javax.swing.JTable();
        lbltrainer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        getContentPane().add(LBLbck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PayTitle.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        PayTitle.setForeground(new java.awt.Color(255, 255, 255));
        PayTitle.setText("Check Sessions");
        getContentPane().add(PayTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        LBLClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close1.png"))); // NOI18N
        LBLClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBLCloseMouseClicked(evt);
            }
        });
        getContentPane().add(LBLClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 0, -1, -1));

        tbsession.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ", "Session", "Date", "Time", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbsession);
        if (tbsession.getColumnModel().getColumnCount() > 0) {
            tbsession.getColumnModel().getColumn(0).setResizable(false);
            tbsession.getColumnModel().getColumn(1).setResizable(false);
            tbsession.getColumnModel().getColumn(2).setResizable(false);
            tbsession.getColumnModel().getColumn(3).setResizable(false);
            tbsession.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 680, -1));

        lbltrainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bck1.jpg"))); // NOI18N
        getContentPane().add(lbltrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LBLbckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLbckMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new MainTrainer(lbltrainer.getText()).setVisible(true);
    }//GEN-LAST:event_LBLbckMouseClicked

    private void LBLCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LBLCloseMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            check_session();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CheckSessions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated
    public void check_session() throws FileNotFoundException{
        DefaultTableModel clear=(DefaultTableModel)tbsession.getModel();
        clear.setRowCount(0);
        
        File rec = new File("session.txt");

        Scanner input=new Scanner(rec);
        while(input.hasNext()){
            String record=input.nextLine();
            String[] details=record.split(",");
            
            if(details[1].equals(lbltrainer.getText())){
                DefaultTableModel model=(DefaultTableModel)tbsession.getModel();
                String[] data={details[1],details[2],details[3],details[4],details[5]};
                model.addRow(data);
            }
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
            java.util.logging.Logger.getLogger(CheckSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLClose;
    private javax.swing.JLabel LBLbck;
    private javax.swing.JLabel PayTitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltrainer;
    private javax.swing.JTable tbsession;
    // End of variables declaration//GEN-END:variables
}
