/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AptekaInternetowa.java;

import AptekaInternetowa.models.Lek;
import java.io.File;
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
public final class DatabaseSingleton {

    Connection conn = null;
    Statement stat = null;
    String databaseName = "test.db";
    File file = null;
    
    public DatabaseSingleton() throws ClassNotFoundException, SQLException {
        
        Initialization(); // * sprawdzecznie czy db istnieje jak nie to stowrzenie jej
        showData();
        // closeConnection();
    }

    public void closeConnection() throws SQLException {
        conn.close();
    }
    
    public void Initialization() throws ClassNotFoundException, SQLException
    {
         file = new File(databaseName);
        if(! file.exists())
        {
        createTable();
        }
        Class.forName("org.sqlite.JDBC");
        conn  = DriverManager.getConnection("jdbc:sqlite:"+ databaseName);
        stat  = conn.createStatement();
    }
    public void insertData(String nazwa, String producent, Float cena, Integer sztuk) throws ClassNotFoundException, SQLException
    {
        PreparedStatement prep = conn.prepareStatement(
            "insert into leki values (?, ?, ?, ?);");

        prep.setString(1, nazwa);
        prep.setString(2, producent);
        prep.setFloat(3, cena);
        prep.setInt(4, sztuk);
        prep.addBatch();
        
        conn.setAutoCommit(false);
        prep.executeBatch();
        conn.setAutoCommit(true);
        
        
    
       }

    public void showData() throws SQLException {
        ResultSet rs = stat.executeQuery("select * from leki;");
        while (rs.next()) {
            System.out.println("nazwa = " + rs.getString("nazwa"));
            System.out.println("producent= " + rs.getString("producent"));
            System.out.println("cena= " + rs.getFloat("cena"));
            System.out.println("sztuk= " + rs.getInt("sztuk"));
        }
        rs.close();
        
    }

    public void createTable() throws SQLException {
         stat.executeUpdate("drop table if exists leki;");
         stat.executeUpdate("create table leki (nazwa,producent,cena,sztuk);");
    }

  



   
    }
