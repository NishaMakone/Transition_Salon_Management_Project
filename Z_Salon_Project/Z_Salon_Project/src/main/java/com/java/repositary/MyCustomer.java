package com.java.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.entity.*;

@Repository
public interface MyCustomer extends JpaRepository<CustomerPojo, Integer> {
	
	@Query(value= "SELECT * FROM customer_datails_tbl U WHERE U.cust_email=:email AND U.cust_password=:password",nativeQuery=true  )
	public CustomerPojo loginCustomer ( @Param ("email") String email, @Param ("password") String password);
	
//	@Query(value= "SELECT * FROM customer_datails_tbl U WHERE U.cust_email=:email",nativeQuery=true)
//	public CustomerPojo custEmailsearch(@Param("cust_email") String email);
}
