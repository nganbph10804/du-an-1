/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import Helper.MessageDialog;
import Helper.Validation;
import controller.UserDAO;
import java.util.ArrayList;
import java.util.List;
import model.User;
import view.login;

/**
 *
 * @author Administrator
 */
public class cap_nhat_nv extends javax.swing.JInternalFrame {

    /**
     * Creates new form cap_nhat_nv
     */
    UserDAO dao = new UserDAO();
    List<User> list = new ArrayList<>();

    public cap_nhat_nv() {
        initComponents();
        txtid.setEnabled(false);
        txtuser.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel4 = new javax.swing.JPanel();
        txtsearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnsearch1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdofemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rdomale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(52, 143, 80));
        kGradientPanel1.setkStartColor(new java.awt.Color(86, 180, 211));
        kGradientPanel1.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Tra cứu")));

        txtsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Số điện thoại");

        btnsearch1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifying-glass.png"))); // NOI18N
        btnsearch1.setText("Tìm");
        btnsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnsearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsearch)
                    .addComponent(btnsearch1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
        );

        kGradientPanel1.add(jPanel4);
        jPanel4.setBounds(10, 10, 370, 100);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin nhân viên"));
        jPanel1.setLayout(null);

        buttonGroup1.add(rdofemale);
        rdofemale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdofemale.setText("Nữ");
        jPanel1.add(rdofemale);
        rdofemale.setBounds(420, 200, 89, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ngày sinh");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(340, 120, 90, 17);

        txtdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        jPanel1.add(txtdate);
        txtdate.setBounds(340, 140, 240, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Giới tính");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(340, 180, 90, 17);

        buttonGroup1.add(rdomale);
        rdomale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdomale.setSelected(true);
        rdomale.setText("Nam");
        jPanel1.add(rdomale);
        rdomale.setBounds(340, 200, 60, 25);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Email");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 120, 90, 17);

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail);
        txtemail.setBounds(10, 140, 240, 30);

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eraser.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear);
        btnclear.setBounds(340, 280, 140, 40);

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane3.setViewportView(txtaddress);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 190, 240, 100);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Địa chỉ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 170, 90, 17);

        txtphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtphone);
        txtphone.setBounds(340, 90, 240, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Số điện thoại");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(340, 70, 100, 17);

        txtname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname);
        txtname.setBounds(340, 40, 240, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Họ tên");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(340, 20, 90, 17);

        txtuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel1.add(txtuser);
        txtuser.setBounds(10, 90, 240, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 70, 90, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mã nhân viên");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 20, 110, 17);

        txtid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid);
        txtid.setBounds(10, 40, 240, 30);

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnupdate.setText("Cập nhật");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate);
        btnupdate.setBounds(340, 230, 140, 40);

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(10, 120, 600, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtid.setText("");
        txtuser.setText("");
        txtname.setText("");
        txtdate.setText("");
        rdomale.setSelected(true);
        txtphone.setText("");
        txtemail.setText("");
        txtaddress.setText("");

    }//GEN-LAST:event_btnclearActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void btnsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch1ActionPerformed
        StringBuilder sb = new StringBuilder();
        
        Validation.ValidateEmpty(txtsearch, sb, "Vui lòng nhập SĐT cần tìm");
        Validation.ValidateNumbers(txtsearch, sb, "Vui lòng nhập SĐT là số và không âm");
         if (sb.length()>0) {
            MessageDialog.showErrorDialog(this, sb.toString(), "Lỗi");
            return;
        }
        try {
            User us = dao.searchPhone(txtsearch.getText());
            txtid.setText(us.getUserID());
            txtuser.setText(us.getUserName());
            txtname.setText(us.getName());
            txtdate.setText(us.getBirthDay());
            String sex = us.getGender();
            if (sex.equalsIgnoreCase("Nam")) {
                rdomale.setSelected(true);
            }
            if (sex.equalsIgnoreCase("Nữ")) {
                rdofemale.setSelected(true);
            }
            txtphone.setText(us.getPhone());
            txtemail.setText(us.getEmail());
            txtaddress.setText(us.getAddress());
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.showErrorDialog(this, e.getMessage(), "Không có SĐT");
        }

    }//GEN-LAST:event_btnsearch1ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        Validation.ValidateEmpty(txtname, sb, "Vui lòng nhập họ tên");
        Validation.ValidateEmpty(txtdate, sb, "Vui lòng nhập ngày sinh");
        Validation.ValidateEmpty(txtphone, sb, "Vui lòng nhập số điẹn thoại");
        Validation.ValidateEmpty(txtemail, sb, "Vui lòng nhập họ email");
        Validation.ValidateEmpty(txtaddress, sb, "Vui lòng nhập địa chỉ");
        Validation.ValidateDate(txtdate, sb, "Mời nhập đúng định dạng yyyy-MM-dd");
        Validation.ValidateNumbers(txtphone, sb, "Vui lòng nhập SĐT là số và không âm");
        Validation.ValidateEmail(txtemail, sb, "Vui lòng nhập email the định dạng Example@gmail.com");
        if (sb.length() > 0) {
            MessageDialog.showErrorDialog(this, sb.toString(), "Lỗi");
            return;
        }

        try {
            User us = new User();
            us.setName(txtname.getText());
            us.setBirthDay(txtdate.getText());
            String gender = "";
            if (rdomale.isSelected()) {
                gender = "Nam";
            }
            if (rdofemale.isSelected()) {
                gender = "Nữ";
            }
            us.setGender(gender);
            us.setPhone(txtphone.getText());
            us.setEmail(txtemail.getText());
            us.setAddress(txtaddress.getText());
            us.setUserID(txtid.getText());
            UserDAO dao = new UserDAO();
            if (dao.update(us)) {
                MessageDialog.showMessageDialog(this, "Update nhân viên thành công", "Thông báo");
                txtuser.setText("");
                txtid.setText("");
                txtname.setText("");
                txtdate.setText("");
                rdomale.setSelected(true);
                txtphone.setText("");
                txtemail.setText("");
                txtaddress.setText("");

            } else {
                MessageDialog.showMessageDialog(this, "Update nhân viên thất bại", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.showErrorDialog(this, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsearch1;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JRadioButton rdofemale;
    public javax.swing.JRadioButton rdomale;
    public javax.swing.JTextArea txtaddress;
    public javax.swing.JTextField txtdate;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsearch;
    public javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
