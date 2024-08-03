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
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import static trafficpolicefinemis.dashboard.con;

public class fine_view_table extends javax.swing.JFrame {

    function f = new function();
    databaseDetails dbdetails = new databaseDetails();
    public String getPlateNr = "";
    static Connection con;

    public fine_view_table() {
        initComponents();
        con = (Connection) databaseDetails.conDB();

        f.loadRegVehiclesDetails(jTable_registeredVehicles);
        
        f.loadDataToTable(vehiclesDetailsTable);

        f.loadDataToTable_PAIDFINES(jTable_paid_fines);
        plateNrTxtbx.setText("لطفن نمبر پلیت را تایپ کنید");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        plateNrTxtbx = new javax.swing.JTextField();
        VehDetSearchBtn = new javax.swing.JButton();
        jLabel_traffic_sign = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();
        jTabbedPane_vwPaidFines = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        vehiclesDetailsTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_paid_fines = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_registeredVehicles = new javax.swing.JTable();
        Exit_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plateNrTxtbx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plateNrTxtbx.setForeground(new java.awt.Color(255, 0, 0));
        plateNrTxtbx.setToolTipText("نمبر پلیت را ورود سازید");
        plateNrTxtbx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plateNrTxtbxMouseClicked(evt);
            }
        });
        plateNrTxtbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                plateNrTxtbxKeyPressed(evt);
            }
        });
        jPanel1.add(plateNrTxtbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 410, 40));

        VehDetSearchBtn.setBackground(new java.awt.Color(255, 0, 0));
        VehDetSearchBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VehDetSearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        VehDetSearchBtn.setText("تثبیت واسطه");
        VehDetSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehDetSearchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(VehDetSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 190, 40));

        jLabel_traffic_sign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trafline.2.png"))); // NOI18N
        jPanel1.add(jLabel_traffic_sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, -1));

        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_title.setText("سیستم جرایم ریاست پولیس ترافیک کابل");
        jLabel_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 720, 40));

        vehiclesDetailsTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vehiclesDetailsTable.setForeground(new java.awt.Color(255, 51, 51));
        vehiclesDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ایدی ", "تاریخ", "نوعیت واسطه", "رنگ", "سال تولید", "شاسی", "انجن", "ولایت", "پلیت", "مبلغ جریمه", "نوعیت جریمه"
            }
        ));
        vehiclesDetailsTable.setToolTipText("وسایط جریمه شده");
        vehiclesDetailsTable.setRowHeight(20);
        vehiclesDetailsTable.setSelectionBackground(new java.awt.Color(255, 23, 11));
        jScrollPane2.setViewportView(vehiclesDetailsTable);

        jTabbedPane_vwPaidFines.addTab("وسایط جریمه شده", jScrollPane2);

        jTable_paid_fines.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable_paid_fines.setForeground(new java.awt.Color(255, 51, 51));
        jTable_paid_fines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ایدی پارچه", "تاریخ", "نوع واسطه", "رنگ", "شاسی", "پلیت نمبر", "راننده", "مبلغ جریمه", "نوعیت جریمه"
            }
        ));
        jScrollPane1.setViewportView(jTable_paid_fines);

        jTabbedPane_vwPaidFines.addTab("جرایمه پرداخت شده", jScrollPane1);

        jTable_registeredVehicles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable_registeredVehicles.setForeground(new java.awt.Color(255, 51, 51));
        jTable_registeredVehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ایدی", "نوعیت", "مدل سال", "پلیت نمبر", "شاسی", "نمبر انجن", "رنگ", "ولایت", "مالک", "کشور", "برند"
            }
        ));
        jScrollPane3.setViewportView(jTable_registeredVehicles);

        jTabbedPane_vwPaidFines.addTab("وسایط راجستر شده", jScrollPane3);

        jPanel1.add(jTabbedPane_vwPaidFines, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1060, 370));

        Exit_Btn.setBackground(new java.awt.Color(51, 255, 51));
        Exit_Btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit_Btn.setForeground(new java.awt.Color(255, 51, 0));
        Exit_Btn.setText("خروج");
        Exit_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Exit_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VehDetSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehDetSearchBtnActionPerformed
        //filtering the tables data as typed

        if (plateNrTxtbx.getText().equals("") || plateNrTxtbx.getText().equals("لطفن نمبر پلیت را تایپ کنید")) {
            JOptionPane.showMessageDialog(rootPane, "لطفن نمبر پلیت را تایپ کنید!");
        }
        
        //vehiclesDetailsTable
        if (!plateNrTxtbx.getText().equals("")) {

            DefaultTableModel dm;
            dm = (DefaultTableModel) vehiclesDetailsTable.getModel();
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);

            vehiclesDetailsTable.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(plateNrTxtbx.getText()));

            //jTable_paid_fines
            DefaultTableModel dmjTable_paid_fines;
            dmjTable_paid_fines = (DefaultTableModel) jTable_paid_fines.getModel();
            TableRowSorter<DefaultTableModel> trjTable_paid_fines = new TableRowSorter<DefaultTableModel>(dmjTable_paid_fines);

            jTable_paid_fines.setRowSorter(trjTable_paid_fines);
            trjTable_paid_fines.setRowFilter(RowFilter.regexFilter(plateNrTxtbx.getText()));

        }
        else if (plateNrTxtbx.getText().equals("")) {
                    plateNrTxtbx.setText("لطفن نمبر پلیت را تایپ کنید");

        }
    }//GEN-LAST:event_VehDetSearchBtnActionPerformed

    private void plateNrTxtbxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plateNrTxtbxKeyPressed

        //filtering the table data as typed
        //vehiclesDetailsTable
//        DefaultTableModel dm;
//        dm = (DefaultTableModel) vehiclesDetailsTable.getModel();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
//
//        vehiclesDetailsTable.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(plateNrTxtbx.getText()));
//
//        //
//                DefaultTableModel dm2;
//        dm2 = (DefaultTableModel) jTable_paid_fines.getModel();
//        TableRowSorter<DefaultTableModel> tr2 = new TableRowSorter<DefaultTableModel>(dm2);
//
//        vehiclesDetailsTable.setRowSorter(tr2);
//        tr2.setRowFilter(RowFilter.regexFilter(plateNrTxtbx.getText()));

    }//GEN-LAST:event_plateNrTxtbxKeyPressed

    private void plateNrTxtbxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plateNrTxtbxMouseClicked
        plateNrTxtbx.setText("");
    }//GEN-LAST:event_plateNrTxtbxMouseClicked

    private void Exit_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_BtnActionPerformed
        dashboard d= new dashboard();
        this.dispose();
        d.show();
        
    }//GEN-LAST:event_Exit_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(fine_view_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fine_view_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fine_view_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fine_view_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fine_view_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit_Btn;
    private javax.swing.JButton VehDetSearchBtn;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_traffic_sign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTabbedPane jTabbedPane_vwPaidFines;
    public javax.swing.JTable jTable_paid_fines;
    private javax.swing.JTable jTable_registeredVehicles;
    private javax.swing.JTextField plateNrTxtbx;
    public javax.swing.JTable vehiclesDetailsTable;
    // End of variables declaration//GEN-END:variables

}
