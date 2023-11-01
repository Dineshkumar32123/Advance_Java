package com.select_statement;

import java.sql.*;

/*
* 1. next() depends on Result table
* 2. get() depends upon datatype of our column
* 3. next() present in ResultSet
* 4. get() present in ResultSet
* */
public class Select {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/actress","root","root");

            Statement s =c.createStatement();

            ResultSet rs = s.executeQuery("select * from movie");

            while(rs.next()){
                System.out.println("Movie name: "+rs.getString(1));
                System.out.println("Hero: "+rs.getString(2));
                System.out.println("Director: "+rs.getString(3));
                System.out.println("Heroine: "+rs.getString(4));
                System.out.println("Collection: "+rs.getDouble(5));
                System.out.println("Music Director: "+rs.getString(6));
                System.out.println("Rating: "+rs.getInt(7));
                System.out.println("-------------------------------------------------------");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
