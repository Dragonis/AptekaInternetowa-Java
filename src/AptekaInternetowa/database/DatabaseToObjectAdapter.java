/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.database;

import AptekaInternetowa.models.Lek;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wojtek
 */
public class DatabaseToObjectAdapter {
        ArrayList<Lek> set = new ArrayList(); 
        ArrayList<Lek> leki = new ArrayList();
        SingletonDatabaseInstance db = null;
        
    public ArrayList<Lek> getNoweLeki() {
            try {
                db = new SingletonDatabaseInstance();
                leki = db.pokazLekizDB();
                return leki;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DatabaseToObjectAdapter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseToObjectAdapter.class.getName()).log(Level.SEVERE, null, ex);
            }
            return leki;
    }
    
    public ArrayList<Lek> getLekiwPromocji()
    {
         try {
                db = new SingletonDatabaseInstance();
                leki = db.pokazPromocyjneLekizDB();
                return leki;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DatabaseToObjectAdapter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseToObjectAdapter.class.getName()).log(Level.SEVERE, null, ex);
            }
            return leki;
    }
    
    public ArrayList<Lek> getLekidoZaplaty()
    {
        return set;
    }
}
