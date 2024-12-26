/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterData;

import Koneksi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class SEWAMOBIL extends javax.swing.JFrame {
    Connection conn= (Connection)koneksi.configDB();

    /**
     * Creates new form SEWAMOBIL
     */
    public SEWAMOBIL() {
        initComponents();
        setExtendedState(SEWAMOBIL.MAXIMIZED_BOTH);
        
        load_Date_Time();
        load_table();
        tampil_jenisMobil();
        tampil_namaCustomer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSewa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonHapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonTambah = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonUbah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbKd_Mobil = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtTarif = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        cbKd_Customer = new javax.swing.JComboBox<>();
        jTextField_jumlahHari = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonHitungHari = new javax.swing.JButton();
        jTextFieldTgllPinjam = new javax.swing.JTextField();
        jTextFieldTglKembali = new javax.swing.JTextField();
        txtNamaCustomer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotalSewa = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabelKodeSewa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RENTAL MOBIL");

        jTableSewa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jTableSewa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSewaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSewa);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEWA MOBIL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setFocusCycleRoot(true);

        jButtonHapus.setText("HAPUS");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jLabel2.setText("KD MOBIL");

        jButtonTambah.setText("TAMBAH");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("KD CUSTOMER");

        jButtonUbah.setText("UBAH");
        jButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahActionPerformed(evt);
            }
        });

        jLabel5.setText("TGL PINJAM");

        jLabel4.setText("TGL KEMBALI");

        cbKd_Mobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item" }));
        cbKd_Mobil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKd_MobilItemStateChanged(evt);
            }
        });

        jLabel1.setText("Tarif Per Hari");

        txtTarif.setEditable(false);
        txtTarif.setForeground(new java.awt.Color(255, 51, 51));
        txtTarif.setText("jFormattedTextField3");

        jLabel6.setText("NAMA ");

        cbKd_Customer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbKd_Customer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKd_CustomerItemStateChanged(evt);
            }
        });

        jTextField_jumlahHari.setEditable(false);
        jTextField_jumlahHari.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setText("Rp.");

        jButtonHitungHari.setText("Hitung hari");
        jButtonHitungHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitungHariActionPerformed(evt);
            }
        });

        jTextFieldTgllPinjam.setText("\"dd-MM-yyyy\"");

        jTextFieldTglKembali.setText("\"dd-MM-yyyy\"");
        jTextFieldTglKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTglKembaliActionPerformed(evt);
            }
        });

        txtNamaCustomer.setEditable(false);
        txtNamaCustomer.setText("jTextField4");

        jLabel8.setText("Total Sewa");

        txtTotalSewa.setEditable(false);

        jLabel9.setText("Rp.");

        jButton5.setText("Simpan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabelKodeSewa.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTarif, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cbKd_Mobil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cbKd_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldTgllPinjam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTglKembali, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelKodeSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonHitungHari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_jumlahHari)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(jButtonUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTotalSewa))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelKodeSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbKd_Mobil)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbKd_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonHitungHari)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonHapus)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_jumlahHari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotalSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldTgllPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        // Menampilkan data ke jTable 
        tampilData();
        
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonHitungHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitungHariActionPerformed
              
        try {
            String tglsatu = jTextFieldTgllPinjam.getText();
            DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
            Date tglAwal = (Date) date.parse(tglsatu);
            String tgldua = jTextFieldTglKembali.getText();
            Date tglAkhir = (Date) date.parse(tgldua);
            
            long bedaHari = Math.abs(tglAkhir.getTime()-tglAwal.getTime());
            
            int OkeA = (int) TimeUnit.MILLISECONDS.toDays(bedaHari);
            
            String oke = String.valueOf(OkeA);
            jTextField_jumlahHari.setText(oke);
                       
//            if(TimeUnit.MILLISECONDS.toDays(bedaHari) >= 3){
//                int denda = (int) (TimeUnit.MILLISECONDS.toDays(bedaHari));
//                String oke = String.valueOf(bedaHari);
//                jTextField_jumlahHari.setText(oke);
//            }
        hitungTarif();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButtonHitungHariActionPerformed

    private void jTextFieldTglKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTglKembaliActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldTglKembaliActionPerformed

    private void cbKd_CustomerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKd_CustomerItemStateChanged
        // TODO add your handling code here:
        try {
            if(cbKd_Customer.getSelectedIndex()==0){
                txtNamaCustomer.setText("");
            }else{
                String IDCustomer = cbKd_Customer.getSelectedItem().toString();
                String query = "select Nama from customer where ID_Customer = '"+IDCustomer+"'";

                try {
                    Statement stm=conn.createStatement();
                    ResultSet rs=stm.executeQuery(query);

                    if(rs.next()){
                        txtNamaCustomer.setText(rs.getString("Nama"));
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbKd_CustomerItemStateChanged

    private void cbKd_MobilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKd_MobilItemStateChanged
        // TODO add your handling code here:
        try {
            if(cbKd_Mobil.getSelectedIndex()==0){
                txtTarif.setText("");
            }else{
                String KdMobil = cbKd_Mobil.getSelectedItem().toString();
                String query = "select Tarif_sewa from mobil where Kd_mobil = '"+KdMobil+"'";

                try {
                    Statement stm=conn.createStatement();
                    ResultSet rs=stm.executeQuery(query);

                    if(rs.next()){
                        double j = Double.parseDouble(rs.getString("Tarif_sewa"));
                        txtTarif.setText(String.format("%,.2f", j));
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbKd_MobilItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Simpan data tabel
        simpanData();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // bersihkan isian
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
        // TODO add your handling code here:
         try {
            final String OLD_FORMAT = "dd-MM-yyyy";
            final String NEW_FORMAT = "yyyy-MM-dd";
            
            String oldDateString = jTextFieldTgllPinjam.getText();
            String oldDateString1 = jTextFieldTglKembali.getText();
            String newDateString;
            String newDateString1;
            
            SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
            Date tglpjm = sdf.parse(oldDateString);
            Date tglkmbli = sdf.parse(oldDateString1);
            sdf.applyPattern(NEW_FORMAT);
            newDateString = sdf.format(tglpjm);
            newDateString1 = sdf.format(tglkmbli);
            
            String sql ="UPDATE sewa SET Kd_sewa = '"+jLabelKodeSewa.getText()+"', Kd_Customer = '"+cbKd_Customer.getSelectedItem()+"', Jenis_mobil = '"+cbKd_Mobil.getSelectedItem()+"',Tgl_Pinjam= '"+newDateString+"',Tgl_Kembali= '"+newDateString1+"' WHERE Kd_sewa = '"+jLabelKodeSewa.getText()+"'";
            Connection conn=(Connection)koneksi.configDB();
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        load_table();
        clear();
        
    }//GEN-LAST:event_jButtonUbahActionPerformed

    private void jTableSewaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSewaMouseClicked
        // TODO add your handling code here
        jTextField_jumlahHari.setText("");
        txtTotalSewa.setText("");
        try {
        int baris = jTableSewa.rowAtPoint(evt.getPoint());
        final String OLD_FORMAT = "yyyy-MM-dd";
        final String NEW_FORMAT = "dd-MM-yyyy";

        String oldDateString = jTableSewa.getValueAt(baris, 3).toString();
        String oldDateString1 = jTableSewa.getValueAt(baris, 4).toString();
        String newDateString;
        String newDateString1;

        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
        Date tglpjm = sdf.parse(oldDateString);
        Date tglkmbli = sdf.parse(oldDateString1);
        sdf.applyPattern(NEW_FORMAT);
        newDateString = sdf.format(tglpjm);
        newDateString1 = sdf.format(tglkmbli);
        
        String kdSewa = jTableSewa.getValueAt(baris, 0).toString();
        jLabelKodeSewa.setText(kdSewa);
        String jenisMobil  =jTableSewa.getValueAt(baris, 2).toString();
        cbKd_Mobil.setSelectedItem(jenisMobil);
        String kdCustomer = jTableSewa.getValueAt(baris,1).toString();
        cbKd_Customer.setSelectedItem(kdCustomer);
        
        jTextFieldTgllPinjam.setText(newDateString); 
        jTextFieldTglKembali.setText(newDateString1);    
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jTableSewaMouseClicked

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        String kdSewa = jLabelKodeSewa.getText();
        String query_hapus = "delete from sewa where Kd_sewa = '"+kdSewa+"'";
        try {
            int pilihan = JOptionPane.showConfirmDialog(null, "Hapus data?","Peringatan",JOptionPane.YES_NO_OPTION);
                if(pilihan==JOptionPane.YES_OPTION){
                    PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query_hapus);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                    clear();
                    load_table();
                }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButtonHapusActionPerformed

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
            java.util.logging.Logger.getLogger(SEWAMOBIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEWAMOBIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEWAMOBIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEWAMOBIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEWAMOBIL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbKd_Customer;
    private javax.swing.JComboBox<String> cbKd_Mobil;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonHitungHari;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelKodeSewa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSewa;
    private javax.swing.JTextField jTextFieldTglKembali;
    private javax.swing.JTextField jTextFieldTgllPinjam;
    private javax.swing.JTextField jTextField_jumlahHari;
    private javax.swing.JTextField txtNamaCustomer;
    private javax.swing.JFormattedTextField txtTarif;
    private javax.swing.JFormattedTextField txtTotalSewa;
    // End of variables declaration//GEN-END:variables

private void tampil_namaCustomer() {
         cbKd_Customer.removeAllItems();
         cbKd_Customer.addItem("Pilih Satuan");
         String query = "select ID_Customer from customer order by ID_Customer asc";
         try {
            Statement stm=conn.createStatement();
            ResultSet res=stm.executeQuery(query);
             while (res.next()) {                 
                 cbKd_Customer.addItem(res.getString("ID_Customer"));
             }
             res.last();
             int jumlahData = res.getRow();
             res.first();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }

    
    }

    private void tampil_jenisMobil() {
         cbKd_Mobil.removeAllItems();
         cbKd_Mobil.addItem("Pilih Kategori");
         String query = "select Kd_mobil from mobil order by Kd_mobil asc";
         try {
            Statement stm=conn.createStatement();
            ResultSet res=stm.executeQuery(query);
             while (res.next()) {                 
                 cbKd_Mobil.addItem(res.getString("Kd_mobil"));
             }
             res.last();
             int jumlahData = res.getRow();
             res.first();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

//    private void clear() {
//        jTextFieldBarcode.setText("");
//        jTextFieldNamaBarang.setText("");
//        jComboBoxSatuan.setSelectedIndex(0);
//        jComboBoxKategori.setSelectedIndex(0);
//        jFormattedTextField_Hrg_Beli.setText("");
//        jFormattedTextField_HrgJual.setText("");
//        jFormattedTextField_Stok.setText("");
//    }

    private void load_table(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("No");
        model.addColumn("Kode Sewa");
        model.addColumn("KD Customer");
        model.addColumn("Jenis Mobil");
        model.addColumn("TGL Pinjam");
        model.addColumn("TGL Kembali");
        model.addColumn("Total Sewa");
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "select * from sewa";
            Statement stm=conn.createStatement();
            ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                Object[]o=new Object[6];
                o[0]= res.getString("Kd_sewa");
                o[1]= res.getString("Kd_Customer");
                o[2]= res.getString("Jenis_mobil");
                o[3]= res.getString("Tgl_Pinjam");
                o[4]= res.getString("Tgl_kembali");
                double j = Double.parseDouble(res.getString("Total_Sewa"));
                o[5]= String.format("%,.2f", j);
                model.addRow(o);
            }
            jTableSewa.setModel(model);
        } catch (Exception e) {
        }
}

    private double hitungTarif() {
      String stok = txtTarif.getText();
            String stoka = stok.replace(",", "");
            double stokOke = Double.valueOf(stoka);
      
            double TotalSewa= stokOke * Double.parseDouble(jTextField_jumlahHari.getText());
      
      txtTotalSewa.setText(String.format("%,.2f",TotalSewa));
      
      return TotalSewa;
    }

    private void simpanData() {
        if(cbKd_Mobil.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Masukan Kode Mobil");
        }else if(cbKd_Customer.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Masukan Kode Customer");
        }else if(txtTarif.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Pilih Kode Mobil");
        }else if(txtNamaCustomer.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Pilih Kode Customer");
        }else if(jTextFieldTgllPinjam.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Masukan Tanggal Pinjam");
        }else if(jTextFieldTglKembali.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Masukan Tanggal Kembali");
        }else if(txtTotalSewa.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Masukan Jenis Mobil");
        }else if(jTextField_jumlahHari.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Masukan Tanggal Kembali");
        }else{
            try {
            final String OLD_FORMAT = "dd-MM-yyyy";
            final String NEW_FORMAT = "yyyy-MM-dd";

            // Menyiapkan format tanggal untuk input data ke tabel MySQL
            String oldDateString = jTextFieldTgllPinjam.getText();
            String oldDateString1 = jTextFieldTglKembali.getText();
            String newDateString;
            String newDateString1;
            
            SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
            Date tglpjm = sdf.parse(oldDateString);
            Date tglkmbli = sdf.parse(oldDateString1);
            sdf.applyPattern(NEW_FORMAT);
            newDateString = sdf.format(tglpjm);
            newDateString1 = sdf.format(tglkmbli);
            
            String jnsMobil = cbKd_Mobil.getSelectedItem().toString();
            String kdCustomer = cbKd_Customer.getSelectedItem().toString();
            String nmCustomer = txtNamaCustomer.getText();
            String tglPinjam = newDateString;
            String tglKembali = newDateString1;
            
            String TotalHari = jTextField_jumlahHari.getText();
            String txtTarif = this.txtTarif.getText();
            String tarif = txtTarif.replace(",", "");
            double tarifOke = Double.valueOf(tarif);
            
            String totalSewa = txtTotalSewa.getText();
            String totSewa = totalSewa.replace(",", "");
            double totSewaOke = Double.valueOf(totSewa);
            
            String query ="INSERT INTO `sewa` (`Kd_sewa`, `Kd_Customer`, `Jenis_mobil`, `Tgl_Pinjam`, `Tgl_kembali`, `Total_Sewa`) VALUES (NULL, '"+kdCustomer+"', '"+jnsMobil+"', '"+tglPinjam+"', '"+tglKembali+"', '"+totSewaOke+"');";
            
            int pilihan = JOptionPane.showConfirmDialog(null, "Simpan data?","Peringatan",JOptionPane.YES_NO_OPTION);
                if(pilihan==JOptionPane.YES_OPTION){
                    PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                    clear();
                    load_table();
            }
            }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    private void tampilData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void clear() {
       cbKd_Customer.setSelectedIndex(0);
       cbKd_Mobil.setSelectedIndex(0);
       txtNamaCustomer.setText("");
       txtTarif.setText("");
       txtTotalSewa.setText("");
       jTextFieldTgllPinjam.setText("");
       jTextFieldTglKembali.setText("");
       jTextField_jumlahHari.setText("");
       jLabelKodeSewa.setText("");
    }

    private void load_Date_Time() {
        // Instantiate a Date object
       Date date = new Date();
        
       // display time and date using toString()
       System.out.println(date.toString());
       
    }
}
