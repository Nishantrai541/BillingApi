package com.example.BillingWebAPI.DTO;

public class HistoryShow {

	
	private String productNAme;
	private double price;
	private int Quatity;
	public HistoryShow(String productNAme, int quatity, double price) {
		super();
		
		this.productNAme = productNAme;
		this.price = price;
		Quatity = quatity;
	}
	
	public HistoryShow() {
		super();
	}
	public String getProductNAme() {
		return productNAme;
	}
	public void setProductNAme(String productNAme) {
		this.productNAme = productNAme;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuatity() {
		return Quatity;
	}
	public void setQuatity(int quatity) {
		Quatity = quatity;
	}
	
}
