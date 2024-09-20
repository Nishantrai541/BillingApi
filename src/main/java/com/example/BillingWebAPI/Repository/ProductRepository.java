package com.example.BillingWebAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BillingWebAPI.Entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

	
	@Query("select u from ProductEntity u WHERE u.p_Name= :n")
	public ProductEntity findByProductName(@Param("n") String name);
	
	
}
