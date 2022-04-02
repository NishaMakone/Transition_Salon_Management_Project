package com.java.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="payment_details_tbl")
public class PaymentPojo {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="payment_id")
	private int payment_id;
	
	@Column(name="payment_total_cost")
	private int total_cost;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="cust_id")
	private CustomerPojo customer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="salon_id")
	private SalonPojo salon;
	
	

	public PaymentPojo(int payment_id, int cust_id, int sal_id, int total_cost) {
		super();
		this.payment_id = payment_id;
		this.total_cost = total_cost;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public int getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}

	
}
