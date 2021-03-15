package JBDC_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTB {
    static Connection conn = null;
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "testUser";
        String password = "toor";
        Scanner sc = new Scanner(System.in);

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connecting to Database...");
            Statement stmt = conn.createStatement();

            String sql = "CREATE TABLE Employee (id INT, name VARCHAR(50), title VARCHAR(50), salary decimal)";
            stmt.executeUpdate(sql);
            System.out.println(sql + "\nUpdate run successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
