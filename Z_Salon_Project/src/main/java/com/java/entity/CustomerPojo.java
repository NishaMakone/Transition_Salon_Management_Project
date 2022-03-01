package com.java.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_datails_tbl")
public class CustomerPojo {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="cust_id")
	private int cust_id;
	
	@Column(name="cust_name")
	private String cust_name;
	
	@Column(name="cust_phone")
	private String cust_phone;
	
	@Column(name="cust_email")
	private String cust_email;
	
	@Column(name="cust_gender")
	private String cust_gender;
	
	@Column(name="cust_city")
	private String cust_city;
	
	@Column(name="cust_username")
	private String username;
	
	@Column(name="cust_password")
	private String password;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<PaymentPojo> app = new ArrayList<PaymentPojo>()  ;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<AppointmentPojo> appointment = new ArrayList<AppointmentPojo>();
	

	public CustomerPojo(int id, String name, String phone, String email, String gender, String city, String uname,
			String password) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_phone = cust_phone;
		this.cust_email = cust_email;
		this.cust_gender = cust_gender;
		this.cust_city = cust_city;
		this.username = username;
		this.password = password;
	}

	

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_phone() {
		return cust_phone;
	}

	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public String getCust_gender() {
		return cust_gender;
	}

	public void setCust_gender(String cust_gender) {
		this.cust_gender = cust_gender;
	}

	public String getCust_city() {
		return cust_city;
	}

	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
