package com.java.entity;

public class Customer {

	
		public int customer_id;
		public Customer_Name customer_name;
		public int customer_phone;
		public String customer_email;
		
		public Customer()
		{
			customer_id=0;
			customer_name=null;
			customer_phone=0;
			customer_email=null;
		}
		
		

		public Customer(int customer_id, Customer_Name customer_name, int customer_phone, String customer_email)
		{
			super();
			this.customer_id = customer_id;
			this.customer_name = customer_name;
			this.customer_phone = customer_phone;
			this.customer_email = customer_email;
		}

		
		

		public int getCustomer_id() {
			return customer_id;
		}



		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}



		public Customer_Name getCustomer_name() {
			return customer_name;
		}



		public void setCustomer_name(Customer_Name customer_name) {
			this.customer_name = customer_name;
		}



		public int getCustomer_phone() {
			return customer_phone;
		}



		public void setCustomer_phone(int customer_phone) {
			this.customer_phone = customer_phone;
		}



		public String getCustomer_email() {
			return customer_email;
		}



		public void setCustomer_email(String customer_email) {
			this.customer_email = customer_email;
		}



		public String toString() {
			String str="";
			str+= "customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_phone="
					+ customer_phone + ", customer_email=" + customer_email + ", getCustomer_id()=" + getCustomer_id()
					+ ", getCustomer_name()=" + getCustomer_name() + ", getCustomer_phone()=" + getCustomer_phone()
					+ ", getCustomer_email()=" + getCustomer_email() + ", getClass()=" + getClass() + ", toString()=" + super.toString();
			
			return str;
		}

}
