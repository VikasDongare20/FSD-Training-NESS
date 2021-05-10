package com.viki.SpringWebProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viki.SpringWebProject.model.Employee;
import com.viki.SpringWebProject.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	public EmployeeService() {
		
	}

	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void saveMyEmployee(Employee employee)
	{
		repo.save(employee);
	}
	
	public Iterable<Employee> showAllEmployee()
	{
		return repo.findAll();
	}
	
	public Iterable<Employee> deleteByUsername(String username)
	{
		repo.deleteByUsername(username);
		return repo.findAll();
	}
	
	public Employee findByUsername(String username)
	{
		return repo.findByUsername(username);
		
	}
	

}
