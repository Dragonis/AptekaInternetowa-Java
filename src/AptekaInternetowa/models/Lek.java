/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.models;

/**
 *
 * @author Wojtek
 */
public class Lek {
    private int id;
    private String nazwa;
    private String producent;
    private float cena;
    private int sztuk;

    public Lek() {
    }
    

    public int getSztuk() {
        return sztuk;
    }

    public void setSztuk(int sztuk) {
        this.sztuk = sztuk;
    }
    private boolean kupiony;

    public boolean isKupiony() {
        return kupiony;
    }

    public void setKupiony(boolean kupiony) {
        this.kupiony = kupiony;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getProducent() {
        return producent;
    }
    public void setProducent(String producent) {
        this.producent = producent;
    }
 
    public Lek(int id, String tytul, String autor, float cena, int sztuk, boolean kupiony) {
        this.id = id;
        this.nazwa = tytul;
        this.producent = autor;
        this.cena = cena;
        this.sztuk = sztuk;
        this.kupiony = kupiony;
    }

    public Lek(int id, String tytul, String autor, float cena, int sztuk) {
        this.id = id;
        this.nazwa = tytul;
        this.producent = autor;
        this.cena = cena;
        this.sztuk = sztuk;
    }
    

}
