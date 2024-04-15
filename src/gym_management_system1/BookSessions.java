/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_management_system1;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;
import org.jdesktop.swingx.calendar.SingleDaySelectionModel;
import org.jdesktop.swingx.JXDatePicker;
import java.lang.Object.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author Laptop
 */
public class BookSessions extends javax.swing.JFrame {

    /**
     * Creates new form BookSessions
     */
    public BookSessions(String name) {
        initComponents();
        background.setText(name);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtduration = new javax.swing.JTextField();
        txttrainer = new javax.swing.JTextField();
        txtcustomer = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        lbltrainer = new javax.swing.JLabel();
        txttime = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
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
        PayTitle.setText("Book Sessions");
        getContentPane().add(PayTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        LBLClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close1.png"))); // NOI18N
        LBLClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBLCloseMouseClicked(evt);
            }
        });
        getContentPane().add(LBLClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Duration");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trainer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Time");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        txtduration.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtduration, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 220, -1));

        txttrainer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txttrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 220, -1));

        txtcustomer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 220, -1));

        txtdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtdate.setActionCommand("<Not Set>");
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 220, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reset.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 220, -1));

        txtprice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 220, -1));

        lbltrainer.setText("jLabel1");
        getContentPane().add(lbltrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        txttime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimeActionPerformed(evt);
            }
        });
        getContentPane().add(txttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 220, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bck1.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LBLbckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLbckMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new MainTrainer(background.getText()).setVisible(true);
    }//GEN-LAST:event_LBLbckMouseClicked

    private void LBLCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LBLCloseMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        txtcustomer.setText("");
        txttrainer.setText("");
        txtdate.setText("");
        txttime.setText("");
        txtduration.setText("");
        txtprice.setText("");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lbltrainer.setVisible(false);
        txtcustomer.setText("");
        txttrainer.setText("");
        txtprice.setText("");
        txtduration.setText("");
        txtdate.setText("");
        txttime.setText("");

    }//GEN-LAST:event_formWindowActivated

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if(txttrainer.getText().isEmpty()| txtcustomer.getText().isEmpty()|txtdate.getText().isEmpty()|txttime.getText().isEmpty()|txtduration.getText().isEmpty()|txtprice.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill up all the field","Fields not fill up.",JOptionPane.ERROR_MESSAGE);
        }else if(validateJavaDate(txtdate.getText())==false){
            JOptionPane.showMessageDialog(null,"Please enter Date field in this 'yyyy-MM-dd' format ","Incorrect Format",JOptionPane.ERROR_MESSAGE);
        }else if(isValidTime(txttime.getText())==false){
            JOptionPane.showMessageDialog(null,"Please enter Time field in this 'HH:mm' and 24 hour format ","Incorrect Format",JOptionPane.ERROR_MESSAGE);
        }else{
            double price=Double.parseDouble(txtprice.getText());
            LocalDate date=LocalDate.parse(txtdate.getText());
            trainer trainer=new trainer();
            try {
                trainer.book_train_ses(txttrainer.getText(), txtcustomer.getText(), date, txttime.getText(), txtduration.getText(),price);
            } catch (IOException ex) {
                Logger.getLogger(BookSessions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
        ;
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimeActionPerformed
    public static boolean isValidTime(String time){
        // Regex to check valid time in 24-hour format.
        String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the time is empty
        // return false
        if (time == null) {
            return false;
        }
 
        // Pattern class contains matcher() method
        // to find matching between given time
        // and regular expression.
        Matcher m = p.matcher(time);
 
        // Return if the time
        // matched the ReGex
        return m.matches();
    }
 
    public static boolean validateJavaDate(String strDate){
	/* Check if date is 'null' */
	if (strDate.trim().equals("")){
	    return true;
	}
	/* Date is not 'null' */
	else{
	    /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd");
	    sdfrmt.setLenient(false);
	    /* Create Date object
	     * parse the string into date 
             */
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        return false;
	    }
	    /* Return true if date format is valid */
	    return true;
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
            java.util.logging.Logger.getLogger(BookSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookSessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lbltrainer;
    private javax.swing.JTextField txtcustomer;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txttime;
    private javax.swing.JTextField txttrainer;
    // End of variables declaration//GEN-END:variables
}
