package com.java.daobean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.CustomerPojo;
import com.java.entity.SalonPojo;
import com.java.repositary.MySalon;

@Repository
public class SalonDaoBean {
	
	@Autowired
	MySalon repo;
	
//----------------------------------------------------------------------------------------------------------------	
	public SalonPojo addSalon( int reg_id, String name, String address, long phone,
			String email, int no_of_stylist, String username, String password)
	{
		SalonPojo sp = new SalonPojo( reg_id, name, address, phone, email, no_of_stylist, username, password);
		return repo.save(sp);
	}
	public SalonPojo authenticationSalon(String email,String password)
	{
		return repo.loginSalon(email,password);
	}
/*
//-----------------------------------------------------------------------------------------------------------------
	public List<SalonPojo> getAllSalons() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
//-----------------------------------------------------------------------------------------------------------------	

     
//-----------------------------------------------------------------------------------------------------------------
     		
*/
}
