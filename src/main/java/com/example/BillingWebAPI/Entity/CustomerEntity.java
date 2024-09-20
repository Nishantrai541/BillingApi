package com.example.BillingWebAPI.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="customer")
@Entity
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long cust_Id;
	
	private String cust_Name;
	
	@Column(unique=true)
	private long cust_Mobile;
	
	@Column(unique=true)
	private String Cust_Email;
	
	private String cust_Address;
	
	private int cust_pin;
	
	
	
	@OneToMany(mappedBy="customer")
	private List<PurchaseRecordEntity> record;
	//All parameterized constructor

	public CustomerEntity(long cust_Id, String cust_Name, long cust_Mobile, String cust_Email, String cust_Address,
			int cust_pin) {
		super();
		this.cust_Id = cust_Id;
		this.cust_Name = cust_Name;
		this.cust_Mobile = cust_Mobile;
		Cust_Email = cust_Email;
		this.cust_Address = cust_Address;
		this.cust_pin = cust_pin;
		
	}

	
	public CustomerEntity(String cust_Name, long cust_Mobile, String cust_Email, String cust_Address, int cust_pin) {
		
		this.cust_Name = cust_Name;
		this.cust_Mobile = cust_Mobile;
		Cust_Email = cust_Email;
		this.cust_Address = cust_Address;
		this.cust_pin = cust_pin;
		
	}


	//Default constructor
	

	public CustomerEntity() {
		super();
	}
	
	
	//Setter and Getters


	public long getCust_Id() {
		return cust_Id;
	}


	public void setCust_Id(long cust_Id) {
		this.cust_Id = cust_Id;
	}


	public String getCust_Name() {
		return cust_Name;
	}


	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}


	public long getCust_Mobile() {
		return cust_Mobile;
	}


	public void setCust_Mobile(long cust_Mobile) {
		this.cust_Mobile = cust_Mobile;
	}


	public String getCust_Email() {
		return Cust_Email;
	}


	public void setCust_Email(String cust_Email) {
		Cust_Email = cust_Email;
	}


	public String getCust_Address() {
		return cust_Address;
	}


	public void setCust_Address(String cust_Address) {
		this.cust_Address = cust_Address;
	}


	public int getCust_pin() {
		return cust_pin;
	}

	public void setCust_pin(int cust_pin) {
		this.cust_pin = cust_pin;
	}

	public List<PurchaseRecordEntity> getRecord() {
		return record;
	}



	public void setRecord(List<PurchaseRecordEntity> record) {
		this.record = record;
	}



	

}
