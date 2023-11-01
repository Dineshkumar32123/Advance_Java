package com.user_input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Movie name: ");
//        String mname = sc.next();
//        System.out.println("Enter Hero: ");
//        String hero = sc.next();
//        System.out.println("Enter Director: ");
//        String director = sc.next();
//        System.out.println("Enter Heroine: ");
//        String heroine = sc.next();
//        System.out.println("Enter Collection: ");
//        double collection = sc.nextDouble();
//        System.out.println("Enter Music Director ");
//        String musicDirector = sc.next();
//        System.out.println("Enter Rating: ");
//        int rating = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/actress","root","root");

//            PreparedStatement ps =c.prepareStatement("insert into movie values (?,?,?,?,?,?,?)");
//
//            ps.setString(1,mname);
//            ps.setString(2,hero);
//            ps.setString(3,director);
//            ps.setString(4,heroine);
//            ps.setDouble(5,collection);
//            ps.setString(6,musicDirector);
//            ps.setInt(7,rating);
//
//            ps.executeUpdate();
//
//            System.out.println("Success...");

//            System.out.println("Enter rating: ");
//            int rating = sc.nextInt();
//            System.out.println("Enter Moviename: ");
//            String mname = sc.next();

//            PreparedStatement ps1 = c.prepareStatement("update movie set rating=? where moviename=?");
//            ps1.setInt(1,rating);
//            ps1.setString(2,mname);
//            System.out.println("updated...");
//
//            ps1.executeUpdate();


            PreparedStatement ps2 = c.prepareStatement("update movie set director=? where moviename=?");
            System.out.println("Enter Director Name: ");
            String director = sc.next();
            System.out.println("Enter Moviename: ");
            String mname = sc.next();
            ps2.setString(1,director);
            ps2.setString(2,mname);
            ps2.executeUpdate();

            System.out.println("director name updated...");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
