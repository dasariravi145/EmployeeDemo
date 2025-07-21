package com.application.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	    @Bean
	    public EmployeeService empservice() {
	    	return new EmployeeService();
	    }

}
