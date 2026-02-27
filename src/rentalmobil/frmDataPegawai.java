package rentalmobil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import myConnection.Koneksi;
import myEntity.Pegawai;
import myEntityManager.PegawaiManager;
import myFunction.JTablePegawai;

public class frmDataPegawai extends javax.swing.JFrame {
    
    public frmDataPegawai() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        setResizable(false);
        
        tblpegawai.setModel(sTable);
        tampilTabel();
    }
    
    private void bersih()
    {
        txt_IdPegawai.setText("");
        txt_Nama.setText("");
        txt_Alamat.setText("");
        txt_Telp.setText("");
        txt_Jabatan.setText("");
        txtkodecari.setText("");
    }
    
    JTablePegawai sTable = new JTablePegawai();
    Connection _Cnn;
    Statement st;
    Koneksi db = new Koneksi();
    
    private void tampilTabel ()
    { 
        try
        {
            _Cnn = db.getConnection();
            st = _Cnn.createStatement();
            int row = tblpegawai.getRowCount();
            for (int i = 0; i < row; i++)
            {
                sTable.removeRow(0,row);
            }
            
            ResultSet rs = st.executeQuery ("select * from pegawai "
                    + "where nama like '%"+txtkodecari.getText()+"%'"
                    + "order by id_pegawai asc");
            
            while (rs.next())
                
            {
                Pegawai p = new Pegawai();
                p.setId_pegawai(rs.getInt("id_pegawai"));
                p.setNama(rs.getString("nama"));
                p.setAlamat(rs.getString("alamat"));
                p.setTelp(rs.getString("telp"));
                p.setJabatan(rs.getString("jabatan"));
                sTable.add(p);
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
        txt_IdPegawai = new javax.swing.JTextField();
        txt_Nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Alamat = new javax.swing.JTextArea();
        txt_Telp = new javax.swing.JTextField();
        txt_Jabatan = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtkodecari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpegawai = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Pegawai");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Id Pegawai");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Alamat");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Nomor Telephone");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Jabatan");

        txt_IdPegawai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_Alamat.setColumns(20);
        txt_Alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Alamat.setRows(5);
        jScrollPane1.setViewportView(txt_Alamat);

        txt_Telp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Telp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TelpKeyTyped(evt);
            }
        });

        txt_Jabatan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtkodecari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtkodecari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkodecariKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Cari Pegawai Berdasarkan Nama");

        tblpegawai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblpegawai.setModel(new javax.swing.table.DefaultTableModel(
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
        tblpegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpegawaiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblpegawai);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtkodecari, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtkodecari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Data Pegawai");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSimpan)
                            .addGap(18, 18, 18)
                            .addComponent(btnHapus)
                            .addGap(18, 18, 18)
                            .addComponent(btnUbah)
                            .addGap(18, 18, 18)
                            .addComponent(btnReset)))
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_IdPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Telp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_IdPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnHapus)
                            .addComponent(btnUbah)
                            .addComponent(btnReset))
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkodecariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkodecariKeyTyped
       tampilTabel();
    }//GEN-LAST:event_txtkodecariKeyTyped

    private void tblpegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpegawaiMouseClicked
        txt_IdPegawai.setText(tblpegawai.getValueAt(tblpegawai.getSelectedRow(), 0).toString());
        txt_Nama.setText(tblpegawai.getValueAt(tblpegawai.getSelectedRow(),1).toString()); 
        txt_Alamat.setText(tblpegawai.getValueAt (tblpegawai.getSelectedRow(),2).toString());
        txt_Telp.setText(tblpegawai.getValueAt(tblpegawai.getSelectedRow(),3).toString());
        txt_Jabatan.setText(tblpegawai.getValueAt (tblpegawai.getSelectedRow(),4).toString());
    }//GEN-LAST:event_tblpegawaiMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (txt_Nama.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Nama harus diisi"); 
           txt_Nama.requestFocus();
       } 
       else if (txt_Alamat.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Alamat harus diisi"); 
           txt_Alamat.requestFocus();
       }
       else if (txt_Telp.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Telp harus diisi");
           txt_Telp.requestFocus();
       }
       else if (txt_Jabatan.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Jabatan harus diisi");
           txt_Jabatan.requestFocus();
       }
       else
       {
           Pegawai pega=new Pegawai(txt_Nama.getText(),txt_Alamat.getText(), 
                   txt_Telp.getText(),txt_Jabatan.getText());
           PegawaiManager pem = new PegawaiManager();
           
           int i=pem.inputData(pega); 
           if (i==1)
           {
               JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
               bersih();
               txt_Nama.requestFocus();
               tampilTabel();
           }
           else
           {
              JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"); 
              txt_Nama.requestFocus();
           }
       }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (txt_IdPegawai.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
            return;
        }

        String idpegawai = txt_IdPegawai.getText();

        int jawab = JOptionPane.showConfirmDialog(rootPane,
            "Hapus Pegawai " + idpegawai + "?", 
            "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (jawab == JOptionPane.YES_OPTION) 
        {
            PegawaiManager pm = new PegawaiManager();
        
            if (pm.hapusData(Integer.parseInt(idpegawai)) == 1) 
            {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");

                int row = tblpegawai.getRowCount();
                for (int i = 0; i < row; i++) 
                {
                    sTable.removeRow(0,row);
                }
            
            bersih();
            tampilTabel();
            } 
            
            else 
            {
                JOptionPane.showMessageDialog(this, "data gagal dihapus karena sedang dalam transaksi");
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        if (txt_Nama.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Nama harus diisi");
            txt_Nama.requestFocus();
        } 
        
        else if (txt_Alamat.getText().trim().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Alamat harus diisi");
            txt_Alamat.requestFocus();
        } 
        
        else if (txt_Telp.getText().trim().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Telp harus diisi");
            txt_Telp.requestFocus();
        } 
        
        else if (txt_Jabatan.getText().trim().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Jabatan harus diisi");
            txt_Jabatan.requestFocus();
        }
        
        else 
        {
            try 
            {
                Pegawai pega = new Pegawai();
                pega.setId_pegawai(Integer.parseInt(txt_IdPegawai.getText()));
                pega.setNama(txt_Nama.getText());
                pega.setAlamat(txt_Alamat.getText());
                pega.setTelp(txt_Telp.getText());
                pega.setJabatan(txt_Jabatan.getText());

                PegawaiManager pem = new PegawaiManager();
                int i = pem.updateData(pega);
                if (i == 1) 
                {
                    JOptionPane.showMessageDialog(null, "Update Data Berhasil");
                    bersih();
                    txt_IdPegawai.requestFocus();
                    tampilTabel();
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Data Gagal Diupdate");
                    txt_Nama.requestFocus();
                }
            } 
            
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Kode Pegawai harus berupa angka yang valid.");
                txt_IdPegawai.requestFocus();
            }
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        bersih();
        txt_IdPegawai.enable(true);
        txt_IdPegawai.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txt_IdPegawai.enable(false);
        txt_Nama.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void txt_TelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TelpKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_TelpKeyTyped
    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmDataPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblpegawai;
    private javax.swing.JTextArea txt_Alamat;
    private javax.swing.JTextField txt_IdPegawai;
    private javax.swing.JTextField txt_Jabatan;
    private javax.swing.JTextField txt_Nama;
    private javax.swing.JTextField txt_Telp;
    private javax.swing.JTextField txtkodecari;
    // End of variables declaration//GEN-END:variables
}