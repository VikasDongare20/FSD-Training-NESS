package com.viki.Spring_JDBC_Demo.dao;

import java.util.List;

import com.viki.Spring_JDBC_Demo.entities.Employee;

public interface EmployeeDao {
	
	public int addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int id);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployes();
}

