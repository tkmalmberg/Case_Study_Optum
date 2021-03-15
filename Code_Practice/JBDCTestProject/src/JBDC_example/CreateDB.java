package JBDC_example;

import java.sql.*;
import java.util.Scanner;

public class CreateDB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306";
        String username = "testUser";
        String password = "toor";
        Scanner sc = new Scanner(System.in);

        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connecting to Database...");
        Statement stmt = conn.createStatement();

        String sql = "CREATE DATABASE TEST";
        stmt.executeUpdate(sql);
        System.out.println("Database created successfully...");
    }

}
