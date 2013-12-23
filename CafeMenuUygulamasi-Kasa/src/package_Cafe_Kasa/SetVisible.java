/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package_Cafe_Kasa;


import javax.swing.JPanel;
import static package_Cafe_Kasa.CafeUygulamasi.PanelAnaEkran;
import static package_Cafe_Kasa.CafeUygulamasi.PanelUrunler;
import static package_Cafe_Kasa.CafeUygulamasi.PanelGarsonlar;
import static package_Cafe_Kasa.CafeUygulamasi.PanelMasa;
import static package_Cafe_Kasa.CafeUygulamasi.PanelMasaSiparisDuzenle;
import static package_Cafe_Kasa.CafeUygulamasi.PanelSiparisDuzenleSecilenMasa;
import static package_Cafe_Kasa.CafeUygulamasi.PanelMasaSiparisEkle;
import static package_Cafe_Kasa.CafeUygulamasi.PanelUrunEkleDuzenleSil;

/**
 *
 * @author Burak BEYKURT
 */
public class SetVisible 
{
    static void visibleAyarla(JPanel internalPanel) {
        
        PanelAnaEkran.setVisible(false);
        PanelUrunler.setVisible(false);
        PanelGarsonlar.setVisible(false);
        PanelMasa.setVisible(false);
        PanelMasaSiparisDuzenle.setVisible(false);
        PanelSiparisDuzenleSecilenMasa.setVisible(false);
        PanelMasaSiparisEkle.setVisible(false);
        PanelUrunEkleDuzenleSil.setVisible(false);
        PanelGarsonlar.visibleFalsePanels();
        internalPanel.setVisible(true); 
    }
}
