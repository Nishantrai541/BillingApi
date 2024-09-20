package com.example.BillingWebAPI.DTO;

public class ProductDto {
	
	private long p_Id_dto;
	private String p_Name_dto;
	private double p_Price_dto;
	public ProductDto(long p_Id_dto, String p_Name_dto, double p_Price_dto) {
		
		this.p_Id_dto = p_Id_dto;
		this.p_Name_dto = p_Name_dto;
		this.p_Price_dto = p_Price_dto;
	}
	public ProductDto() {
		
	}
	public long getP_Id_dto() {
		return p_Id_dto;
	}
	public void setP_Id_dto(long p_Id_dto) {
		this.p_Id_dto = p_Id_dto;
	}
	public String getP_Name_dto() {
		return p_Name_dto;
	}
	public void setP_Name_dto(String p_Name_dto) {
		this.p_Name_dto = p_Name_dto;
	}
	public double getP_Price_dto() {
		return p_Price_dto;
	}
	public void setP_Price_dto(double p_Price_dto) {
		this.p_Price_dto = p_Price_dto;
	}
	

	
}
