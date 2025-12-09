package com.employee.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.employee.dao.EmployeeDAO;
import com.employee.dto.EmployeeDetailsDto;
import com.employee.entity.EmployeeDetails;

/*@Service is used to specify the class is used to write the business logic code 
 *to perform validation,calculations and also used to create the structure of the 
 *response 
 *-> And also used to create the bean for the Service classes*/
@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	@Autowired
	private ModelMapper mapper;

	/*
	 * ModelMapper is the class which is used to transfer the values from one object
	 * to another object ->For that transaction we need to make use of map method
	 * which is non static two argument method ->First argument is object ref
	 * variable of the class from which we need to transfer the data ->second
	 * argument is to which class it has to be transfered that class file is
	 * provided as argument
	 */
	public void employeeRegistration(EmployeeDetailsDto employeeDetailsDto) {

		EmployeeDetails employeeDetails = mapper.map(employeeDetailsDto, EmployeeDetails.class);
		employeeDAO.insertEmployeeDetails(employeeDetails);
	}

	public List<EmployeeDetails> allEmployeeDetails() {/* Employee Service */
		return employeeDAO.getAllEmployeeDetails();
	}

	public void deleteEmployeeByUsingId(int empid) {
		employeeDAO.deleteEmployeeDetailsByUsingEmployeeId(empid);/* Service */
	}
	public EmployeeDetails getEmployeeByUsingId(int empid) {/* Employee Service */
		return employeeDAO.getEmployeeDetailsByUsingPrimaryKey(empid);
	}
	
	public List<EmployeeDetails> filterEmployeeDetails(String filter) {
		return employeeDAO.selectEmployeeDetailsByUsingEmpNameOrEmpEmailidOrGenderOrAddress(filter);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
