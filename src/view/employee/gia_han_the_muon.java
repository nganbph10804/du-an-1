/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.employee;

/**
 *
 * @author Administrator
 */
public class gia_han_the_muon extends javax.swing.JInternalFrame {

    /**
     * Creates new form gia_han_the_muon
     */
    public gia_han_the_muon() {
        initComponents();
        cbodate.setEnabled(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtdg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtdg2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtpm = new javax.swing.JTextField();
        txttc = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtslc10 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        cbodate = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        btnloan = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel6 = new javax.swing.JPanel();
        btnsearch2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txttm1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtemail1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdiachi1 = new javax.swing.JTextArea();
        txtname1 = new javax.swing.JTextField();
        txtdg1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnsearch3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtslc4 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        txtslc5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtslc6 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtslc7 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(52, 143, 80));
        kGradientPanel1.setkStartColor(new java.awt.Color(86, 180, 211));
        kGradientPanel1.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mã độc giả");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 90, 30);

        txtdg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdgActionPerformed(evt);
            }
        });
        jPanel1.add(txtdg);
        txtdg.setBounds(10, 40, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Họ tên");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 70, 70, 30);

        txtname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname);
        txtname.setBounds(10, 100, 240, 30);

        txtdg2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdg2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtdg2);
        txtdg2.setBounds(10, 160, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 130, 110, 30);

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(20, 110, 380, 210);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Phí mượn"));
        jPanel5.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Thời hạn");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(270, 20, 70, 30);

        txtpm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpmActionPerformed(evt);
            }
        });
        jPanel5.add(txtpm);
        txtpm.setBounds(90, 20, 160, 30);

        txttc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttcActionPerformed(evt);
            }
        });
        jPanel5.add(txttc);
        txttc.setBounds(90, 70, 160, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Tiền cọc");
        jPanel5.add(jLabel26);
        jLabel26.setBounds(10, 70, 70, 30);

        txtslc10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtslc10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtslc10ActionPerformed(evt);
            }
        });
        jPanel5.add(txtslc10);
        txtslc10.setBounds(90, 120, 160, 30);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Tổng cộng");
        jPanel5.add(jLabel27);
        jLabel27.setBounds(10, 120, 80, 30);

        cbodate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ngày", "2 ngày", "3 ngày", "4 ngày", "5 ngày", "6 ngày", "7 ngày" }));
        jPanel5.add(cbodate);
        cbodate.setBounds(350, 20, 80, 30);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Phí mượn");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(10, 20, 70, 30);

        btnloan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnloan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N
        btnloan.setText("Gia hạn");
        jPanel5.add(btnloan);
        btnloan.setBounds(270, 90, 150, 50);

        kGradientPanel1.add(jPanel5);
        jPanel5.setBounds(20, 330, 440, 190);

        kGradientPanel2.setkEndColor(new java.awt.Color(52, 143, 80));
        kGradientPanel2.setkStartColor(new java.awt.Color(86, 180, 211));
        kGradientPanel2.setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm độc giả"));
        jPanel6.setLayout(null);

        btnsearch2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifying-glass.png"))); // NOI18N
        btnsearch2.setText("Tìm");
        btnsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch2ActionPerformed(evt);
            }
        });
        jPanel6.add(btnsearch2);
        btnsearch2.setBounds(260, 50, 80, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField3);
        jTextField3.setBounds(10, 50, 240, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Số điện thoại");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(10, 30, 100, 17);

        kGradientPanel2.add(jPanel6);
        jPanel6.setBounds(10, 10, 360, 100);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin độc giả"));
        jPanel7.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Mã thẻ mượn");
        jPanel7.add(jLabel15);
        jLabel15.setBounds(10, 50, 100, 17);

        txttm1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttm1ActionPerformed(evt);
            }
        });
        jPanel7.add(txttm1);
        txttm1.setBounds(120, 50, 130, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Họ tên");
        jPanel7.add(jLabel16);
        jLabel16.setBounds(10, 90, 100, 17);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Mã độc giả");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(10, 20, 100, 17);

        txtemail1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtemail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemail1ActionPerformed(evt);
            }
        });
        jPanel7.add(txtemail1);
        txtemail1.setBounds(10, 160, 240, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Địa chỉ");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(10, 190, 100, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Email");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(10, 140, 100, 17);

        txtdiachi1.setColumns(20);
        txtdiachi1.setRows(5);
        jScrollPane2.setViewportView(txtdiachi1);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(10, 210, 240, 90);

        txtname1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname1ActionPerformed(evt);
            }
        });
        jPanel7.add(txtname1);
        txtname1.setBounds(10, 110, 240, 30);

        txtdg1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdg1ActionPerformed(evt);
            }
        });
        jPanel7.add(txtdg1);
        txtdg1.setBounds(120, 10, 130, 30);

        kGradientPanel2.add(jPanel7);
        jPanel7.setBounds(10, 120, 360, 320);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm sách"));
        jPanel8.setLayout(null);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField4);
        jTextField4.setBounds(20, 40, 240, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Tên sách");
        jPanel8.add(jLabel20);
        jLabel20.setBounds(20, 20, 100, 17);

        btnsearch3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifying-glass.png"))); // NOI18N
        btnsearch3.setText("Tìm");
        btnsearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch3ActionPerformed(evt);
            }
        });
        jPanel8.add(btnsearch3);
        btnsearch3.setBounds(270, 40, 80, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Số lượng còn");
        jPanel8.add(jLabel21);
        jLabel21.setBounds(20, 80, 100, 30);

        txtslc4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtslc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtslc4ActionPerformed(evt);
            }
        });
        jPanel8.add(txtslc4);
        txtslc4.setBounds(120, 80, 70, 30);

        kGradientPanel2.add(jPanel8);
        jPanel8.setBounds(420, 10, 440, 120);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin mượn"));
        jPanel9.setLayout(null);

        txtslc5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtslc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtslc5ActionPerformed(evt);
            }
        });
        jPanel9.add(txtslc5);
        txtslc5.setBounds(90, 20, 70, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Số lượng");
        jPanel9.add(jLabel22);
        jLabel22.setBounds(10, 20, 70, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Thời hạn");
        jPanel9.add(jLabel23);
        jLabel23.setBounds(10, 60, 70, 30);

        txtslc6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtslc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtslc6ActionPerformed(evt);
            }
        });
        jPanel9.add(txtslc6);
        txtslc6.setBounds(90, 60, 160, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Giá tiền");
        jPanel9.add(jLabel24);
        jLabel24.setBounds(10, 100, 70, 30);

        txtslc7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtslc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtslc7ActionPerformed(evt);
            }
        });
        jPanel9.add(txtslc7);
        txtslc7.setBounds(90, 100, 160, 30);

        kGradientPanel2.add(jPanel9);
        jPanel9.setBounds(420, 140, 430, 150);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Phí mượn"));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        kGradientPanel2.add(jPanel10);
        jPanel10.setBounds(420, 300, 430, 130);

        kGradientPanel1.add(kGradientPanel2);
        kGradientPanel2.setBounds(0, 0, 0, 0);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Đầu sách", "SL", "Giá sách", "Thời hạn", "Ngày mượn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowVerticalLines(false);
        jScrollPane3.setViewportView(jTable1);

        kGradientPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(410, 10, 480, 310);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Phiếu mượn"));
        jPanel2.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(20, 40, 240, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Mã phiếu mượn");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 20, 130, 17);

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifying-glass.png"))); // NOI18N
        btnsearch.setText("Tìm");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnsearch);
        btnsearch.setBounds(270, 40, 80, 30);

        kGradientPanel1.add(jPanel2);
        jPanel2.setBounds(20, 10, 380, 90);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/music-and-multimedia.png"))); // NOI18N
        kGradientPanel1.add(jButton2);
        jButton2.setBounds(600, 330, 70, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next (1).png"))); // NOI18N
        kGradientPanel1.add(jButton3);
        jButton3.setBounds(700, 330, 70, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdgActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpmActionPerformed

    private void txttcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttcActionPerformed

    private void txtslc10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtslc10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtslc10ActionPerformed

    private void btnsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearch2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txttm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttm1ActionPerformed

    private void txtemail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemail1ActionPerformed

    private void txtname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname1ActionPerformed

    private void txtdg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdg1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btnsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearch3ActionPerformed

    private void txtslc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtslc4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtslc4ActionPerformed

    private void txtslc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtslc5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtslc5ActionPerformed

    private void txtslc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtslc6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtslc6ActionPerformed

    private void txtslc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtslc7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtslc7ActionPerformed

    private void txtdg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdg2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnloan;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsearch2;
    private javax.swing.JButton btnsearch3;
    private javax.swing.JComboBox<String> cbodate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField txtdg;
    private javax.swing.JTextField txtdg1;
    private javax.swing.JTextField txtdg2;
    private javax.swing.JTextArea txtdiachi1;
    private javax.swing.JTextField txtemail1;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtpm;
    private javax.swing.JTextField txtslc10;
    private javax.swing.JTextField txtslc4;
    private javax.swing.JTextField txtslc5;
    private javax.swing.JTextField txtslc6;
    private javax.swing.JTextField txtslc7;
    private javax.swing.JTextField txttc;
    private javax.swing.JTextField txttm1;
    // End of variables declaration//GEN-END:variables
}
