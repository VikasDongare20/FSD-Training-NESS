package com.viki.Spring_JDBC_Demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.viki.Spring_JDBC_Demo.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addEmployee(Employee employee) {
		String query = "insert into employee (empId, name, email) values (?,?,?)";
        int result =  jdbcTemplate.update(query,employee.getId(), employee.getName(), employee.getEmail());
        return result;
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String query = "update employee set name = ? where empId = ?";
		int result=jdbcTemplate.update(query, employee.getName(), employee.getId());
		System.out.println(" "+result);
	       
		
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String query = "delete from employee where empId = ?";
		jdbcTemplate.update(query, id);
		 System.out.println("Deleted Record with ID = " + id );
	      return;	
		
	}

	public Employee getEmployee(int id) {
		return null;
		
	}

	/*
	 * public List<Employee> getAllEmployes(Employee employee) { // TODO
	 * Auto-generated method stub
	 * 
	 * String query="select * from employee"; jdbcTemplate.update(query); return
	 * null;
	 * 
	 * }
	 */

	
	  public List<Employee> getAllEmployes() { 
		  String SQL ="select * from employee";
	  //List <Employee> employee =jdbcTemplate.query("select * from employee");
	  //return employee;
		return null;
	  
	  }
	 
	
	

}

