package com.example.BillingWebAPI.DTO;

public class ShowEmployee {
	
	private String name;
	private long mobile;
	private String email;
	private String Address;
	private String department;
	
	
	public ShowEmployee(String name, long mobile, String email, String address, String department) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		Address = address;
		this.department = department;
	}


	public ShowEmployee() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
