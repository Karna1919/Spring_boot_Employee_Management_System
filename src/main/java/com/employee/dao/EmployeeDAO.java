package com.employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.employee.dto.EmployeeDetailsDto;
import com.employee.entity.EmployeeDetails;
import com.employee.repository.EmployeeRepository;

/*@Repository is used to specify the class is used to perform the CRUD operations 
 *by depending on the Repository
 *-> And also used to create the bean for the DAO classes*/
@Repository
public class EmployeeDAO {

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeDetails insertEmployeeDetails(EmployeeDetails employeeDetails) {
		// insertion
		return employeeRepository.save(employeeDetails);
	}

	public List<EmployeeDetails> getAllEmployeeDetails() {/* Employee DAO */
		return employeeRepository.findAll();
	}

	public void deleteEmployeeDetailsByUsingEmployeeId(int empid) {
		employeeRepository.deleteById(empid);/* DAO */
	}

	public EmployeeDetails getEmployeeDetailsByUsingPrimaryKey(int empid) {
//		Optional<EmployeeDetails> byId = employeeRepository.findById(empid);
//
//		try {
//			EmployeeDetails employeeDetails = byId.get();
//			return employeeDetails;
//		} catch (Exception e) {
//			return null;
//		}
		try {
			EmployeeDetails employeeDetails = employeeRepository.findById(empid).get();
			return employeeDetails;
		} catch (Exception e) {
			return null;
		}
	}

public List<EmployeeDetails> selectEmployeeDetailsByUsingEmpNameOrEmpEmailidOrGenderOrAddress(String filter) {
		// Selection
return employeeRepository.findByEmpnameOrEmpemailidOrGenderOrAddress(filter,filter,filter,filter);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
