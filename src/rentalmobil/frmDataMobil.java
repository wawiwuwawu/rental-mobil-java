package rentalmobil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import myConnection.Koneksi;
import myEntity.Mobil;
import myEntityManager.MobilManager;
import myFunction.JTableMobil;

public class frmDataMobil extends javax.swing.JFrame {

    public frmDataMobil() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        setResizable(false);
        
        tbl_mobil.setModel(sTable);
        tampilTabel();
    }
    
    
    private void bersih()
    {
        txtcarimobil.setText("");
        txt_nomor_polisi.setText("");
        txt_jenis_mobil.setText("");
        txt_merk.setText("");
        txt_biayapinjamperhari.setText("");
        txt_status.setText("");
    }
    
    JTableMobil sTable = new JTableMobil();
    Connection _Cnn;
    Statement st;
    Koneksi db = new Koneksi();
    
    private void tampilTabel ()
    { 
        try
        {
            _Cnn = db.getConnection();
            st = _Cnn.createStatement();
            int row = tbl_mobil.getRowCount();
            for (int i = 0; i < row; i++)
            {
                sTable.removeRow(0, row);
            }
            
            ResultSet rs = st.executeQuery ("select * from Mobil "
                    + "where nomor_polisi like '%"+txtcarimobil.getText()+"%'"
                    + "order by nomor_polisi asc");
            
            while (rs.next())
                
            {
                Mobil m = new Mobil();
                m.setNomor_polisi(rs.getString("nomor_polisi"));
                m.setJenis_mobil(rs.getString("jenis_mobil"));
                m.setMerk(rs.getString("merk"));
                m.setBiaya_pinjam_per_hari(rs.getInt("biaya_pinjam_per_hari"));
                m.setStatus(rs.getString("status"));
                sTable.add(m);
            }
        }
        
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nomor_polisi = new javax.swing.JTextField();
        txt_jenis_mobil = new javax.swing.JTextField();
        txt_merk = new javax.swing.JTextField();
        txt_biayapinjamperhari = new javax.swing.JTextField();
        bt_simpan = new javax.swing.JButton();
        bt_hapus = new javax.swing.JButton();
        bt_reset = new javax.swing.JButton();
        bt_ubah = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mobil = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtcarimobil = new javax.swing.JTextField();
        bt_keluar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Mobil");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Data Mobil");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Nomor Polisi");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Mobil");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Merk");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Biaya Pinjam Per Hari");

        txt_nomor_polisi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_jenis_mobil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_merk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_biayapinjamperhari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bt_simpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_simpan.setText("Simpan");
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        bt_hapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_hapus.setText("Hapus");
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });

        bt_reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_reset.setText("Reset");
        bt_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetActionPerformed(evt);
            }
        });

        bt_ubah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_ubah.setText("Ubah");
        bt_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ubahActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_mobil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_mobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_mobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_mobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_mobil);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Cari Mobil Berdasarkan Nomor");

        txtcarimobil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcarimobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcarimobilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcarimobil, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcarimobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        bt_keluar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_keluar.setText("Keluar");
        bt_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_keluarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Status");

        txt_status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_simpan)
                        .addGap(18, 18, 18)
                        .addComponent(bt_hapus)
                        .addGap(18, 18, 18)
                        .addComponent(bt_reset)
                        .addGap(18, 18, 18)
                        .addComponent(bt_ubah))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_jenis_mobil, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(txt_merk)
                            .addComponent(txt_biayapinjamperhari, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nomor_polisi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_status)))
                    .addComponent(bt_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nomor_polisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_jenis_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_biayapinjamperhari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_simpan)
                            .addComponent(bt_hapus)
                            .addComponent(bt_reset)
                            .addComponent(bt_ubah))
                        .addGap(18, 18, 18)
                        .addComponent(bt_keluar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed
        if (txt_nomor_polisi.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Nomor Polisi Harus diisi"); 
           txt_nomor_polisi.requestFocus();
       }
       
       else if (txt_jenis_mobil.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Jenis kendaraan harus diisi"); 
           txt_jenis_mobil.requestFocus();
       }
       
       else if (txt_merk.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Merk harus diisi");
           txt_merk.requestFocus();
       }
       else if (txt_biayapinjamperhari.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Biaya pinjam harus diisi");
           txt_biayapinjamperhari.requestFocus();
       }
       
       else if (txt_status.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Status harus diisi");
           txt_status.requestFocus();
       }
       
       else if (!txt_status.getText().equalsIgnoreCase("Tersedia") && !txt_status.getText().equalsIgnoreCase("Tidak Tersedia")) 
       {
            JOptionPane.showMessageDialog(null, "Status harus diisi dengan 'Tersedia' atau 'Tidak Tersedia'"); 
            txt_status.requestFocus();
        }
       
       else
       {
           Mobil mobi=new Mobil(txt_nomor_polisi.getText(),txt_jenis_mobil.getText(), 
                   txt_merk.getText(),Integer.valueOf(txt_biayapinjamperhari.getText()), txt_status.getText());
           MobilManager mobijer = new MobilManager();
           
           int i=mobijer.inputData(mobi); 
           if (i==1)
           {
               JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
               bersih();
               txt_nomor_polisi.requestFocus();
               tampilTabel();
           }
           else
           {
              JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"); 
              txt_nomor_polisi.requestFocus();
           }
       }
    }//GEN-LAST:event_bt_simpanActionPerformed

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
if (txt_nomor_polisi.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
            return;
        }

        String nomorPolisi = txt_nomor_polisi.getText();

        int jawab = JOptionPane.showConfirmDialog(rootPane,
            "Hapus Mobil " + nomorPolisi + "?", 
            "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (jawab == JOptionPane.YES_OPTION) 
        {
            MobilManager pm = new MobilManager();
            Mobil mobi = new Mobil(txt_nomor_polisi.getText(), txt_jenis_mobil.getText(), txt_merk.getText(),
                    Integer.valueOf(txt_biayapinjamperhari.getText()), txt_status.getText());
            
            if (pm.hapusData(mobi) == 1) 
            {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");

                int row = tbl_mobil.getRowCount();
                for (int i = 0; i < row; i++) 
                {
                    sTable.removeRow(0,row);
                }
               bersih();
               txt_nomor_polisi.requestFocus();
               tampilTabel();
            
            } 
            
            else 
            {
                JOptionPane.showMessageDialog(this, "data gagal dihapus karena sedang dalam transaksi");
            }
        }
        
        
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void bt_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetActionPerformed
        bersih();
        txt_nomor_polisi.enable(true);
        txt_nomor_polisi.requestFocus();
    }//GEN-LAST:event_bt_resetActionPerformed

    private void txtcarimobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcarimobilActionPerformed
        tampilTabel();
    }//GEN-LAST:event_txtcarimobilActionPerformed

    private void bt_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ubahActionPerformed
        if (txt_nomor_polisi.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Nomor polisi harus diisi");
            txt_nomor_polisi.requestFocus();
        } 
        
        else if (txt_jenis_mobil.getText().trim().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Jenis mobil harus diisi");
            txt_jenis_mobil.requestFocus();
        } 
        
        else if (txt_merk.getText().trim().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Merk harus diisi");
            txt_merk.requestFocus();
        } 
        
        else if (txt_biayapinjamperhari.getText().trim().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Biaya pinjam harus diisi");
            txt_biayapinjamperhari.requestFocus();
        }
        
        else if (!txt_status.getText().equalsIgnoreCase("Tersedia") && !txt_status.getText().equalsIgnoreCase("Tidak Tersedia")) 
        {
            JOptionPane.showMessageDialog(null, "Status harus diisi dengan 'Tersedia' atau 'Tidak Tersedia'"); 
            txt_status.requestFocus();
        }
        
        else 
        {
            try 
            {
                
                Mobil mobi=new Mobil(txt_nomor_polisi.getText(),txt_jenis_mobil.getText(), 
                   txt_merk.getText(),Integer.valueOf(txt_biayapinjamperhari.getText()), txt_status.getText());

                MobilManager mobijer = new MobilManager();
                int i = mobijer.updateData(mobi);
                if (i == 1) 
                {
                    JOptionPane.showMessageDialog(null, "Update Data Berhasil");
                    bersih();
                    txt_nomor_polisi.requestFocus();
                    tampilTabel();
                } 
                
                else 
                {
                    JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
                    txt_nomor_polisi.requestFocus();
                }
            } 
            
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Nomor Polisi harus valid.");
                txt_nomor_polisi.requestFocus();
            }
        }

             
        
    }//GEN-LAST:event_bt_ubahActionPerformed

    private void bt_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_bt_keluarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void tbl_mobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mobilMouseClicked
        
        txt_nomor_polisi.setText(tbl_mobil.getValueAt(tbl_mobil.getSelectedRow(),0).toString()); 
        txt_jenis_mobil.setText(tbl_mobil.getValueAt (tbl_mobil.getSelectedRow(),1).toString());
        txt_merk.setText(tbl_mobil.getValueAt(tbl_mobil.getSelectedRow(),2).toString());
        txt_biayapinjamperhari.setText(tbl_mobil.getValueAt (tbl_mobil.getSelectedRow(),3).toString());
        txt_status.setText(tbl_mobil.getValueAt (tbl_mobil.getSelectedRow(),4).toString());
        
    }//GEN-LAST:event_tbl_mobilMouseClicked

   
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
            java.util.logging.Logger.getLogger(frmDataMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDataMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDataMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDataMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
           
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDataMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDataMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDataMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDataMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmDataMobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_keluar;
    private javax.swing.JButton bt_reset;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JButton bt_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_mobil;
    private javax.swing.JTextField txt_biayapinjamperhari;
    private javax.swing.JTextField txt_jenis_mobil;
    private javax.swing.JTextField txt_merk;
    private javax.swing.JTextField txt_nomor_polisi;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txtcarimobil;
    // End of variables declaration//GEN-END:variables
}
