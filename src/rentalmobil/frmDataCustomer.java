package rentalmobil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import myConnection.Koneksi;
import myEntity.Customer;
import myEntityManager.CustomerManager;
import myFunction.JTableCustomer;

public class frmDataCustomer extends javax.swing.JFrame {
    
    public frmDataCustomer() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        setResizable(false);
        
        tblcustomer.setModel(sTable);
        tampilTabel();
    }
    
    private void bersih()
    {
        txtkodecari.setText("");
        txtnik.setText("");
        txtnama.setText("");
        txtalamat.setText("");
        txttelp.setText("");
        txtsim.setText("");
    }
    
    JTableCustomer sTable = new JTableCustomer();
    Connection _Cnn;
    Statement st;
    Koneksi db = new Koneksi();
    
    private void tampilTabel ()
    { 
        try
        {
            _Cnn = db.getConnection();
            st = _Cnn.createStatement();
            int row = tblcustomer.getRowCount();
            for (int i = 0; i < row; i++)
            {
                sTable.removeRow(0,row);
            }
            
            ResultSet rs = st.executeQuery ("select * from customer "
                    + "where nama like '%"+txtkodecari.getText()+"%'"
                    + "order by nik_customer asc");
            
            while (rs.next())
                
            {
                Customer c = new Customer();
                c.setNik_customer(rs.getInt("nik_customer"));
                c.setNama(rs.getString("nama"));
                c.setAlamat_customer(rs.getString("alamat_customer"));
                c.setNo_telp_customer(rs.getString("no_telp_customer"));
                c.setSim(rs.getString("sim"));
                sTable.add(c);
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
        txtnik = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        txttelp = new javax.swing.JTextField();
        txtsim = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtkodecari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcustomer = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Customer");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Nik Customer");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Alamat");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Nomor Telephone");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("sim");

        txtnik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtalamat.setColumns(20);
        txtalamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        txttelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelpKeyTyped(evt);
            }
        });

        txtsim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtkodecari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtkodecari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkodecariKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Cari Customer Berdasarkan Nama");

        tblcustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblcustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        tblcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblcustomer);

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
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
        jLabel7.setText("Data Customer");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSimpan)
                            .addGap(18, 18, 18)
                            .addComponent(btnHapus)
                            .addGap(18, 18, 18)
                            .addComponent(btnUbah)
                            .addGap(18, 18, 18)
                            .addComponent(btnReset))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtsim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tblcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomerMouseClicked
        txtnik.setText(tblcustomer.getValueAt(tblcustomer.getSelectedRow(),0).toString()); 
        txtnama.setText(tblcustomer.getValueAt(tblcustomer.getSelectedRow(),1).toString()); 
        txtalamat.setText(tblcustomer.getValueAt (tblcustomer.getSelectedRow(),2).toString());
        txttelp.setText(tblcustomer.getValueAt(tblcustomer.getSelectedRow(),3).toString());
        txtsim.setText(tblcustomer.getValueAt (tblcustomer.getSelectedRow(),4).toString());
    }//GEN-LAST:event_tblcustomerMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
       if (txtnama.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Nama harus diisi"); 
           txtnama.requestFocus();
       }
       
       else if (txtalamat.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Alamat harus diisi"); 
           txtalamat.requestFocus();
       }
       
       else if (txttelp.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Telp harus diisi");
           txttelp.requestFocus();
       }
       
       else if (txtsim.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Sim harus diisi");
           txtsim.requestFocus();
       }
       
       else if (!txtsim.getText().equalsIgnoreCase("Punya") && !txtsim.getText().equalsIgnoreCase("Tidak Punya")) 
       {
            JOptionPane.showMessageDialog(null, "SIM harus diisi dengan 'Punya' atau 'Tidak Punya'"); 
            txtsim.requestFocus();
        }
       
       else
       {
           Customer cust=new Customer(txtnama.getText(),txtalamat.getText(), 
                   txttelp.getText(),txtsim.getText());
           CustomerManager cum = new CustomerManager();
           
           int i=cum.inputData(cust); 
           if (i==1)
           {
               JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
               bersih();
               txtnama.requestFocus();
               tampilTabel();
           }
           else
           {
              JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"); 
              txtnama.requestFocus();
           }
       }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (txtnik.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
            return;
        }

        String nikcustomer = txtnik.getText();

        int jawab = JOptionPane.showConfirmDialog(rootPane,
            "Hapus Customer " + nikcustomer + "?", 
            "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (jawab == JOptionPane.YES_OPTION) 
        {
            CustomerManager pm = new CustomerManager();
        
            if (pm.hapusData(Integer.parseInt(nikcustomer)) == 1) 
            {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");

                int row = tblcustomer.getRowCount();
                for (int i = 0; i < row; i++) 
                {
                    sTable.removeRow(0,row);
                }
            bersih();
            txtnama.requestFocus();    
            tampilTabel();
            } 
            
            else 
            {
                JOptionPane.showMessageDialog(this, "data gagal dihapus karena sedang dalam transaksi");
            }
        } 
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        if (txtnama.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Nama harus diisi");
            txtnama.requestFocus();
        } 
        
        else if (txtalamat.getText().trim().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Alamat harus diisi");
            txtalamat.requestFocus();
        } 
        
        else if (txttelp.getText().trim().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Telp harus diisi");
            txttelp.requestFocus();
        } 
        
        else if (txtsim.getText().trim().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Sim harus diisi");
            txtsim.requestFocus();
        }
        
        else if (!txtsim.getText().equalsIgnoreCase("Punya") && !txtsim.getText().equalsIgnoreCase("Tidak Punya")) 
        {
            JOptionPane.showMessageDialog(null, "SIM harus diisi dengan 'Punya' atau 'Tidak Punya'"); 
            txtsim.requestFocus();
        }
        
        else 
        {
            try 
            {
                Customer cust = new Customer();
                cust.setNik_customer(Integer.parseInt(txtnik.getText()));
                cust.setNama(txtnama.getText());
                cust.setAlamat_customer(txtalamat.getText());
                cust.setNo_telp_customer(txttelp.getText());
                cust.setSim(txtsim.getText());

                CustomerManager cum = new CustomerManager();
                int i = cum.updateData(cust);
                if (i == 1) 
                {
                    JOptionPane.showMessageDialog(null, "Update Data Berhasil");
                    bersih();
                    txtnama.requestFocus();
                    tampilTabel();
                } 
                
                else 
                {
                    JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
                    txtnama.requestFocus();
                }
            } 
            
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Nik Customer harus berupa angka yang valid.");
                txtnik.requestFocus();
            }
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        bersih();
        txtnik.enable(true);
        txtnik.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtnik.enable(false);
        txtnama.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void txttelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelpKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txttelpKeyTyped
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
                new frmDataCustomer().setVisible(true);
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
    private javax.swing.JTable tblcustomer;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtkodecari;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtsim;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables
}