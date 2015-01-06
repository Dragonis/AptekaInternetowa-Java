/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.java;

import AptekaInternetowa.models.Lek;
import java.util.ArrayList;
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

}
