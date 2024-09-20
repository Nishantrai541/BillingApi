package com.example.BillingWebAPI.Service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.example.BillingWebAPI.DTO.HistoryShow;
import com.example.BillingWebAPI.DTO.PurchaseRecordDto;
import com.example.BillingWebAPI.Entity.CustomerEntity;
import com.example.BillingWebAPI.Entity.PurchaseRecordEntity;
import com.example.BillingWebAPI.Repository.CustomerRepository;
import com.example.BillingWebAPI.Repository.PurchaseRecordRepository;

@Service
public class PurchaseRecordService {
	
	//Repository
	final CustomerRepository cust_repo;
	final PurchaseRecordRepository repository_Purchase;
	
	//Entity
	private PurchaseRecordEntity purchaseEntity;
	private CustomerEntity customer;
	
	public PurchaseRecordService(CustomerRepository custom, PurchaseRecordRepository repo) {
		
		this.cust_repo=custom;
		this.repository_Purchase=repo;
	}
	
	
	
	public String addPurchaseHistory(long number, List<PurchaseRecordDto> record) {
	
		customer=this.cust_repo.findByMobile(number);
		 if(!(customer==null)){
			 List<PurchaseRecordEntity> purchase=new ArrayList<>();
			 for(PurchaseRecordDto dto: record) {
				 
				purchaseEntity=new PurchaseRecordEntity(dto.getId(), dto.getProduct_Name(), dto.getProduct_Id(), dto.getProduct_Quantity(), dto.getProduct_Prize());
				purchaseEntity.setCustomer(customer);
				purchase.add(purchaseEntity);
				repository_Purchase.save(purchaseEntity);
			 }
			 customer.setRecord(purchase);
			 this.cust_repo.save(customer);
			 
			 return "purchase Successfully";
			 
		 }
		
		return "customer not Exists";
	}


	public List<HistoryShow> getPurchase(long number) {
		customer=cust_repo.findByMobile(number);
		List<HistoryShow> dtorecord=new ArrayList<>();
		if(!(customer==null)) {
			List<PurchaseRecordEntity> record_List=this.repository_Purchase.getPuchaseDetails(customer);
			if(!(record_List==null)){
			for(PurchaseRecordEntity en: record_List) {
			HistoryShow	list=new HistoryShow(en.getProduct_Name(), en.getProduct_Quantity(),en.getProduct_Prize());
			dtorecord.add(list);
			} 
			return dtorecord;
		}
		return dtorecord;
	} return dtorecord;
	
	
	}
	
}
