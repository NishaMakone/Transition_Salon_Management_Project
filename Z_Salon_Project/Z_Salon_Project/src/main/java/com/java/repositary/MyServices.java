package com.java.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.entity.*;

@Repository
public interface MyServices extends JpaRepository<ServicesPojo, Integer>{

	//@Query(value= "Delete from  service_details_tbl U where u.serv_name = name ")
	//public ServicesPojo deleteByname(@Param("name") String name);
	
	
}

