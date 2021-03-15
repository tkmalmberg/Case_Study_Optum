package employee_crud_db;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Runnable {
    public static void main(String[] args) throws SQLException, InterruptedException {
        Scanner reader = new Scanner(System.in);
        EmployeeDAO app = new EmployeeDAO();
        app.connect();
        Integer choice = 0;
        while (choice != 6) {
            menu();
            choice = Integer.parseInt(reader.nextLine());

            switch (choice) {
                case 1:
                    Employee employee = new Employee();
                    System.out.print("\nEnter Employee ID:\n");
                    employee.setId(Integer.parseInt(reader.nextLine()));
                    System.out.print("\nEnter Employee Name:\n");
                    employee.setName(reader.nextLine());
                    System.out.print("\nEnter Employee's Title:\n");
                    employee.setTitle(reader.nextLine());
                    System.out.print("\nEnter Employee's Salary:\n");
                    employee.setSalary(Double.parseDouble(reader.nextLine()));
                    System.out.println(employee.getName());
                    if (app.addEmp(employee)) {
                        System.out.println("Employee successfully added");
                    } else {
                        System.out.println("Try Again");
                    }
                    break;
                case 2:
                    app.displayAllEmp();
                    break;
                case 3:
                    System.out.println("Please enter ID of Employee to remove:");
                    int input = Integer.parseInt(reader.nextLine());
                    if (app.deleteEmp(input)) {
                        System.out.println("Employee removed");
                    } else {
                        System.out.println("No such employee exists");
                    }
                    break;
                case 4:
                    Employee updateEmployee = new Employee();
                    System.out.print("\nID of Employee you want to update:\n");
                    updateEmployee.setId(Integer.parseInt(reader.nextLine()));
                    System.out.print("\nUpdate Employee Name:\n");
                    updateEmployee.setName(reader.nextLine());
                    System.out.print("\nUpdate Employee's Title:\n");
                    updateEmployee.setTitle(reader.nextLine());
                    System.out.print("\nUpdate Employee's Salary:\n");
                    updateEmployee.setSalary(Double.parseDouble(reader.nextLine()));
                    if (app.updateEmp(updateEmployee)) {
                        System.out.println("Employee ID " + updateEmployee.getId() + " has been updated.");
                    } else {
                        System.out.println("Employee " + updateEmployee.getId() + " has been added them to the system.");
                    }
                    break;
                case 5:
                    System.out.println("Please enter ID of Employee you want:");
                    input = Integer.parseInt(reader.nextLine());
                    System.out.println("\n" + app.getEmp(input) + "\n");
                    break;
                case 6:
                    System.out.println("\nBye");
                    app.close();
                    break;
            }
        }
        reader.close();
    }

    public static void menu() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\n***********************");
        System.out.println("* Choose an action:   *");
        System.out.println("***********************\n");
        System.out.println("1. Add Employee to System");
        System.out.println("2. Display System");
        System.out.println("3. Remove item from System");
        System.out.println("4. Update Employee Information");
        System.out.println("5. Get Specific Employee");
        System.out.println("6. Quit");
    }
}
