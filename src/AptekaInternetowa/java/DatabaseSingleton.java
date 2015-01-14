/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.java;

import AptekaInternetowa.models.Lek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author student
 */
public class DatabaseSingleton {
    
    // http://javastart.pl/static/zaawansowane-programowanie/bazy-danych-sqlite-w-javie/
    
     public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:AptekaInternetowa.db";
 
    private Connection conn;
    private Statement stat;
 
    public DatabaseSingleton() throws SQLException {
        try {
            Class.forName(DatabaseSingleton.DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Brak sterownika JDBC");
            e.printStackTrace();
        }
 
        try {
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem z otwarciem polaczenia");
            e.printStackTrace();
        }
 
        createTables();
    }

     public boolean createTables() throws SQLException  {
        String stworzTabele_Leki = "CREATE TABLE IF NOT EXISTS leki (id_leku INTEGER PRIMARY KEY AUTOINCREMENT, nazwa varchar(255), producent varchar(255), kupiony boolean)";
        stat.execute(stworzTabele_Leki);
        return true;
    }
 
    public boolean insertLek(int id, String nazwa, String producent, Boolean kupiony) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "insert into leki values (6, '6', '6', true);");
            prepStmt.setInt(1, id);
            prepStmt.setString(2, nazwa);
            prepStmt.setString(3, producent);
            prepStmt.setBoolean(4, kupiony);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu Leku (blad po stronie SQL)");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
     public ArrayList<Lek> selectLeki() throws SQLException {
        ArrayList<Lek> tablicaLekow = new ArrayList<Lek>();
        ResultSet result = stat.executeQuery("SELECT * FROM leki");
        int id;
        String nazwa, producent;
        Boolean kupiony;
        while(result.next()) {
            id = result.getInt("id");
            nazwa = result.getString("nazwa");
            producent = result.getString("producent");
            kupiony = result.getBoolean("kupiony");
            tablicaLekow.add(new Lek());
        }
        return tablicaLekow;
    }
    
     public void closeConnection() throws SQLException {
         conn.close();
    }
}
