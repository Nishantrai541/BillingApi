package com.example.BillingWebAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillingWebAPI.DTO.CustomerDto;
import com.example.BillingWebAPI.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService servic;
	
	@PostMapping(path="/addCustomer")
	public String addCustomer(@RequestBody CustomerDto cust) {
	
		
		return servic.addMember(cust);
	}
	
	
	@PostMapping(path="/addCustomer1")
	public String addCustomer2(@RequestParam(name="Id", required=false) long id,
			@RequestParam(name="Name", required=true) String name,
			@RequestParam(name="Mobile", required=true) long mobile,
			@RequestParam(name="Email", required=true) String email,
			@RequestParam(name="Address" ) String address,
			@RequestParam(name="pin") int pin) {
		
		CustomerDto customer=new CustomerDto(id,name,mobile,email,address,pin);
		return servic.addMember(customer);
		
	}
	
	
	@PostMapping(path="/get/{id}")
	public CustomerDto getCustomer(@PathVariable("id") long id) {
		
		
		return servic.getCustomerData(id);
	}
	
	

	@PostMapping(path="/getNum/{num}")
	public CustomerDto getCUstomerByNum(@PathVariable("num") long num) {
		
		
		return servic.getCustomerDataByNum(num);
	}
	
	@PostMapping(path="/getEmail/{email}")
	public CustomerDto getCUstomerByNum(@PathVariable("email") String email) {
		
		
		return servic.getCustomerDataByEmail(email);
	}
	
	
}
