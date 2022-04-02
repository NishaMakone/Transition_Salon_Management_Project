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
		public CustomerPojo addCustomer( String name, String mobile, String email, String gender,
				String city, String username, String password)
		{
			CustomerPojo cp = new CustomerPojo( name, mobile, email, gender, city, username, password);
			return repo.save(cp);
		}
		public CustomerPojo authenticationCustomer(String email,String password)
		{
			return repo.loginCustomer(email,password);
		}
	/*	public CustomerPojo custByEmail(String cust_email) {
			
			return repo.custEmailsearch(cust_email);
		}

	//-----------------------------------------------------------------------------------------------------------------
	/*	public List<CustomerPojo> getAllCustomers() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}
		
	//-----------------------------------------------------------------------------------------------------------------	
		
	   
	     
	//-----------------------------------------------------------------------------------------------------------------
	     	
	
	*/
		
	
	
	
	
}
