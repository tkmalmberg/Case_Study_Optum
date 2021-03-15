package JBDC_example;

import java.sql.*;
import java.util.Scanner;

public class JBDCTest {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String username = "testUser";
        String password = "toor";
        Scanner sc = new Scanner(System.in);

        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Database is Connected");
//        String sql = "SELECT lastName, firstName, officeCode FROM employees ORDER BY lastName LIMIT 10";
//        Statement stmt = conn.createStatement();
//        ResultSet result = stmt.executeQuery(sql);

        String sql = "SELECT customerName, phone, country, creditLimit FROM customers WHERE customerNumber = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        System.out.println("Please enter a Customer Number:");
        ps.setInt(1, sc.nextInt());

        ResultSet result = ps.executeQuery();
        while (result.next()) {
            System.out.printf("%-10s|%-10s|%-10s|%-10s\n",
                    result.getString("customerName"),
                    result.getString("phone"),
                    result.getString("country"),
                    result.getString("creditLimit"));
        }
        System.out.println("Query Finished...");

//        PreparedStatement ps = conn.prepareStatement(sql);

    }
}
