package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stylist_details_tbl")
public class StylistPojo {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="sty_id")
	private int sty_id;
	
	@Column(name="sal_id")
	private int sal_id;
	
	@Column(name="sty_name")
	private String sty_name;
	
	@Column(name="sty_phone")
	private long sty_phone;
	
	@Column(name="sty_email")
	private String sty_email;

	public StylistPojo(int sty_id, int sal_id, String sty_name, long sty_phone, String sty_email) {
		super();
		this.sty_id = sty_id;
		this.sal_id = sal_id;
		this.sty_name = sty_name;
		this.sty_phone = sty_phone;
		this.sty_email = sty_email;
	}
	
	public StylistPojo(int sty_id, String sty_name, long sty_phone, String sty_email) {
		super();
		this.sty_id = sty_id;
		this.sty_name = sty_name;
		this.sty_phone = sty_phone;
		this.sty_email = sty_email;
	}
	
	public int getSty_id() {
		return sty_id;
	}

	public void setSty_id(int sty_id) {
		this.sty_id = sty_id;
	}

	public int getSal_id() {
		return sal_id;
	}

	public void setSal_id(int sal_id) {
		this.sal_id = sal_id;
	}

	public String getSty_name() {
		return sty_name;
	}

	public void setSty_name(String sty_name) {
		this.sty_name = sty_name;
	}

	public long getSty_phone() {
		return sty_phone;
	}

	public void setSty_phone(long sty_phone) {
		this.sty_phone = sty_phone;
	}

	public String getSty_email() {
		return sty_email;
	}

	public void setSty_email(String sty_email) {
		this.sty_email = sty_email;
	}
	
//	private Sty_image;

	
}
