package com.example.BillingWebAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillingWebAPI.DTO.ProductDto;
import com.example.BillingWebAPI.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productser;
	
	
	@PostMapping(path="/addProduct")
	public String addProduc(@RequestParam(name="id", required=false) long id,
			@RequestParam(name="name1", required=true) String name,
			@RequestParam(name="rate", required=true) long price) {
//		product.setP_Id_dto(id);
//		product.setP_Name_dto(name);
//		product.setP_Price_dto(price);
		ProductDto productdto=new ProductDto(id,name,price);
		
		System.out.println(productdto.getP_Name_dto());
		
		return productser.addProduct(productdto);
	}
	
	
	@PostMapping(path="/findProduct/{name}")
	public ProductDto getProduct(@PathVariable("name") String name) {
		
		return productser.getProduct(name);
	}
	
	
	@PostMapping(path="/items")
	public List<ProductDto> getAllProduct(){
		
		return productser.getAllProduct();
	}
	
	@PostMapping(path="/delete/{name}")
	public String deleteProduct(@PathVariable("name") String product) {
		
		return productser.deleteProduct(product);
	}
}
