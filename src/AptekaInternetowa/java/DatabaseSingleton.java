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
public final class DatabaseSingleton {

    Connection conn = null;
    Statement stat = null;
    
    public DatabaseSingleton() throws ClassNotFoundException, SQLException {
        
        Initialization();
        createTable();
        insrtData();
        showData();
        
        conn.close();
    }
    
    public void Initialization() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.sqlite.JDBC");
        conn  = DriverManager.getConnection("jdbc:sqlite:test.db");
        stat  = conn.createStatement();
    }
    public void insrtData() throws ClassNotFoundException, SQLException
    {
        PreparedStatement prep = conn.prepareStatement(
            "insert into people values (?, ?);");

        prep.setString(1, "Gandhi");
        prep.setString(2, "politics");
        prep.addBatch();
        prep.setString(1, "Turing");
        prep.setString(2, "computers");
        prep.addBatch();
        prep.setString(1, "Wittgenstein");
        prep.setString(2, "smartypants");
        prep.addBatch();

        conn.setAutoCommit(false);
        prep.executeBatch();
        conn.setAutoCommit(true);
    
       }

    public void showData() throws SQLException {
        ResultSet rs = stat.executeQuery("select * from people;");
        while (rs.next()) {
            System.out.println("name = " + rs.getString("name"));
            System.out.println("job = " + rs.getString("occupation"));
        }
        rs.close();
    }

    public void createTable() throws SQLException {
        stat.executeUpdate("drop table if exists people;");
        stat.executeUpdate("create table people (name, occupation);");
    }
    }
