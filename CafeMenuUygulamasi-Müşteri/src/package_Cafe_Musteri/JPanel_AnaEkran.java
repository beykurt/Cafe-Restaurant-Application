/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package_Cafe_Musteri;

import javax.swing.JOptionPane;

/**
 *
 * @author wissen1
 */
public class JPanel_AnaEkran extends javax.swing.JPanel {

    int cayAdet;
    int suAdet;
    public JPanel_AnaEkran() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_ustResim = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_AnaEkran2 = new javax.swing.JPanel();
        jButton_Menu = new javax.swing.JButton();
        jButton_HesapIste = new javax.swing.JButton();
        jButton_GarsonCagir = new javax.swing.JButton();
        jButton_NotBirak = new javax.swing.JButton();
        jButton_Cay = new javax.swing.JButton();
        jButton_Su = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

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

        jPanel_AnaEkran2.setBackground(new java.awt.Color(255, 255, 255));

        jButton_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menü.png"))); // NOI18N
        jButton_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_MenuMouseExited(evt);
            }
        });
        jButton_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MenuActionPerformed(evt);
            }
        });

        jButton_HesapIste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hesapİste.png"))); // NOI18N
        jButton_HesapIste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_HesapIsteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_HesapIsteMouseExited(evt);
            }
        });
        jButton_HesapIste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HesapIsteActionPerformed(evt);
            }
        });

        jButton_GarsonCagir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GarsonCagir.png"))); // NOI18N
        jButton_GarsonCagir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_GarsonCagirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_GarsonCagirMouseExited(evt);
            }
        });
        jButton_GarsonCagir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GarsonCagirActionPerformed(evt);
            }
        });

        jButton_NotBirak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NotBırak.png"))); // NOI18N
        jButton_NotBirak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_NotBirakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_NotBirakMouseExited(evt);
            }
        });
        jButton_NotBirak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NotBirakActionPerformed(evt);
            }
        });

        jButton_Cay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Çay.png"))); // NOI18N
        jButton_Cay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_CayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_CayMouseExited(evt);
            }
        });
        jButton_Cay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CayActionPerformed(evt);
            }
        });

        jButton_Su.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Su.png"))); // NOI18N
        jButton_Su.setAlignmentY(0.0F);
        jButton_Su.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton_Su.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_SuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_SuMouseExited(evt);
            }
        });
        jButton_Su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_AnaEkran2Layout = new javax.swing.GroupLayout(jPanel_AnaEkran2);
        jPanel_AnaEkran2.setLayout(jPanel_AnaEkran2Layout);
        jPanel_AnaEkran2Layout.setHorizontalGroup(
            jPanel_AnaEkran2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaEkran2Layout.createSequentialGroup()
                .addGroup(jPanel_AnaEkran2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_AnaEkran2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Su, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel_AnaEkran2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AnaEkran2Layout.createSequentialGroup()
                        .addComponent(jButton_Cay, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton_NotBirak, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_AnaEkran2Layout.createSequentialGroup()
                        .addComponent(jButton_GarsonCagir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton_HesapIste, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_AnaEkran2Layout.setVerticalGroup(
            jPanel_AnaEkran2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaEkran2Layout.createSequentialGroup()
                .addGroup(jPanel_AnaEkran2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_GarsonCagir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_HesapIste, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_AnaEkran2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_NotBirak, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Su, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_ustResim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel_AnaEkran2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel_ustResim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel_AnaEkran2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MenuMouseEntered
        jButton_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuYazi.png")));
    }//GEN-LAST:event_jButton_MenuMouseEntered

    private void jButton_MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_MenuMouseExited
        jButton_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menü.png")));
    }//GEN-LAST:event_jButton_MenuMouseExited

    private void jButton_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MenuActionPerformed
        SetVisible.visibleAyarla(CafeUygulamasi.PanelMenu);
    }//GEN-LAST:event_jButton_MenuActionPerformed

    private void jButton_HesapIsteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_HesapIsteMouseEntered
        jButton_HesapIste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hesapIsteYazi.png")));
    }//GEN-LAST:event_jButton_HesapIsteMouseEntered

    private void jButton_HesapIsteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_HesapIsteMouseExited
        jButton_HesapIste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hesapİste.png")));
    }//GEN-LAST:event_jButton_HesapIsteMouseExited

    private void jButton_GarsonCagirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GarsonCagirMouseEntered
        jButton_GarsonCagir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/garsonYazi.png")));
    }//GEN-LAST:event_jButton_GarsonCagirMouseEntered

    private void jButton_GarsonCagirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GarsonCagirMouseExited
        jButton_GarsonCagir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GarsonCagir.png")));
    }//GEN-LAST:event_jButton_GarsonCagirMouseExited

    private void jButton_NotBirakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_NotBirakMouseEntered
        jButton_NotBirak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notBirakImage.png")));
    }//GEN-LAST:event_jButton_NotBirakMouseEntered

    private void jButton_NotBirakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_NotBirakMouseExited
        jButton_NotBirak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NotBırak.png")));
    }//GEN-LAST:event_jButton_NotBirakMouseExited

    private void jButton_CayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CayMouseEntered
        jButton_Cay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cayYazi.png")));
    }//GEN-LAST:event_jButton_CayMouseEntered

    private void jButton_CayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CayMouseExited
        jButton_Cay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Çay.png")));
    }//GEN-LAST:event_jButton_CayMouseExited

    private void jButton_CayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CayActionPerformed
        cayAdet = Integer.parseInt(JOptionPane.showInputDialog(null,"Kaç Adet Çay İstersiniz : ","Sipariş Adet", JOptionPane.QUESTION_MESSAGE ));
        JOptionPane.showMessageDialog(null, cayAdet+" Adet Çayınız İlgili Garson İle En Kısa Sürede Getirilecektir"," ͡° ͜ʖ﻿ ͡°) Teşekkürler",JOptionPane.PLAIN_MESSAGE);       
   
    }//GEN-LAST:event_jButton_CayActionPerformed

    private void jButton_SuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SuMouseEntered
        jButton_Su.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/suYazi.png")));
    }//GEN-LAST:event_jButton_SuMouseEntered

    private void jButton_SuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SuMouseExited
        jButton_Su.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Su.png")));
    }//GEN-LAST:event_jButton_SuMouseExited

    private void jButton_SuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuActionPerformed
        suAdet = Integer.parseInt(JOptionPane.showInputDialog(null,"Kaç Adet Su İstersiniz : ","Sipariş Adet", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, suAdet+" Adet Suyunuz İlgili Garson İle En Kısa Sürede Getirilecektir"," ͡° ͜ʖ﻿ ͡°) Teşekkürler",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton_SuActionPerformed

    private void jButton_GarsonCagirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GarsonCagirActionPerformed
        JOptionPane.showMessageDialog(null, "İlgili Garson Masanıza Yönlendiliyor..."," ͡° ͜ʖ﻿ ͡°) Garsonunuz Geliyor",JOptionPane.PLAIN_MESSAGE);       
    }//GEN-LAST:event_jButton_GarsonCagirActionPerformed

    private void jButton_HesapIsteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HesapIsteActionPerformed
       
           Object[] possibleValues = { "Kredi Kartı", "Nakit"};
           Object selectedValue = JOptionPane.showInputDialog(null,"Adisyonunuz Kapatılıp Hesabınız Gönderilecektir.\nOnaylıyor İseniz Ödeme Türünü Seçiniz", "Ödeme Şekli",
                JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
           if(selectedValue.toString().equalsIgnoreCase("Kredi Kartı"))
               JOptionPane.showMessageDialog(null, selectedValue.toString()+ " İlgili Garson Masanıza Yönlendiliyor..."," ͡° ͜ʖ﻿ ͡°) Garsonunuz Geliyor",JOptionPane.PLAIN_MESSAGE);       
           else if(selectedValue.toString().equalsIgnoreCase("Nakit"))
               JOptionPane.showMessageDialog(null, "İlgili Garson Masanıza Yönlendiliyor..."," ͡° ͜ʖ﻿ ͡°) Garsonunuz Geliyor",JOptionPane.PLAIN_MESSAGE);       
           
        
    }//GEN-LAST:event_jButton_HesapIsteActionPerformed

    private void jButton_NotBirakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NotBirakActionPerformed
        SetVisible.visibleAyarla(CafeUygulamasi.PanelBizeUlasin);
    }//GEN-LAST:event_jButton_NotBirakActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cay;
    private javax.swing.JButton jButton_GarsonCagir;
    private javax.swing.JButton jButton_HesapIste;
    private javax.swing.JButton jButton_Menu;
    private javax.swing.JButton jButton_NotBirak;
    private javax.swing.JButton jButton_Su;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel_AnaEkran2;
    private javax.swing.JPanel jPanel_ustResim;
    // End of variables declaration//GEN-END:variables
}
