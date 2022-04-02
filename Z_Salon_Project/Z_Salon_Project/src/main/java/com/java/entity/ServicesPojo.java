package com.java.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="service_details_tbl")
public class ServicesPojo {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="serv_id")
	public int service_id;
	
	@Column(name="serv_name")
	public String service_name;
	
	@Column(name="serv_cost")
	public int service_cost;
	
	@Column(name="serv_time")
	public int service_time;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="sal_id")
	private SalonPojo salon;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<AppointmentPojo> app = new ArrayList<AppointmentPojo>();
	
	
	
	

	

	

	public ServicesPojo(String service_name, int service_cost, int service_time) {
	
		this.service_name = service_name;
		this.service_cost = service_cost;
		this.service_time = service_time;
	}

	public ServicesPojo(int service_id, String service_name, int service_cost, int service_time
			) {
		super();
		this.service_id = service_id;
		this.service_name = service_name;
		this.service_cost = service_cost;
		this.service_time = service_time;
		
	}

	public ServicesPojo() {
		super();
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public int getService_cost() {
		return service_cost;
	}

	public void setService_cost(int service_cost) {
		this.service_cost = service_cost;
	}

	public int getService_time() {
		return service_time;
	}

	public void setService_time(int service_time) {
		this.service_time = service_time;
	}

	



}
