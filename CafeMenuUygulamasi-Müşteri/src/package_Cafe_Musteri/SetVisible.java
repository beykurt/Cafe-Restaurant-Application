/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package_Cafe_Musteri;


import static package_Cafe_Musteri.CafeUygulamasi.PanelMenu;
import static package_Cafe_Musteri.CafeUygulamasi.PanelAnaEkran;
import static package_Cafe_Musteri.CafeUygulamasi.PanelBizeUlasin;
import static package_Cafe_Musteri.CafeUygulamasi.PanelMenuAnaYemekler;
import static package_Cafe_Musteri.CafeUygulamasi.PanelMenuAraSicaklar;
import static package_Cafe_Musteri.CafeUygulamasi.PanelMenuSalatalar;
import static package_Cafe_Musteri.CafeUygulamasi.PanelMenuIcecekler;
import javax.swing.JPanel;

/**
 *
 * @author Burak BEYKURT
 */
public class SetVisible 
{
    static void visibleAyarla(JPanel internalPanel) {
        
        PanelAnaEkran.setVisible(false);
        PanelMenu.setVisible(false);
        PanelBizeUlasin.setVisible(false);
        PanelMenuAnaYemekler.setVisible(false);
        PanelMenuAraSicaklar.setVisible(false);
        PanelMenuSalatalar.setVisible(false);
        PanelMenuIcecekler.setVisible(false);
        internalPanel.setVisible(true); 
    }
}
