package com.java.daobean;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.entity.ServicesPojo;
import com.java.repositary.MyServices;

@Repository

public class ServiceDaoBean {

	@Autowired
	MyServices repo;
//------------------------------------------------------------------------------------------------------------------	
	
		public ServicesPojo addService(String name,int cost,int time)
		{
			ServicesPojo sp = new ServicesPojo(name,cost,time);
			return repo.save(sp);
		}
//-------------------------------------------------------------------------------------------------------------------
		
		public List<ServicesPojo> getAllServices() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}
//-----------------------------------------------------------------------------------------------------------------	
	      
	     public void removeService(String name)
	     {
	    //	 ServicesPojo sp = new ServicesPojo(id , sid, cost, name);
	 		// repo.deleteByname(name);
	     }
	     
     

}
