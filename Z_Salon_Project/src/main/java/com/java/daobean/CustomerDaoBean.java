package com.java.daobean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.CustomerPojo;
import com.java.repositary.MyCustomer;

@Repository
public class CustomerDaoBean {

	@Autowired
	MyCustomer repo;
	
	//----------------------------------------------------------------------------------------------------------------	
		public CustomerPojo addCustomer(int id, String name, String phone, String email, String gender,
				String city, String uname, String password)
		{
			CustomerPojo cp = new CustomerPojo(id, name, phone, email, gender, city, uname, password);
			return repo.save(cp);
		}

	//-----------------------------------------------------------------------------------------------------------------
		public List<CustomerPojo> getAllCustomers() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}
		
	//-----------------------------------------------------------------------------------------------------------------	

	   
	     
	//-----------------------------------------------------------------------------------------------------------------
	     	
	
	
	
	
	
	
}
