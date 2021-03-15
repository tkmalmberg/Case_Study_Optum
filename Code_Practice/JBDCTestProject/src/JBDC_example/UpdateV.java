package JBDC_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateV {
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

            String sql = "UPDATE employee "
                    + "SET salary = 95000 WHERE id = 223";
            int rowC = stmt.executeUpdate(sql);
            System.out.printf(sql + "\n%s Value(s) updated successfully...", rowC);
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
