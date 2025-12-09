package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/*It is the combination of @EnableAutoConfiguration , @ComponentScan ,@SpringBootConfiguration
 * It is used to run Spring Boot Application
 * It is used to Enable Auto Configuration
 * It is Used to scan Component classes
 * It is used to enable the Spring Boot Configuration*/
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.employee")
//@SpringBootConfiguration
@SpringBootApplication
public class EmployeeManagementSystemByUsingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemByUsingSpringBootApplication.class, args);
	}

}
