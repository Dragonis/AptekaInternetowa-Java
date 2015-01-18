/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.java;

import AptekaInternetowa.models.Lek;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
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

    /**
     * Wyświetla wszystkie rekordy w tabeli zgodnie z wartoscia kolumny.
     * @param rowIndex
     * @param columnIndex
     * @return Object
     */
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
    
     /**
      * Metoda reagujaca na zaznaczenie badz odznaczenie checkboxa w tabeli
      * @param row
      * @param col
      * @return boolean
      */ 
    @Override
        public boolean isCellEditable(int row, int col) {
           
            // Jeżeli checkbox kupiony == false
            if(tabNoweLeki.get(row).isKupiony() == false)
            {
                // ustaw ten checkbox na true;
                tabNoweLeki.get(row).setKupiony(true);
                System.out.println("Zmieniono wartosc checbkboxa na true");
                
                // poniewaz nie mozna z tego miejsca wywolac dostepu do Tabeli, 
                // to odwoluje sie do niej prez przez new nowaFormatka.Tabela4 (ta ktora mnei interesuje)
                JTable JTable4 = new PanelZamowieniaKlienta().getJTable4();
               
                // wprwoadzam do tabeli zawartosc danych, jakim jest ta klasa.
                JTable4.setModel(this);
                
                // informuje tabele by sie odswiezyla 
                // poniewaz tabela sama w sobie nie ma mozliwosci autoodswiezania danych, po insercie/update/delete..)
                fireTableCellUpdated(0, 4);
                
                
                
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

    }
    
    public void setValueAt(Object value, int row, int col) {
        
    }
    

}
