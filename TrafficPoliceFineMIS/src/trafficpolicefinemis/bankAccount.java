package trafficpolicefinemis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.lang.Exception;
import java.sql.JDBCType;
import javafx.scene.Cursor;
import javax.swing.JOptionPane;
import java.awt.*;
import static trafficpolicefinemis.dashboard.con;

public class bankAccount extends javax.swing.JFrame {

    function func = new function();

    static Connection con;

    public bankAccount() {
        initComponents();

        con = (Connection) databaseDetails.conDB();

        func.loadFineType(jComboBox_fineType);
        func.loadFineAmountCombobox(jComboBox_fineamount);
        func.loadVehicleType(jComboBox_vehType);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_bankAccnt = new javax.swing.JPanel();
        jLabel_trafficSign = new javax.swing.JLabel();
        jLabel_heading2 = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();
        textField_finedVehID = new java.awt.TextField();
        textField_colorTxt = new java.awt.TextField();
        textField_vin = new java.awt.TextField();
        jLabel_date = new javax.swing.JLabel();
        jLabel_date1 = new javax.swing.JLabel();
        jLabel_date2 = new javax.swing.JLabel();
        jLabel_fine_id = new javax.swing.JLabel();
        jLabel_date4 = new javax.swing.JLabel();
        textField_regNr = new java.awt.TextField();
        jLabel_date5 = new javax.swing.JLabel();
        jLabel_date6 = new javax.swing.JLabel();
        textField_driverName = new java.awt.TextField();
        paymentBtn = new javax.swing.JButton();
        jLabel_date7 = new javax.swing.JLabel();
        jComboBox_vehType = new javax.swing.JComboBox<>();
        jComboBox_fineType = new javax.swing.JComboBox<>();
        textField_date = new java.awt.TextField();
        jLabel_date9 = new javax.swing.JLabel();
        jComboBox_fineamount = new javax.swing.JComboBox<>();
        jLabeluserName = new javax.swing.JLabel();

        setTitle("سیستم معلوماتی و مدیریتی جمع آوری جرایم ترافیک");
        setResizable(false);

        jPanel_bankAccnt.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_bankAccnt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_trafficSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trafline.2.png"))); // NOI18N
        jPanel_bankAccnt.add(jLabel_trafficSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        jLabel_heading2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_heading2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_heading2.setText("بخش پرداخت جرایم وسایط");
        jLabel_heading2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_bankAccnt.add(jLabel_heading2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 290, 40));

        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_title.setText("سیستم جرایم ریاست پولیس ترافیک کابل");
        jLabel_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_bankAccnt.add(jLabel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 720, 40));

