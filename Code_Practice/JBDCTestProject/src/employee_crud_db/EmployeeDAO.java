package employee_crud_db;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDAO implements IEmployeeDAO {
    private Connection conn = null;
    private String sql = null;
    private Statement stmt = null;
    private PreparedStatement ps = null;
    private ResultSet result = null;
    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> emps;
    public void connect() {
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "testUser";
        String password = "toor";

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connecting to Database...");
//            Statement stmt = conn.createStatement();
//
//            String sql = "CREATE TABLE Employee (id INT, name VARCHAR(50), title VARCHAR(50), salary decimal)";
//            stmt.executeUpdate(sql);
//            System.out.println(sql + "\nEmployee Table created successfully...");
//
//            sql = "INSERT INTO Employee (id, name, title, salary) values "
//                    + "(101, 'Tyler', 'Developer', 52000.00),"
//                    + "(223, 'Elijah', 'Senior Manager', 85000),"
//                    + "(201, 'Gerald', 'Software Engineer', 90000),"
//                    + "(150, 'Jean', 'CEO', 300000)";
//            int rowC = stmt.executeUpdate(sql);
//            System.out.println(rowC);
//            System.out.println(sql + "\nValues inserted successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Employee> getEmps() {
        return emps;
    }

    public void setEmps(ArrayList<Employee> emps) {
        this.emps = emps;
    }

    public boolean addEmp(Employee emp) throws SQLException {
        sql = "SELECT COUNT(id) FROM Employee WHERE id = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, emp.getId());
        result = ps.executeQuery();
        while (result.next()) {
            if (result.getInt("COUNT(id)") == 0) {
                sql = "INSERT INTO Employee (id, name, title, salary) values "
                        + "(?, ?, ?, ?)";
                ps = conn.prepareStatement(sql);
                ps.setInt(1, emp.getId());
                ps.setString(2, emp.getName());
                ps.setString(3, emp.getTitle());
                ps.setDouble(4, emp.getSalary());

                ps.executeUpdate();
                return true;
            } else {
                System.out.println("This user already exists...");
                return false;
            }
        }
        return false;
    }

    public Employee getEmp(int id) throws SQLException {
        sql = "SELECT id, name, title, salary FROM Employee WHERE id = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        result = ps.executeQuery();
        Employee e = new Employee();
        while (result.next()) {
            e.setId(result.getInt("id"));
            e.setName(result.getString("name"));
            e.setTitle(result.getString("title"));
            e.setSalary(result.getDouble("salary"));
        }
        return e;
    }

    public boolean updateEmp(Employee emp) throws SQLException {
        sql = "UPDATE employee "
                + "SET name = ?, "
                + "title = ?, "
                + "salary = ?"
                + " WHERE id = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, emp.getName());
        ps.setString(2, emp.getTitle());
        ps.setDouble(3, emp.getSalary());
        ps.setInt(4, emp.getId());
        int rowC = ps.executeUpdate();
        if (rowC > 0) {
            System.out.println("Employee " + emp.getId() + " Updated...");
            return true;
        } else {
            System.out.println("Employee " + emp.getId() + " does not exist. Adding to system...");
            this.addEmp(emp);
            return false;
        }
    }

    public boolean deleteEmp(int id) throws SQLException {
        sql = "DELETE FROM employee WHERE id = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        int rowC = ps.executeUpdate();
        if (rowC > 0) {
            System.out.println("Employee " + id + " Deleted...");
            return true;
        } else {
            System.out.println("Employee " + id + " does not exist.");
            return false;
        }
    }

    public void displayAllEmp() throws SQLException {
        sql = "SELECT id, name, title, salary FROM Employee";
        ps = conn.prepareStatement(sql);

        result = ps.executeQuery();
        while (result.next()) {
            System.out.printf("%-10s|%-10s|%-10s|%-10s\n",
                    result.getString("id"),
                    result.getString("name"),
                    result.getString("title"),
                    result.getString("salary"));
        }
    }
}
