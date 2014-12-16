/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwiaciarnia.java;

/**
 *
 * @author Wojtek
 */
public class Kupienie {
    private int idKsiazka;
    private int idCzytelnik;
 
    public int getIdKsiazka() {
        return idKsiazka;
    }
    public void setIdKsiazka(int idKsiazka) {
        this.idKsiazka = idKsiazka;
    }
    public int getIdCzytelnik() {
        return idCzytelnik;
    }
    public void setIdCzytelnik(int idCzytelnik) {
        this.idCzytelnik = idCzytelnik;
    }
 
    public Kupienie() {}
    public Kupienie(int idKsiazka, int idCzytelnik) {
        this.idKsiazka = idKsiazka;
        this.idCzytelnik = idCzytelnik;
 
    }
}