package com.employee.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetailsDto {
	
	private String empname;
	@Email(message = "Invalid Emailid")
	private String empemailid;
	@Min(value = 6000000000l ,message = "Invalid Mobile Number")
	@Max(value = 9999999999l ,message = "Invalid Mobile Number")
	private long mobilenumber;
	private String gender;
	private String address;
	private double salary;
	private int deptno;
	

}
