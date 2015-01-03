/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwiaciarnia.java;

import kwiaciarnia.models.Ksiazka;
import java.util.ArrayList;

/**
 *
 * @author Wojtek
 */
public class DatabaseLayer {
        ArrayList<Ksiazka> set = new ArrayList();

    public ArrayList<Ksiazka> getNoweKsiazki() {

        Ksiazka nowe1 = new Ksiazka(1, "Tytul", "Autor", 50, 30, true);
        Ksiazka nowe2 = new Ksiazka(2, "Tytul2", "Autor2", 60, 80, false);
        Ksiazka nowe3 = new Ksiazka(3, "Tytul3", "Autor3", 70, 40, true);

        set.add(nowe1); set.add(nowe2); set.add(nowe3);
        
        return set;
    }
    
    public ArrayList<Ksiazka> getKsiazkiwPromocji()
    {
        
        Ksiazka wPromocji1 = new Ksiazka(1, "Ala", "Autor", 50, 30, true);
        Ksiazka wPromocji2 = new Ksiazka(2, "ma", "Autor2", 60, 80, false);
        Ksiazka wPromocji3 = new Ksiazka(3, "Kota", "Autor3", 70, 40, true);
        
        set.add(wPromocji1); set.add(wPromocji2); set.add(wPromocji3);

        return set;
    }
    
    public ArrayList<Ksiazka> getKsiazkidoZaplaty()
    {
        
        Ksiazka doZaplaty1 = new Ksiazka(1, "AAA", "Autor", 50, 30, Boolean.TRUE);
        Ksiazka doZaplaty2 = new Ksiazka(2, "BBB", "Autor2", 60, 80, Boolean.FALSE);
        Ksiazka doZaplaty3 = new Ksiazka(3, "CCC", "Autor3", 70, 40, Boolean.TRUE);
        
        set.add(doZaplaty1); set.add(doZaplaty2); set.add(doZaplaty3);

        return set;
    }

}
