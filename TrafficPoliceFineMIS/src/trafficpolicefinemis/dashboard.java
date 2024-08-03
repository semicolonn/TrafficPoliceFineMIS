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
import javax.swing.ImageIcon;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class dashboard extends javax.swing.JFrame {

    function f = new function();
    public String getPlateNr = "";
    boolean flag = false;
    static Connection con;

    //login log= new login();
    public dashboard() {
        initComponents();

        con = (Connection) databaseDetails.conDB();

        //jLabeluserName.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //f.showUserProfilePhoto(log.jComboBox_usertype.getSelectedItem().toString());
        //ImageIcon ii = f.userProfileImage();
        //jLabel_profilePhoto.setIcon(ii);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_dashboard = new javax.swing.JPanel();
        plateNrTxtbx = new javax.swing.JTextField();
        VehDetSearchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehiclesDetailsTable = new javax.swing.JTable();
        jLabel_create_fine = new javax.swing.JLabel();
        jLabel_trafic_image = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();
        jLabeluserName = new javax.swing.JLabel();
        jLabel_reg_veh = new javax.swing.JLabel();
        jButton_exit = new javax.swing.JButton();
        jLabel_vehicles_list = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سیستم معلوماتی و مدیریتی جمع آوری جرایم ترافیک");
        setResizable(false);

        jPanel_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plateNrTxtbx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plateNrTxtbx.setForeground(new java.awt.Color(255, 0, 0));
        plateNrTxtbx.setToolTipText("نمبر پلیت را ورود سازید");
        jPanel_dashboard.add(plateNrTxtbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 410, 40));

        VehDetSearchBtn.setBackground(new java.awt.Color(255, 0, 0));
        VehDetSearchBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VehDetSearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        VehDetSearchBtn.setText("تثبیت واسطه");
        VehDetSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehDetSearchBtnActionPerformed(evt);
            }
        });
        jPanel_dashboard.add(VehDetSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 190, 40));

        vehiclesDetailsTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));
        vehiclesDetailsTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vehiclesDetailsTable.setForeground(new java.awt.Color(255, 51, 51));
        vehiclesDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "نوعیت واسطه", "سال تولید", "نمبر پلیت", "شاسی", "انجن", "رنگ", "ولایت", "مالک", "کشور", "شرکت تولید"
            }
        ));
        vehiclesDetailsTable.setEnabled(false);
        vehiclesDetailsTable.setGridColor(new java.awt.Color(255, 51, 51));
        vehiclesDetailsTable.setMaximumSize(new java.awt.Dimension(2147483647, 50));
        vehiclesDetailsTable.setRowHeight(30);
        vehiclesDetailsTable.setRowMargin(0);
        jScrollPane1.setViewportView(vehiclesDetailsTable);

        jPanel_dashboard.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 1070, 120));

        jLabel_create_fine.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_create_fine.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_create_fine.setText("تطبیق جریمه");
        jLabel_create_fine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_create_fine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_create_fineMouseClicked(evt);
            }
        });
        jPanel_dashboard.add(jLabel_create_fine, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 150, 40));

        jLabel_trafic_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trafline.2.png"))); // NOI18N
        jPanel_dashboard.add(jLabel_trafic_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_title.setText("سیستم جرایم ریاست پولیس ترافیک کابل");
        jLabel_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_dashboard.add(jLabel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 720, 40));

        jLabeluserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabeluserName.setForeground(new java.awt.Color(255, 51, 51));
        jLabeluserName.setText("کاربر");
        jPanel_dashboard.add(jLabeluserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 150, 70));

        jLabel_reg_veh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_reg_veh.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_reg_veh.setText("ثبت وسایط");
        jLabel_reg_veh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_reg_veh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_reg_vehMouseClicked(evt);
            }
        });
        jPanel_dashboard.add(jLabel_reg_veh, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, -1, 30));

        jButton_exit.setBackground(new java.awt.Color(51, 255, 0));
        jButton_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_exit.setForeground(new java.awt.Color(255, 51, 51));
        jButton_exit.setText("خروج");
        jButton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitActionPerformed(evt);
            }
        });
        jPanel_dashboard.add(jButton_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 130, 40));

        jLabel_vehicles_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_vehicles_list.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vehicles_list.setText("لیست وسایط جریمه شده");
        jLabel_vehicles_list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_vehicles_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_vehicles_listMouseClicked(evt);
            }
        });
        jPanel_dashboard.add(jLabel_vehicles_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VehDetSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehDetSearchBtnActionPerformed

        //search vehicles details by plate or registeration number
        if (plateNrTxtbx.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "لطفن نمبر پلیت را وارد سازید!");
        } else {
            int counter = 0;

            if (counter == 0) {
                try {
                    getPlateNr = plateNrTxtbx.getText();

                    String query = "SELECT * FROM vehicles_view_table WHERE regNr='" + plateNrTxtbx.getText() + "'";

                    Statement st = con.createStatement();

                    ResultSet rs = st.executeQuery(query);

                    if (rs.next()) {

                        DefaultTableModel dm = (DefaultTableModel) vehiclesDetailsTable.getModel();
                        //   while (rs.next()) {

                        Object obj[] = {
                            rs.getString("vehType"), 
                            rs.getString("year"),
                            rs.getString("regNr"), 
                            rs.getString("vin"),
                            rs.getString("engNr"), 
                            rs.getString("color"), 
                            rs.getString("provinceName"),
                            rs.getString("owner"),
                            rs.getString("country_name"),
                            rs.getString("brand_name")
                            
                        };
                        dm.addRow(obj);

                        //  }
                    } else if (!rs.next()) {
                        //filtering the table data as typed
                        DefaultTableModel dm;
                        dm = (DefaultTableModel) vehiclesDetailsTable.getModel();
                        TableRowSorter<DefaultTableModel> tr
                                = new TableRowSorter<DefaultTableModel>(dm);

                        vehiclesDetailsTable.setRowSorter(tr);
                        tr.setRowFilter(RowFilter.regexFilter(plateNrTxtbx.getText()));
                        JOptionPane.showMessageDialog(rootPane, " پلیت نمبر" + " "
                                + getPlateNr + " " + "درج سیستم نیست!");
                        plateNrTxtbx.setText("");
                                            con.close();

                    }

                    //con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_VehDetSearchBtnActionPerformed

    private void jLabel_create_fineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_create_fineMouseClicked

        if (plateNrTxtbx.getText().equals("")) {
            return;
        } else {
            flag=true;
            this.dispose();
            createFineForm cff = new createFineForm();
            cff.show();
        }
    }//GEN-LAST:event_jLabel_create_fineMouseClicked

    private void jLabel_reg_vehMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_reg_vehMouseClicked
        registerVehicle rv=new registerVehicle();
        rv.show();
    }//GEN-LAST:event_jLabel_reg_vehMouseClicked

    private void jButton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitActionPerformed
        this.dispose();
        login log= new login();
        log.show();
        
    }//GEN-LAST:event_jButton_exitActionPerformed

    private void jLabel_vehicles_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_vehicles_listMouseClicked
        fine_view_table fvt= new fine_view_table();
        fvt.show();
        this.dispose();
    }//GEN-LAST:event_jLabel_vehicles_listMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VehDetSearchBtn;
    private javax.swing.JButton jButton_exit;
    private javax.swing.JLabel jLabel_create_fine;
    private javax.swing.JLabel jLabel_reg_veh;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_trafic_image;
    private javax.swing.JLabel jLabel_vehicles_list;
    public static javax.swing.JLabel jLabeluserName;
    private javax.swing.JPanel jPanel_dashboard;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField plateNrTxtbx;
    private javax.swing.JTable vehiclesDetailsTable;
    // End of variables declaration//GEN-END:variables

}
