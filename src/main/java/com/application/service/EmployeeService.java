package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.application.entity.Employee;

@Service
public class EmployeeService {

	   public void saveEmployee() {
		   
		      List<Employee> list=new ArrayList<>();
		      
		      list.add(new Employee(123, "ravi"));
		      list.add(new Employee(234, "abc"));
		      
		       for(Employee emp:list) {
		    	   
		    	      System.out.println(emp.getId());
		    	      System.out.println(emp.getName());
		       }
		      
	   }
}
