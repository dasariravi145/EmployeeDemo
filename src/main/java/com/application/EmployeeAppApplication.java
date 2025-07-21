package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.service.AppConfig;
import com.application.service.EmployeeService;


@SpringBootApplication
public class EmployeeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppApplication.class, args);
		
       ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService emp=context.getBean(EmployeeService.class);
		
		emp.saveEmployee();
	}

}
