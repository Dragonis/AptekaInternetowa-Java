/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwiaciarnia.models;

/**
 *
 * @author Wojtek
 */
public class Uzytkownik {
    public static String Nazwa;
    public static String Haslo;

    public Uzytkownik(String Nazwa, String Haslo) {
        this.Nazwa = Nazwa;
        this.Haslo = Haslo;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String Nazwa) {
        this.Nazwa = Nazwa;
    }

    public String getHaslo() {
        return Haslo;
    }

    public void setHaslo(String Haslo) {
        this.Haslo = Haslo;
    }
}
