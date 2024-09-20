package com.example.BillingWebAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillingWebAPI.DTO.HistoryShow;
import com.example.BillingWebAPI.DTO.PurchaseRecordDto;
import com.example.BillingWebAPI.Service.PurchaseRecordService;

@RestController
public class PurchaseRecordController {
	
	@Autowired
	private PurchaseRecordService service;
	
	
	@PostMapping(path="/purchase/{val}")
	public String setPurchaseHistory(@PathVariable("val") long number, @RequestBody List<PurchaseRecordDto> purchasedto) {
		
		return service.addPurchaseHistory(number, purchasedto);
	}
	
	@PostMapping(path="/purchaseRecord/{num}")
	public List<HistoryShow> getPurchaseRecord(@PathVariable("num") long number){
		
		return service.getPurchase(number);
	}

}
