package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_details_tbl")
public class PaymentPojo {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="payment_id")
	private int payment_id;
	
	@Column(name="cust_id")
	private int cust_id;
	
	@Column(name="salon_id")
	private int sal_id;
	
	@Column(name="total_cost")
	private int total_cost;

	public PaymentPojo(int payment_id, int cust_id, int sal_id, int total_cost) {
		super();
		this.payment_id = payment_id;
		this.cust_id = cust_id;
		this.sal_id = sal_id;
		this.total_cost = total_cost;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getSal_id() {
		return sal_id;
	}

	public void setSal_id(int sal_id) {
		this.sal_id = sal_id;
	}

	public int getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}

	
}
