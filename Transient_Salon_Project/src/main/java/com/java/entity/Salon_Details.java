package com.java.entity;

public class Salon_Details {

	
		public int salon_id;
		public int salon_registration_id;
		public String salon_name;
		public String salon_address;
		public int salon_phone_no;
		public String salon_email;
		public int no_of_seat;
		public String username;
		public String password;
		
		public Salon_Details() {
			salon_id=0;
			salon_registration_id=0;
			salon_name=null;
			salon_address=null;
			salon_phone_no=0;
			salon_email=null;
			no_of_seat=0;
			username=null;
			password=null;
			
		}

		public Salon_Details(int salon_id, int salon_registration_id, String salon_name, String salon_address,
				int salon_phone_no, String salon_email, int no_of_seat, String username, String password) {
			this.salon_id = salon_id;
			this.salon_registration_id = salon_registration_id;
			this.salon_name = salon_name;
			this.salon_address = salon_address;
			this.salon_phone_no = salon_phone_no;
			this.salon_email = salon_email;
			this.no_of_seat = no_of_seat;
			this.username = username;
			this.password = password;
		}

		public int getSalon_id() {
			return salon_id;
		}

		public void setSalon_id(int salon_id) {
			this.salon_id = salon_id;
		}

		public int getSalon_registration_id() {
			return salon_registration_id;
		}

		public void setSalon_registration_id(int salon_registration_id) {
			this.salon_registration_id = salon_registration_id;
		}

		public String getSalon_name() {
			return salon_name;
		}

		public void setSalon_name(String salon_name) {
			this.salon_name = salon_name;
		}

		public String getSalon_address() {
			return salon_address;
		}

		public void setSalon_address(String salon_address) {
			this.salon_address = salon_address;
		}

		public int getSalon_phone_no() {
			return salon_phone_no;
		}

		public void setSalon_phone_no(int salon_phone_no) {
			this.salon_phone_no = salon_phone_no;
		}

		public String getSalon_email() {
			return salon_email;
		}

		public void setSalon_email(String salon_email) {
			this.salon_email = salon_email;
		}

		public int getNo_of_seat() {
			return no_of_seat;
		}

		public void setNo_of_seat(int no_of_seat) {
			this.no_of_seat = no_of_seat;
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


		public String toString() {
			String str="";
			str+= "salon_id=" + salon_id + ", salon_registration_id=" + salon_registration_id
					+ ", salon_name=" + salon_name + ", salon_address=" + salon_address + ", salon_phone_no="
					+ salon_phone_no + ", salon_email=" + salon_email + ", no_of_seat=" + no_of_seat + ", username="
					+ username + ", password=" + password + ", getSalon_id()=" + getSalon_id()
					+ ", getSalon_registration_id()=" + getSalon_registration_id() + ", getSalon_name()=" + getSalon_name()
					+ ", getSalon_address()=" + getSalon_address() + ", getSalon_phone_no()=" + getSalon_phone_no()
					+ ", getSalon_email()=" + getSalon_email() + ", getNo_of_seat()=" + getNo_of_seat() + ", getUsername()="
					+ getUsername() + ", getPassword()=" + getPassword();
			
			return str;
		}
		
}
