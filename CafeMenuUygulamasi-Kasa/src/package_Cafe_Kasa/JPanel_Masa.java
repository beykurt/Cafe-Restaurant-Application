
package package_Cafe_Kasa;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class JPanel_Masa extends javax.swing.JPanel {

    SQLQuaries sqlQuaries = new SQLQuaries();
    Color koyuYesil = new Color (51,204,0);
    public JPanel_Masa() 
    {
        initComponents();
        
        ArrayList<Table> table = sqlQuaries.returnTableInfo();
        for(Table a : table)
        {
            switch (a.gettableNo())
            {
                case "1" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa1.setBackground(Color.red);
                                else button_Masa1.setBackground(koyuYesil); break;
                case "2" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa2.setBackground(Color.red);
                                else button_Masa2.setBackground(koyuYesil); break;
                case "3" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa3.setBackground(Color.red);
                                else button_Masa3.setBackground(koyuYesil); break;
                case "4" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa4.setBackground(Color.red);
                                else button_Masa4.setBackground(koyuYesil); break;
                case "5" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa5.setBackground(Color.red);
                                else button_Masa5.setBackground(koyuYesil); break;
                case "6" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa6.setBackground(Color.red);
                                else button_Masa6.setBackground(koyuYesil); break;
                case "7" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa7.setBackground(Color.red);
                                else button_Masa7.setBackground(koyuYesil); break;
                case "8" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa8.setBackground(Color.red);
                                else button_Masa8.setBackground(koyuYesil); break;
                case "9" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa9.setBackground(Color.red);
                                else button_Masa9.setBackground(koyuYesil); break;
                case "10" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa10.setBackground(Color.red);
                                else button_Masa10.setBackground(koyuYesil); break;
                case "11" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa11.setBackground(Color.red);
                                else button_Masa11.setBackground(koyuYesil); break;
                case "12" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa12.setBackground(Color.red);
                                else button_Masa12.setBackground(koyuYesil); break;
                case "13" : if(a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa13.setBackground(Color.red);
                                else button_Masa13.setBackground(koyuYesil); break;    
            }
            if(a.gettableNo().equals("1") && a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa1.setBackground(Color.red);
                else button_Masa1.setBackground(koyuYesil);

            if(a.gettableNo().equals("2") && a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa2.setBackground(Color.red);
                else button_Masa2.setBackground(koyuYesil);

            if(a.gettableNo().equals("3") && a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa3.setBackground(Color.red);
                else button_Masa3.setBackground(koyuYesil);

            if(a.gettableNo().equals("4") && a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa4.setBackground(Color.red);
                else button_Masa4.setBackground(koyuYesil);

            if(a.gettableNo().equals("5") && a.gettableStatus().equalsIgnoreCase("DOLU")) button_Masa5.setBackground(Color.red);
                else button_Masa5.setBackground(koyuYesil);
            
        }
        //String status = sqlQuaries.returnTableInfo("4");
        //JOptionPane.showMessageDialog(null, " "+status, "Garson Seçiniz", JOptionPane.PLAIN_MESSAGE);
       
        /*if(sqlQuaries.returnTableInfo("1").equalsIgnoreCase("DOLU"))
            button_Masa1.setBackground(Color.red);
        else
            button_Masa1.setBackground(koyuYesil);
        
        if(sqlQuaries.returnTableInfo("2").equalsIgnoreCase("DOLU"))
            button_Masa2.setBackground(Color.red);
        else
            button_Masa2.setBackground(koyuYesil);
        
        if(sqlQuaries.returnTableInfo("3").equalsIgnoreCase("DOLU"))
            button_Masa3.setBackground(Color.red);
        else
            button_Masa3.setBackground(koyuYesil);
        
        if(sqlQuaries.returnTableInfo("4").equalsIgnoreCase("DOLU"))
            button_Masa4.setBackground(Color.red);
        else
            button_Masa4.setBackground(koyuYesil);
        
        if(sqlQuaries.returnTableInfo("4").equalsIgnoreCase("DOLU"))
            button_Masa4.setBackground(Color.red);
        else
            button_Masa4.setBackground(koyuYesil);*/
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        button_Masa1 = new java.awt.Button();
        button_Masa2 = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        button_Masa4 = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        button_Masa5 = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        button_Masa8 = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        button_Masa7 = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        button_Masa6 = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        button_Masa11 = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();
        button_Masa10 = new java.awt.Button();
        jLabel9 = new javax.swing.JLabel();
        button_Masa13 = new java.awt.Button();
        jLabel10 = new javax.swing.JLabel();
        button_Masa9 = new java.awt.Button();
        jLabel11 = new javax.swing.JLabel();
        button_Masa12 = new java.awt.Button();
        jLabel12 = new javax.swing.JLabel();
        button_Masa3 = new java.awt.Button();
        jLabel13 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(874, 768));

        panel1.setBackground(new java.awt.Color(226, 226, 226));
        panel1.setName(""); // NOI18N
        panel1.setPreferredSize(new java.awt.Dimension(874, 768));

        jLabel1.setText("Hesap : 0 TL");

        button_Masa1.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa1.setLabel("MASA 1");
        button_Masa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Masa1ActionPerformed(evt);
            }
        });

        button_Masa2.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa2.setLabel("MASA 2");
        button_Masa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Masa2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Hesap : 0 TL");

        button_Masa4.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa4.setLabel("MASA 4");

        jLabel3.setText("Hesap : 0 TL");

        button_Masa5.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa5.setLabel("MASA 5");

        jLabel4.setText("Hesap : 0 TL");

        button_Masa8.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa8.setLabel("MASA 8");

        jLabel5.setText("Hesap : 0 TL");

        button_Masa7.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa7.setLabel("MASA 7");

        jLabel6.setText("Hesap : 0 TL");

        button_Masa6.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa6.setLabel("MASA 6");

        jLabel7.setText("Hesap : 0 TL");

        button_Masa11.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa11.setLabel("MASA 11");

        jLabel8.setText("Hesap : 0 TL");

        button_Masa10.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa10.setLabel("MASA 10");

        jLabel9.setText("Hesap : 0 TL");

        button_Masa13.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa13.setLabel("MASA 13");

        jLabel10.setText("Hesap : 0 TL");

        button_Masa9.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa9.setLabel("MASA 9");

        jLabel11.setText("Hesap : 0 TL");

        button_Masa12.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa12.setLabel("MASA 12");

        jLabel12.setText("Hesap : 0 TL");

        button_Masa3.setBackground(new java.awt.Color(51, 204, 0));
        button_Masa3.setLabel("MASA 3");

        jLabel13.setText("Hesap : 0 TL");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button_Masa1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_Masa9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Masa6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Masa10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Masa2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button_Masa11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_Masa7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button_Masa3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Masa8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Masa4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Masa12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Masa5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Masa13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(button_Masa2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(button_Masa6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(button_Masa9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(button_Masa3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(button_Masa7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(button_Masa10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(button_Masa11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(button_Masa1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button_Masa4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(button_Masa8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(button_Masa5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(button_Masa13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(button_Masa12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(284, Short.MAX_VALUE))
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

    private void button_Masa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Masa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_Masa2ActionPerformed

    private void button_Masa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Masa1ActionPerformed
        
    }//GEN-LAST:event_button_Masa1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button_Masa1;
    private java.awt.Button button_Masa10;
    private java.awt.Button button_Masa11;
    private java.awt.Button button_Masa12;
    private java.awt.Button button_Masa13;
    private java.awt.Button button_Masa2;
    private java.awt.Button button_Masa3;
    private java.awt.Button button_Masa4;
    private java.awt.Button button_Masa5;
    private java.awt.Button button_Masa6;
    private java.awt.Button button_Masa7;
    private java.awt.Button button_Masa8;
    private java.awt.Button button_Masa9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
