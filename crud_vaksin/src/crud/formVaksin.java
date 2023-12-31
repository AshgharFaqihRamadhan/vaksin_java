package crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.formLogin;

/**
 *
 * @author Ashghar
 */
public class formVaksin extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = crud.koneksi.koneksi();

    public formVaksin() {
        initComponents();
        judul();
        tampilData("");
        reset();

        buttonHapus.setEnabled(false);
        buttonUpdate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nik = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jk = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        buttonSimpan = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePasien = new javax.swing.JTable();
        btnLogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        telp = new javax.swing.JTextField();
        ket = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 48)); // NOI18N
        jLabel1.setText("Form Vaksin");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("NIik");

        nik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nikMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nama");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Jk");

        jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Alamat");

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        tablePasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tablePasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePasienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePasien);

        btnLogout.setText("Loogout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("No Telp");

        ket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUDAH VAKSIN", "BELUM VAKSIN" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Keterangan");

        jLabel8.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel8.setText("Form Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonSimpan)
                                    .addComponent(buttonUpdate))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonReset)
                                    .addComponent(buttonHapus)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telp)
                                    .addComponent(ket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(btnLogout)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(111, 111, 111)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nik, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jk, 0, 323, Short.MAX_VALUE))
                    .addContainerGap(707, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHapus)
                    .addComponent(buttonSimpan))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonReset))
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(81, 81, 81))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(65, 65, 65)
                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO pasien VALUES('" + nik.getText() + "','" + nama.getText() + "','" + alamat.getText() + "','" + jk.getSelectedItem() + "','" + telp.getText()+ "','" + ket.getSelectedItem() + "');");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
            nik.setText("");
            nama.setText("");
            telp.setText("");
            alamat.setText("");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        try {
            int jawab;

            if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin Menghapus data?",
                    "konfiramsi", JOptionPane.YES_NO_OPTION)) == 0) {
                st = cn.createStatement();
                st.executeUpdate("DELETE FROM pasien WHERE nik='"
                        + tabModel.getValueAt(tablePasien.getSelectedRow(), 0) + "'");
                tampilData("");
                reset();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        try {
            st = cn.createStatement();
            st.executeUpdate("UPDATE pasien set "
                    + "nama='" + nama.getText() + "', "
                    + "alamat='" + alamat.getText() + "',"         
                    + "jk='" + jk.getSelectedItem() + "', "   
                    + "telp='" + telp.getText() + "', "
                    + "ket='" + ket.getSelectedItem() +  "'where "+ "nik='" + nik.getText() + "'");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Update Berhasil");
            reset();
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void tablePasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePasienMouseClicked
        // TODO add your handling code here:
        nik.setText(tablePasien.getValueAt(tablePasien.getSelectedRow(), 0).toString());
        nama.setText(tablePasien.getValueAt(tablePasien.getSelectedRow(), 1).toString());
        telp.setText(tablePasien.getValueAt(tablePasien.getSelectedRow(), 2).toString());
        jk.setSelectedItem(tablePasien.getValueAt(tablePasien.getSelectedRow(), 3).toString());
        ket.setSelectedItem(tablePasien.getValueAt(tablePasien.getSelectedRow(), 4).toString());
        alamat.setText(tablePasien.getValueAt(tablePasien.getSelectedRow(), 5).toString());
        buttonSimpan.setEnabled(false);
        buttonUpdate.setEnabled(true);
        buttonHapus.setEnabled(true);
        nik.setEditable(true);
    }//GEN-LAST:event_tablePasienMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        formLogin fl = new formLogin();
        fl.show();
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void nikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nikMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nikMouseClicked

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
            java.util.logging.Logger.getLogger(formVaksin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formVaksin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formVaksin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formVaksin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formVaksin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JComboBox<String> jk;
    private javax.swing.JComboBox<String> ket;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JTable tablePasien;
    private javax.swing.JTextField telp;
    // End of variables declaration//GEN-END:variables
  public void judul() {
        Object[] judul = {
             "Nik", "Nama", "No Telp", "JK", "Keterangan", "Alamat"
        };
        tabModel = new DefaultTableModel(null, judul);
        tablePasien.setModel(tabModel);
    }

    public void reset() {
        nik.setText("");
        nama.setText("");
        telp.setText("");
        jk.setSelectedItem("");
        ket.setSelectedItem("");
        alamat.setText("");
        buttonSimpan.setEnabled(true);
        nik.setEnabled(true);
        buttonUpdate.setEnabled(false);
        buttonHapus.setEnabled(false);
    }

    public void tampilData(String where) {
        try {
            st = cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM pasien" + where);

            while (rs.next()) {
                Object[] data = {
                    rs.getString("nik"),
                    rs.getString("nama"),
                    rs.getString("alamat"),
                    rs.getString("jk"),
                    rs.getString("telp"),
                    rs.getString("ket"),};

                tabModel.addRow(data);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
