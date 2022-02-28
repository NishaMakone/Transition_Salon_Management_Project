package com.java.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.daobean.ServiceDaoBean;
import com.java.entity.ServicesPojo;


@Controller
public class WebController {

	
	
	@Autowired(required = false)
	ServiceDaoBean dao;

//----------------------------------------------------------------------------------------------------------------	
	
	@RequestMapping("/addService")
	public String func2()
	{
		return "addService";
	}
	
	@RequestMapping(value="/insertService" , method = RequestMethod.POST)
	public String insertServices(@RequestParam int id,@RequestParam int sid, @RequestParam int cost,@RequestParam String name)
	{
		
	    ServicesPojo sp= new ServicesPojo();
	    dao.addService(id, sid, cost, name);
	   System.out.println("Done....");
	   return "addService";
	}	
	
//----------------------------------------------------------------------------------------------------------------	
	
	@RequestMapping("/getServices")
	public ModelAndView getListOfServices()
	{
		ModelAndView mv = new ModelAndView();
		
		List<ServicesPojo> list = dao.getAllServices();
		
		mv.addObject("allservices", list);  //request.setAttribute
		mv.setViewName("allservices");  //requestdispatcher forward
		
		return mv;
	}
	
//----------------------------------------------------------------------------------------------------------------
	
	
	@RequestMapping(value="/deleteService" , method = RequestMethod.POST)
	public String deleteServices(@PathVariable int id)
	{
		
	    ServicesPojo sp= new ServicesPojo();
	    dao.removeService(id);
	   System.out.println("Done....");
	   return "allservices";
	}	
//----------------------------------------------------------------------------------------------------------------
		
	
	
	
}
