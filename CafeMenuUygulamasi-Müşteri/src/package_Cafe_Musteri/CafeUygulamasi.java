/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package_Cafe_Musteri;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author wissen1
 */
public class CafeUygulamasi extends javax.swing.JFrame {

    public static JPanel_Menu PanelMenu = new JPanel_Menu();
    public static JPanel_AnaEkran PanelAnaEkran = new JPanel_AnaEkran();
    public static JPanel_BizeUlasin PanelBizeUlasin = new JPanel_BizeUlasin();
    public static JPanel_Menu_AnaYemekler PanelMenuAnaYemekler = new JPanel_Menu_AnaYemekler();
    public static JPanel_Menu_AraSicaklar PanelMenuAraSicaklar = new JPanel_Menu_AraSicaklar();
    public static JPanel_Menu_Salatalar PanelMenuSalatalar = new JPanel_Menu_Salatalar(); 
    public static JPanel_Menu_Icecekler PanelMenuIcecekler = new JPanel_Menu_Icecekler();
    int cayAdet , suAdet;
    
    public CafeUygulamasi() throws IOException {
       initComponents();
       setTitle(" ( ͡° ͜ʖ﻿ ͡°) Cafe De İlk-Bu ®");
       Image image = ImageIO.read(getClass().getResource("/images/kahve.png"));
            setIconImage(image); 
       
       PanelAnaEkran.setVisible(true);
       PanelAnaEkran.setBounds(0, 0, 825, 700);
       jDesktopPane_CafeUygulamasi.add(PanelAnaEkran, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelMenu.setVisible(false);
       PanelMenu.setBounds(0, 0, 825, 700);
       jDesktopPane_CafeUygulamasi.add(PanelMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelBizeUlasin.setVisible(false);
       PanelBizeUlasin.setBounds(0, 0, 825, 700);
       jDesktopPane_CafeUygulamasi.add(PanelBizeUlasin, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelMenuAnaYemekler.setVisible(false);
       PanelMenuAnaYemekler.setBounds(0, 0, 825, 700);
       jDesktopPane_CafeUygulamasi.add(PanelMenuAnaYemekler, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelMenuAraSicaklar.setVisible(false);
       PanelMenuAraSicaklar.setBounds(0, 0, 825, 700);
       jDesktopPane_CafeUygulamasi.add(PanelMenuAraSicaklar, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelMenuSalatalar.setVisible(false);
       PanelMenuSalatalar.setBounds(0, 0, 825, 700);
       jDesktopPane_CafeUygulamasi.add(PanelMenuSalatalar, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       PanelMenuIcecekler.setVisible(false);
       PanelMenuIcecekler.setBounds(0, 0, 825, 700);
       jDesktopPane_CafeUygulamasi.add(PanelMenuIcecekler, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------------------------------------------
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane_CafeUygulamasi = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafe De İlk-Bu");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_CafeUygulamasi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_CafeUygulamasi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CafeUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CafeUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CafeUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CafeUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JDesktopPane jDesktopPane_CafeUygulamasi;
    // End of variables declaration//GEN-END:variables
}
