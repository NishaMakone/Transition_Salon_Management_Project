package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="history_details_tbl")
public class OrederHistoryPojo {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="order_id")
	private int order_hystory_id;
	
	@Column(name="salon_id")
	private int salon_id;
	
	@Column(name="service_id")
	private int service_id;
	
	@Column(name="appointment_id")
	private int app_id;
	
	@Column(name="payment_id")
	private int payment_id;
	
	@Column(name="appointment_date")
	private MyDate app_date;
	
	@Column(name="appointment_time")
	private MyDate app_time;
	
	@Column(name="total_cost")
	private int total_cost;

	public OrederHistoryPojo(int order_hystory_id, int salon_id, int service_id, int app_id, int payment_id,
			MyDate app_date, MyDate app_time, int total_cost) {
		super();
		this.order_hystory_id = order_hystory_id;
		this.salon_id = salon_id;
		this.service_id = service_id;
		this.app_id = app_id;
		this.payment_id = payment_id;
		this.app_date = app_date;
		this.app_time = app_time;
		this.total_cost = total_cost;
	}

	public int getOrder_hystory_id() {
		return order_hystory_id;
	}

	public void setOrder_hystory_id(int order_hystory_id) {
		this.order_hystory_id = order_hystory_id;
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

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public MyDate getApp_date() {
		return app_date;
	}

	public void setApp_date(MyDate app_date) {
		this.app_date = app_date;
	}

	public MyDate getApp_time() {
		return app_time;
	}

	public void setApp_time(MyDate app_time) {
		this.app_time = app_time;
	}

	public int getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}

	
}
