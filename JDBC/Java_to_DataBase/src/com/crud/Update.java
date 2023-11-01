package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        try {
//        1.Load or Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
//            2.Establish Connection
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/actress","root","root");
//            3.Create Statement
            Statement s = c.createStatement();
//            Execute Queries
            s.execute("update movie set director = 'Lokesh',MusicDirector='Anirudh ravichander' where moviename = 'Leo' ");
            System.out.println("Updated...");
        } catch (ClassNotFoundException | SQLException e) {
             e.printStackTrace();
        }

    }
}
