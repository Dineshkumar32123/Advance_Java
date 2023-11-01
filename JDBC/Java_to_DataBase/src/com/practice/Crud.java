package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","root");
            Statement s = c.createStatement();

//            INSERT STMT
//            s.executeUpdate("insert into product_table values (01,'Rx100','yamaha',100000,1,9.5,'Black')");
//            s.executeUpdate("insert into product_table values (02,'R15','yamaha',250000,1,9.3,'Blue')");
//            s.executeUpdate("insert into product_table values (03,'RE','Royal Enfield',300000,1,9,'Black')");

//            UPDATE STMT
//            s.executeUpdate("update product_table set color = 'Gray' where pid=3");

//            DELETE STMT
//            s.executeUpdate("delete from product_table where pid=3");


            System.out.println("Inserted...");
            System.out.println("Updated...");
            System.out.println("Deleted...");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
