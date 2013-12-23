/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package_Cafe_Kasa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JPanel_Garsonlar extends javax.swing.JPanel {

    SQLQuaries sqlQuaries = new SQLQuaries();
    String secilenGarson, secilenGarsonSSN=null;
    public JPanel_Garsonlar() {
        initComponents();
        jTable_Garsonlar.setModel(sqlQuaries.tabloAta(sqlQuaries.garsonlariGetir));
    }

    boolean isValidDate(String input) {
        if (input == null || !input.matches("\\d{4}-[01]\\d-[0-3]\\d"))
           return false;
       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       df.setLenient(false);
       try {
           df.parse(input);
           return true;
       } catch (ParseException ex) {
           return false;
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panelGarsonDuzenle = new java.awt.Panel();
        jButton_GarsonDuzenle_Kaydet = new javax.swing.JButton();
        labelGarsonEkle_GarsonAdi2 = new java.awt.Label();
        jTextField_GarsonDuzenle_GarsonAdi = new javax.swing.JTextField();
        jTextField_GarsonDuzenle_GarsonIkinciAd = new javax.swing.JTextField();
        labelGarsonEkle_GarsonIkinciAd1 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi18 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi19 = new java.awt.Label();
        jTextField_GarsonDuzenle_GarsonSoyadi = new javax.swing.JTextField();
        labelGarsonEkle_GarsonSoyadi2 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi20 = new java.awt.Label();
        jTextField_GarsonDuzenle_GarsonDogumTarihi = new javax.swing.JTextField();
        labelGarsonEkle_GarsonYasi21 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi22 = new java.awt.Label();
        jTextField_GarsonDuzenle_GarsonSSN = new javax.swing.JTextField();
        labelGarsonEkle_GarsonYasi23 = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_GarsonDuzenle_GarsonAdres = new javax.swing.JTextArea();
        labelGarsonEkle_GarsonYasi24 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi25 = new java.awt.Label();
        jTextField_GarsonDuzenle_GarsonCinsiyet = new javax.swing.JTextField();
        labelGarsonEkle_GarsonYasi26 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi27 = new java.awt.Label();
        jTextField_GarsonDuzenle_GarsonUstSSN = new javax.swing.JTextField();
        jTextField_GarsonDuzenle_GarsonMaas = new javax.swing.JTextField();
        labelGarsonEkle_GarsonYasi28 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi29 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi30 = new java.awt.Label();
        jTextField_GarsonDuzenle_GarsonBaslamaYili = new javax.swing.JTextField();
        labelGarsonEkle_GarsonYasi31 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi32 = new java.awt.Label();
        panelGarsonEkle = new java.awt.Panel();
        labelGarsonEkle_GarsonAdi = new java.awt.Label();
        labelGarsonEkle_GarsonSoyadi = new java.awt.Label();
        jButtonGarsonEkle_Ekle = new javax.swing.JButton();
        labelGarsonEkle_GarsonYasi = new java.awt.Label();
        jTextField_GarsonEkle_GarsonAdi = new javax.swing.JTextField();
        jTextField_GarsonEkle_GarsonSoyadi = new javax.swing.JTextField();
        jTextField_GarsonEkle_GarsonSSN = new javax.swing.JTextField();
        jTextField_GarsonEkle_Maas = new javax.swing.JTextField();
        jTextField_GarsonEkle_BaslamaYili = new javax.swing.JTextField();
        labelGarsonEkle_GarsonYasi1 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi2 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi6 = new java.awt.Label();
        jTextField_GarsonEkle_GarsonDogumTarihi = new javax.swing.JTextField();
        labelGarsonEkle_GarsonYasi7 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi8 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_GarsonEkle_GarsonAdres = new javax.swing.JTextArea();
        labelGarsonEkle_GarsonYasi9 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi10 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi11 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi12 = new java.awt.Label();
        jTextField_GarsonEkle_GarsonUstSSN = new javax.swing.JTextField();
        labelGarsonEkle_GarsonYasi13 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi14 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi15 = new java.awt.Label();
        labelGarsonEkle_GarsonYasi16 = new java.awt.Label();
        jTextField_GarsonEkle_GarsonIkinciAd = new javax.swing.JTextField();
        labelGarsonEkle_GarsonIkinciAd = new java.awt.Label();
        jTextField_GarsonEkle_GarsonCinsiyet = new javax.swing.JTextField();
        labelGarsonEkle_GarsonYasi17 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Garsonlar = new javax.swing.JTable();
        jButton_GarsonEkle = new javax.swing.JButton();
        jButton_GarsonDuzenle = new javax.swing.JButton();
        jButton_GarsonSil = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1024, 768));

        panel1.setBackground(new java.awt.Color(226, 226, 226));
        panel1.setName(""); // NOI18N
        panel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        panelGarsonDuzenle.setVisible(false);

        jButton_GarsonDuzenle_Kaydet.setText("Kaydet");
        jButton_GarsonDuzenle_Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GarsonDuzenle_KaydetActionPerformed(evt);
            }
        });

        labelGarsonEkle_GarsonAdi2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonAdi2.setText("Adı : ");

        labelGarsonEkle_GarsonIkinciAd1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonIkinciAd1.setText("İkinci Ad : ");

        labelGarsonEkle_GarsonYasi18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi18.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi18.setText("***");

        labelGarsonEkle_GarsonYasi19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi19.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi19.setText("***");

        labelGarsonEkle_GarsonSoyadi2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonSoyadi2.setText("Soyadı : ");

        labelGarsonEkle_GarsonYasi20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi20.setText("Doğum Tarihi : ");

        labelGarsonEkle_GarsonYasi21.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi21.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi21.setText("*Format : yyyy-aa-gg");

        labelGarsonEkle_GarsonYasi22.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi22.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi22.setText("***");

        labelGarsonEkle_GarsonYasi23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi23.setText("SSN :");

        jTextArea_GarsonDuzenle_GarsonAdres.setColumns(20);
        jTextArea_GarsonDuzenle_GarsonAdres.setRows(5);
        jScrollPane3.setViewportView(jTextArea_GarsonDuzenle_GarsonAdres);

        labelGarsonEkle_GarsonYasi24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi24.setText("Adres : ");

        labelGarsonEkle_GarsonYasi25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi25.setText("Cinsiyet : ");

        labelGarsonEkle_GarsonYasi26.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi26.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi26.setText("*** M / F");

        labelGarsonEkle_GarsonYasi27.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi27.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi27.setText("***");

        labelGarsonEkle_GarsonYasi28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi28.setText("Üstünün SSN :");

        labelGarsonEkle_GarsonYasi29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi29.setText("Maaş :");

        labelGarsonEkle_GarsonYasi30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi30.setText("Başlama Yılı : ");

        jTextField_GarsonDuzenle_GarsonBaslamaYili.setToolTipText("");

        labelGarsonEkle_GarsonYasi31.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi31.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi31.setText("***");

        labelGarsonEkle_GarsonYasi32.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelGarsonEkle_GarsonYasi32.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi32.setText("*** ile işaretli alanları doldurmak zorunludur.");

        javax.swing.GroupLayout panelGarsonDuzenleLayout = new javax.swing.GroupLayout(panelGarsonDuzenle);
        panelGarsonDuzenle.setLayout(panelGarsonDuzenleLayout);
        panelGarsonDuzenleLayout.setHorizontalGroup(
            panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                        .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelGarsonEkle_GarsonYasi28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(135, 135, 135)
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelGarsonEkle_GarsonYasi32, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                                        .addComponent(labelGarsonEkle_GarsonSoyadi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_GarsonDuzenle_GarsonIkinciAd)
                                            .addComponent(jTextField_GarsonDuzenle_GarsonAdi, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField_GarsonDuzenle_GarsonSoyadi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(labelGarsonEkle_GarsonIkinciAd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonAdi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57))
                    .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                        .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGarsonDuzenleLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_GarsonDuzenle_GarsonSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_GarsonDuzenle_GarsonDogumTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                                        .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_GarsonDuzenle_GarsonUstSSN)
                                            .addComponent(jTextField_GarsonDuzenle_GarsonBaslamaYili)
                                            .addComponent(jTextField_GarsonDuzenle_GarsonMaas)
                                            .addComponent(jTextField_GarsonDuzenle_GarsonCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)
                                        .addComponent(labelGarsonEkle_GarsonYasi26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
            .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButton_GarsonDuzenle_Kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelGarsonDuzenleLayout.setVerticalGroup(
            panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGarsonDuzenleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelGarsonEkle_GarsonAdi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_GarsonDuzenle_GarsonAdi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGarsonEkle_GarsonYasi18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                        .addComponent(labelGarsonEkle_GarsonIkinciAd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGarsonDuzenleLayout.createSequentialGroup()
                        .addComponent(jTextField_GarsonDuzenle_GarsonIkinciAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                        .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_GarsonDuzenle_GarsonSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGarsonEkle_GarsonYasi19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGarsonEkle_GarsonSoyadi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelGarsonEkle_GarsonYasi20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_GarsonDuzenle_GarsonDogumTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelGarsonEkle_GarsonYasi21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                        .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(labelGarsonEkle_GarsonYasi23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_GarsonDuzenle_GarsonSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGarsonDuzenleLayout.createSequentialGroup()
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelGarsonEkle_GarsonYasi25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_GarsonDuzenle_GarsonCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelGarsonEkle_GarsonYasi26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelGarsonEkle_GarsonYasi28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_GarsonDuzenle_GarsonUstSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelGarsonDuzenleLayout.createSequentialGroup()
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_GarsonDuzenle_GarsonMaas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelGarsonDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_GarsonDuzenle_GarsonBaslamaYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelGarsonEkle_GarsonYasi30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelGarsonEkle_GarsonYasi32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelGarsonEkle_GarsonYasi22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_GarsonDuzenle_Kaydet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGarsonEkle.setVisible(false);

        labelGarsonEkle_GarsonAdi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonAdi.setText("Adı : ");

        labelGarsonEkle_GarsonSoyadi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonSoyadi.setText("Soyadı : ");

        jButtonGarsonEkle_Ekle.setText("Ekle");
        jButtonGarsonEkle_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGarsonEkle_EkleActionPerformed(evt);
            }
        });

        labelGarsonEkle_GarsonYasi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi.setText("SSN :");

        jTextField_GarsonEkle_BaslamaYili.setToolTipText("");

        labelGarsonEkle_GarsonYasi1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi1.setText("Maaş :");

        labelGarsonEkle_GarsonYasi2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi2.setText("Başlama Yılı : ");

        labelGarsonEkle_GarsonYasi6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi6.setText("Doğum Tarihi : ");

        labelGarsonEkle_GarsonYasi7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi7.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi7.setText("*Format : yyyy-aa-gg");

        labelGarsonEkle_GarsonYasi8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi8.setText("Adres : ");

        jTextArea_GarsonEkle_GarsonAdres.setColumns(20);
        jTextArea_GarsonEkle_GarsonAdres.setRows(5);
        jScrollPane2.setViewportView(jTextArea_GarsonEkle_GarsonAdres);

        labelGarsonEkle_GarsonYasi9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi9.setText("Cinsiyet : ");

        labelGarsonEkle_GarsonYasi10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi10.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi10.setText("***");

        labelGarsonEkle_GarsonYasi11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi11.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi11.setText("***");

        labelGarsonEkle_GarsonYasi12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi12.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi12.setText("***");

        labelGarsonEkle_GarsonYasi13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonYasi13.setText("Üstünün SSN :");

        labelGarsonEkle_GarsonYasi14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi14.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi14.setText("***");

        labelGarsonEkle_GarsonYasi15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi15.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi15.setText("***");

        labelGarsonEkle_GarsonYasi16.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        labelGarsonEkle_GarsonYasi16.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi16.setText("*** ile işaretli alanları doldurmak zorunludur.");

        labelGarsonEkle_GarsonIkinciAd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelGarsonEkle_GarsonIkinciAd.setText("İkinci Ad : ");

        labelGarsonEkle_GarsonYasi17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelGarsonEkle_GarsonYasi17.setForeground(new java.awt.Color(255, 0, 0));
        labelGarsonEkle_GarsonYasi17.setText("*** M / F");

        javax.swing.GroupLayout panelGarsonEkleLayout = new javax.swing.GroupLayout(panelGarsonEkle);
        panelGarsonEkle.setLayout(panelGarsonEkleLayout);
        panelGarsonEkleLayout.setHorizontalGroup(
            panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelGarsonEkle_GarsonYasi13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(135, 135, 135)
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelGarsonEkle_GarsonYasi16, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                                        .addComponent(labelGarsonEkle_GarsonSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_GarsonEkle_GarsonIkinciAd, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                            .addComponent(jTextField_GarsonEkle_GarsonAdi, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField_GarsonEkle_GarsonSoyadi, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(labelGarsonEkle_GarsonIkinciAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_GarsonEkle_GarsonSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_GarsonEkle_GarsonDogumTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGarsonEkleLayout.createSequentialGroup()
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_GarsonEkle_GarsonUstSSN, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                            .addComponent(jTextField_GarsonEkle_BaslamaYili)
                                            .addComponent(jTextField_GarsonEkle_Maas)
                                            .addComponent(jTextField_GarsonEkle_GarsonCinsiyet))
                                        .addGap(11, 11, 11)
                                        .addComponent(labelGarsonEkle_GarsonYasi17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
            .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButtonGarsonEkle_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelGarsonEkleLayout.setVerticalGroup(
            panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelGarsonEkle_GarsonAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGarsonEkleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_GarsonEkle_GarsonAdi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGarsonEkle_GarsonYasi10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                        .addComponent(labelGarsonEkle_GarsonIkinciAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGarsonEkleLayout.createSequentialGroup()
                        .addComponent(jTextField_GarsonEkle_GarsonIkinciAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_GarsonEkle_GarsonSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGarsonEkle_GarsonYasi11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGarsonEkle_GarsonSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelGarsonEkle_GarsonYasi6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_GarsonEkle_GarsonDogumTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelGarsonEkle_GarsonYasi7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(labelGarsonEkle_GarsonYasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_GarsonEkle_GarsonSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGarsonEkleLayout.createSequentialGroup()
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGarsonEkle_GarsonYasi8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelGarsonEkle_GarsonYasi9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_GarsonEkle_GarsonCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelGarsonEkle_GarsonYasi17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelGarsonEkle_GarsonYasi13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_GarsonEkle_GarsonUstSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelGarsonEkleLayout.createSequentialGroup()
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_GarsonEkle_Maas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelGarsonEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_GarsonEkle_BaslamaYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGarsonEkle_GarsonYasi15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelGarsonEkle_GarsonYasi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelGarsonEkle_GarsonYasi16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelGarsonEkle_GarsonYasi12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGarsonEkle_Ekle))
        );

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel1.setText("Garsonlar");

        jTable_Garsonlar.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_Garsonlar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_GarsonlarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Garsonlar);

        jButton_GarsonEkle.setText("Garson Ekle");
        jButton_GarsonEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GarsonEkleActionPerformed(evt);
            }
        });

        jButton_GarsonDuzenle.setText("Garson Düzenle");
        jButton_GarsonDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GarsonDuzenleActionPerformed(evt);
            }
        });

        jButton_GarsonSil.setText("Garson Sil");
        jButton_GarsonSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GarsonSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(847, 847, 847)
                .addComponent(panelGarsonEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(802, 802, 802)
                .addComponent(panelGarsonDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jButton_GarsonEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jButton_GarsonDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButton_GarsonSil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelGarsonDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(panelGarsonEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(538, 538, 538))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_GarsonEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_GarsonDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_GarsonSil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setVisibleTruePanelGarsonEkle()
    {   
        panelGarsonEkle.setVisible(true);
        garsonDuzenlePaneliTemizle();
        panelGarsonDuzenle.setVisible(false);
        panelGarsonEkle.setBounds(100, 255, 400, 450);
    }
    
    public void setVisibleTruePanelGarsonDuzenle()
    {   
        panelGarsonDuzenle.setVisible(true);
        garsonEklePaneliTemizle();
        panelGarsonEkle.setVisible(false);
        panelGarsonDuzenle.setBounds(100, 260, 400, 450);
        //garsonDuzenlePaneliDoldur();  
    }
    
    public void visibleFalsePanels()
    {
        panelGarsonEkle.setVisible(false);
        panelGarsonDuzenle.setVisible(false);
        garsonEklePaneliTemizle();
        garsonDuzenlePaneliTemizle();
    }
    private void garsonDuzenlePaneliDoldur()
    {
       int row = jTable_Garsonlar.getSelectedRow();
       int column = jTable_Garsonlar.getColumnCount();
       secilenGarson = (String) jTable_Garsonlar.getValueAt(row, 0);
       for(int i = 1; i < column; i++) {
            secilenGarson +=" & "+ jTable_Garsonlar.getValueAt(row, i);
       }
       String[] garsonBilgileri = secilenGarson.split(" & ");
       secilenGarsonSSN = garsonBilgileri[3];
        jTextField_GarsonDuzenle_GarsonAdi.setText(garsonBilgileri[0]);
        jTextField_GarsonDuzenle_GarsonIkinciAd.setText(garsonBilgileri[1]);
        jTextField_GarsonDuzenle_GarsonSoyadi.setText(garsonBilgileri[2]);
        jTextField_GarsonDuzenle_GarsonSSN.setText(garsonBilgileri[3]);
        jTextField_GarsonDuzenle_GarsonDogumTarihi.setText(garsonBilgileri[4]);
        jTextArea_GarsonDuzenle_GarsonAdres.setText(garsonBilgileri[5]);
        jTextField_GarsonDuzenle_GarsonCinsiyet.setText(garsonBilgileri[6]);
        jTextField_GarsonDuzenle_GarsonMaas.setText(garsonBilgileri[7]);
        jTextField_GarsonDuzenle_GarsonBaslamaYili.setText(garsonBilgileri[8]);
        jTextField_GarsonDuzenle_GarsonUstSSN.setText(garsonBilgileri[9]);
        
    }
    private void jButton_GarsonEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GarsonEkleActionPerformed
         setVisibleTruePanelGarsonEkle();
    }//GEN-LAST:event_jButton_GarsonEkleActionPerformed

    private void jButton_GarsonDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GarsonDuzenleActionPerformed
        setVisibleTruePanelGarsonDuzenle();
    }//GEN-LAST:event_jButton_GarsonDuzenleActionPerformed

    private void jButton_GarsonSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GarsonSilActionPerformed
        garsonDuzenlePaneliTemizle();
        garsonEklePaneliTemizle();
        panelGarsonEkle.setVisible(false);
        panelGarsonDuzenle.setVisible(false);
        
        
        if(secilenGarsonSSN==null)
        {
            JOptionPane.showMessageDialog(null, "Lütfen Bir Garson Seçiniz!", "Garson Seçiniz", JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            int reply = JOptionPane.showConfirmDialog(null," Garsonunuzu Siliyorsunuz.Onaylıyor Musunuz?","ONAY", JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION)
            {
                int result = sqlQuaries.garsonSil(secilenGarsonSSN);
                    if(result==1)
                    {
                        JOptionPane.showMessageDialog(this,"Garson Silindi!!","Başarılı",JOptionPane.PLAIN_MESSAGE);
                        jTable_Garsonlar.setModel(sqlQuaries.tabloAta(sqlQuaries.garsonlariGetir));
                    }
                    else
                        JOptionPane.showMessageDialog(this,"Garson Silinemedi!","Hata",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_GarsonSilActionPerformed

    private void jButtonGarsonEkle_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGarsonEkle_EkleActionPerformed
        String garsonAd=null, garsonIkinciAd=null, garsonSoyad=null, garsonSSN=null, garsonDogumTarih=null, garsonAdres=null,
               garsonCinsiyet=null, garsonBaslangicYili=null, garsonUstSSN=null;
        float garsonMaas;
        if(jTextField_GarsonEkle_GarsonAdi.getText().equalsIgnoreCase("")    || jTextField_GarsonEkle_GarsonSoyadi.getText().equalsIgnoreCase("") || jTextField_GarsonEkle_GarsonSSN.getText().equalsIgnoreCase("") 
           || jTextField_GarsonEkle_GarsonDogumTarihi.getText().equalsIgnoreCase("") || jTextField_GarsonEkle_Maas.getText().equalsIgnoreCase("") || jTextField_GarsonEkle_BaslamaYili.getText().equalsIgnoreCase("") 
           || jTextField_GarsonEkle_GarsonCinsiyet.getText().equalsIgnoreCase("") )
        {
            JOptionPane.showMessageDialog(null, "*** ile işaretli alanları doldurmanız gerekmektedir!", "Eksik Bilgi", JOptionPane.PLAIN_MESSAGE);
        }
        else if(!isValidDate(jTextField_GarsonEkle_GarsonDogumTarihi.getText()))
            {
                JOptionPane.showMessageDialog(null, "Tarih Formatı Yanlış Lütfen Uygun Formatta Yazınız.", "Format Hatası", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                int reply = JOptionPane.showConfirmDialog(null,"Garson Ekleme İşlemini Onaylıyor Musunuz?","ONAY", JOptionPane.YES_NO_OPTION);
                if(reply == JOptionPane.YES_OPTION)
                {
                    garsonAd = jTextField_GarsonEkle_GarsonAdi.getText();
                    garsonIkinciAd = jTextField_GarsonEkle_GarsonIkinciAd.getText();
                    garsonSoyad = jTextField_GarsonEkle_GarsonSoyadi.getText();
                    garsonSSN = jTextField_GarsonEkle_GarsonSSN.getText();
                    garsonDogumTarih = jTextField_GarsonEkle_GarsonDogumTarihi.getText();
                    garsonAdres = jTextArea_GarsonEkle_GarsonAdres.getText();
                    garsonCinsiyet = jTextField_GarsonEkle_GarsonCinsiyet.getText();
                    garsonBaslangicYili = jTextField_GarsonEkle_BaslamaYili.getText();
                    garsonUstSSN = jTextField_GarsonEkle_GarsonUstSSN.getText();
                    garsonMaas = Float.parseFloat(jTextField_GarsonEkle_Maas.getText());

                    int result = sqlQuaries.garsonEkle(garsonAd,garsonIkinciAd,garsonSoyad,garsonSSN,garsonDogumTarih,garsonAdres,garsonCinsiyet,garsonMaas,garsonUstSSN,garsonBaslangicYili);
                    if(result==1)
                    {
                        JOptionPane.showMessageDialog(this,"Garson Eklendi!!","Başarılı",JOptionPane.PLAIN_MESSAGE);
                        jTable_Garsonlar.setModel(sqlQuaries.tabloAta(sqlQuaries.garsonlariGetir));
                    }
                    else
                        JOptionPane.showMessageDialog(this,"Garson Eklenemedi!","Hata",JOptionPane.PLAIN_MESSAGE);
                }
            }   
    }//GEN-LAST:event_jButtonGarsonEkle_EkleActionPerformed

    private void jButton_GarsonDuzenle_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GarsonDuzenle_KaydetActionPerformed
        String garsonAd=null, garsonIkinciAd=null, garsonSoyad=null, garsonSSN=null, garsonDogumTarih=null, garsonAdres=null,
               garsonCinsiyet=null, garsonBaslangicYili=null, garsonUstSSN=null;
        float garsonMaas;
        if(jTextField_GarsonDuzenle_GarsonAdi.getText().equalsIgnoreCase("")    || jTextField_GarsonDuzenle_GarsonSoyadi.getText().equalsIgnoreCase("") || jTextField_GarsonDuzenle_GarsonSSN.getText().equalsIgnoreCase("") 
           || jTextField_GarsonDuzenle_GarsonDogumTarihi.getText().equalsIgnoreCase("") || jTextField_GarsonDuzenle_GarsonMaas.getText().equalsIgnoreCase("") || jTextField_GarsonDuzenle_GarsonBaslamaYili.getText().equalsIgnoreCase("") 
           || jTextField_GarsonDuzenle_GarsonCinsiyet.getText().equalsIgnoreCase("") )
        {
            JOptionPane.showMessageDialog(null, "*** ile işaretli alanları doldurmanız gerekmektedir!", "Eksik Bilgi", JOptionPane.PLAIN_MESSAGE);
        }
        else if(!isValidDate(jTextField_GarsonDuzenle_GarsonDogumTarihi.getText()))
            {
                JOptionPane.showMessageDialog(null, "Tarih Formatı Yanlış Lütfen Uygun Formatta Yazınız.", "Format Hatası", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                int reply = JOptionPane.showConfirmDialog(null,"Garson Güncelleme İşlemini Onaylıyor Musunuz?","ONAY", JOptionPane.YES_NO_OPTION);
                if(reply == JOptionPane.YES_OPTION)
                {
                    garsonAd = jTextField_GarsonDuzenle_GarsonAdi.getText();
                    garsonIkinciAd = jTextField_GarsonDuzenle_GarsonIkinciAd.getText();
                    garsonSoyad = jTextField_GarsonDuzenle_GarsonSoyadi.getText();
                    garsonSSN = jTextField_GarsonDuzenle_GarsonSSN.getText();
                    garsonDogumTarih = jTextField_GarsonDuzenle_GarsonDogumTarihi.getText();
                    garsonAdres = jTextArea_GarsonDuzenle_GarsonAdres.getText();
                    garsonCinsiyet = jTextField_GarsonDuzenle_GarsonCinsiyet.getText();
                    garsonBaslangicYili = jTextField_GarsonDuzenle_GarsonBaslamaYili.getText();
                    garsonUstSSN = jTextField_GarsonDuzenle_GarsonUstSSN.getText();
                    garsonMaas = Float.parseFloat(jTextField_GarsonDuzenle_GarsonMaas.getText());

                    int result = sqlQuaries.garsonDuzenle(garsonAd,garsonIkinciAd,garsonSoyad,garsonSSN,garsonDogumTarih,garsonAdres,garsonCinsiyet,garsonMaas,garsonUstSSN,garsonBaslangicYili,secilenGarsonSSN);
                    if(result==1)
                    {
                        JOptionPane.showMessageDialog(this,"Garson Bilgileri Güncellendi!!","Başarılı",JOptionPane.PLAIN_MESSAGE);
                        jTable_Garsonlar.setModel(sqlQuaries.tabloAta(sqlQuaries.garsonlariGetir));
                    }                
                    else
                        JOptionPane.showMessageDialog(this,"!!Garson Bilgileri Güncellenemedi!!","Hata",JOptionPane.PLAIN_MESSAGE);
                }
            }   
    }//GEN-LAST:event_jButton_GarsonDuzenle_KaydetActionPerformed

    private void jTable_GarsonlarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_GarsonlarMouseClicked
       garsonDuzenlePaneliDoldur();
    }//GEN-LAST:event_jTable_GarsonlarMouseClicked

    private void garsonDuzenlePaneliTemizle()
    {
        jTextField_GarsonDuzenle_GarsonAdi.setText("");
        jTextField_GarsonDuzenle_GarsonIkinciAd.setText("");
        jTextField_GarsonDuzenle_GarsonSoyadi.setText("");
        jTextField_GarsonDuzenle_GarsonSSN.setText("");
        jTextField_GarsonDuzenle_GarsonMaas.setText("");
        jTextField_GarsonDuzenle_GarsonBaslamaYili.setText("");
        jTextArea_GarsonDuzenle_GarsonAdres.setText("");
        jTextField_GarsonDuzenle_GarsonDogumTarihi.setText("");
        jTextField_GarsonDuzenle_GarsonCinsiyet.setText("");
        jTextField_GarsonDuzenle_GarsonUstSSN.setText("");
    }
    private void garsonEklePaneliTemizle()
    {
        jTextField_GarsonEkle_GarsonAdi.setText("");
        jTextField_GarsonEkle_GarsonIkinciAd.setText("");
        jTextField_GarsonEkle_GarsonSoyadi.setText("");
        jTextField_GarsonEkle_GarsonSSN.setText("");
        jTextField_GarsonEkle_Maas.setText("");
        jTextField_GarsonEkle_BaslamaYili.setText("");
        jTextArea_GarsonEkle_GarsonAdres.setText("");
        jTextField_GarsonEkle_GarsonDogumTarihi.setText("");
        jTextField_GarsonEkle_GarsonCinsiyet.setText("");
        jTextField_GarsonEkle_GarsonUstSSN.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGarsonEkle_Ekle;
    private javax.swing.JButton jButton_GarsonDuzenle;
    private javax.swing.JButton jButton_GarsonDuzenle_Kaydet;
    private javax.swing.JButton jButton_GarsonEkle;
    private javax.swing.JButton jButton_GarsonSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Garsonlar;
    private javax.swing.JTextArea jTextArea_GarsonDuzenle_GarsonAdres;
    private javax.swing.JTextArea jTextArea_GarsonEkle_GarsonAdres;
    private javax.swing.JTextField jTextField_GarsonDuzenle_GarsonAdi;
    private javax.swing.JTextField jTextField_GarsonDuzenle_GarsonBaslamaYili;
    private javax.swing.JTextField jTextField_GarsonDuzenle_GarsonCinsiyet;
    private javax.swing.JTextField jTextField_GarsonDuzenle_GarsonDogumTarihi;
    private javax.swing.JTextField jTextField_GarsonDuzenle_GarsonIkinciAd;
    private javax.swing.JTextField jTextField_GarsonDuzenle_GarsonMaas;
    private javax.swing.JTextField jTextField_GarsonDuzenle_GarsonSSN;
    private javax.swing.JTextField jTextField_GarsonDuzenle_GarsonSoyadi;
    private javax.swing.JTextField jTextField_GarsonDuzenle_GarsonUstSSN;
    private javax.swing.JTextField jTextField_GarsonEkle_BaslamaYili;
    private javax.swing.JTextField jTextField_GarsonEkle_GarsonAdi;
    private javax.swing.JTextField jTextField_GarsonEkle_GarsonCinsiyet;
    private javax.swing.JTextField jTextField_GarsonEkle_GarsonDogumTarihi;
    private javax.swing.JTextField jTextField_GarsonEkle_GarsonIkinciAd;
    private javax.swing.JTextField jTextField_GarsonEkle_GarsonSSN;
    private javax.swing.JTextField jTextField_GarsonEkle_GarsonSoyadi;
    private javax.swing.JTextField jTextField_GarsonEkle_GarsonUstSSN;
    private javax.swing.JTextField jTextField_GarsonEkle_Maas;
    private java.awt.Label labelGarsonEkle_GarsonAdi;
    private java.awt.Label labelGarsonEkle_GarsonAdi2;
    private java.awt.Label labelGarsonEkle_GarsonIkinciAd;
    private java.awt.Label labelGarsonEkle_GarsonIkinciAd1;
    private java.awt.Label labelGarsonEkle_GarsonSoyadi;
    private java.awt.Label labelGarsonEkle_GarsonSoyadi2;
    private java.awt.Label labelGarsonEkle_GarsonYasi;
    private java.awt.Label labelGarsonEkle_GarsonYasi1;
    private java.awt.Label labelGarsonEkle_GarsonYasi10;
    private java.awt.Label labelGarsonEkle_GarsonYasi11;
    private java.awt.Label labelGarsonEkle_GarsonYasi12;
    private java.awt.Label labelGarsonEkle_GarsonYasi13;
    private java.awt.Label labelGarsonEkle_GarsonYasi14;
    private java.awt.Label labelGarsonEkle_GarsonYasi15;
    private java.awt.Label labelGarsonEkle_GarsonYasi16;
    private java.awt.Label labelGarsonEkle_GarsonYasi17;
    private java.awt.Label labelGarsonEkle_GarsonYasi18;
    private java.awt.Label labelGarsonEkle_GarsonYasi19;
    private java.awt.Label labelGarsonEkle_GarsonYasi2;
    private java.awt.Label labelGarsonEkle_GarsonYasi20;
    private java.awt.Label labelGarsonEkle_GarsonYasi21;
    private java.awt.Label labelGarsonEkle_GarsonYasi22;
    private java.awt.Label labelGarsonEkle_GarsonYasi23;
    private java.awt.Label labelGarsonEkle_GarsonYasi24;
    private java.awt.Label labelGarsonEkle_GarsonYasi25;
    private java.awt.Label labelGarsonEkle_GarsonYasi26;
    private java.awt.Label labelGarsonEkle_GarsonYasi27;
    private java.awt.Label labelGarsonEkle_GarsonYasi28;
    private java.awt.Label labelGarsonEkle_GarsonYasi29;
    private java.awt.Label labelGarsonEkle_GarsonYasi30;
    private java.awt.Label labelGarsonEkle_GarsonYasi31;
    private java.awt.Label labelGarsonEkle_GarsonYasi32;
    private java.awt.Label labelGarsonEkle_GarsonYasi6;
    private java.awt.Label labelGarsonEkle_GarsonYasi7;
    private java.awt.Label labelGarsonEkle_GarsonYasi8;
    private java.awt.Label labelGarsonEkle_GarsonYasi9;
    private java.awt.Panel panel1;
    private java.awt.Panel panelGarsonDuzenle;
    private java.awt.Panel panelGarsonEkle;
    // End of variables declaration//GEN-END:variables
}
