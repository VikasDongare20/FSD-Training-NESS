package com.viki.SpringWebProject.repository;



import org.springframework.data.repository.CrudRepository;

import com.viki.SpringWebProject.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	public Iterable<Employee> deleteByUsername(String username);
	public Employee findByUsername(String username);
	

}
