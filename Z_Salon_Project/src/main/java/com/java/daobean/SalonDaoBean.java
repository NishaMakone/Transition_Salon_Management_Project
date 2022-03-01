package com.java.daobean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.SalonPojo;
import com.java.repositary.MySalon;

@Repository
public class SalonDaoBean {
	
	@Autowired
	MySalon repo;
/*	
//----------------------------------------------------------------------------------------------------------------	
	public SalonPojo addSalon(int id, int reg_id, String name, String address, long phone,
			String email, int no_of_stylist, String username, String password)
	{
		SalonPojo sp = new SalonPojo(id, reg_id, name, address, phone, email, no_of_stylist, username, password);
		return repo.save(sp);
	}

//-----------------------------------------------------------------------------------------------------------------
	public List<SalonPojo> getAllSalons() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
//-----------------------------------------------------------------------------------------------------------------	

     
//-----------------------------------------------------------------------------------------------------------------
     		
*/
}
