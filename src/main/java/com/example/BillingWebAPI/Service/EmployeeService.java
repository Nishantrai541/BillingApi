package com.example.BillingWebAPI.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BillingWebAPI.DTO.EmployeeSignupDto;
import com.example.BillingWebAPI.DTO.ShowEmployee;
import com.example.BillingWebAPI.Entity.EmployeeEntity;
import com.example.BillingWebAPI.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	final EmployeeRepository emprepo;
	private EmployeeEntity em;
	
	
	//constructor
	public EmployeeService(EmployeeRepository empr) {
		this.emprepo=empr;
	}
	
	// Employee add Service layer 
	
	public String empSignup(EmployeeSignupDto emp) {
		long mobile=emp.getEmp_Mobile();
		em=emprepo.existByMobile(mobile);
		if(em==null) {//Mobile number check for Registration
			String email=emp.getEmp_Email();
			em=emprepo.existBYEmail(email);
			if(em==null) {// Email id check for registration
				em=new EmployeeEntity(emp.getEmp_Name(), emp.getEmp_Email(), emp.getEmp_Mobile(), emp.getEmp_Address(), emp.getEmp_Department(), emp.getEmp_Password());
				em=emprepo.save(em);// Data save on Database;
				if(!(em==null)) {
					return "Registered Successfully";
				}else 
					return "Something Went Wrong Try Again Leter";
			}
			
			return "Email Already Registered";
		}
		
		return "Mobile Already Registered";
	}

	
	//Login using Email
	public String empLogin(String email, String password) {
			
			String empEmail=email;
			String empPassword=password;
			em=emprepo.existBYEmail(empEmail);
			if(!(em==null)) {
				String passActual=em.getEmp_Password();
				if(empPassword.equals(passActual)) {
					return "Login Successfully";
				}
				return "Wrong Password";
			}
			return "User Not Register with this "+email+" Email";
		}
		
	
	//Login using Mobile
	public String empLoginMob(long mobile1, String password) {
		
		long number=mobile1;
		String empPassword=password;
		em=emprepo.existByMobile(number);
		if(!(em==null)) {
			String passActual=em.getEmp_Password();
			if(empPassword.equals(passActual)) {
				return "Login Successfully";
			}
			return "Wrong Password";
		}
		return "User Not Register with this "+number+" number";
	}
	
	//Find all Employee Service logic

	public List<ShowEmployee> getEmployee() {
		List<EmployeeEntity> empList=emprepo.findAll();
		List<ShowEmployee> showEmp=new ArrayList<>();
		for(EmployeeEntity e:empList) {
			ShowEmployee data=new ShowEmployee(e.getEmp_Name(), e.getEmp_Mobile(), e.getEmp_Email(), e.getEmp_Address(), e.getEmp_Department());
			showEmp.add(data);
		}
		return showEmp;
	}

	

	
	
	
}
