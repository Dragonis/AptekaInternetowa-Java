/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.main;

import AptekaInternetowa.database.DatabaseToObjectAdapter;
import AptekaInternetowa.models.Lek;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wojtek
 */
public class TableModel_LekiDoZaplaty extends AbstractTableModel implements TableModelListener {

    private String[] columnNames = {"ID", "Nazwa", "Producent", "Cena", "Sztuk"};
     ArrayList<Lek> tabLekiDoZaplaty = (new DatabaseToObjectAdapter()).getLekidoZaplaty();

    @Override
    public int getRowCount() {
        return tabLekiDoZaplaty.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lek ks = tabLekiDoZaplaty.get(rowIndex);
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
    
       // Pozwala na edytowanie danych w tabeli
        @Override
        public boolean isCellEditable(int row, int col) {
           
            return false; // col == 4;
            
        }

    public void setValueAt(Object value, int row, int col) {
        fireTableCellUpdated(row, col);
      
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public void tableChanged(TableModelEvent e) {
   
    }

}
