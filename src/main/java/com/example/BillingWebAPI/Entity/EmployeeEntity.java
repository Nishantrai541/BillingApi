package com.example.BillingWebAPI.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emp_Id;
	private String emp_Name;
	@Column(unique=true)
	private String emp_Email;
	@Column(unique=true)
	private long emp_Mobile;
	private String emp_Address;
	private String emp_Department;
	private String emp_Password;
	public EmployeeEntity(int emp_Id, String emp_Name, String emp_Email, long emp_Mobile, String emp_Address,
			String emp_Department, String emp_Password) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Email = emp_Email;
		this.emp_Mobile = emp_Mobile;
		this.emp_Address = emp_Address;
		this.emp_Department = emp_Department;
		this.emp_Password = emp_Password;
	}
	
	public EmployeeEntity(String emp_Name, String emp_Email, long emp_Mobile, String emp_Address, String emp_Department,
			String emp_Password) {
		super();
		this.emp_Name = emp_Name;
		this.emp_Email = emp_Email;
		this.emp_Mobile = emp_Mobile;
		this.emp_Address = emp_Address;
		this.emp_Department = emp_Department;
		this.emp_Password = emp_Password;
	}

	public EmployeeEntity() {
		super();
	}
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
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
	public String getEmp_Address() {
		return emp_Address;
	}
	public void setEmp_Address(String emp_Address) {
		this.emp_Address = emp_Address;
	}
	public String getEmp_Department() {
		return emp_Department;
	}
	public void setEmp_Department(String emp_Department) {
		this.emp_Department = emp_Department;
	}
	public String getEmp_Password() {
		return emp_Password;
	}
	public void setEmp_Password(String emp_Password) {
		this.emp_Password = emp_Password;
	}
	
	
	
	
	
}
