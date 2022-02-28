package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment_details_tbl")
public class AppointmentPojo {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="app_id")
	private int app_id;
	
	@Column(name="cust_id")
	private int cust_id;
	
	@Column(name="sty_id")
	private int sty_id;
	
	@Column(name="sal_id")
	private int salon_id;
	
	@Column(name="app_id")
	private int service_id;
	
	@Column(name="app_date")
	private MyDate app_date;

	@Column(name="app_booking_date")
	private MyDate app_booking_date;
	
	@Column(name="app_start_time")
	private int app_start_time;
	
	@Column(name="app_total_cost")
	private int app_total_cost;
	
	@Column(name="app_status")
	private String app_status;

	public AppointmentPojo(int app_id, int cust_id, int sty_id, int salon_id, int service_id, MyDate app_date,
			MyDate app_booking_date, int app_start_time, int total_cost, String app_status) {
		super();
		this.app_id = app_id;
		this.cust_id = cust_id;
		this.sty_id = sty_id;
		this.salon_id = salon_id;
		this.service_id = service_id;
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

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getSty_id() {
		return sty_id;
	}

	public void setSty_id(int sty_id) {
		this.sty_id = sty_id;
	}

	public int getSalon_id() {
		return salon_id;
	}

	public void setSalon_id(int salon_id) {
		this.salon_id = salon_id;
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public MyDate getApp_date() {
		return app_date;
	}

	public void setApp_date(MyDate app_date) {
		this.app_date = app_date;
	}

	public MyDate getApp_booking_date() {
		return app_booking_date;
	}

	public void setApp_booking_date(MyDate app_booking_date) {
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
