package com.viki.Spring_JDBC_Demo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.viki.Spring_JDBC_Demo.dao.EmployeeDaoImpl;
import com.viki.Spring_JDBC_Demo.entities.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println("Application started...");
         ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
         EmployeeDaoImpl daoImpl = context.getBean("empDao", EmployeeDaoImpl.class);
         Scanner sc= new Scanner(System.in);
        
      
         
         // insert
       //  employee.setName("viki");
			/*
			 * employee.setId(8); result = daoImpl.updateEmployee(employee);
			 * System.out.println("("+result+") rows inserted..");
			 */
         Employee employee = new Employee();
         employee.setName("raju");
         employee.setId(1);
         daoImpl.updateEmployee(employee);
       System.out.println("Employee Info Updated");
       System.out.println("*************Press******************");
       System.out.println("1:ADD Employee");
       System.out.println("2:Get All Employee");
       System.out.println("3:Update Employee");
       System.out.println("4:Delete Employee");
       System.out.println("**************Enter your choice*********");
       int input=sc.nextInt();
       switch (input) {
	case 1: System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter email");
			String email=sc.next();
			Employee employee1 = new Employee();
			
			employee1.setId(id);
		    employee1.setName(name);
		    employee1.setEmail(email);
		    int result = daoImpl.addEmployee(employee1);
		    System.out.println("("+result+") rows inserted..");
		 
		
		break;

	default:
		break;
	}
         
       
       
        
    }
}
