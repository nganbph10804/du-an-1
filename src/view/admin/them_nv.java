/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import Helper.MessageDialog;
import Helper.Validation;
import controller.UserDAO;
import model.User;

/**
 *
 * @author Administrator
 */
public class them_nv extends javax.swing.JInternalFrame {

    /**
     * Creates new form them_nv
     */
    public them_nv() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rdomale = new javax.swing.JRadioButton();
        rdofemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        btnadd = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(52, 143, 80));
        kGradientPanel1.setkStartColor(new java.awt.Color(86, 180, 211));
        kGradientPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Username");
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(30, 20, 90, 17);

        txtuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txtuser);
        txtuser.setBounds(30, 40, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(360, 20, 90, 17);

        txtpass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kGradientPanel1.add(txtpass);
        txtpass.setBounds(360, 40, 240, 31);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Họ tên");
        kGradientPanel1.add(jLabel8);
        jLabel8.setBounds(30, 70, 90, 17);

        txtname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txtname);
        txtname.setBounds(30, 90, 240, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ngày sinh");
        kGradientPanel1.add(jLabel9);
        jLabel9.setBounds(360, 70, 90, 17);

        txtdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txtdate);
        txtdate.setBounds(360, 90, 240, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Số điện thoại");
        kGradientPanel1.add(jLabel10);
        jLabel10.setBounds(30, 120, 100, 17);

        txtphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txtphone);
        txtphone.setBounds(30, 140, 240, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Email");
        kGradientPanel1.add(jLabel12);
        jLabel12.setBounds(360, 180, 90, 17);

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txtemail);
        txtemail.setBounds(360, 200, 240, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Giới tính");
        kGradientPanel1.add(jLabel13);
        jLabel13.setBounds(360, 130, 90, 17);

        buttonGroup1.add(rdomale);
        rdomale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdomale.setSelected(true);
        rdomale.setText("Nam");
        kGradientPanel1.add(rdomale);
        rdomale.setBounds(360, 150, 60, 25);

        buttonGroup1.add(rdofemale);
        rdofemale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdofemale.setText("Nữ");
        kGradientPanel1.add(rdofemale);
        rdofemale.setBounds(440, 150, 89, 25);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Địa chỉ");
        kGradientPanel1.add(jLabel11);
        jLabel11.setBounds(30, 180, 90, 17);

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane3.setViewportView(txtaddress);

        kGradientPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(30, 200, 240, 100);

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.png"))); // NOI18N
        btnadd.setText("Thêm");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnadd);
        btnadd.setBounds(370, 260, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
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

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        Validation.ValidateEmpty(txtuser, sb, "Vui lòng nhập username");
        Validation.ValidateEmpty(txtpass, sb, "Vui lòng nhập password");
        Validation.ValidateEmpty(txtname, sb, "Vui lòng nhập họ tên");
        Validation.ValidateEmpty(txtdate, sb, "Vui lòng nhập ngày sinh");
        Validation.ValidateEmpty(txtphone, sb, "Vui lòng nhập số điẹn thoại");
        Validation.ValidateEmpty(txtemail, sb, "Vui lòng nhập họ email");
        Validation.ValidateEmpty(txtaddress, sb, "Vui lòng nhập địa chỉ");
        Validation.ValidateDate(txtdate, sb, "Mời nhập đúng định dạng yyyy-MM-dd");
        Validation.ValidateNumbers(txtphone, sb, "Vui lòng nhập SĐT là số và không âm");
        Validation.ValidateEmail(txtemail, sb, "Vui lòng nhập email the định dạng Example@gmail.com");
        if (sb.length()>0) {
            MessageDialog.showErrorDialog(this, sb.toString(), "Lỗi");
            return;
        }
        
        try {
            User us = new User();
            us.setUserName(txtuser.getText());
            us.setPassword(new String(txtpass.getPassword()));;
            us.setName(txtname.getText());
             us.setBirthDay(txtdate.getText());
            String gender =null;
            if (rdomale.isSelected()) {
                gender="Nam";
            }
            if (rdofemale.isSelected()) {
                gender="Nữ";
            }
            us.setGender(gender);
            us.setPhone(txtphone.getText());
            us.setEmail(txtemail.getText());       
            us.setAddress(txtaddress.getText());
            UserDAO dao = new UserDAO();
            if (dao.insert(us)) {
                MessageDialog.showMessageDialog(this, "Thêm nhân viên thành công", "Thông báo");
                txtuser.setText("");
                txtpass.setText("");
                txtname.setText("");
                txtdate.setText("");
                rdomale.setSelected(true);
                txtphone.setText("");
                txtemail.setText("");
                txtaddress.setText("");
            }else{
                MessageDialog.showMessageDialog(this, "Thêm nhân viên thất bại", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.showErrorDialog(this, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnaddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton rdofemale;
    private javax.swing.JRadioButton rdomale;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
