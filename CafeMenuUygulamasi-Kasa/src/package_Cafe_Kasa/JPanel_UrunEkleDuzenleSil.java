/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package_Cafe_Kasa;

import javax.swing.JOptionPane;


public class JPanel_UrunEkleDuzenleSil extends javax.swing.JPanel {

    SQLQuaries sqlQuaries = new SQLQuaries();
    String secilenUrun,secilenUrunID;
    int siradakiUrunID;
    public JPanel_UrunEkleDuzenleSil() {
        initComponents();
         jTable_Urunler.setModel(sqlQuaries.tabloAta(sqlQuaries.urunleriGetir));
         int sonID = Integer.parseInt(sqlQuaries.returnUrunSonKayit());
         siradakiUrunID = sonID + 1;
         jLabel_urunID.setText( Integer.toString(siradakiUrunID));
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel_UrunEkle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_YemekTuru = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField_YemekAdi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_YemekFiyati = new javax.swing.JTextField();
        jButton_Ekle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_urunID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Urunler = new javax.swing.JTable();
        jPanel_UrunEkle1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_YemekTuru1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextField_YemekAdi1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_YemekFiyati1 = new javax.swing.JTextField();
        jButton_Duzenle = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_urunID1 = new javax.swing.JLabel();
        jPanel_UrunEkle2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton_Sil = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel_urunID2 = new javax.swing.JLabel();
        jLabel_Tur = new javax.swing.JLabel();
        jLabel_Adi = new javax.swing.JLabel();
        jLabel_Fiyati = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 768));

        panel1.setBackground(new java.awt.Color(226, 226, 226));

        jLabel2.setText("Tür : ");

        jComboBox_YemekTuru.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KAHVALTI", "ARASICAK", "ANAYEMEK", "SALATA", "TATLI", "İÇECEK" }));

        jLabel3.setText("Adı : ");

        jLabel4.setText("Fiyatı : ");

        jTextField_YemekFiyati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_YemekFiyatiActionPerformed(evt);
            }
        });

        jButton_Ekle.setText("Ekle");
        jButton_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EkleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("ÜRÜN EKLE");

        jLabel9.setText("ID : ");

        javax.swing.GroupLayout jPanel_UrunEkleLayout = new javax.swing.GroupLayout(jPanel_UrunEkle);
        jPanel_UrunEkle.setLayout(jPanel_UrunEkleLayout);
        jPanel_UrunEkleLayout.setHorizontalGroup(
            jPanel_UrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UrunEkleLayout.createSequentialGroup()
                .addGroup(jPanel_UrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_UrunEkleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_UrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_UrunEkleLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_UrunEkleLayout.createSequentialGroup()
                                .addGroup(jPanel_UrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_UrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_YemekAdi)
                                    .addComponent(jComboBox_YemekTuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_YemekFiyati)))))
                    .addGroup(jPanel_UrunEkleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_urunID, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_UrunEkleLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_UrunEkleLayout.setVerticalGroup(
            jPanel_UrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_UrunEkleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel_UrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel_urunID, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_YemekTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_YemekAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_YemekFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Ekle)
                .addContainerGap())
        );

        jTable_Urunler.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_Urunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_UrunlerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Urunler);

        jLabel5.setText("Tür : ");

        jComboBox_YemekTuru1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KAHVALTI", "ARASICAK", "ANAYEMEK", "SALATA", "TATLI", "İÇECEK" }));

        jLabel6.setText("Adı : ");

        jLabel7.setText("Fiyatı : ");

        jTextField_YemekFiyati1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_YemekFiyati1ActionPerformed(evt);
            }
        });

        jButton_Duzenle.setText("Düzenle");
        jButton_Duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DuzenleActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("ÜRÜN DÜZENLE");

        jLabel10.setText("ID : ");

        javax.swing.GroupLayout jPanel_UrunEkle1Layout = new javax.swing.GroupLayout(jPanel_UrunEkle1);
        jPanel_UrunEkle1.setLayout(jPanel_UrunEkle1Layout);
        jPanel_UrunEkle1Layout.setHorizontalGroup(
            jPanel_UrunEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UrunEkle1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_UrunEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_UrunEkle1Layout.createSequentialGroup()
                        .addGroup(jPanel_UrunEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel_UrunEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_YemekAdi1)
                            .addComponent(jComboBox_YemekTuru1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_UrunEkle1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_urunID1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_UrunEkle1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_YemekFiyati1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_UrunEkle1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Duzenle)))
                .addContainerGap())
            .addGroup(jPanel_UrunEkle1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_UrunEkle1Layout.setVerticalGroup(
            jPanel_UrunEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_UrunEkle1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel_urunID1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_YemekTuru1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_YemekAdi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_YemekFiyati1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Duzenle)
                .addContainerGap())
        );

        jLabel11.setText("Tür : ");

        jLabel12.setText("Adı : ");

        jLabel13.setText("Fiyatı : ");

        jButton_Sil.setText("Sil");

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setText("ÜRÜN SİL");

        jLabel15.setText("ID : ");

        javax.swing.GroupLayout jPanel_UrunEkle2Layout = new javax.swing.GroupLayout(jPanel_UrunEkle2);
        jPanel_UrunEkle2.setLayout(jPanel_UrunEkle2Layout);
        jPanel_UrunEkle2Layout.setHorizontalGroup(
            jPanel_UrunEkle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UrunEkle2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_UrunEkle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_UrunEkle2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_urunID2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_UrunEkle2Layout.createSequentialGroup()
                        .addGroup(jPanel_UrunEkle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_UrunEkle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Fiyati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Tur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Adi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_UrunEkle2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_UrunEkle2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel_UrunEkle2Layout.setVerticalGroup(
            jPanel_UrunEkle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UrunEkle2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel_urunID2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel_Tur, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel_Adi, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UrunEkle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel_Fiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Sil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel16.setText("ÜRÜN EKLE - DÜZENLE - SİL PANELİ");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel_UrunEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_UrunEkle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_UrunEkle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(22, 22, 22)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jPanel_UrunEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_UrunEkle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_UrunEkle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_YemekFiyatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_YemekFiyatiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_YemekFiyatiActionPerformed

    private void jTextField_YemekFiyati1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_YemekFiyati1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_YemekFiyati1ActionPerformed

    private void jTable_UrunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_UrunlerMouseClicked
       int row = jTable_Urunler.getSelectedRow();
       int column = jTable_Urunler.getColumnCount();
       secilenUrun =""+ jTable_Urunler.getValueAt(row, 0);
       for(int i = 1; i < column; i++) {
            secilenUrun +=" & "+ jTable_Urunler.getValueAt(row, i);
       }
       String[] urunBilgileri = secilenUrun.split(" & ");
       secilenUrunID = urunBilgileri[0];
       jLabel_urunID1.setText(urunBilgileri[0]);
       jTextField_YemekAdi1.setText(urunBilgileri[2]);
       jTextField_YemekFiyati1.setText(urunBilgileri[3]);
       if(urunBilgileri[1].equalsIgnoreCase("KAHVALTI") )
            jComboBox_YemekTuru1.setSelectedIndex(0);
        else if(urunBilgileri[1].equalsIgnoreCase("ARASICAK") )
            jComboBox_YemekTuru1.setSelectedIndex(1);
        else if(urunBilgileri[1].equalsIgnoreCase("ANAYEMEK") )
            jComboBox_YemekTuru1.setSelectedIndex(2);
        else if(urunBilgileri[1].equalsIgnoreCase("SALATA") )
            jComboBox_YemekTuru1.setSelectedIndex(3);
        else if(urunBilgileri[1].equalsIgnoreCase("TATLI") )
            jComboBox_YemekTuru1.setSelectedIndex(4);
        else if(urunBilgileri[1].equalsIgnoreCase("İÇECEK") )
            jComboBox_YemekTuru1.setSelectedIndex(5);
        jLabel_urunID2.setText(urunBilgileri[0]);
        jLabel_Tur.setText(urunBilgileri[1]);
        jLabel_Adi.setText(urunBilgileri[2]);
        jLabel_Fiyati.setText(urunBilgileri[3]);
        
    }//GEN-LAST:event_jTable_UrunlerMouseClicked

    private void jButton_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EkleActionPerformed
        String urunKategori=null,urunAd;
        int urunID;
        float urunUcret;
        if(jComboBox_YemekTuru.getSelectedIndex()==1)
            urunKategori = "KAHVALTI";
        if(jComboBox_YemekTuru.getSelectedIndex()==2)
            urunKategori = "ARASICAK";
        if(jComboBox_YemekTuru.getSelectedIndex()==3)
            urunKategori = "ANAYEMEK";
        if(jComboBox_YemekTuru.getSelectedIndex()==4)
            urunKategori = "SALATA";
        if(jComboBox_YemekTuru.getSelectedIndex()==5)
            urunKategori = "TATLI";
        if(jComboBox_YemekTuru.getSelectedIndex()==6)
            urunKategori = "İÇECEK";
        
        urunAd = jTextField_YemekAdi.getText();
        urunID = Integer.parseInt(jLabel_urunID.getText());
        urunUcret = Float.parseFloat(jTextField_YemekFiyati.getText());
        int result = sqlQuaries.urunEkle(urunKategori,urunAd,urunID,urunUcret);
        if(result==1)
        {
             JOptionPane.showMessageDialog(this,"Ürün Eklendi!!","Başarılı",JOptionPane.PLAIN_MESSAGE);
             jTable_Urunler.setModel(sqlQuaries.tabloAta(sqlQuaries.urunleriGetir));
             int sonID = Integer.parseInt(sqlQuaries.returnUrunSonKayit());
             siradakiUrunID = sonID + 1;
             jLabel_urunID.setText( Integer.toString(siradakiUrunID));
             jTextField_YemekAdi.setText("");
             jTextField_YemekFiyati.setText("");
             jComboBox_YemekTuru.setSelectedIndex(1);
        }
        else
             JOptionPane.showMessageDialog(this,"Ürün Eklenemedi!","Hata",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton_EkleActionPerformed

    private void jButton_DuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DuzenleActionPerformed
       String urunKategori=null,urunAd;
        int urunID;
        float urunUcret;
        if(jComboBox_YemekTuru1.getSelectedIndex()==1)
            urunKategori = "KAHVALTI";
        if(jComboBox_YemekTuru1.getSelectedIndex()==2)
            urunKategori = "ARASICAK";
        if(jComboBox_YemekTuru1.getSelectedIndex()==3)
            urunKategori = "ANAYEMEK";
        if(jComboBox_YemekTuru1.getSelectedIndex()==4)
            urunKategori = "SALATA";
        if(jComboBox_YemekTuru1.getSelectedIndex()==5)
            urunKategori = "TATLI";
        if(jComboBox_YemekTuru1.getSelectedIndex()==6)
            urunKategori = "İÇECEK";
        
        urunAd = jTextField_YemekAdi1.getText();
        urunID = Integer.parseInt(jLabel_urunID1.getText());
        urunUcret = Float.parseFloat(jTextField_YemekFiyati1.getText());
        int result = sqlQuaries.urunDuzenle(urunKategori,urunAd,urunID,urunUcret);
        if(result==1)
        {
             JOptionPane.showMessageDialog(this,"Ürün Düzenlendi!!","Başarılı",JOptionPane.PLAIN_MESSAGE);
             jTable_Urunler.setModel(sqlQuaries.tabloAta(sqlQuaries.urunleriGetir));
             
             jLabel_urunID1.setText("");
             jTextField_YemekAdi1.setText("");
             jTextField_YemekFiyati1.setText("");
             jComboBox_YemekTuru1.setSelectedIndex(1);
        }
        else
             JOptionPane.showMessageDialog(this,"Ürün Düzenlenemedi!","Hata",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton_DuzenleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Duzenle;
    private javax.swing.JButton jButton_Ekle;
    private javax.swing.JButton jButton_Sil;
    private javax.swing.JComboBox jComboBox_YemekTuru;
    private javax.swing.JComboBox jComboBox_YemekTuru1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Adi;
    private javax.swing.JLabel jLabel_Fiyati;
    private javax.swing.JLabel jLabel_Tur;
    private javax.swing.JLabel jLabel_urunID;
    private javax.swing.JLabel jLabel_urunID1;
    private javax.swing.JLabel jLabel_urunID2;
    private javax.swing.JPanel jPanel_UrunEkle;
    private javax.swing.JPanel jPanel_UrunEkle1;
    private javax.swing.JPanel jPanel_UrunEkle2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Urunler;
    private javax.swing.JTextField jTextField_YemekAdi;
    private javax.swing.JTextField jTextField_YemekAdi1;
    private javax.swing.JTextField jTextField_YemekFiyati;
    private javax.swing.JTextField jTextField_YemekFiyati1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
