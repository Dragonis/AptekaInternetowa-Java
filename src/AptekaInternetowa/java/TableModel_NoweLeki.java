/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.java;

import AptekaInternetowa.models.Lek;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Wojtek
 */
public class TableModel_NoweLeki extends AbstractTableModel implements TableModelListener {

    String[] columnNames = {"ID", "Nazwa", "Producent","Cena","Sztuk","Kupiony"};
    ArrayList<Lek> tabNoweLeki = (new DatabaseLayer()).getNoweLeki();
    ArrayList<Lek> tabLekiDoZaplaty = (new DatabaseLayer()).getLekidoZaplaty();

    public TableModel_NoweLeki() {
        addTableModelListener(this);
    }
    
    @Override
    public int getRowCount() {
        return tabNoweLeki.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lek ks = tabNoweLeki.get(rowIndex);
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
    
     // Pozwala na edytowanie danych w tabeli
        @Override
        public boolean isCellEditable(int row, int col) {
           
            if(tabNoweLeki.get(row).isKupiony() == false)
            {
                tabNoweLeki.get(row).setKupiony(true);
                System.out.println("Zmieniono wartosc na true");
                
                // tabNoweLeki.add(new Lek(4, "aaa", "bbb", (float) 14.06, 5, true));
                Lek ks = new Lek(4, "aaa", "bbb", (float) 14.06, 5);
                JTable JTable4 = new PanelZamowieniaKlienta().getJTable4();
                JTable4.setValueAt(1, 4, 0);
                
                fireTableCellUpdated(0, 4);
                JTable4.setModel(this);
                
                new TableModel_LekiDoZaplaty().setValueAt(0, row, col);
                           
                
                
                
            }else{
                tabNoweLeki.get(row).setKupiony(false);
                System.out.println("Zmieniono wartosc na false - w isCellEditable");
            }
        
            return col == 5;
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
    public void tableChanged(TableModelEvent e) {

     int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);

        tabLekiDoZaplaty.add(new Lek(4, "aaa", "bbb", (float) 14.06, 5, true));
                
    }
    
    public void setValueAt(Object value, int row, int col) {
        
       // fireTableCellUpdated(row, col);
    }
    

}
