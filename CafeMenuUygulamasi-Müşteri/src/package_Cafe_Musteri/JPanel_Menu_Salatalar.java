/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package_Cafe_Musteri;

/**
 *
 * @author wissen1
 */
public class JPanel_Menu_Salatalar extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Menu
     */
    public JPanel_Menu_Salatalar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_AnaEkran = new javax.swing.JPanel();
        jLayeredPane_ArkaPlan = new javax.swing.JLayeredPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel_AnaSayfa = new javax.swing.JLabel();
        jLabel_Geri = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_ustResim = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel_AnaEkran.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_AnaSayfa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homePageButton1.png"))); // NOI18N
        jLabel_AnaSayfa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AnaSayfaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_AnaSayfaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_AnaSayfaMouseExited(evt);
            }
        });
        jLabel_AnaSayfa.setBounds(270, 560, 60, 50);
        jLayeredPane1.add(jLabel_AnaSayfa, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        jLabel_Geri.setBounds(330, 560, 60, 50);
        jLayeredPane1.add(jLabel_Geri, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane1.setBounds(90, 90, 650, 610);
        jLayeredPane_ArkaPlan.add(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuArkaPlan.png"))); // NOI18N
        jLabel2.setBounds(10, 80, 820, 580);
        jLayeredPane_ArkaPlan.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel_ustResim.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salatalarBaslik.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_ustResimLayout = new javax.swing.GroupLayout(jPanel_ustResim);
        jPanel_ustResim.setLayout(jPanel_ustResimLayout);
        jPanel_ustResimLayout.setHorizontalGroup(
            jPanel_ustResimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ustResimLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel3)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel_ustResimLayout.setVerticalGroup(
            jPanel_ustResimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ustResimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jLayeredPane_ArkaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
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
         SetVisible.visibleAyarla(CafeUygulamasi.PanelMenu);
    }//GEN-LAST:event_jLabel_GeriMouseClicked

    private void jLabel_AnaSayfaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AnaSayfaMouseClicked
        SetVisible.visibleAyarla(CafeUygulamasi.PanelAnaEkran);
    }//GEN-LAST:event_jLabel_AnaSayfaMouseClicked

    private void jLabel_AnaSayfaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AnaSayfaMouseEntered
        jLabel_AnaSayfa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homePageButtonBuyuk.png")));
    }//GEN-LAST:event_jLabel_AnaSayfaMouseEntered

    private void jLabel_AnaSayfaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AnaSayfaMouseExited
        jLabel_AnaSayfa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homePageButton1.png")));
    }//GEN-LAST:event_jLabel_AnaSayfaMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_AnaSayfa;
    private javax.swing.JLabel jLabel_Geri;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane_ArkaPlan;
    private javax.swing.JPanel jPanel_AnaEkran;
    private javax.swing.JPanel jPanel_ustResim;
    // End of variables declaration//GEN-END:variables
}
