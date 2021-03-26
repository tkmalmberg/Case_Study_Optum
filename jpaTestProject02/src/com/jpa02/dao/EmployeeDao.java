package com.jpa02.dao;

import com.jpa02.dbConnection.DBConnection;
import com.jpa02.entity.Employee;

public class EmployeeDao extends DBConnection implements EmployeeDaoI {

	@Override
	public void addEmp(Employee emp) {
		this.connect();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		this.disconnect();
	}

	@Override
	public Employee getEmp(int id) {
		this.connect();
		Employee empFound = em.find(Employee.class, id);
		this.disconnect();
		return empFound;
	}

}
