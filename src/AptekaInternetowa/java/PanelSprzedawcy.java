/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.java;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import AptekaInternetowa.models.Lek;
import AptekaInternetowa.models.Uzytkownik;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Wojtek
 */
public class PanelSprzedawcy extends javax.swing.JFrame {

    ArrayList<Lek> listaLekow_NoweLeki = new ArrayList<Lek>();
    ArrayList<Lek> listaLekow_wPromocji = new ArrayList<Lek>();
    DatabaseSingleton db = null;
    
    public PanelSprzedawcy() {
        initComponents();
   
        jLabel2.setText(Uzytkownik.Nazwa);
        TableModel_LekiWPromocji tableModel_LekiWPromocji = new TableModel_LekiWPromocji();
        TableModel_NoweLeki tableModel_NoweLeki = new TableModel_NoweLeki();

        jTable2.setModel(tableModel_LekiWPromocji);
        jTable3.setModel(tableModel_NoweLeki);
        
        listaLekow_NoweLeki = tableModel_NoweLeki.tabNoweLeki;
        listaLekow_wPromocji = tableModel_LekiWPromocji.tabLekiwPromocji;
       
            
        
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bttn_DodajLek = new javax.swing.JButton();
        txt_Cena = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Nazwa = new javax.swing.JTextField();
        txt_Producent = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Sztuk = new javax.swing.JTextField();
        usunDB_button = new javax.swing.JButton();
        Wyloguj_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jesteś zalogowany jako: ");

        jLabel5.setText("Lista leków:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nazwa", "Producent", "Cena"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTabbedPane2.addTab("Nowe", jScrollPane3);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nazwa", "Producent", "Cena"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane2.addTab("W promocji", jScrollPane2);

        jLabel2.setText("jLabel2");

        jLabel4.setText("Sprzedawca może wprowadzac, modyfikowac, usuwac dane tabeli.");

        jLabel6.setText("Uzytkownik moze tylko zaznaczac ktore leki chce kupic");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dodaj lek"));

        jLabel7.setText("Producent:");

        jLabel8.setText("Cena:");

        bttn_DodajLek.setText("Dodaj");
        bttn_DodajLek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_DodajLekActionPerformed(evt);
            }
        });

        txt_Cena.setText("1");

        jLabel3.setText("Nazwa:");

        txt_Nazwa.setText("aaa");

        txt_Producent.setText("aaa");

        jLabel9.setText("Sztuk:");

        txt_Sztuk.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_Nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Producent))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt_Cena, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Sztuk, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(bttn_DodajLek)))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Producent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Cena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Sztuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bttn_DodajLek)
                .addContainerGap())
        );

        usunDB_button.setText("usuń bazę danych");
        usunDB_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunDB_buttonActionPerformed(evt);
            }
        });

        Wyloguj_button.setText("Wyloguj");
        Wyloguj_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wyloguj_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(usunDB_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Wyloguj_button)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(usunDB_button)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Wyloguj_button)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_DodajLekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_DodajLekActionPerformed
        
        Integer id = new TableModel_NoweLeki().getRowCount() + 1;
        String nazwa = txt_Nazwa.getText();
        String producent = txt_Producent.getText();
        Float cena = Float.parseFloat( txt_Cena.getText() );
        Integer sztuk = Integer.parseInt( txt_Sztuk.getText() );
        
         Lek lek = new Lek(0, nazwa , producent, cena, sztuk);
                
                if(jTabbedPane2.getSelectedIndex() == 0)
                {
                    listaLekow_NoweLeki.add(lek);
                }
                else if (jTabbedPane2.getSelectedIndex() == 1)
                {
                    listaLekow_wPromocji.add(lek);
                }
        try {
            db = new DatabaseSingleton();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelSprzedawcy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PanelSprzedawcy.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            db.insertData(nazwa, producent, cena, sztuk);
            db.showData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelSprzedawcy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PanelSprzedawcy.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                TableModel_NoweLeki model = new TableModel_NoweLeki();
                TableModel_LekiWPromocji model2 = new TableModel_LekiWPromocji();
                model.tabNoweLeki = listaLekow_NoweLeki;
                model2.tabLekiwPromocji = listaLekow_wPromocji;
                if(jTabbedPane2.getSelectedIndex() == 0)
                {
                jTable3.setModel(model);
                }else if(jTabbedPane2.getSelectedIndex() == 1)
                {
                    jTable2.setModel(model2);   
                }               
                
    }//GEN-LAST:event_bttn_DodajLekActionPerformed

    private void usunDB_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunDB_buttonActionPerformed
        try {
            db = new DatabaseSingleton();
            db.usunDB();
            TableModel_LekiDoZaplaty model = new TableModel_LekiDoZaplaty();
            ArrayList<Lek> tabLekiDoZaplaty = model.tabLekiDoZaplaty;
            tabLekiDoZaplaty = null;
            listaLekow_NoweLeki = new ArrayList<>();
            listaLekow_wPromocji = new ArrayList<>();
            model.fireTableDataChanged();
            jTable3.setModel(model);
            
            JOptionPane.showMessageDialog(rootPane, "Usunięto DB");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelSprzedawcy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PanelSprzedawcy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_usunDB_buttonActionPerformed

    private void Wyloguj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wyloguj_buttonActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_Wyloguj_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(PanelSprzedawcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelSprzedawcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelSprzedawcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelSprzedawcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelSprzedawcy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Wyloguj_button;
    private javax.swing.JButton bttn_DodajLek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txt_Cena;
    private javax.swing.JTextField txt_Nazwa;
    private javax.swing.JTextField txt_Producent;
    private javax.swing.JTextField txt_Sztuk;
    private javax.swing.JButton usunDB_button;
    // End of variables declaration//GEN-END:variables
}