        textField_finedVehID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel_bankAccnt.add(textField_finedVehID, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 180, 40));

        textField_colorTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel_bankAccnt.add(textField_colorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 180, 40));

        textField_vin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel_bankAccnt.add(textField_vin, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 180, 40));

        jLabel_date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_date.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_date.setText("رنگ");
        jLabel_date.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_bankAccnt.add(jLabel_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, -1, -1));

        jLabel_date1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_date1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_date1.setText("شاسی");
        jLabel_date1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_bankAccnt.add(jLabel_date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, -1, -1));

        jLabel_date2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_date2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_date2.setText("نوعیت واسطه");
        jLabel_date2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_bankAccnt.add(jLabel_date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, -1, -1));

        jLabel_fine_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_fine_id.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_fine_id.setText("ایدی پارچه");
        jLabel_fine_id.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_bankAccnt.add(jLabel_fine_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, -1, -1));

        jLabel_date4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_date4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_date4.setText("پلیت");
        jLabel_date4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_bankAccnt.add(jLabel_date4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, -1, -1));

        textField_regNr.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel_bankAccnt.add(textField_regNr, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 180, 40));

        jLabel_date5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_date5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_date5.setText("مبلغ جریمه");
        jLabel_date5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_bankAccnt.add(jLabel_date5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, 40));

        jLabel_date6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_date6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_date6.setText("اسم راننده");
        jLabel_date6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_bankAccnt.add(jLabel_date6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, 40));

        textField_driverName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel_bankAccnt.add(textField_driverName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 180, 40));

        paymentBtn.setBackground(new java.awt.Color(255, 0, 0));
        paymentBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentBtn.setForeground(new java.awt.Color(255, 255, 255));
        paymentBtn.setText("پرداخت");
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });
        jPanel_bankAccnt.add(paymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 180, 40));

        jLabel_date7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_date7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_date7.setText("حالت پرداخت");
        jLabel_date7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_bankAccnt.add(jLabel_date7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        jComboBox_vehType.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox_vehType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_vehType.setForeground(new java.awt.Color(255, 51, 51));
        jPanel_bankAccnt.add(jComboBox_vehType, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 180, 40));

        jComboBox_fineType.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox_fineType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_fineType.setForeground(new java.awt.Color(255, 51, 51));
        jPanel_bankAccnt.add(jComboBox_fineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 180, 40));

        textField_date.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel_bankAccnt.add(textField_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 180, 40));

        jLabel_date9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_date9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_date9.setText("تاریخ پرداخت");
        jLabel_date9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_bankAccnt.add(jLabel_date9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, -1, -1));

        jComboBox_fineamount.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox_fineamount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_fineamount.setForeground(new java.awt.Color(255, 51, 51));
        jPanel_bankAccnt.add(jComboBox_fineamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 180, 40));

        jLabeluserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabeluserName.setForeground(new java.awt.Color(255, 51, 51));
        jLabeluserName.setText("کاربر");
        jPanel_bankAccnt.add(jLabeluserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 170, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bankAccnt, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bankAccnt, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed

        //function func = new function();
        if (textField_regNr.getText().equals("")
            || textField_finedVehID.getText().equals("")
            || textField_date.getText().equals("")
            || textField_colorTxt.getText().equals("")
            || textField_vin.getText().equals("")
            || textField_regNr.getText().equals("")
            || textField_driverName.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "لطفن معلومات را وارد سازید!");
        } else {

            double getAmount= Double.parseDouble(jComboBox_fineamount.getSelectedItem().toString());

            fine_view_table fvt = new fine_view_table();

            func.insertFinePaymentRecord(
                Integer.parseInt(textField_finedVehID.getText()),
                textField_date.getText(),
                jComboBox_vehType.getSelectedItem().toString(),
                textField_colorTxt.getText(),
                textField_vin.getText(),
                textField_regNr.getText(),
                textField_driverName.getText(),
                getAmount,
                jComboBox_fineType.getSelectedItem().toString(),
                fvt
            );
            textField_finedVehID.setText("");
            textField_regNr.setText("");
            textField_date.setText("");
            textField_colorTxt.setText("");
            textField_vin.setText("");
            textField_regNr.setText("");
            textField_driverName.setText("");
    }//GEN-LAST:event_paymentBtnActionPerformed
    }

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
            java.util.logging.Logger.getLogger(bankAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bankAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bankAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bankAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bankAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox_fineType;
    private javax.swing.JComboBox<String> jComboBox_fineamount;
    private javax.swing.JComboBox<String> jComboBox_vehType;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_date1;
    private javax.swing.JLabel jLabel_date2;
    private javax.swing.JLabel jLabel_date4;
    private javax.swing.JLabel jLabel_date5;
    private javax.swing.JLabel jLabel_date6;
    private javax.swing.JLabel jLabel_date7;
    private javax.swing.JLabel jLabel_date9;
    private javax.swing.JLabel jLabel_fine_id;
    private javax.swing.JLabel jLabel_heading2;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_trafficSign;
    public javax.swing.JLabel jLabeluserName;
    private javax.swing.JPanel jPanel_bankAccnt;
    private javax.swing.JButton paymentBtn;
    private java.awt.TextField textField_colorTxt;
    private java.awt.TextField textField_date;
    private java.awt.TextField textField_driverName;
    private java.awt.TextField textField_finedVehID;
    private java.awt.TextField textField_regNr;
    private java.awt.TextField textField_vin;
    // End of variables declaration//GEN-END:variables

}
