package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.dto.EmployeeDetailsDto;
import com.employee.entity.EmployeeDetails;
import com.employee.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/registrationPage")
	public String employeeRegistrationPage(Model model) {
		model.addAttribute("employeedetails", new EmployeeDetailsDto());
		return "EmployeeRegitration";
	}

	@RequestMapping("/registration")
	public String employeeRegistration(@Valid EmployeeDetailsDto employeeDetailsDto) {
		System.out.println(employeeDetailsDto);
		employeeService.employeeRegistration(employeeDetailsDto);
		return "redirect:/getAllEmployeeDetails";
	}

	@RequestMapping("/getAllEmployeeDetails")
	public String getAllEmployeeDetails(Model model) {
		List<EmployeeDetails> allEmployeeDetails = employeeService.allEmployeeDetails();
		model.addAttribute("allemployeedetails", allEmployeeDetails);
		return "DisplayAllEmployeeDetails";
	}

	@RequestMapping("/deletebyid")
	public String deleteEmployeeDetailsByusingId(int empid) {
		System.out.println(empid);
		employeeService.deleteEmployeeByUsingId(empid);
		return "redirect:/getAllEmployeeDetails";
	}
	@RequestMapping("/getbyusingid")
	public String getEmployeeDetailsByUsingId(int empid,Model model) {
		System.out.println(empid);
		EmployeeDetails employeeDetails = employeeService.getEmployeeByUsingId(empid);
		System.out.println(employeeDetails);
		model.addAttribute("employee", employeeDetails);
		return "UpdateEmployeeDetails" ;
	}
	@RequestMapping("/filterby")
	public String fiterEmoployeeByUsingNameOrEmailidOrAddressOrGender(String filter,Model model) {
		//System.out.println(filter);
		List<EmployeeDetails> filterEmployeeDetails = employeeService.filterEmployeeDetails(filter);
		model.addAttribute("allemployeedetails", filterEmployeeDetails);
		return "DisplayAllEmployeeDetails";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
