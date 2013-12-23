
package package_Cafe_Musteri;

import javax.swing.JOptionPane;

public class JPanel_BizeUlasin extends javax.swing.JPanel {

    public JPanel_BizeUlasin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_AnaEkran = new javax.swing.JPanel();
        jPanel_ustResim = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane_ArkaPlan = new javax.swing.JLayeredPane();
        jLayeredPane_YaziAlani = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Mesaj = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Ad = new javax.swing.JTextField();
        jLabel_Geri = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_MesajGonder = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel_AnaEkran.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_ustResim.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cafedeilkbu3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_ustResimLayout = new javax.swing.GroupLayout(jPanel_ustResim);
        jPanel_ustResim.setLayout(jPanel_ustResimLayout);
        jPanel_ustResimLayout.setHorizontalGroup(
            jPanel_ustResimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel_ustResimLayout.setVerticalGroup(
            jPanel_ustResimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ustResimLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);

        jLayeredPane_ArkaPlan.setOpaque(true);

        jTextArea_Mesaj.setColumns(20);
        jTextArea_Mesaj.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Mesaj);

        jScrollPane1.setBounds(100, 120, 370, 200);
        jLayeredPane_YaziAlani.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel3.setText("Mesajınız : ");
        jLabel3.setBounds(10, 120, 90, 20);
        jLayeredPane_YaziAlani.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel4.setText("Adınız : ");
        jLabel4.setBounds(30, 90, 70, 21);
        jLayeredPane_YaziAlani.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField_Ad.setBounds(100, 90, 140, 20);
        jLayeredPane_YaziAlani.add(jTextField_Ad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel_Geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Geri50.png"))); // NOI18N
        jLabel_Geri.setPreferredSize(new java.awt.Dimension(100, 40));
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
        jLabel_Geri.setBounds(110, 320, 60, 60);
        jLayeredPane_YaziAlani.add(jLabel_Geri, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bizeUlasinTransparan.png"))); // NOI18N
        jLabel5.setBounds(140, 0, 250, 90);
        jLayeredPane_YaziAlani.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel_MesajGonder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mailSend50.png"))); // NOI18N
        jLabel_MesajGonder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MesajGonderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MesajGonderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MesajGonderMouseExited(evt);
            }
        });
        jLabel_MesajGonder.setBounds(410, 330, 60, 50);
        jLayeredPane_YaziAlani.add(jLabel_MesajGonder, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane_YaziAlani.setBounds(150, 20, 560, 440);
        jLayeredPane_ArkaPlan.add(jLayeredPane_YaziAlani, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parsomen.jpg"))); // NOI18N
        jLabel2.setBounds(60, 0, 710, 480);
        jLayeredPane_ArkaPlan.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane_ArkaPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane_ArkaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_AnaEkranLayout = new javax.swing.GroupLayout(jPanel_AnaEkran);
        jPanel_AnaEkran.setLayout(jPanel_AnaEkranLayout);
        jPanel_AnaEkranLayout.setHorizontalGroup(
            jPanel_AnaEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ustResim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel_AnaEkranLayout.setVerticalGroup(
            jPanel_AnaEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaEkranLayout.createSequentialGroup()
                .addComponent(jPanel_ustResim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaEkran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaEkran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_GeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GeriMouseClicked
         SetVisible.visibleAyarla(CafeUygulamasi.PanelAnaEkran);
    }//GEN-LAST:event_jLabel_GeriMouseClicked

    private void jLabel_GeriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GeriMouseEntered
         jLabel_Geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Geri60.png")));
    }//GEN-LAST:event_jLabel_GeriMouseEntered

    private void jLabel_GeriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GeriMouseExited
        jLabel_Geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Geri50.png")));
    }//GEN-LAST:event_jLabel_GeriMouseExited

    private void jLabel_MesajGonderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MesajGonderMouseClicked
        String ad,mesaj;
        ad = jTextField_Ad.getText();
        mesaj = jTextArea_Mesaj.getText();
        JOptionPane.showMessageDialog(null, "Mesajınız Alınmıştır.Teşekkür Ederiz"," ͡° ͜ʖ﻿ ͡°) Teşekkürler",JOptionPane.PLAIN_MESSAGE);       
   
    }//GEN-LAST:event_jLabel_MesajGonderMouseClicked

    private void jLabel_MesajGonderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MesajGonderMouseEntered
        jLabel_MesajGonder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mailSend60.png")));
    }//GEN-LAST:event_jLabel_MesajGonderMouseEntered

    private void jLabel_MesajGonderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MesajGonderMouseExited
        jLabel_MesajGonder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mailSend50.png")));
    }//GEN-LAST:event_jLabel_MesajGonderMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Geri;
    private javax.swing.JLabel jLabel_MesajGonder;
    private javax.swing.JLayeredPane jLayeredPane_ArkaPlan;
    private javax.swing.JLayeredPane jLayeredPane_YaziAlani;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_AnaEkran;
    private javax.swing.JPanel jPanel_ustResim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Mesaj;
    private javax.swing.JTextField jTextField_Ad;
    // End of variables declaration//GEN-END:variables
}
