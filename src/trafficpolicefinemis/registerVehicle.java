package trafficpolicefinemis;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static trafficpolicefinemis.function.con;

/**
 *
 * @author DE LL
 */
public class registerVehicle extends javax.swing.JFrame {

    function f = new function();

    boolean flag = false;

    public registerVehicle() {
        initComponents();
        f.loadVehicleType(jComboBox_vType);
        f.loadVehicleMakeYear(jComboBox_vYear);
        f.loadProvince(jComboBox_vProvince);
        f.loadCountryMake(jComboBox_vCountry);
        f.loadVehicleBrand(jComboBox_vBrand);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_title_regVeh = new javax.swing.JLabel();
        jComboBox_vType = new javax.swing.JComboBox<>();
        jLabel_vType = new javax.swing.JLabel();
        jLabel_vYear = new javax.swing.JLabel();
        jComboBox_vYear = new javax.swing.JComboBox<>();
        jLabel_vPlateNr = new javax.swing.JLabel();
        jLabel_vVin = new javax.swing.JLabel();
        jLabel_vEngNr = new javax.swing.JLabel();
        jLabel_vColor = new javax.swing.JLabel();
        jComboBox_vProvince = new javax.swing.JComboBox<>();
        jLabelـvProvince = new javax.swing.JLabel();
        jLabel_vOwner = new javax.swing.JLabel();
        jLabelـvCountry = new javax.swing.JLabel();
        jComboBox_vCountry = new javax.swing.JComboBox<>();
        jLabelـvBrand = new javax.swing.JLabel();
        jComboBox_vBrand = new javax.swing.JComboBox<>();
        textField_vehicleVinNo = new java.awt.TextField();
        textField_vehiclePlateNo = new java.awt.TextField();
        textField_vehicleOwnerName = new java.awt.TextField();
        textField_vehicleEngineNum = new java.awt.TextField();
        textField_vehicleColor = new java.awt.TextField();
        btn_exit = new javax.swing.JButton();
        btn_reg = new javax.swing.JButton();
        jLabel_traffic_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سیستم معلوماتی و مدیریتی جمع آوری جرایم ترافیک");
        setResizable(false);

        jLabel_title_regVeh.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_title_regVeh.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_title_regVeh.setText("سیستم جرایم ریاست پولیس ترافیک کابل");
        jLabel_title_regVeh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_vType.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox_vType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_vType.setForeground(new java.awt.Color(255, 51, 51));

        jLabel_vType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_vType.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vType.setText("نوعیت");
        jLabel_vType.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_vYear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_vYear.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vYear.setText("مدل سال");
        jLabel_vYear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox_vYear.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox_vYear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_vYear.setForeground(new java.awt.Color(255, 51, 51));

        jLabel_vPlateNr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_vPlateNr.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vPlateNr.setText("پلیت");
        jLabel_vPlateNr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_vVin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_vVin.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vVin.setText("شاسی");
        jLabel_vVin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_vEngNr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_vEngNr.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vEngNr.setText("انجن");
        jLabel_vEngNr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_vColor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_vColor.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vColor.setText("رنگ");
        jLabel_vColor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox_vProvince.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox_vProvince.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_vProvince.setForeground(new java.awt.Color(255, 51, 51));

        jLabelـvProvince.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelـvProvince.setForeground(new java.awt.Color(255, 51, 51));
        jLabelـvProvince.setText("ولایت");
        jLabelـvProvince.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_vOwner.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_vOwner.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vOwner.setText("مالک");
        jLabel_vOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelـvCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelـvCountry.setForeground(new java.awt.Color(255, 51, 51));
        jLabelـvCountry.setText("کشور");
        jLabelـvCountry.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox_vCountry.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox_vCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_vCountry.setForeground(new java.awt.Color(255, 51, 51));

        jLabelـvBrand.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelـvBrand.setForeground(new java.awt.Color(255, 51, 51));
        jLabelـvBrand.setText("مدل");
        jLabelـvBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox_vBrand.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox_vBrand.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_vBrand.setForeground(new java.awt.Color(255, 51, 51));

        textField_vehicleVinNo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        textField_vehiclePlateNo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        textField_vehicleOwnerName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        textField_vehicleEngineNum.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        textField_vehicleColor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_exit.setBackground(new java.awt.Color(51, 255, 0));
        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("خروج");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_reg.setBackground(new java.awt.Color(255, 0, 0));
        btn_reg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_reg.setForeground(new java.awt.Color(255, 255, 255));
        btn_reg.setText("راجستر");
        btn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regActionPerformed(evt);
            }
        });

        jLabel_traffic_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trafline.2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_title_regVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox_vProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelـvProvince))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox_vCountry, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox_vBrand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelـvCountry)
                                    .addComponent(jLabelـvBrand)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField_vehicleOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_vehicleColor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_vOwner)
                                    .addComponent(jLabel_vColor)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox_vType, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel_vType))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBox_vYear, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField_vehiclePlateNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(textField_vehicleVinNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField_vehicleEngineNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_vYear)
                                            .addComponent(jLabel_vPlateNr)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel_vVin)
                                                    .addComponent(jLabel_vEngNr)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btn_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(224, 224, 224))))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel_traffic_img)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel_title_regVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_vColor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_vehicleColor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_vProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelـvProvince))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_vOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_vehicleOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_vType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_vType))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_vYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_vYear))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_vPlateNr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_vehiclePlateNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox_vCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_vEngNr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelـvCountry)
                    .addComponent(textField_vehicleEngineNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_vBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelـvBrand)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_vVin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(textField_vehicleVinNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel_traffic_img)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.dispose();
        dashboard dashb = new dashboard();
        dashb.show();

    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regActionPerformed

        String vehicleType = jComboBox_vType.getSelectedItem().toString();
        String vehicleMakeYear = jComboBox_vYear.getSelectedItem().toString();
        String vehiclePlate = textField_vehiclePlateNo.getText();
        String vin = textField_vehicleVinNo.getText();
        String engNr = textField_vehicleEngineNum.getText();
        String color = textField_vehicleColor.getText();
        String province = jComboBox_vProvince.getSelectedItem().toString();
        String ownerName = textField_vehicleOwnerName.getText();
        String countryMake = jComboBox_vCountry.getSelectedItem().toString();
        String vehicleBrand = jComboBox_vBrand.getSelectedItem().toString();

        f.insertVehiclesDetails(vehicleType,
                vehicleMakeYear,
                vehiclePlate,
                vin,
                engNr,
                color,
                province,
                ownerName,
                countryMake,
                vehicleBrand,
                this
        );
        textField_vehiclePlateNo.setText("");
        textField_vehicleEngineNum.setText("");
        textField_vehicleOwnerName.setText("");
        textField_vehicleVinNo.setText("");
        textField_vehicleColor.setText("");
    }//GEN-LAST:event_btn_regActionPerformed

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
            java.util.logging.Logger.getLogger(registerVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_reg;
    private javax.swing.JComboBox<String> jComboBox_vBrand;
    private javax.swing.JComboBox<String> jComboBox_vCountry;
    private javax.swing.JComboBox<String> jComboBox_vProvince;
    private javax.swing.JComboBox<String> jComboBox_vType;
    private javax.swing.JComboBox<String> jComboBox_vYear;
    private javax.swing.JLabel jLabel_title_regVeh;
    private javax.swing.JLabel jLabel_traffic_img;
    private javax.swing.JLabel jLabel_vColor;
    private javax.swing.JLabel jLabel_vEngNr;
    private javax.swing.JLabel jLabel_vOwner;
    private javax.swing.JLabel jLabel_vPlateNr;
    private javax.swing.JLabel jLabel_vType;
    private javax.swing.JLabel jLabel_vVin;
    private javax.swing.JLabel jLabel_vYear;
    private javax.swing.JLabel jLabelـvBrand;
    private javax.swing.JLabel jLabelـvCountry;
    private javax.swing.JLabel jLabelـvProvince;
    private java.awt.TextField textField_vehicleColor;
    private java.awt.TextField textField_vehicleEngineNum;
    private java.awt.TextField textField_vehicleOwnerName;
    private java.awt.TextField textField_vehiclePlateNo;
    private java.awt.TextField textField_vehicleVinNo;
    // End of variables declaration//GEN-END:variables
}
