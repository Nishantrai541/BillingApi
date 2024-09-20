package com.example.BillingWebAPI.DTO;

public class EmployeeLoginDto {
	
	
	private String emp_Email;
	private long emp_Mobile;
	private String emp_Password;
	
	//constructor for login using Email
	public EmployeeLoginDto(String emp_Email, String emp_Password) {
		super();
		this.emp_Email = emp_Email;
		this.emp_Password = emp_Password;
	}

	//constructor for login using Mobile
	public EmployeeLoginDto(long emp_Mobile, String emp_Password) {
		super();
		this.emp_Mobile = emp_Mobile;
		this.emp_Password = emp_Password;
	}

	public String getEmp_Email() {
		return emp_Email;
	}

	public void setEmp_Email(String emp_Email) {
		this.emp_Email = emp_Email;
	}

	public long getEmp_Mobile() {
		return emp_Mobile;
	}

	public void setEmp_Mobile(long emp_Mobile) {
		this.emp_Mobile = emp_Mobile;
	}

	public String getEmp_Password() {
		return emp_Password;
	}

	public void setEmp_Password(String emp_Password) {
		this.emp_Password = emp_Password;
	}
	
	
	
	
	

}
