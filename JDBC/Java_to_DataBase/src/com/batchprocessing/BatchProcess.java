package com.batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcess {
    public static void main(String[] args) {
        Connection c = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many data's want to insert ?");
        int count = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql://localhost:3306/actress","root","root");
            PreparedStatement ps = c.prepareStatement("insert into movie values (?,?,?,?,?,?,?)");
            for (int i=1;i<=count;i++){
                System.out.println("Enter Movie name: ");
                String mname = sc.next();
                System.out.println("Enter Hero: ");
                String hero = sc.next();
                System.out.println("Enter Director: ");
                String director = sc.next();
                System.out.println("Enter Heroine: ");
                String heroine = sc.next();
                System.out.println("Enter Collection: ");
                double collection = sc.nextDouble();
                System.out.println("Enter Music Director ");
                String musicDirector = sc.next();
                System.out.println("Enter Rating: ");
                int rating = sc.nextInt();

                ps.setString(1,mname);
                ps.setString(2,hero);
                ps.setString(3,director);
                ps.setString(4,heroine);
                ps.setDouble(5,collection);
                ps.setString(6,musicDirector);
                ps.setInt(7,rating);

                System.err.println(i+" row inserted...");
                ps.addBatch();
            }
            ps.executeBatch();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                c.close();
                System.out.println("Connection closed...");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
