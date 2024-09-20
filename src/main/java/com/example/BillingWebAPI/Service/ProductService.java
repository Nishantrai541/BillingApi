package com.example.BillingWebAPI.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BillingWebAPI.DTO.ProductDto;
import com.example.BillingWebAPI.Entity.ProductEntity;
import com.example.BillingWebAPI.Repository.ProductRepository;

@Service
public class ProductService {

	private ProductEntity product_Entity;
	final ProductRepository repository; 
	public ProductService(ProductRepository repo) {
		this.repository=repo;
	}
	
	public String addProduct(ProductDto product) {
		String name=product.getP_Name_dto();		
		product_Entity=repository.findByProductName(name);
		System.out.println(name);
		if(product_Entity==null) {
			product_Entity=new ProductEntity(product.getP_Id_dto(), product.getP_Name_dto(), product.getP_Price_dto());
			product_Entity=repository.save(product_Entity);
			if(!(product_Entity==null)) {
				return "Product Add";
			}return "Something Wrong to save data";
		}
		return "product already registered";
	}

	public ProductDto getProduct(String name) {
		
		product_Entity=repository.findByProductName(name);
		
		if(!(product_Entity==null)) {
			return new ProductDto(product_Entity.getP_Id(), product_Entity.getP_Name(), product_Entity.getP_Price());
		}
		return null;
	}
	
	
	public List<ProductDto>  getAllProduct(){
		
		List<ProductEntity> product=repository.findAll();
		List<ProductDto> productList=new ArrayList<>();
		if(!(product==null)) {
		for(ProductEntity pro :product) {
		
			ProductDto product1=new ProductDto(pro.getP_Id(), pro.getP_Name(), pro.getP_Price());
			productList.add(product1);
			}
		return productList;
		}
		return null;
		
	}

	public String deleteProduct(String product) {
		
		product_Entity=this.repository.findByProductName(product);
		if(!(product_Entity==null)) {
			long a=product_Entity.getP_Id();
			this.repository.deleteById(a);
			return "item Deleted";
			}
		return "item does not exists";
	}
	
}
