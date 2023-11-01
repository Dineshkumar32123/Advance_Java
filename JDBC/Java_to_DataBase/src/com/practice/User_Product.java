package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","root");

//            Inserting values

//            PreparedStatement ps = c.prepareStatement("insert into product_table values (?,?,?,?,?,?,?) ");
//
//            System.out.println("Enter pid: ");
//            int pid =sc.nextInt();
//            System.out.println("Enter name: ");
//            String name =sc.next();
//            System.out.println("Enter brand: ");
//            String brand = sc.next();
//            System.out.println("Enter price: ");
//            double price =sc.nextDouble();
//            System.out.println("Enter Quantity: ");
//            int quantity =sc.nextInt();
//            System.out.println("Enter rating: ");
//            double rating = sc.nextDouble();
//            System.out.println("Enter color: ");
//            String color = sc.next();
//
//            ps.setInt(1,pid);
//            ps.setString(2,name);
//            ps.setString(3,brand);
//            ps.setDouble(4,price);
//            ps.setInt(5,quantity);
//            ps.setDouble(6,rating);
//            ps.setString(7,color);
//
//            ps.executeUpdate();

//            Updation
//            PreparedStatement ps1 = c.prepareStatement("update product_table set price=? where pid=?");
//            System.out.println("Enter the Price: ");
//            int price =sc.nextInt();
//            System.out.println("Enter pid: ");
//            int pid = sc.nextInt();
//            ps1.setInt(1,price);
//            ps1.setInt(2,pid);
//            ps1.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
