/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import view.doi_mk;
import view.login;
import view.employee.tra_cuu_nhap_sach;
import view.admin.tra_cuu_the_muon_admin;


/**
 *
 * @author Administrator
 */
public class MDI_admin extends javax.swing.JFrame {

    /**
     * Creates new form MDI_admin
     */
    public MDI_admin() {
        initComponents();
        setLocationRelativeTo(null);
        sach_muon_nn smnn = new sach_muon_nn();
        smnn.setLocation(this.getWidth()/2 - smnn.getWidth()/2,(this.getHeight()-20)/2 - smnn.getHeight()/2 - 20);
        desktopPane.removeAll();
        desktopPane.add(smnn);
        smnn.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý thư viện - MEGABOOK");
        setResizable(false);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home (2).png"))); // NOI18N
        jMenu2.setText("Hệ thống");

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rotation1.png"))); // NOI18N
        jMenuItem13.setText("Đổi mật khẩu");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jMenuItem14.setText("Đăng xuất");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        menuBar.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/name.png"))); // NOI18N
        jMenu4.setText("Quản lí Mượn Sách");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jMenuItem5.setText("Tra cứu");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        menuBar.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book.png"))); // NOI18N
        jMenu5.setText("Quản lí Sách");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (1).png"))); // NOI18N
        jMenuItem7.setText("Tra cứu");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-book.png"))); // NOI18N
        jMenuItem8.setText("Nhập sách");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        menuBar.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/analytics.png"))); // NOI18N
        jMenu6.setText("Thống kê");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reuse-32.png"))); // NOI18N
        jMenuItem3.setText("Phiếu mượn quá hạn");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (1).png"))); // NOI18N
        jMenuItem4.setText("Sách còn trong thư viện");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diagram.png"))); // NOI18N
        jMenuItem6.setText("Sách mượn nhiều nhất trong tháng");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        menuBar.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-groups-32.png"))); // NOI18N
        jMenu7.setText("Quản li nhân viên");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/find-user-male-32.png"))); // NOI18N
        jMenuItem1.setText("Tra cứu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-user-group-woman-man-32.png"))); // NOI18N
        jMenuItem2.setText("Thêm nhân viên");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        menuBar.add(jMenu7);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        doi_mk dmk = new doi_mk();
        desktopPane.removeAll();
        desktopPane.add(dmk);
        dmk.setVisible(true);
        dmk.setLocation(this.getWidth()/2 - dmk.getWidth()/2,(this.getHeight()-20)/2 - dmk.getHeight()/2 - 20);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        login log = new login();
        log.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        tra_cuu_the_muon_admin tm = new tra_cuu_the_muon_admin();
        desktopPane.removeAll();
        desktopPane.add(tm);
        tm.setVisible(true);
        tm.setLocation(this.getWidth()/2 - tm.getWidth()/2,(this.getHeight()-20)/2 - tm.getHeight()/2 - 20);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        tra_cuu_nhap_sach_admin tcns = new tra_cuu_nhap_sach_admin();
        tcns.setLocation(this.getWidth()/2 - tcns.getWidth()/2,(this.getHeight()-20)/2 - tcns.getHeight()/2 - 20);
        desktopPane.removeAll();
        desktopPane.add(tcns);
        tcns.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        nhap_sach ns = new nhap_sach();
//        ns.setLocation(this.getWidth()/2 - ns.getWidth()/2,(this.getHeight()-20)/2 - ns.getHeight()/2 - 20);
        desktopPane.removeAll();
        desktopPane.add(ns);
        ns.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        tra_cuu_nv tcnv = new tra_cuu_nv();
        tcnv.setLocation(this.getWidth()/2 - tcnv.getWidth()/2,(this.getHeight()-20)/2 - tcnv.getHeight()/2 - 20);
        desktopPane.removeAll();
        desktopPane.add(tcnv);
        tcnv.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        sach_muon_nn smnn = new sach_muon_nn();
        smnn.setLocation(this.getWidth()/2 - smnn.getWidth()/2,(this.getHeight()-20)/2 - smnn.getHeight()/2 - 20);
        desktopPane.removeAll();
        desktopPane.add(smnn);
        smnn.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        the_muon_qua_han tmqh = new the_muon_qua_han();
        tmqh.setLocation(this.getWidth()/2 - tmqh.getWidth()/2,(this.getHeight()-20)/2 - tmqh.getHeight()/2 - 20);
        desktopPane.removeAll();
        desktopPane.add(tmqh);
        tmqh.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        sach_con sc = new sach_con();
        sc.setLocation(this.getWidth()/2 - sc.getWidth()/2,(this.getHeight()-20)/2 - sc.getHeight()/2 - 20);
        desktopPane.removeAll();
        desktopPane.add(sc);
        sc.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        them_nv tnc = new them_nv();
        tnc.setLocation(this.getWidth()/2 - tnc.getWidth()/2,(this.getHeight()-20)/2 - tnc.getHeight()/2 - 20);
        desktopPane.removeAll();
        desktopPane.add(tnc);
        tnc.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MDI_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}