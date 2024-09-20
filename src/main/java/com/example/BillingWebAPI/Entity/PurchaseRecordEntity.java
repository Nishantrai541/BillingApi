package com.example.BillingWebAPI.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name="purchaseRecord")
@Entity
public class PurchaseRecordEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	private String product_Name;
	
	private long product_Id;
	
	private int product_Quantity;
	
	private double product_Prize;
	
	@ManyToOne
	@JoinColumn(name="customer_Id")
	private CustomerEntity customer;
	



	//All parameterized constructor
	
	public PurchaseRecordEntity(long Id, String product_Name, long product_Id, int product_Quantity,
			double product_Prize, CustomerEntity customer) {
		super();
		this.id = Id;
		this.product_Name = product_Name;
		this.product_Id = product_Id;
		this.product_Quantity = product_Quantity;
		this.product_Prize = product_Prize;
		
	}

	//Default constructor
	
	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public PurchaseRecordEntity(long id, String product_Name, long product_Id, int product_Quantity,
			double product_Prize) {
		super();
		this.id = id;
		this.product_Name = product_Name;
		this.product_Id = product_Id;
		this.product_Quantity = product_Quantity;
		this.product_Prize = product_Prize;
	}

	public PurchaseRecordEntity() {
		super();
	}

	
	//Setter and Getters
	
	public long getId() {
		return id;
	}

	public void setId(long row) {
		this.id = row;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public long getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(long product_Id) {
		this.product_Id = product_Id;
	}

	public int getProduct_Quantity() {
		return product_Quantity;
	}

	public void setProduct_Quantity(int product_Quantity) {
		this.product_Quantity = product_Quantity;
	}

	public double getProduct_Prize() {
		return product_Prize;
	}

	public void setProduct_Prize(double product_Prize) {
		this.product_Prize = product_Prize;
	}

	
	
	
	
}

