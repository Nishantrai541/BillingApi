package com.example.BillingWebAPI.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="product")
@Entity
public class ProductEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long p_Id;
	private String p_Name;
	private double p_Price;
	
	//Constructor of all field
	

	public ProductEntity(long p_Id, String p_Name, double p_Price) {
	
		this.p_Id = p_Id;
		this.p_Name = p_Name;
		this.p_Price = p_Price;
	}
	
	//Default Constructor
	public ProductEntity() {
		
	}
	//Setter and Getters

	public long getP_Id() {
		return p_Id;
	}

	public void setP_Id(long p_Id) {
		this.p_Id = p_Id;
	}

	public String getP_Name() {
		return p_Name;
	}

	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}

	public double getP_Price() {
		return p_Price;
	}

	public void setP_Price(double p_Price) {
		this.p_Price = p_Price;
	}
	
	
	
}
