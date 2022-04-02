package com.java.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.entity.*;

@Repository
public interface MySalon extends JpaRepository<SalonPojo, Integer> {


	@Query(value= "SELECT * FROM salon_details_tbl U WHERE U.sal_email=:email AND U.sal_password=:password",nativeQuery=true  )
	public SalonPojo loginSalon ( @Param ("email") String email, @Param ("password") String password);
}
