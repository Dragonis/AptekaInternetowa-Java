/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.java;

import AptekaInternetowa.models.Lek;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wojtek
 */
public class DatabaseLayer {
        ArrayList<Lek> set = new ArrayList(); 
/// @UP: pojdzie do usunicia, kwestia tylko przerobienie tak samo nastepne metody
        ArrayList<Lek> leki = null;
        DatabaseSingleton db = null;
        
    public ArrayList<Lek> getNoweLeki() {
            try {
                db = new DatabaseSingleton();
                leki = db.pokazLekizDB();

                return leki;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DatabaseLayer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseLayer.class.getName()).log(Level.SEVERE, null, ex);
            }
            return leki;
    }
    
    public ArrayList<Lek> getLekiwPromocji()
    {
         try {
                db = new DatabaseSingleton();
                leki = db.pokazPromocyjneLekizDB();

                return leki;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DatabaseLayer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseLayer.class.getName()).log(Level.SEVERE, null, ex);
            }
            return leki;
    }
    
    public ArrayList<Lek> getLekidoZaplaty()
    {
        /*
        Lek doZaplaty1 = new Lek(1, "AAA", "ProducenteA", 50, 30, Boolean.FALSE);
        Lek doZaplaty2 = new Lek(2, "BBB", "ProducentB", 60, 80, Boolean.FALSE);
        Lek doZaplaty3 = new Lek(3, "CCC", "ProducentC", 70, 40, Boolean.FALSE);
        
        set.add(doZaplaty1); set.add(doZaplaty2); set.add(doZaplaty3);
        */
        
        return set;
    }

}
