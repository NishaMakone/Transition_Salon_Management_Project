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
@Table(name="salon_details_tbl")
public class SalonPojo {

	public SalonPojo() {
		
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="sal_id")
	private int sal_id;
	
	@Column(name="sal_reg_id")	
	private int sal_Registration_id;
	
	@Column(name="sal_name")
	private String sal_name;
	
	@Column(name="sal_address")
	private String sal_address;
	
	@Column(name="sal_phone")
	private long sal_phone;
	
	@Column(name="sal_email")
	private String sal_email;
	
	@Column(name="no_of_stylist")
	private int no_of_stylist;
	
	@Column(name="sal_uname")
	private String username;
	
	@Column(name="sal_password")
	private String password;

	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<StylistPojo> stylist = new ArrayList<StylistPojo>();
	
	@OneToMany
	private List<PaymentPojo> payment = new ArrayList<PaymentPojo>();
	
	@OneToMany
	private List<ServicesPojo> service = new ArrayList<ServicesPojo>();
	
	@OneToMany
	private List<AppointmentPojo> app = new ArrayList<AppointmentPojo>();
	
	
	
	
	public SalonPojo( int sal_Registration_id, String sal_name, String sal_address, long sal_phnoe,
			String sal_email, int no_of_stylist, String username, String password) {
		super();
		
		this.sal_Registration_id = sal_Registration_id;
		this.sal_name = sal_name;
		this.sal_address = sal_address;
		this.sal_phone = sal_phnoe;
		this.sal_email = sal_email;
		this.no_of_stylist = no_of_stylist;
		this.username = username;
		this.password = password;
	}
	
	

	public int getSal_id() {
		return sal_id;
	}

	public void setSal_id(int sal_id) {
		this.sal_id = sal_id;
	}

	public int getSal_Registration_id() {
		return sal_Registration_id;
	}

	public void setSal_Registration_id(int sal_Registration_id) {
		this.sal_Registration_id = sal_Registration_id;
	}

	public String getSal_name() {
		return sal_name;
	}

	public void setSal_name(String sal_name) {
		this.sal_name = sal_name;
	}

	public String getSal_address() {
		return sal_address;
	}

	public void setSal_address(String sal_address) {
		this.sal_address = sal_address;
	}

	public long getSal_phone() {
		return sal_phone;
	}

	public void setSal_phoe(long sal_phnoe) {
		this.sal_phone = sal_phnoe;
	}

	public String getSal_email() {
		return sal_email;
	}

	public void setSal_email(String sal_email) {
		this.sal_email = sal_email;
	}

	public int getNo_of_stylist() {
		return no_of_stylist;
	}

	public void setNo_of_stylist(int no_of_stylist) {
		this.no_of_stylist = no_of_stylist;
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
