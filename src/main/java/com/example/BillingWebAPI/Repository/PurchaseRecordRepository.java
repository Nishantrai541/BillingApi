package com.example.BillingWebAPI.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BillingWebAPI.Entity.CustomerEntity;
import com.example.BillingWebAPI.Entity.PurchaseRecordEntity;

@Repository
public interface PurchaseRecordRepository extends JpaRepository<PurchaseRecordEntity, Long>{

	@Query("select u from PurchaseRecordEntity u WHERE u.customer= :n")
	public List<PurchaseRecordEntity> getPuchaseDetails(@Param("n") CustomerEntity Cust);
	
}
