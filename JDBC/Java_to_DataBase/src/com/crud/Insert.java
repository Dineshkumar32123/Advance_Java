package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {

        try {
//        1.Load or Register
            Class.forName("com.mysql.cj.jdbc.Driver");
//            2.Establish connection
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/actress","root","root");
//            3.Create Statement
            Statement s = c.createStatement();
//            4.Writing Queries
//            s.executeUpdate("insert into movie values ('Kaithi','Karthi','Loki',null,250.00,'Sam c.s',4.0)");
//            s.executeUpdate("update movie set director = 'Lokesh',MusicDirector='Anirudh ravichander' where moviename = 'Leo' ");;

            System.out.println("Data inserted...");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
