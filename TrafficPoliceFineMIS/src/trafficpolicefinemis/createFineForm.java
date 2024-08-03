package trafficpolicefinemis;

import com.sun.javafx.scene.layout.region.Margins;
import javax.swing.JOptionPane;

public class createFineForm extends javax.swing.JFrame {

    function func = new function();
    dashboard d = new dashboard();

    public createFineForm() {
        initComponents();

        func.loadFineAmountCombobox(jComboBoxAmountOfFine);
        func.loadFineType(jComboBox_typeOfFine);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_fineCreate = new javax.swing.JPanel();
        jlabel_datetime = new javax.swing.JLabel();
        jLabel_date = new javax.swing.JLabel();
        jLabel_color = new javax.swing.JLabel();
        jLabel_vehTypelbl2 = new javax.swing.JLabel();
        jLabel_makeYear = new javax.swing.JLabel();
        jLabel_makeYear2 = new javax.swing.JLabel();
        jLabel_fineAmount = new javax.swing.JLabel();
        jLabel_prvince2 = new javax.swing.JLabel();
        jLabel_prvince = new javax.swing.JLabel();
        jLabel_engnr = new javax.swing.JLabel();
        jLabel_engnr2 = new javax.swing.JLabel();
        jLabel_vin = new javax.swing.JLabel();
        jLabel_vin2 = new javax.swing.JLabel();
        jLabel_messageInfo = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();
        jComboBox_typeOfFine = new javax.swing.JComboBox<>();
        createFineBtn = new javax.swing.JButton();
        btnFindPlate = new javax.swing.JButton();
        jLabel_fineType = new javax.swing.JLabel();
        printSlipFineBtn = new javax.swing.JButton();
        jLabel_vehTypelbl = new javax.swing.JLabel();
        jLabel_color2 = new javax.swing.JLabel();
        jLabel_trafficSign = new javax.swing.JLabel();
        jTextField_plateNr = new javax.swing.JTextField();
        btnExitt_cff1 = new javax.swing.JButton();
        jLabel_platenr = new javax.swing.JLabel();
        jLabel_platenr2 = new javax.swing.JLabel();
        jComboBoxAmountOfFine = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel_fineCreate.setBackground(new java.awt.Color(204, 204, 204));

        jlabel_datetime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel_datetime.setForeground(new java.awt.Color(255, 51, 51));
        jlabel_datetime.setText("000000");
        jlabel_datetime.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_date.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_date.setText("تاریخ");
        jLabel_date.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_color.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_color.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_color.setText("رنگ");
        jLabel_color.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_vehTypelbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_vehTypelbl2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vehTypelbl2.setText("000000");
        jLabel_vehTypelbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_makeYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_makeYear.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_makeYear.setText("سال تولید");
        jLabel_makeYear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_makeYear2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_makeYear2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_makeYear2.setText("000000");
        jLabel_makeYear2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_fineAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_fineAmount.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_fineAmount.setText("مبلغ جریمه");
        jLabel_fineAmount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_prvince2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_prvince2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_prvince2.setText("000000");
        jLabel_prvince2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_prvince.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_prvince.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_prvince.setText("ولایت");
        jLabel_prvince.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_engnr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_engnr.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_engnr.setText("انجن");
        jLabel_engnr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_engnr2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_engnr2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_engnr2.setText("000000");
        jLabel_engnr2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_vin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_vin.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vin.setText("شاسی");
        jLabel_vin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_vin2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_vin2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vin2.setText("000000");
        jLabel_vin2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_messageInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_messageInfo.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_messageInfo.setText("نمبر پلیت را وارد سازید:");
        jLabel_messageInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_title.setText("سیستم جرایم پولیس ترافیک کابل");
        jLabel_title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_typeOfFine.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox_typeOfFine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_typeOfFine.setForeground(new java.awt.Color(255, 51, 51));

        createFineBtn.setBackground(new java.awt.Color(255, 0, 0));
        createFineBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createFineBtn.setForeground(new java.awt.Color(255, 255, 255));
        createFineBtn.setText("اجرای جریمه");
        createFineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFineBtnActionPerformed(evt);
            }
        });

        btnFindPlate.setBackground(new java.awt.Color(255, 0, 0));
        btnFindPlate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFindPlate.setForeground(new java.awt.Color(255, 255, 255));
        btnFindPlate.setText("دریافت");
        btnFindPlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPlateActionPerformed(evt);
            }
        });

        jLabel_fineType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_fineType.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_fineType.setText("نوع جریمه");
        jLabel_fineType.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        printSlipFineBtn.setBackground(new java.awt.Color(255, 0, 0));
        printSlipFineBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        printSlipFineBtn.setForeground(new java.awt.Color(255, 255, 255));
        printSlipFineBtn.setText("چاپ سلپ جریمه");
        printSlipFineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printSlipFineBtnActionPerformed(evt);
            }
        });

        jLabel_vehTypelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_vehTypelbl.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_vehTypelbl.setText("نوعیت واسطه");
        jLabel_vehTypelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_color2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_color2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_color2.setText("000000");
        jLabel_color2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_trafficSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trafline.2.png"))); // NOI18N

        jTextField_plateNr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_plateNr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_plateNrKeyPressed(evt);
            }
        });

        btnExitt_cff1.setBackground(new java.awt.Color(255, 0, 0));
        btnExitt_cff1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExitt_cff1.setForeground(new java.awt.Color(255, 255, 255));
        btnExitt_cff1.setText("خروج");
        btnExitt_cff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitt_cff1ActionPerformed(evt);
            }
        });

        jLabel_platenr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_platenr.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_platenr.setText("پلیت");
        jLabel_platenr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_platenr2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_platenr2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_platenr2.setText("000000");
        jLabel_platenr2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBoxAmountOfFine.setBackground(new java.awt.Color(255, 51, 51));
        jComboBoxAmountOfFine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxAmountOfFine.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel_fineCreateLayout = new javax.swing.GroupLayout(jPanel_fineCreate);
        jPanel_fineCreate.setLayout(jPanel_fineCreateLayout);
        jPanel_fineCreateLayout.setHorizontalGroup(
            jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_fineCreateLayout.createSequentialGroup()
                .addGap(0, 132, Short.MAX_VALUE)
                .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_fineCreateLayout.createSequentialGroup()
                        .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                                .addComponent(jLabel_prvince2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186)
                                .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_color2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_makeYear2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_vin2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(jLabel_engnr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_vehTypelbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlabel_datetime, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_date, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_engnr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_vin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_color, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_vehTypelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_makeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_fineCreateLayout.createSequentialGroup()
                        .addComponent(btnFindPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_fineCreateLayout.createSequentialGroup()
                                .addComponent(jTextField_plateNr, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_messageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(244, 244, 244))
                            .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                                .addComponent(jLabel_prvince, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_fineCreateLayout.createSequentialGroup()
                        .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_fineCreateLayout.createSequentialGroup()
                                .addComponent(jLabel_platenr2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_fineCreateLayout.createSequentialGroup()
                                .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox_typeOfFine, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxAmountOfFine, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(200, 200, 200))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_fineAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_fineType, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_platenr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(517, 517, 517))))
            .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel_trafficSign))
                    .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(printSlipFineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(createFineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnExitt_cff1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_fineCreateLayout.setVerticalGroup(
            jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_messageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_plateNr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                        .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_prvince, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel_datetime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_prvince2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                                .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_makeYear2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                                            .addGap(100, 100, 100)
                                            .addComponent(jLabel_fineAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                                            .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel_platenr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_platenr2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jComboBox_typeOfFine, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_fineType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(jComboBoxAmountOfFine, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_vin2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                                .addComponent(jLabel_vehTypelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_color2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel_engnr2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_fineCreateLayout.createSequentialGroup()
                        .addComponent(jLabel_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_vehTypelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_color, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_makeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_vin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_engnr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel_fineCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printSlipFineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createFineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExitt_cff1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel_trafficSign)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel_fineCreate);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitt_cff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitt_cff1ActionPerformed
        this.dispose();
        login log= new login();
        log.show();
    }//GEN-LAST:event_btnExitt_cff1ActionPerformed

    private void printSlipFineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printSlipFineBtnActionPerformed
        print_fine_slip pfs = new print_fine_slip();
        pfs.jTextArea_fineSlip.setFont(new java.awt.Font("Dialog", 1, 22));        
        pfs.jTextArea_fineSlip.append("\t\t\t\t"
                + "جمهوری اسلامی افغانستان\n"
                + "\t\t\t"
                + "ریاست عمومی ترافیک\n"
                + "\t\t\t\t"
                + "\t" + "پارچه جرایم وسایط نقلیه\n"
                + "\t\t\t*******************************\n\n"
                + "\t\t\t\t\t\t\t\t" + "تاریخ :" + jlabel_datetime.getText() + "\n"
                + "\t\t\t\t\t\t\t\t" + "نوعیت واسطه :" + jLabel_vehTypelbl2.getText() + "\n"
                + "\t\t\t\t\t\t\t\t" + "رنگ :" + jLabel_color2.getText() + "\n"
                + "\t\t\t\t\t\t\t\t" + "مدل سال :" + jLabel_makeYear2.getText() + "\n" 
                + "\t\t\t\t\t\t\t\t" + "شاسی :" + jLabel_vin2.getText() + "\n" 
                + "\t\t\t\t\t\t\t\t" + "ولایت :" + jLabel_prvince2.getText() + "\n" 
                + "\t\t\t\t\t\t\t\t" + "پلیت :" + jLabel_platenr2.getText() + "\n"
                + "\t\t\t\t\t\t\t\t" + "مبلغ :" + jComboBoxAmountOfFine.getSelectedItem().toString() + "\n"
                + "\t\t\t\t\t\t\t\t" + "جریمه :" + jComboBox_typeOfFine.getSelectedItem().toString() + "\n" 
        );

        pfs.show();
    }//GEN-LAST:event_printSlipFineBtnActionPerformed

    private void btnFindPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPlateActionPerformed
        if (jTextField_plateNr.getText().isEmpty() == false) {

            func.loadVehicleDetails(jTextField_plateNr.getText(),
                    jLabel_vehTypelbl2, jLabel_color2, jLabel_makeYear2,
                    jLabel_platenr2, jLabel_vin2, jLabel_engnr2,
                    jLabel_prvince2);
            func.currentDateTime(jlabel_datetime);
            if (func.flag_ != true) {
                JOptionPane.showMessageDialog(this, "این واسط درج سیستم نیست!");

            }
        }

    }//GEN-LAST:event_btnFindPlateActionPerformed

    private void createFineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFineBtnActionPerformed
        if (!jTextField_plateNr.getText().equals("")) {
            createFineForm cff = new createFineForm();
            func.executeFine(
                    jTextField_plateNr.getText(),
                    jlabel_datetime.getText(),
                    jLabel_vehTypelbl2.getText(),
                    jLabel_color2.getText(),
                    Integer.parseInt(jLabel_makeYear2.getText()),
                    jLabel_vin2.getText(),
                    jLabel_engnr2.getText(),
                    jLabel_prvince2.getText(),
                    jLabel_platenr.getText(),
                    jComboBox_typeOfFine.getSelectedItem().toString(),
                    jComboBoxAmountOfFine.getSelectedItem().toString(),
                    cff
            );

        }
    }//GEN-LAST:event_createFineBtnActionPerformed

    private void jTextField_plateNrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_plateNrKeyPressed
        if (jTextField_plateNr.getText().isEmpty() == false) {

            func.loadVehicleDetails(jTextField_plateNr.getText(),
                    jLabel_vehTypelbl2, jLabel_color2, jLabel_makeYear2,
                    jLabel_platenr2, jLabel_vin2, jLabel_engnr2, jLabel_prvince2);
            func.currentDateTime(jlabel_datetime);
//            if (func.flag!=true) {
//                 JOptionPane.showMessageDialog(this, "این واسط درج سیستم نیست!");
//
//            }

        }
    }//GEN-LAST:event_jTextField_plateNrKeyPressed

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
            java.util.logging.Logger.getLogger(createFineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createFineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createFineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createFineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createFineForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitt_cff1;
    private javax.swing.JButton btnFindPlate;
    private javax.swing.JButton createFineBtn;
    private javax.swing.JComboBox<String> jComboBoxAmountOfFine;
    private javax.swing.JComboBox<String> jComboBox_typeOfFine;
    private javax.swing.JLabel jLabel_color;
    private javax.swing.JLabel jLabel_color2;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_engnr;
    private javax.swing.JLabel jLabel_engnr2;
    private javax.swing.JLabel jLabel_fineAmount;
    private javax.swing.JLabel jLabel_fineType;
    private javax.swing.JLabel jLabel_makeYear;
    private javax.swing.JLabel jLabel_makeYear2;
    private javax.swing.JLabel jLabel_messageInfo;
    private javax.swing.JLabel jLabel_platenr;
    private javax.swing.JLabel jLabel_platenr2;
    private javax.swing.JLabel jLabel_prvince;
    private javax.swing.JLabel jLabel_prvince2;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_trafficSign;
    private javax.swing.JLabel jLabel_vehTypelbl;
    private javax.swing.JLabel jLabel_vehTypelbl2;
    private javax.swing.JLabel jLabel_vin;
    private javax.swing.JLabel jLabel_vin2;
    public javax.swing.JPanel jPanel_fineCreate;
    private javax.swing.JTextField jTextField_plateNr;
    private javax.swing.JLabel jlabel_datetime;
    private javax.swing.JButton printSlipFineBtn;
    // End of variables declaration//GEN-END:variables
}
