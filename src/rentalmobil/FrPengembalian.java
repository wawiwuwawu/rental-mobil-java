package rentalmobil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import myConnection.Koneksi;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import myEntity.Mobil;
import myEntity.Customer;
import myEntity.Pegawai;
import myEntity.Peminjaman;
import myEntity.Pengembalian;
import myEntityManager.PeminjamanManager;
import myEntityManager.MobilManager;
import myEntityManager.PengembalianManager;
import myFunction.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class FrPengembalian extends javax.swing.JFrame {
    JTablePengembalian sTabel = new JTablePengembalian();
    JTablePeminjaman sTabel2 = new JTablePeminjaman();
    JTablePegawai sTabel4 = new JTablePegawai();
    static Connection _Cnn;
    static Koneksi db = new Koneksi();
    static Statement st;
    public void initDB() {
        try {
            _Cnn = db.getConnection();
            st = (Statement) _Cnn.createStatement();
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    public FrPengembalian() {
        initComponents();
        long now = System.currentTimeMillis();
        Date date = new Date(now);
        TPengembalian.getJCalendar().setMaxSelectableDate(date);
        tbl_pengembalian.setModel((AbstractTableModel) sTabel);
        jTable3.setModel((AbstractTableModel) sTabel2);
        jTable4.setModel((AbstractTableModel) sTabel4);
        
        initDB();
        update();
        update2();
        update3();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txt_Peminjaman_1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        btn_ok_peminjaman = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_NIK_1 = new javax.swing.JTextField();
        txt_NomorPolisi_1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        btn_ok_pegawai = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_IdTransaksi = new javax.swing.JTextField();
        txt_IdCustomer = new javax.swing.JTextField();
        txt_NomorPolisi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TPengembalian = new com.toedter.calendar.JDateChooser();
        txt_IdPegawai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_IdPegawai = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_IdPengembalian = new javax.swing.JTextField();
        btn_KembaliMobil = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_IdPeminjaman = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pengembalian = new javax.swing.JTable();

        jFrame2.setTitle("Peminjaman");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Id Peminjaman");

        txt_Peminjaman_1.setEditable(false);
        txt_Peminjaman_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setText("Batal");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        btn_ok_peminjaman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ok_peminjaman.setText("OK");
        btn_ok_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ok_peminjamanActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setText("Nik Customer");

        txt_NIK_1.setEditable(false);
        txt_NIK_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_NomorPolisi_1.setEditable(false);
        txt_NomorPolisi_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setText("Nomor Polisi");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NIK_1)
                            .addComponent(txt_Peminjaman_1)
                            .addComponent(txt_NomorPolisi_1))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ok_peminjaman))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_Peminjaman_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txt_NIK_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_NomorPolisi_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(btn_ok_peminjaman))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jFrame3.setTitle("Pegawai");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jTable4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("Id Pegawai");

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("Batal");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        btn_ok_pegawai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ok_pegawai.setText("OK");
        btn_ok_pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ok_pegawaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ok_pegawai)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(btn_ok_pegawai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Transaksi Pengembalian");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Id Peminjaman");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Id Pelanggan");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Mobil");

        txt_IdTransaksi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_IdCustomer.setEditable(false);
        txt_IdCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_NomorPolisi.setEditable(false);
        txt_NomorPolisi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_NomorPolisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomorPolisiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal Pengembalian");

        TPengembalian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_IdPegawai.setEditable(false);
        txt_IdPegawai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_IdPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdPegawaiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Id Pegawai");

        btn_IdPegawai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_IdPegawai.setText("...");
        btn_IdPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IdPegawaiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Id Pengembalian");

        txt_IdPengembalian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_KembaliMobil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_KembaliMobil.setText("Kembalikan Mobil");
        btn_KembaliMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KembaliMobilActionPerformed(evt);
            }
        });

        btn_keluar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        btn_IdPeminjaman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_IdPeminjaman.setText("...");
        btn_IdPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IdPeminjamanActionPerformed(evt);
            }
        });

        btnCetak.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCetak.setText("Cetak Data");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_KembaliMobil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(btn_keluar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_IdPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_IdPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addComponent(txt_IdTransaksi))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_IdPegawai)
                                        .addComponent(btn_IdPeminjaman))))))
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_IdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_NomorPolisi, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCetak)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_IdPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_IdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_IdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_IdPeminjaman))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_IdPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_IdPegawai)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_NomorPolisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(TPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_KembaliMobil)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_keluar)
                        .addComponent(btnCetak)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_pengembalian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_pengembalian.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pengembalianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pengembalian);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KembaliMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KembaliMobilActionPerformed



            java.sql.Date tgl = new java.sql.Date(TPengembalian.getDate().getTime());
            Pengembalian pengem = new Pengembalian(Integer.valueOf(txt_IdTransaksi.getText()),Integer.valueOf(txt_IdPegawai.getText()),Integer.valueOf(txt_IdCustomer.getText()),
                    txt_NomorPolisi.getText(),tgl);
           PengembalianManager pm = new PengembalianManager();
           
           int i=pm.simpanData(pengem); 
           if (i==1)
           {
               JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
               String status = "Tersedia";
               String sql = "UPDATE mobil Set status =? WHERE nomor_polisi ='"+txt_NomorPolisi.getText()+"'";
               PreparedStatement stat = null;
               try {
                   stat = _Cnn.prepareStatement(sql);
                   stat.setString(1, status);
                   stat.executeUpdate();
               }catch(Exception e){}
               clear();
               txt_IdTransaksi.requestFocus();
               update();
           }
           else
           {
              JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"); 
              txt_IdTransaksi.requestFocus();
           }
    }//GEN-LAST:event_btn_KembaliMobilActionPerformed

    private void tbl_pengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pengembalianMouseClicked
        int row = tbl_pengembalian.rowAtPoint(evt.getPoint());
        txt_IdPengembalian.setText(tbl_pengembalian.getValueAt(row, 0).toString());
        txt_IdTransaksi.setText(tbl_pengembalian.getValueAt(row, 1).toString());
        txt_IdPegawai.setText(tbl_pengembalian.getValueAt(row, 2).toString());
        txt_IdCustomer.setText(tbl_pengembalian.getValueAt(row, 3).toString());
        txt_NomorPolisi.setText(tbl_pengembalian.getValueAt(row, 4).toString());
        TPengembalian.setDate(Date.valueOf(tbl_pengembalian.getValueAt(row, 5).toString()));
    }//GEN-LAST:event_tbl_pengembalianMouseClicked

    private void btn_ok_peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ok_peminjamanActionPerformed
        jFrame2.setVisible(false);
        txt_IdTransaksi.setText(txt_Peminjaman_1.getText());
        txt_IdCustomer.setText(txt_NIK_1.getText());
        txt_NomorPolisi.setText(txt_NomorPolisi_1.getText());
    }//GEN-LAST:event_btn_ok_peminjamanActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int row = jTable3.rowAtPoint(evt.getPoint());
        txt_Peminjaman_1.setText(jTable3.getValueAt(row, 0).toString());
        txt_NIK_1.setText(jTable3.getValueAt(row, 3).toString());
        txt_NomorPolisi_1.setText(jTable3.getValueAt(row, 2).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jFrame2.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btn_IdPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IdPegawaiActionPerformed
        jFrame3.setSize(500, 415);
        jFrame3.setVisible(true);
    }//GEN-LAST:event_btn_IdPegawaiActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
             int row = jTable4.rowAtPoint(evt.getPoint());
        jTextField10.setText(jTable4.getValueAt(row, 0).toString());
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         jFrame3.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btn_ok_pegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ok_pegawaiActionPerformed
        jFrame3.setVisible(false);
        txt_IdPegawai.setText(jTextField10.getText());
    }//GEN-LAST:event_btn_ok_pegawaiActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed

        dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_IdPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IdPeminjamanActionPerformed
        jFrame2.setSize(450, 500);
        jFrame2.setVisible(true);
    }//GEN-LAST:event_btn_IdPeminjamanActionPerformed

    private void txt_NomorPolisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomorPolisiActionPerformed
        
    }//GEN-LAST:event_txt_NomorPolisiActionPerformed

    private void txt_IdPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdPegawaiActionPerformed
        
    }//GEN-LAST:event_txt_IdPegawaiActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed

    String jdbc_driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String pass = "";
    String url = "jdbc:mysql://localhost:3306/rental_mobil"; 
    File reportFile = new File(".");
    String dirr = "";

    try {
        
        Class.forName(jdbc_driver);
        Connection conn = DriverManager.getConnection(url, user, pass); 

        
        Statement stat = conn.createStatement();
        String sql = "SELECT * FROM pengembalian_mobil";
        ResultSet rs = stat.executeQuery(sql); 
        dirr = reportFile.getCanonicalPath() + "/src/Laporan/";

        JasperDesign design = JRXmlLoader.load(dirr + "reportPengembalian.jrxml");
        JasperReport jr = JasperCompileManager.compileReport(design);

        JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
        JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
      
        JasperViewer.viewReport(jp, false);

    } catch (ClassNotFoundException | SQLException | IOException | JRException ex) {
     
        JOptionPane.showMessageDialog(null, "\nGagal Mencetak\n" + ex, "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }

 
        
    }//GEN-LAST:event_btnCetakActionPerformed

    private void clear() {
        txt_IdPengembalian.setText("");
        txt_IdTransaksi.setText("");
        txt_IdPegawai.setText("");
        txt_IdCustomer.setText("");
        txt_NomorPolisi.setText("");
        TPengembalian.setDate(null);
    }
    
    private void update() {
        try {
            int row = tbl_pengembalian.getRowCount();
            for (int i = 0; i< row; i++) {
                sTabel.removeRow(0, row);
            }
            ResultSet rs = st.executeQuery("select * from pengembalian_mobil order by id_pengembalian desc");
            while(rs.next()) {
                Pengembalian m = new Pengembalian(Integer.valueOf(rs.getString(1)),Integer.valueOf(rs.getString(2)),Integer.valueOf(rs.getString(3)),
                        Integer.valueOf(rs.getString(4)), rs.getString(5) ,Date.valueOf(rs.getString(6)));
                sTabel.add(m);
            }
        } catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void update2() {
        try {
            int row = jTable3.getRowCount();
            for (int i = 0; i< row; i++) {
                sTabel2.removeRow(0, row);
            }
            ResultSet rs = st.executeQuery("select * from peminjaman_mobil order by id_peminjaman desc");
            while(rs.next()) {
                Peminjaman mk = new Peminjaman(Integer.valueOf(rs.getString(1)),Integer.valueOf(rs.getString(2)),rs.getString(3),
                        Integer.valueOf(rs.getString(4)),Date.valueOf(rs.getString(5)),Integer.valueOf(rs.getString(6)),Integer.valueOf(rs.getString(7)),
                        Integer.valueOf(rs.getString(8)));
                sTabel2.add(mk);
            }
        } catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
        }
    }
    

    
    private void update3() {
        try {
            int row = jTable4.getRowCount();
            for (int i = 0; i< row; i++) {
                sTabel4.removeRow(0, row);
            }
            ResultSet rs = st.executeQuery("select * from pegawai order by id_pegawai desc");
            while(rs.next()) {
                Pegawai pega = new Pegawai(Integer.valueOf(rs.getString(1)),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
                sTabel4.add(pega);
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    

    
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
            java.util.logging.Logger.getLogger(FrPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser TPengembalian;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btn_IdPegawai;
    private javax.swing.JButton btn_IdPeminjaman;
    private javax.swing.JButton btn_KembaliMobil;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_ok_pegawai;
    private javax.swing.JButton btn_ok_peminjaman;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTable tbl_pengembalian;
    private javax.swing.JTextField txt_IdCustomer;
    private javax.swing.JTextField txt_IdPegawai;
    private javax.swing.JTextField txt_IdPengembalian;
    private javax.swing.JTextField txt_IdTransaksi;
    private javax.swing.JTextField txt_NIK_1;
    private javax.swing.JTextField txt_NomorPolisi;
    private javax.swing.JTextField txt_NomorPolisi_1;
    private javax.swing.JTextField txt_Peminjaman_1;
    // End of variables declaration//GEN-END:variables
}
