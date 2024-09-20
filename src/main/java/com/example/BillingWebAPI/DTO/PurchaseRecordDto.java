package com.example.BillingWebAPI.DTO;

public class PurchaseRecordDto {
	
	private long id;	
	private String product_Name;	
	private long product_Id;	
	private int product_Quantity;	
	private double product_Prize;
	
	public PurchaseRecordDto(long id, String product_Name, long product_Id, int product_Quantity,
			double product_Prize) {
		super();
		this.id = id;
		this.product_Name = product_Name;
		this.product_Id = product_Id;
		this.product_Quantity = product_Quantity;
		this.product_Prize = product_Prize;
	}

	public PurchaseRecordDto(String product_Name,  double product_Prize, int product_Quantity) {
		super();
		this.product_Name = product_Name;
		this.product_Quantity = product_Quantity;
		this.product_Prize = product_Prize;
	}

	public PurchaseRecordDto() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
