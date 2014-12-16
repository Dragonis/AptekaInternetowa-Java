
import java.util.List;
import kwiaciarnia.java.Biblioteka;
import kwiaciarnia.java.Czytelnik;
import kwiaciarnia.java.Ksiazka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Wojtek
 */
public class KwiaciarniaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Biblioteka b = new Biblioteka();
        b.insertCzytelnik("Karol", "Maciaszek", "92873847182");
        b.insertCzytelnik("Piotr", "Wojtecki", "89273849128");
        b.insertCzytelnik("Abdul", "Dabdul", "");
 
        b.insertKsiazka("Cień Wiatru", "Carlos Ruiz Zafon");
        b.insertKsiazka("W pustyni i w puszczy", "Henryk Sienkiewicz");
        b.insertKsiazka("Harry Potter", "Joanne Kathleen Rowling.");
 
        List<Czytelnik> czytelnicy = b.selectCzytelnicy();
        List<Ksiazka> ksiazki = b.selectKsiazki();
 
        System.out.println("Lista czytelników: ");
        for(Czytelnik c: czytelnicy)
            System.out.println(c);
 
        System.out.println("Lista książek:");
        for(Ksiazka k: ksiazki)
            System.out.println(k);
 
        b.closeConnection();
    }
    
}
