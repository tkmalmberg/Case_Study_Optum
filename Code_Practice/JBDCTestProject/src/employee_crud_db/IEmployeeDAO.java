package employee_crud_db;

import java.sql.SQLException;

public interface IEmployeeDAO {
    boolean addEmp(Employee emp) throws SQLException;
    Employee getEmp(int id) throws SQLException;
    boolean updateEmp(Employee emp) throws SQLException;
    boolean deleteEmp(int id) throws SQLException;
    void displayAllEmp() throws SQLException;
}
