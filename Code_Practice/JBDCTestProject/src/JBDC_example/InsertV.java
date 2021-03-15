package JBDC_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertV {
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

            String sql = "INSERT INTO Employee (id, name, title, salary) values "
                    + "(101, 'Young', 'Intern', 25000),"
                    + "(223, 'Elijah', 'Senior Manager', 85000),"
                    + "(201, 'Gerald', 'Software Engineer', 90000),"
                    + "(150, 'Jean', 'CEO', 300000)";
            int rowC = stmt.executeUpdate(sql);
            System.out.println(rowC);
            System.out.println(sql + "\nValues inserted successfully...");
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
