
package package_Cafe_Musteri;

public class JPanel_Menu extends javax.swing.JPanel {

    public JPanel_Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_AnaEkran = new javax.swing.JPanel();
        jLayeredPane_ArkaPlan = new javax.swing.JLayeredPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton_Icecekler = new javax.swing.JButton();
        jButton_AnaYemekler = new javax.swing.JButton();
        jButton_AraSicaklar = new javax.swing.JButton();
        jButton_Salatalar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_Geri = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_ustResim = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel_AnaEkran.setBackground(new java.awt.Color(255, 255, 255));

        jButton_Icecekler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icecekler.png"))); // NOI18N
        jButton_Icecekler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IceceklerActionPerformed(evt);
            }
        });
        jButton_Icecekler.setBounds(350, 340, 250, 180);
        jLayeredPane1.add(jButton_Icecekler, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_AnaYemekler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anaSıcaklar.png"))); // NOI18N
        jButton_AnaYemekler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AnaYemeklerActionPerformed(evt);
            }
        });
        jButton_AnaYemekler.setBounds(50, 100, 250, 180);
        jLayeredPane1.add(jButton_AnaYemekler, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_AraSicaklar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/araSıcak.png"))); // NOI18N
        jButton_AraSicaklar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AraSicaklarActionPerformed(evt);
            }
        });
        jButton_AraSicaklar.setBounds(350, 100, 250, 180);
        jLayeredPane1.add(jButton_AraSicaklar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Salatalar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salatalar.png"))); // NOI18N
        jButton_Salatalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalatalarActionPerformed(evt);
            }
        });
        jButton_Salatalar.setBounds(50, 340, 250, 180);
        jLayeredPane1.add(jButton_Salatalar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AraSıcaklarEtiket.png"))); // NOI18N
        jLabel1.setBounds(370, 60, 220, 30);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iceceklerEtiket.png"))); // NOI18N
        jLabel4.setBounds(370, 300, 220, 30);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel_Geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Geri50.png"))); // NOI18N
        jLabel_Geri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_GeriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_GeriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_GeriMouseExited(evt);
            }
        });
        jLabel_Geri.setBounds(300, 560, 60, 60);
        jLayeredPane1.add(jLabel_Geri, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anaSıcaklarEtiket.png"))); // NOI18N
        jLabel5.setBounds(60, 50, 220, 40);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salatalarEtiket.png"))); // NOI18N
        jLabel6.setBounds(60, 300, 220, 30);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane1.setBounds(90, 80, 650, 620);
        jLayeredPane_ArkaPlan.add(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuArkaPlan.png"))); // NOI18N
        jLabel2.setBounds(10, 80, 820, 580);
        jLayeredPane_ArkaPlan.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel_ustResim.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_ustResimLayout = new javax.swing.GroupLayout(jPanel_ustResim);
        jPanel_ustResim.setLayout(jPanel_ustResimLayout);
        jPanel_ustResimLayout.setHorizontalGroup(
            jPanel_ustResimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ustResimLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel3)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanel_ustResimLayout.setVerticalGroup(
            jPanel_ustResimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ustResimLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_ustResim.setBounds(0, 0, 0, 0);
        jLayeredPane_ArkaPlan.add(jPanel_ustResim, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel_AnaEkranLayout = new javax.swing.GroupLayout(jPanel_AnaEkran);
        jPanel_AnaEkran.setLayout(jPanel_AnaEkranLayout);
        jPanel_AnaEkranLayout.setHorizontalGroup(
            jPanel_AnaEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaEkranLayout.createSequentialGroup()
                .addComponent(jLayeredPane_ArkaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_AnaEkranLayout.setVerticalGroup(
            jPanel_AnaEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaEkranLayout.createSequentialGroup()
                .addComponent(jLayeredPane_ArkaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaEkran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_AnaEkran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_GeriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GeriMouseEntered
       jLabel_Geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Geri60.png")));
    }//GEN-LAST:event_jLabel_GeriMouseEntered

    private void jLabel_GeriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GeriMouseExited
        jLabel_Geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Geri50.png")));
    }//GEN-LAST:event_jLabel_GeriMouseExited

    private void jLabel_GeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GeriMouseClicked
         SetVisible.visibleAyarla(CafeUygulamasi.PanelAnaEkran);
    }//GEN-LAST:event_jLabel_GeriMouseClicked

    private void jButton_AnaYemeklerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AnaYemeklerActionPerformed
        SetVisible.visibleAyarla(CafeUygulamasi.PanelMenuAnaYemekler);
    }//GEN-LAST:event_jButton_AnaYemeklerActionPerformed

    private void jButton_AraSicaklarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AraSicaklarActionPerformed
        SetVisible.visibleAyarla(CafeUygulamasi.PanelMenuAraSicaklar);
    }//GEN-LAST:event_jButton_AraSicaklarActionPerformed

    private void jButton_SalatalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalatalarActionPerformed
        SetVisible.visibleAyarla(CafeUygulamasi.PanelMenuSalatalar);
    }//GEN-LAST:event_jButton_SalatalarActionPerformed

    private void jButton_IceceklerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IceceklerActionPerformed
        SetVisible.visibleAyarla(CafeUygulamasi.PanelMenuIcecekler);
    }//GEN-LAST:event_jButton_IceceklerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AnaYemekler;
    private javax.swing.JButton jButton_AraSicaklar;
    private javax.swing.JButton jButton_Icecekler;
    private javax.swing.JButton jButton_Salatalar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Geri;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane_ArkaPlan;
    private javax.swing.JPanel jPanel_AnaEkran;
    private javax.swing.JPanel jPanel_ustResim;
    // End of variables declaration//GEN-END:variables
}
