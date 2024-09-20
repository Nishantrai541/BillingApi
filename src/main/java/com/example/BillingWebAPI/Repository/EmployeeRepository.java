package com.example.BillingWebAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BillingWebAPI.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

	@Query("select u from EmployeeEntity u WHERE u.emp_Email= :n")
	public EmployeeEntity existBYEmail(@Param("n") String email);
	
	@Query("select u from EmployeeEntity u WHERE u.emp_Mobile= :name")
	public EmployeeEntity existByMobile(@Param("name") long mobile);

	@Query("select u.emp_Password from EmployeeEntity u WHERE u.emp_Email= :email")
	public String checkPassword(@Param("email") String Email_id);
}
