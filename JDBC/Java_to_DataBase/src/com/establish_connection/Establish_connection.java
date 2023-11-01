package com.establish_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Establish_connection {
    public static void main(String[] args) {
        try {
//            1.Load or register
            Class.forName("com.mysql.cj.jdbc.Driver");

//            2.establish connection
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            System.out.println(c);

        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
