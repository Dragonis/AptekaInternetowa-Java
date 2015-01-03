/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwiaciarnia.java;

import kwiaciarnia.models.Ksiazka;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wojtek
 */
public class TableModel_KsiazkiDoZaplaty extends AbstractTableModel implements TableModelListener{

    private String[] columnNames = {"ID", "Tytul", "Autor","Cena","Sztuk"};
    private ArrayList<Ksiazka> tabKsiazkiDoZaplaty = (new DatabaseLayer()).getKsiazkidoZaplaty();

    @Override
    public int getRowCount() {
        return tabKsiazkiDoZaplaty.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ksiazka ks = tabKsiazkiDoZaplaty.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ks.getId();
            case 1:
                return ks.getTytul();
            case 2:
                return ks.getAutor();
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

    @Override
    public void tableChanged(TableModelEvent e) {
              //  tabKsiazkiDoZaplaty.add(new Ksiazka(6, "aaa", "bbb", (float) 14.06, 5));
    }

}
