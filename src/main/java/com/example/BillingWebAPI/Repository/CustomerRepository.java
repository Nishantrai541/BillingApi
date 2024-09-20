package com.example.BillingWebAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BillingWebAPI.Entity.CustomerEntity;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{
	@Query("select u from CustomerEntity u WHERE u.cust_Mobile= :n")
	public CustomerEntity findByMobile(@Param("n") Long mobile);
	
	@Query("select u from CustomerEntity u WHERE u.Cust_Email= :n")
	public CustomerEntity findByEmail(@Param("n") String name);
}
