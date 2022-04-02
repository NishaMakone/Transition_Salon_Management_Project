package com.java.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointment_details_tbl")
public class AppointmentPojo {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="app_id")
	private int app_id;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="app_service_tbl",
	        joinColumns = {@JoinColumn(name="app_id")},
	        inverseJoinColumns = {@JoinColumn(name="serv_id")})
	private List<ServicesPojo> service = new ArrayList<ServicesPojo>();
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="cust_id")
	private CustomerPojo cust;
	
	@ManyToOne
	@JoinColumn(name="sal_id")
	private SalonPojo salon;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="sty_id")
	private StylistPojo stylist ;
	
	
	@Column(name="app_date")
	private String app_date;

	@Column(name="app_booking_date")
	private String app_booking_date;
	
	@Column(name="app_start_time")
	private int app_start_time;
	
	@Column(name="app_total_cost")
	private int app_total_cost;
	
	@Column(name="app_status")
	private String app_status;

	public AppointmentPojo(int app_id, int cust_id, int sty_id, int salon_id, int service_id, String app_date,
			String app_booking_date, int app_start_time, int total_cost, String app_status) {
		super();
		this.app_id = app_id;
		this.app_date = app_date;
		this.app_booking_date = app_booking_date;
		this.app_start_time = app_start_time;
		this.app_total_cost = total_cost;
		this.app_status = app_status;
	}

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}



	public String getApp_date() {
		return app_date;
	}

	public void setApp_date(String app_date) {
		this.app_date = app_date;
	}

	public String getApp_booking_date() {
		return app_booking_date;
	}

	public void setApp_booking_date(String app_booking_date) {
		this.app_booking_date = app_booking_date;
	}

	public int getApp_start_time() {
		return app_start_time;
	}

	public void setApp_start_time(int app_start_time) {
		this.app_start_time = app_start_time;
	}

	public int getTotal_cost() {
		return app_total_cost;
	}

	public void setTotal_cost(int app_total_cost) {
		this.app_total_cost =app_total_cost;
	}

	public String getApp_status() {
		return app_status;
	}

	public void setApp_status(String app_status) {
		this.app_status = app_status;
	}
	
	
}
