package com.load_or_register;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Load_register {
    public static void main(String[] args) {

//        way 2:  ---> Implicitly creating object
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
//            Way.1--->Explicitly creating object 
//            load or register
//        try {
//            Driver d = new com.mysql.cj.jdbc.Driver();
//            DriverManager.registerDriver(d);
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
