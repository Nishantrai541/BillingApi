package com.example.BillingWebAPI.Service;


import org.springframework.stereotype.Service;

import com.example.BillingWebAPI.DTO.CustomerDto;
import com.example.BillingWebAPI.Entity.CustomerEntity;
import com.example.BillingWebAPI.Repository.CustomerRepository;

@Service
public class CustomerService {
	
	
	final CustomerRepository repo;
	private CustomerEntity customer;
	
	
	
	public CustomerService(CustomerRepository repository) {
		
		this.repo=repository;
	}
	
	


	public CustomerDto getCustomerData(long id){
		// TODO Auto-generated method stub
		customer=repo.findById(id).get();
		if(!(customer==null)){
			return new CustomerDto(customer.getCust_Id(), customer.getCust_Name(), customer.getCust_Mobile(), customer.getCust_Email(), customer.getCust_Address(), customer.getCust_pin());
		}
		
		return null;
	}




	public String addMember(CustomerDto cust) {
		
		long num=cust.getCustomer_Mobile();

		customer=repo.findByMobile(num);
		
		if(customer==null) {
			customer=repo.findByEmail(cust.getCustomer_Email());
			if(customer==null) {
			CustomerEntity customer1=new CustomerEntity(cust.getCustomer_Id(),cust.getCustomer_Name(), cust.getCustomer_Mobile(), cust.getCustomer_Email(), cust.getCustomer_Address(), cust.getCustomer_pin());
			customer1=this.repo.save(customer1);
			if(!(customer1==null)) {
				return "Success";
			}
			return "something Wrong";
			} return "Email Already Registered Please add New Email";
		}		
		
		return "already register";
	}




	public CustomerDto getCustomerDataByNum(long num) {
		
		customer=repo.findByMobile(num);
		if(!(customer==null)){
			return new CustomerDto(customer.getCust_Id(), customer.getCust_Name(), customer.getCust_Mobile(), customer.getCust_Email(), customer.getCust_Address(), customer.getCust_pin());
		}
		return null;
	}
	
	
	public CustomerDto getCustomerDataByEmail(String email) {
		
		customer=repo.findByEmail(email);
		if(!(customer==null)){
			return new CustomerDto(customer.getCust_Id(), customer.getCust_Name(), customer.getCust_Mobile(), customer.getCust_Email(), customer.getCust_Address(), customer.getCust_pin());
		}
		return null;
	}
	
}
