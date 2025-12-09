package com.employee.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.dto.EmployeeDetailsDto;
import com.employee.entity.EmployeeDetails;
public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer>
{
	
//	/*delete from employee_details where employee_mobile_number=?*/
//	@Query("delete from EmployeeDetails emp where emp.mobilenumber=?1")
//	int removeByMobilenumber(long mobilenumber);
//	
	List<EmployeeDetails> findByEmpnameOrEmpemailidOrGenderOrAddress(String name,
			String emailid,String gender,String addres);
	

}
