package com.jpa02.main;

import java.util.Scanner;

import com.jpa02.entity.Employee;
import com.jpa02.service.EmployeeService;

public class EmployeeAppMain {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		EmployeeService app = new EmployeeService();
//		app.connect();
		Employee e;
		int id;
		/*
		 * 1. Add an employee to the database
		 * 2. Access an employee info from the database
		 * 3. Update an employee info in the database
		 * 4. Remove an employee from the database
		 * 5. Display all employee info
		 * 6. Quit
		 */
		
		int choice = 0;
		while (choice != 7) {
			menu();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("\nEnter the Employee ID, Name, Title, and Salary");
				Employee emp = new Employee(Integer.parseInt(sc.nextLine()), 
											sc.nextLine(), 
											sc.nextLine(), 
											Double.parseDouble(sc.nextLine()));
				app.addEmpService(emp);
				break;
			case 2:
				System.out.println("Enter the Employee ID");
				id = Integer.parseInt(sc.nextLine());
				e = app.getEmpService(id);
				if (e!=null) {
					header();
					System.out.println(e);
				}
				break;
//			case 3:
//				System.out.println("\nEnter the Employee ID, Name, Title, and Salary to be updated");
//				e = new Employee(Integer.parseInt(sc.nextLine()), 
//											sc.nextLine(), 
//											sc.nextLine(), 
//											Double.parseDouble(sc.nextLine()));
//				app.updateEmp(e);
//				break;
//			case 4:
//				System.out.println("Enter the Employee ID to be removed");
//				id = Integer.parseInt(sc.nextLine());
//				app.removeEmp(id);
//				break;
//			case 5:
//				header();
//				app.getAllEmp().forEach(System.out::println);
//				break;
			case 6:
				System.out.println("\nEnter the Employee ID, Name, and Title to be validated");
				boolean valid = app.validateEmpService(Integer.parseInt(sc.nextLine()), 
														sc.nextLine(), 
														sc.nextLine());
				if (valid) {
					System.out.println("The employee is validated");
				} else {
					System.out.println("Invalid employee");
				}
				break;
			case 7:
//				app.close();
				System.out.println("\nClosing the app...");
				break;
			}
		}
		sc.close();
	}
	public static void menu() {
		System.out.println("\n**Employee DataBase App**");
		System.out.println("1. Add an employee");
		System.out.println("2. Access an employee");
		System.out.println("3. Update an employee");
		System.out.println("4. Remove an employee");
		System.out.println("5. Display all employee");
		System.out.println("6. Validate an employeee");
		System.out.println("7. Quit");
	}
	
	public static void header() {
		System.out.format("\n%3s %15s %20s %10s\n", "ID", "Name", "Title", "Salary");
		System.out.println("-".repeat(51));
	}

}
