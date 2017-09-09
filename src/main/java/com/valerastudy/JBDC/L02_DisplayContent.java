package com.valerastudy.JBDC;

import java.sql.*;

public class L02_DisplayContent {
    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Class not found " + e);
//        }
        try {
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/test",
//                    "root",
//                    "root123");
            Connection con = L00_MySQLConnect.con("test");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
            System.out.println("id\tname\tjob");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job = rs.getString("job");
                System.out.println(id + "\t" + name + "\t" + job);
            }
        } catch (SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
    }
}