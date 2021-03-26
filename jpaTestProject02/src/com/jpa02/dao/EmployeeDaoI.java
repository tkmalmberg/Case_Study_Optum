package com.jpa02.dao;

import java.util.List;

import com.jpa02.entity.Employee;

public interface EmployeeDaoI {
	public void addEmp(Employee emp);
	public Employee getEmp(int id);
//	public void updateEmp(Employee emp);
//	public void removeEmp(int id);
//	public List<Employee> getAllEmp();
}
