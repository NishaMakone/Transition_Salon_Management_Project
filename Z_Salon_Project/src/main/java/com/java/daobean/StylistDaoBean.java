package com.java.daobean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.StylistPojo;
import com.java.repositary.MyStylist;

@Repository
public class StylistDaoBean {
	
	@Autowired
	MyStylist repo;
	/*
	//----------------------------------------------------------------------------------------------------------------	
		public StylistPojo addStylist(int id, String name, long phone, String email)
		{
			StylistPojo sp = new StylistPojo(id , name, phone, email);
			return repo.save(sp);
		}

	//-----------------------------------------------------------------------------------------------------------------
		public List<StylistPojo> getAllStylist() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}
		
	//-----------------------------------------------------------------------------------------------------------------	

	     public void removeStylist(int id)
	     {
	 		 repo.deleteById(id);
	     }
	     
	//-----------------------------------------------------------------------------------------------------------------
	     	
	     public void updateStylist(int id)
	     {
	 		 
	     }
*/
}
