
package package_Cafe_Kasa;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class CafeUygulamasi extends javax.swing.JFrame {

    public static JPanel_AnaEkran PanelAnaEkran = new JPanel_AnaEkran();
    public static JPanel_Urunler PanelUrunler = new JPanel_Urunler();
    public static JPanel_Garsonlar PanelGarsonlar = new JPanel_Garsonlar();
    public static JPanel_Masa PanelMasa = new JPanel_Masa();
    public static JPanel_Masa_SiparisDuzenle PanelMasaSiparisDuzenle = new JPanel_Masa_SiparisDuzenle();
    public static JPanel_Masa_SiparisDuzenle_SecilenMasa PanelSiparisDuzenleSecilenMasa = new JPanel_Masa_SiparisDuzenle_SecilenMasa();
    public static JPanel_MasaSiparisEkle PanelMasaSiparisEkle = new JPanel_MasaSiparisEkle();
    public static JPanel_UrunEkleDuzenleSil PanelUrunEkleDuzenleSil = new JPanel_UrunEkleDuzenleSil();
    
    public CafeUygulamasi() throws IOException {
        initComponents();
        setTitle(" ( ͡° ͜ʖ﻿ ͡°) Cafe De İlk-Bu ®");
        Image image = ImageIO.read(getClass().getResource("/images/kahve.png"));
            setIconImage(image); 
            
       PanelAnaEkran.setVisible(true);
       PanelAnaEkran.setBounds(150, 0, 874, 768);
       desktopPane.add(PanelAnaEkran, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelUrunler.setVisible(false);
       PanelUrunler.setBounds(150, 0, 874, 768);
       desktopPane.add(PanelUrunler, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelGarsonlar.setVisible(false);
       PanelGarsonlar.setBounds(150, 0, 874, 768);
       desktopPane.add(PanelGarsonlar, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelMasa.setVisible(false);
       PanelMasa.setBounds(150, 0, 874, 768);
       desktopPane.add(PanelMasa, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelMasaSiparisDuzenle.setVisible(false);
       PanelMasaSiparisDuzenle.setBounds(150, 0, 874, 768);
       desktopPane.add(PanelMasaSiparisDuzenle, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelSiparisDuzenleSecilenMasa.setVisible(false);
       PanelSiparisDuzenleSecilenMasa.setBounds(150, 0, 874, 768);
       desktopPane.add(PanelSiparisDuzenleSecilenMasa, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelMasaSiparisEkle.setVisible(false);
       PanelMasaSiparisEkle.setBounds(150, 0, 874, 768);
       desktopPane.add(PanelMasaSiparisEkle, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelUrunEkleDuzenleSil.setVisible(false);
       PanelUrunEkleDuzenleSil.setBounds(150, 0, 874, 768);
       desktopPane.add(PanelUrunEkleDuzenleSil, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        panel_SolMenu = new java.awt.Panel();
        jLabelUrunler = new javax.swing.JLabel();
        jLabelGarsonlar = new javax.swing.JLabel();
        jLabelMasaAc = new javax.swing.JLabel();
        jLabel_MasaKapa = new javax.swing.JLabel();
        jLabel_MasaSiparisEkle = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_SiparisDuzenle = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelUrunler1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelUrunler.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabelUrunler.setForeground(new java.awt.Color(0, 0, 204));
        jLabelUrunler.setText("Ürünler");
        jLabelUrunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUrunlerMouseClicked(evt);
            }
        });

        jLabelGarsonlar.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabelGarsonlar.setForeground(new java.awt.Color(0, 0, 204));
        jLabelGarsonlar.setText("Garsonlar");
        jLabelGarsonlar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelGarsonlarMouseClicked(evt);
            }
        });

        jLabelMasaAc.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabelMasaAc.setForeground(new java.awt.Color(0, 0, 204));
        jLabelMasaAc.setText("Masa Aç");
        jLabelMasaAc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMasaAcMouseClicked(evt);
            }
        });

        jLabel_MasaKapa.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel_MasaKapa.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_MasaKapa.setText("Masa Kapa");
        jLabel_MasaKapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MasaKapaMouseClicked(evt);
            }
        });

        jLabel_MasaSiparisEkle.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel_MasaSiparisEkle.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_MasaSiparisEkle.setText("Masa Sipariş Ekle");
        jLabel_MasaSiparisEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MasaSiparisEkleMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Masa Sipariş Sil");

        jLabel_SiparisDuzenle.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel_SiparisDuzenle.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_SiparisDuzenle.setText("Masa Sipariş Düzenle");
        jLabel_SiparisDuzenle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SiparisDuzenleMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Mesajlar");

        jLabelUrunler1.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabelUrunler1.setForeground(new java.awt.Color(0, 0, 204));
        jLabelUrunler1.setText("- Ekle-Sil-Düzenle");
        jLabelUrunler1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUrunler1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_SolMenuLayout = new javax.swing.GroupLayout(panel_SolMenu);
        panel_SolMenu.setLayout(panel_SolMenuLayout);
        panel_SolMenuLayout.setHorizontalGroup(
            panel_SolMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SolMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_SolMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUrunler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGarsonlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMasaAc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_MasaKapa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_MasaSiparisEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_SiparisDuzenle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SolMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelUrunler1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_SolMenuLayout.setVerticalGroup(
            panel_SolMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SolMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelUrunler, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUrunler1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelGarsonlar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMasaAc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_MasaKapa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_MasaSiparisEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_SiparisDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );

        panel_SolMenu.setBounds(0, 0, 160, 768);
        desktopPane.add(panel_SolMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelUrunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUrunlerMouseClicked
        SetVisible.visibleAyarla(CafeUygulamasi.PanelUrunler);
    }//GEN-LAST:event_jLabelUrunlerMouseClicked

    private void jLabelGarsonlarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGarsonlarMouseClicked
        SetVisible.visibleAyarla(CafeUygulamasi.PanelGarsonlar);
    }//GEN-LAST:event_jLabelGarsonlarMouseClicked

    private void jLabelMasaAcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMasaAcMouseClicked
        SetVisible.visibleAyarla(CafeUygulamasi.PanelMasa);
    }//GEN-LAST:event_jLabelMasaAcMouseClicked

    private void jLabel_MasaKapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MasaKapaMouseClicked
        SetVisible.visibleAyarla(CafeUygulamasi.PanelMasa);
    }//GEN-LAST:event_jLabel_MasaKapaMouseClicked

    private void jLabel_SiparisDuzenleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SiparisDuzenleMouseClicked
        SetVisible.visibleAyarla(CafeUygulamasi.PanelMasaSiparisDuzenle);
    }//GEN-LAST:event_jLabel_SiparisDuzenleMouseClicked

    private void jLabel_MasaSiparisEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MasaSiparisEkleMouseClicked
        SetVisible.visibleAyarla(CafeUygulamasi.PanelMasaSiparisEkle);
    }//GEN-LAST:event_jLabel_MasaSiparisEkleMouseClicked

    private void jLabelUrunler1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUrunler1MouseClicked
        SetVisible.visibleAyarla(CafeUygulamasi.PanelUrunEkleDuzenleSil);
    }//GEN-LAST:event_jLabelUrunler1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CafeUygulamasi().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CafeUygulamasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelGarsonlar;
    private javax.swing.JLabel jLabelMasaAc;
    private javax.swing.JLabel jLabelUrunler;
    private javax.swing.JLabel jLabelUrunler1;
    private javax.swing.JLabel jLabel_MasaKapa;
    private javax.swing.JLabel jLabel_MasaSiparisEkle;
    private javax.swing.JLabel jLabel_SiparisDuzenle;
    private java.awt.Panel panel_SolMenu;
    // End of variables declaration//GEN-END:variables
}
