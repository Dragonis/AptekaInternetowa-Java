/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwiaciarnia.java;

import java.util.ArrayList;

/**
 *
 * @author Wojtek
 */
public class DatabaseLayer {

    public ArrayList<Ksiazka> getKsiazki() {

        ArrayList<Ksiazka> set = new ArrayList();

        Ksiazka b1 = new Ksiazka(1, "Tytul", "Autor",50);
        Ksiazka b2 = new Ksiazka(2, "Tytul2", "Autor2",60);
        Ksiazka b3 = new Ksiazka(3, "Tytul3", "Autor3",70);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        return set;
    }

}
