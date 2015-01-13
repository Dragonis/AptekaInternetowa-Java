/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.java;

import AptekaInternetowa.models.Lek;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wojtek
 */
public class TableModel_LekiWPromocji extends AbstractTableModel {

    private String[] columnNames = {"ID", "Nazwa", "Producnt","Cena","Sztuk","Kupiony"};
    private ArrayList<Lek> tabLekiwPromocji = (new DatabaseLayer()).getLekiwPromocji();

    @Override
    public int getRowCount() {
        return tabLekiwPromocji.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lek ks = tabLekiwPromocji.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ks.getId();
            case 1:
                return ks.getNazwa();
            case 2:
                return ks.getProducent();
            case 3:
                return ks.getCena();
            case 4:
                return ks.getSztuk();
            case 5:
                return ks.isKupiony();
            default:
                throw new UnsupportedOperationException("Not supported operation");
        }
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public Class getColumnClass(int c) {
        switch (c) {
            case 5:
                return Boolean.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        if(tabLekiwPromocji.get(row).isKupiony() == false)
            {
                tabLekiwPromocji.get(row).setKupiony(true);
                System.out.println("Zmieniono wartosc na true");
                
                // tabNoweLeki.add(new Lek(4, "aaa", "bbb", (float) 14.06, 5, true));
                Lek ks = new Lek(4, "Lek_w_promocji", "Niesamowity_producent", (float) 14.06, 5);
                JTable JTable4 = new PanelZamowieniaKlienta().getJTable4();
                JTable4.setValueAt(1, 4, 0);
                
                fireTableCellUpdated(0, 4);
                JTable4.setModel(this);
                
                new TableModel_LekiDoZaplaty().setValueAt(0, row, col);
                           
                
                
                
            }else{
                tabLekiwPromocji.get(row).setKupiony(false);
                System.out.println("Zmieniono wartosc na false - w isCellEditable");
            }
        
            return col == 5;
    }
    
    

}
