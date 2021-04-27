package com.viki.spring_ORM_hibernate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.viki.spring_ORM_hibernate.dao.EmployeeDao;
import com.viki.spring_ORM_hibernate.entities.Employee;

/**
 * Hello world!
 *
 */

public class App 
{
   public static void main( String[] args )
   {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
       
   
		/*
		 * newEmployee.setId(1); newEmployee.setName("viki");
		 * newEmployee.setEmail("vdongare@gmail.com");
		 * 
		 * int result = dao.addEmployee(newEmployee);
		 * System.out.println("("+result+") rows inserted...");
		 */
    
       
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Boolean flag=true;
       while(flag)
       {
    	   System.out.println("Which operation u want to perform");
 		  System.out.println("Press:1- Add Employee");
 		  System.out.println("Press:2- Get All Employees");
 		  System.out.println("Press:3- Get employee by ID");
 		  System.out.println("Press:4- update employee");
 		  System.out.println("Press:5- delete employee");
 		  System.out.println("Press:6- Exit ");
 		  System.out.println("******************************************");
    	  try
    	  {
    		
    		  int value=Integer.parseInt(br.readLine());
    		  switch (value) {
					case 1:
						
						System.out.println("Enter Employee ID");
						int id=Integer.parseInt(br.readLine());
						System.out.println("Enter name of the Employee");
						String name=br.readLine();
						System.out.println("Enter email of the employee");
						String email=br.readLine();
						
						
						
						  Employee employee = new Employee(id, name, email);
						  employee.setId(id);
						  employee.setName(name);
						  employee.setEmail(email);
					     int result=dao.addEmployee(employee);
					     System.out.println("("+ result + ") Employee Added");
						
						
						
						break;
						
					case 2: 
						List<Employee> employees=dao.getAllEmployee();
						/*
						 * for(Employee employee1:employees) { System.out.println(employees); }
						 */
						System.out.println(employees);
						break;
					case 3:
						
						System.out.println("Enter employee id which u want to fetch");
						int id4=Integer.parseInt(br.readLine());
						Employee e1=dao.getEmployeeById(id4);
					
						System.out.println(e1);
						
						break;
						
					case 4:
						
						System.out.println("Enter Employee ID which u want to update");
						int id3=Integer.parseInt(br.readLine());
						System.out.println("Enter name of the Employee");
						String name3=br.readLine();
						System.out.println("Enter email of the employee");
						String email3=br.readLine();
						
						
						
						  Employee employee3 = new Employee(id3, name3, email3);
						  employee3.setId(id3);
						  employee3.setName(name3);
						  employee3.setEmail(email3);
						  dao.updateEmployee(employee3);
						  System.out.println("Employee Info Updated");
						  System.out.println(employee3);
						break;
					case 5:
						System.out.println("Enter id which you want to delete");
						int id1=Integer.parseInt(br.readLine());
						Employee emp=new Employee();
						emp.setId(id1);
						dao.deleteEmployee(id1);
						System.out.println("Employee Deleted");
						System.out.println(emp);
					case 6:
						break;
						
						
						
		
					default:
						System.out.println("Enter valid choice");
						break;
					}
    	  }
    	  catch (Exception e) {
			// TODO: handle exception
    		  System.out.println("Enter coorect value");
		}
    	   
    	   
       }
       
       
   }
}
