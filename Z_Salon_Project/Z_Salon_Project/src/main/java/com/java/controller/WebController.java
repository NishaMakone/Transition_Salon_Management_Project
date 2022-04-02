package com.java.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.daobean.CustomerDaoBean;
import com.java.daobean.SalonDaoBean;
import com.java.daobean.ServiceDaoBean;
import com.java.daobean.StylistDaoBean;
import com.java.entity.CustomerPojo;
import com.java.entity.SalonPojo;
import com.java.entity.ServicesPojo;
import com.java.entity.StylistPojo;


@Controller
public class WebController {


	
	@Autowired(required = false)
	ServiceDaoBean servdao;
	
	@Autowired(required = false)
	CustomerDaoBean custdao;
	
	@Autowired(required = false)
	SalonDaoBean saldao;
	
	@Autowired(required = false)
	StylistDaoBean stydao;
//---------------------------Navbar-------------------------------------------
	@RequestMapping("/ind")
	public String func()
	{
		return "index";
	}
	
	@RequestMapping("/abc")
	public String func1()
	{
		return "customerlogin";
	}
	
	@RequestMapping("/xyz")
	public String func2()
	{
		return "salonlogin";
	}
	
	@RequestMapping("/abt")
	public String func3()
	{
		return "about";
	}
	
	@RequestMapping("/cont")
	public String func4()
	{
		return "contact";
	}
	
	@RequestMapping("/mulsal")
	public String func5()
	{
		return "multiplesalon";
	}
//------------------------/Dashboard/----------------------------------------------------------------------------------------	
	@RequestMapping("/allserv")
	public ModelAndView getListOfServices()
	{
		ModelAndView mv = new ModelAndView();

		List<ServicesPojo> list = servdao.getAllServices();

		mv.addObject("allservices", list);  //request.setAttribute
		mv.setViewName("allservices");  //requestdispatcher forward

		return mv;
	}

	@RequestMapping("/addService")
	public String func0()
	{
		return "addService";
	}

	@PostMapping("/insertService" )
	public String insertServices(@RequestParam String name, @RequestParam int cost,@RequestParam int time)
	{
		servdao.addService( name, cost, time);
		System.out.println("Done....");
		return "addService";
	}
/*	@PostMapping("/deleteService" )
	public String deleteServices(@PathVariable String name)
	{

		ServicesPojo sp= new ServicesPojo();
		servdao.removeService(name);
		System.out.println("Done....");
		return "allservices";
	} */
	//---------------Stylist------------------------------------------
	@RequestMapping("/allsty")
	public ModelAndView getListOfStylist()
	{
		ModelAndView mv = new ModelAndView();

		List<StylistPojo> list = stydao.getAllStylist();

		mv.addObject("allStylist", list);  //request.setAttribute
		mv.setViewName("allStylist");  //requestdispatcher forward

		return mv;
	}
	@RequestMapping("/addstylist")
	public String function1()
	{
		return "addStylist";
	}

	@PostMapping("/inStylist" )
	public String insertStylist(@RequestParam String name,@RequestParam int phone,@RequestParam String email)
	{
		
		stydao.addStylist( name, phone, email);
		System.out.println("Done....");
		return "addStylist";
	}
	//----------------signout--------------------------------------------
	@RequestMapping("/out")
	public ModelAndView logout(HttpSession session)
	{
		session.invalidate();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("salonlogin");
		return mv;
	}
//---------------------Customer Login-------------------------------------------------------------------------------------------
		
	@RequestMapping("/addCustomer")
	public String function2()
	{
		return "customerlogin";
	}
/*	@PostMapping("/forgotcust")
	public ModelAndView custForgotPassword(@ModelAttribute("email")CustomerPojo cust) {

		CustomerPojo custobj = custdao.custByEmail(cust.getCust_email());

		String email = cust.getCust_email();
		if(custobj!=null) {

			ModelAndView mv = new ModelAndView();

		//	(email,custobj.getPassword());

			mv.setViewName("custlogin");

			return mv;
		}

		else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("Message","Wrong Credentials");
			mv.setViewName("forgotPassword");
			return mv;			
		}

	}*/
	@RequestMapping("/forgotpass")
	public String forgotPass() {
		
		return "forgotpassword";
	}
	@RequestMapping("/ss")
	public String ser1() {
		
		return "services";
	}
	
	@PostMapping("/insertCustomer")
	public String insertCustomer(@RequestParam String name, @RequestParam String mobile,
	        @RequestParam String email, @RequestParam String gender,  @RequestParam String city, @RequestParam String username,  @RequestParam String password )
	{ 
		
	    CustomerPojo cp = new CustomerPojo();
	    custdao.addCustomer( name, mobile, email, gender, city, username, password);
	   
	   return "customerlogin";
	}	
	@PostMapping("/logcust")
	public ModelAndView loginCustomer(@RequestParam String email, @RequestParam String password,HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();
		CustomerPojo customer = custdao.authenticationCustomer(email, password);
		
		if(Objects.isNull(customer))
		{
			mv.setViewName("Login");
		}
		else
		{
			System.out.println("Session Id " +   session.getId());
			mv.addObject("customer",customer);
			mv.setViewName("profile");
		}
		return mv;
	}
	@GetMapping("/Login")
	public String loginCustomer()
	{
		System.out.println("Reached in func1");
		return "customerlogin";
	}
	@GetMapping("/sal")
	public String salCustomer()
	{
		System.out.println("Reached in ...");
		return "custsal";
	}
	
	@RequestMapping("/cservc")
	public String appointmnt()
	{
		
		return "appointment";
	}
	
	@RequestMapping("/lout")
	public ModelAndView signout(HttpSession session)
	{
		session.invalidate();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("customerlogin");
		return mv;
	}
//----------------------SalonLogin-------------------------------------------------------------------------------	
	
	@RequestMapping("/salonlogin")
	public String function3()
	{
		return "salonlogin";
	}
	
	@PostMapping("/insertsalon")
	public String insertSalon(@RequestParam int reg_id, @RequestParam String name, 
			 @RequestParam String address, @RequestParam long mobile,
	        @RequestParam String email, @RequestParam int no_of_stylist, @RequestParam String username,  @RequestParam String password )
	{ 
		
	    SalonPojo cp = new SalonPojo();
	    saldao.addSalon( reg_id, name, address, mobile, email, no_of_stylist, username, password);
	   return "salonlogin";
	}	
	@PostMapping("/logsal")
	public ModelAndView loginSalon(@RequestParam String email, @RequestParam String password,HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();
		SalonPojo salon = saldao.authenticationSalon(email, password);
		
		if(Objects.isNull(salon))
		{
			mv.setViewName("LoginS");
		}
		else
		{
			System.out.println("Session Id " +   session.getId());
			mv.addObject("salon",salon);
			mv.setViewName("dashboard");
		}
		return mv;
	}
	@GetMapping("/LoginS")
	public String loginSalon()
	{
		System.out.println("Reached in func2");
		return "salonlogin";
	}

//-----------------------------------------------------------------------------------------------------	
	
	@PostMapping("/thank")
	public String bookpp()
	{
		System.out.println("Reached in func2");
		return "thanku";
	}
	
	@GetMapping("/ty")
	public String thankyou()
	{
		System.out.println("Reached in func2");
		return "profile";
	}
}
