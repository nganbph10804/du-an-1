/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.employee;

import javax.swing.JDesktopPane;

/**
 *
 * @author Administrator
 */
public class tra_sach extends javax.swing.JInternalFrame {

    /**
     * Creates new form tra_sach
     */
    public tra_sach() {
        initComponents();
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        txtdg.setEnabled(false);
        txtemail.setEnabled(false);
        txtname.setEnabled(false);
        txttc.setEnabled(false);
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
        btnsearch = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtdg = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txttc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(52, 143, 80));
        kGradientPanel1.setkStartColor(new java.awt.Color(86, 180, 211));
        kGradientPanel1.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm độc giả"));
        jPanel1.setLayout(null);

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifying-glass.png"))); // NOI18N
        btnsearch.setText("Tìm");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch);
        btnsearch.setBounds(260, 50, 80, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(10, 50, 240, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Mã phiếu mượn");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 30, 120, 17);

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(10, 10, 360, 100);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin độc giả"));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Họ tên");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 60, 100, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mã độc giả");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 30, 100, 17);

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail);
        txtemail.setBounds(10, 130, 240, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Số điện thoại");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 110, 100, 17);

        txtname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtname);
        txtname.setBounds(10, 80, 240, 30);

        txtdg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdgActionPerformed(evt);
            }
        });
        jPanel2.add(txtdg);
        txtdg.setBounds(110, 30, 130, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Tiền cọc");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(10, 160, 70, 20);

        txttc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttcActionPerformed(evt);
            }
        });
        jPanel2.add(txttc);
        txttc.setBounds(10, 180, 240, 30);

        kGradientPanel1.add(jPanel2);
        jPanel2.setBounds(10, 120, 360, 230);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jPanel3.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N
        jButton1.setText("Phạt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(262, 26, 133, 57);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return.png"))); // NOI18N
        jButton2.setText("Trả sách");
        jPanel3.add(jButton2);
        jButton2.setBounds(56, 26, 133, 57);

        kGradientPanel1.add(jPanel3);
        jPanel3.setBounds(390, 370, 450, 100);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Đầu sách", "SL", "Giá sách", "Ngày mượn", "Thời hạn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowVerticalLines(false);
        jScrollPane3.setViewportView(jTable1);

        kGradientPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(390, 10, 530, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        phat phat = new phat();
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(phat);
        phat.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttcActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtdg;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttc;
    // End of variables declaration//GEN-END:variables
}
