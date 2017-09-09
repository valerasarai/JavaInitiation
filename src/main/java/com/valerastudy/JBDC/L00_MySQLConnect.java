package com.valerastudy.JBDC;

import java.sql.*;

public class L00_MySQLConnect {
    public static Connection con(String dbname) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        Connection con;
        return con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/" + dbname,
                "root",
                "root123");
    }
}
