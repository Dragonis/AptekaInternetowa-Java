/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwiaciarnia.java;

import kwiaciarnia.models.Ksiazka;
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
public class TableModel_NoweKsiazki extends AbstractTableModel implements TableModelListener {

    private String[] columnNames = {"ID", "Tytul", "Autor","Cena","Sztuk","Kupiony"};
    private ArrayList<Ksiazka> tabNoweKsiazki = (new DatabaseLayer()).getNoweKsiazki();
    private ArrayList<Ksiazka> tabKsiazkiDoZaplaty = (new DatabaseLayer()).getKsiazkidoZaplaty();

    public TableModel_NoweKsiazki() {
        addTableModelListener(this);
    }
    
    @Override
    public int getRowCount() {
        return tabNoweKsiazki.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ksiazka ks = tabNoweKsiazki.get(rowIndex);
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
    
     // Pozwala na edytowanie danych w tabeli
        @Override
        public boolean isCellEditable(int row, int col) {
           
            if(tabNoweKsiazki.get(row).isKupiony() == false)
            {
                tabNoweKsiazki.get(row).setKupiony(true);
                System.out.println("Zmieniono wartosc na true");
                
                tabNoweKsiazki.add(new Ksiazka(4, "aaa", "bbb", (float) 14.06, 5, true));
                tabKsiazkiDoZaplaty.add(new Ksiazka(4, "aaa", "bbb", (float) 14.06, 5, true));
                JTable JTable4 = new PanelZamowieniaKlienta().getJTable4();
                JTable4.setValueAt(1, 4, 0);
                
                fireTableCellUpdated(0, 4);
                JTable4.setModel(this);
                
                
                
            }else{
                tabNoweKsiazki.get(row).setKupiony(false);
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

        tabKsiazkiDoZaplaty.add(new Ksiazka(4, "aaa", "bbb", (float) 14.06, 5, true));
                
    }
    
    public void setValueAt(Object value, int row, int col) {
        
        fireTableCellUpdated(row, col);
    }

}
