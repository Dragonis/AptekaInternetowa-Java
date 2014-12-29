/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwiaciarnia.java;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wojtek
 */
public class TableModel extends AbstractTableModel{

    private String[] columnNames = {"ID","Name","CosJezscze"};
    private ArrayList<Ksiazka> tab = (new DatabaseLayer()).getKsiazki();
    
    
    @Override
    public int getRowCount() {
    return tab.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
        }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ksiazka ks = tab.get(rowIndex);
        switch(columnIndex)
        {
            case 0:
                return ks.getId();
            case 1:
                return ks.getTytul();
            case 2:
                return ks.getAutor();     
            default:
                throw new UnsupportedOperationException("Not supported operation");
        }
    }

    public String[] getColumnNames() {
        return columnNames;
    }
    
    
    
}
