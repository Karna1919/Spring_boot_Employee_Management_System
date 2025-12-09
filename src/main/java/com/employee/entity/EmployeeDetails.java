package com.employee.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "Employee_Details")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	@Column(nullable = false,name = "Employee_Name")
	private String empname;
	@Column(nullable = false,unique = true,name = "Employee_Emailid")
	private String empemailid;
	@Column(nullable = false,unique = true,name = "Employee_Mobile_Number")
	private long mobilenumber;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private double salary;
	@Column(nullable = false)
	private int deptno;

}
