/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.java;

import AptekaInternetowa.models.Lek;
import java.util.ArrayList;

/**
 *
 * @author Wojtek
 */
public class DatabaseLayer {
        ArrayList<Lek> set = new ArrayList();

    public ArrayList<Lek> getNoweLeki() {

        Lek nowe1 = new Lek(1, "Lek1", "Producent", 50, 30, false);
        Lek nowe2 = new Lek(2, "lek2", "Producent2", 60, 80, false);
        Lek nowe3 = new Lek(3, "lek3", "Producent3", 70, 40, false);

        set.add(nowe1); set.add(nowe2); set.add(nowe3);
        
        return set;
    }
    
    public ArrayList<Lek> getLekiwPromocji()
    {
        
        Lek wPromocji1 = new Lek(1, "Ala", "Autor", 50, 30, false);
        Lek wPromocji2 = new Lek(2, "ma", "Autor2", 60, 80, false);
        Lek wPromocji3 = new Lek(3, "Kota", "Autor3", 70, 40, false);
        
        set.add(wPromocji1); set.add(wPromocji2); set.add(wPromocji3);

        return set;
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
