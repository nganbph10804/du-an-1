/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

/**
 *
 * @author Administrator
 */
public class the_muon_qua_han extends javax.swing.JInternalFrame {

    /**
     * Creates new form the_muon_qua_han
     */
    public the_muon_qua_han() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(52, 143, 80));
        kGradientPanel1.setkStartColor(new java.awt.Color(86, 180, 211));
        kGradientPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu mượn", "Mã độc giả", "Họ tên", "Số điện thoại", "Mã thẻ mượn", "Tên sách", "SL", "Giá sách", "Ngày mượn", "Ngày hết hạn", "Tiền mượn", "Tiền cọc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 790, 430);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kích hoạt", "Quá hạn" }));
        kGradientPanel1.add(jComboBox1);
        jComboBox1.setBounds(140, 10, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Trạng thái");
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(30, 10, 80, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/music-and-multimedia.png"))); // NOI18N
        kGradientPanel1.add(jButton2);
        jButton2.setBounds(320, 500, 70, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next (1).png"))); // NOI18N
        kGradientPanel1.add(jButton3);
        jButton3.setBounds(420, 500, 70, 40);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khoa học", "Chính trị" }));
        kGradientPanel1.add(jComboBox2);
        jComboBox2.setBounds(460, 10, 140, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Thể loại");
        kGradientPanel1.add(jLabel5);
        jLabel5.setBounds(350, 10, 80, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}