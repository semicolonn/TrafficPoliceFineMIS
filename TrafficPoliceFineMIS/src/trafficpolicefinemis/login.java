package trafficpolicefinemis;

import java.awt.ComponentOrientation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static trafficpolicefinemis.function.con;

public class login extends javax.swing.JFrame {

    function f = new function();
    databaseDetails dbdetails = new databaseDetails();

    public login() {
        initComponents();
        f.load_usertype(jComboBox_usertype);
        jtextField_username.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jtextField_password.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jComboBox_usertype.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_loginform = new javax.swing.JPanel();
        jLabel_traffic_img = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();
        jPanel_login_cage = new javax.swing.JPanel();
        jLabel_name = new javax.swing.JLabel();
        jtextField_username = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jtextField_password = new javax.swing.JTextField();
        jButton_login = new javax.swing.JButton();
        jLabel_userType = new javax.swing.JLabel();
        jComboBox_usertype = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("سیستم معلوماتی و مدیریتی جمع آوری جرایم ترافیک");
        setResizable(false);

        jPanel_loginform.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_loginform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_traffic_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trafline.2.png"))); // NOI18N
        jPanel_loginform.add(jLabel_traffic_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, -1, -1));

        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_title.setText("سیستم جرایم ریاست پولیس ترافیک کابل");
        jLabel_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_loginform.add(jLabel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 720, 40));

        jPanel_login_cage.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_login_cage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 20));

        jLabel_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_name.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_name.setText("اسم");
        jLabel_name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtextField_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtextField_username.setForeground(new java.awt.Color(255, 0, 0));
        jtextField_username.setToolTipText("");
        jtextField_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jLabel_password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_password.setText("رمز");
        jLabel_password.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtextField_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtextField_password.setForeground(new java.awt.Color(255, 0, 0));
        jtextField_password.setToolTipText("");
        jtextField_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jButton_login.setBackground(new java.awt.Color(255, 0, 0));
        jButton_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("وارد شوید");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jLabel_userType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_userType.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_userType.setText("نوع کاربر");
        jLabel_userType.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox_usertype.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox_usertype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_usertype.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel_login_cageLayout = new javax.swing.GroupLayout(jPanel_login_cage);
        jPanel_login_cage.setLayout(jPanel_login_cageLayout);
        jPanel_login_cageLayout.setHorizontalGroup(
            jPanel_login_cageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_login_cageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_login_cageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_login_cageLayout.createSequentialGroup()
                        .addGroup(jPanel_login_cageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_login_cageLayout.createSequentialGroup()
                                .addComponent(jtextField_username, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel_name))
                            .addGroup(jPanel_login_cageLayout.createSequentialGroup()
                                .addComponent(jtextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel_password))
                            .addGroup(jPanel_login_cageLayout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_login_cageLayout.createSequentialGroup()
                        .addComponent(jComboBox_usertype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel_userType, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel_login_cageLayout.setVerticalGroup(
            jPanel_login_cageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_login_cageLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel_login_cageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_usertype, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_userType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel_login_cageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel_login_cageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jPanel_loginform.add(jPanel_login_cage, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 550, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_loginform, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_loginform, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed

        if (jtextField_username.getText().equals("") || jtextField_password.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "لطفن کاربر و پاسورد را وارد سازید!");
            return;
        }
        if (jComboBox_usertype.getSelectedItem().toString().equals("مدیر سیستم")) {
            try {
                String query = "SELECT * FROM admindetails WHERE name='"
                        + jtextField_username.getText()
                        + "' AND password='" + jtextField_password.getText() + "'";

                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery(query);

                if (rs.next()) {
                    String getName = rs.getString("name");
                    dashboard d = new dashboard();

                    d.jLabeluserName.setText(getName);
                    this.dispose();

                    d.show();
                    //con.close();

                } else {

                    jtextField_username.setText("");
                    jtextField_password.setText("");
                    JOptionPane.showMessageDialog(this, "اسم کاربر یا پاسورد درست نیست!");

                }
            } catch (SQLException ex) {
                Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jComboBox_usertype.getSelectedItem().toString().equals("مامور بانک")) {

            try {
                String query = "SELECT * FROM bankadmindetails WHERE name='"
                        + jtextField_username.getText()
                        + "' AND password='" + jtextField_password.getText() + "'";

                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery(query);

                if (rs.next()) {
                    bankAccount ba = new bankAccount();

                    String getName = rs.getString("name");
                    ba.jLabeluserName.setText(getName);
                    this.dispose();

                    ba.show();
                    //con.close();
                } else {

                    JOptionPane.showMessageDialog(this, "اسم کاربر یا پاسورد درست نیست");
                    jtextField_username.setText("");
                    jtextField_password.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jButton_loginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    protected static javax.swing.JComboBox<String> jComboBox_usertype;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_traffic_img;
    private javax.swing.JLabel jLabel_userType;
    private javax.swing.JPanel jPanel_login_cage;
    private javax.swing.JPanel jPanel_loginform;
    private javax.swing.JTextField jtextField_password;
    private javax.swing.JTextField jtextField_username;
    // End of variables declaration//GEN-END:variables
}
