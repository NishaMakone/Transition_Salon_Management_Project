package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	@Column(name="sal_id")
	public int sal_id;
	
	@Column(name="serv_name")
	public String service_name;
	
	@Column(name="serv_cost")
	public int service_cost;
	
	@Column(name="serv_time")
	public int service_time;
	
	public ServicesPojo(int id, int sid, int cost, String name) {
		service_id=0;
		sal_id=0;
		service_name=null;
		service_cost=0;	
		service_time=0;	
	}

	public ServicesPojo() {
		super();
		this.service_id = service_id;
		this.sal_id = sal_id;
		this.service_name = service_name;
		this.service_cost = service_cost;
		this.service_time = service_time;
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public int getSal_id() {
		return sal_id;
	}

	public void setSal_id(int sal_id) {
		this.sal_id = sal_id;
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
