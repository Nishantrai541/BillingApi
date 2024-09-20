package com.example.BillingWebAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillingWebAPI.DTO.EmployeeSignupDto;
import com.example.BillingWebAPI.Service.EmployeeService;
import com.example.BillingWebAPI.DTO.ShowEmployee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService services;
	
	
	//Signup Controller logic for employee
	@PostMapping(path="/signupEmp")
	public String signup(@RequestParam(name="empname", required=true) String name,
			@RequestParam(name="empEmail", required=true) String email,
			@RequestParam(name="empMobile", required=true) long mobile,
			@RequestParam(name="empAddress", required=true) String address,
			@RequestParam(name="empdepartment", required=true) String depart,
			@RequestParam(name="empPassword", required=true) String password) {
		EmployeeSignupDto employee=new EmployeeSignupDto(name,email,mobile,address,depart,password);
		
		
		return services.empSignup(employee);
		
	}
	
	//Login Controller Logic for Employee
	@PostMapping(path="/loginEmployeeWithEmail")
	public String loginEmp(@RequestParam(name="email", required=true) String email,
			@RequestParam(name="password", required=true) String password) {
		String empEmail=email;
		String empPassword=password;
		return services.empLogin(empEmail, empPassword);
	}
	
	@PostMapping(path="/loginEmployeeWithMobile")
	public String loginEmpMobile(@RequestParam(name="mobile", required=true) long mobile,
			@RequestParam(name="password", required=true) String password) {
		long mobile1 =mobile;
		String empPassword=password;
		return services.empLoginMob(mobile1, empPassword);
	}
	
	
	// Find all Employee controller logic
	@GetMapping(path="/allEmployee")
	public List<ShowEmployee> getAllEmp(){
		
		return services.getEmployee();
	}
	
	
	//Find all by department
//	@GetMapping(path="/")

}
