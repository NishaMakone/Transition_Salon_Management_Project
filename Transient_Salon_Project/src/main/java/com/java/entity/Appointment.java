package com.java.entity;

public class Appointment {

		public int app_id;
		public int customer_id;
		public int salon_id;
		public int service_id;
		public String app_date;
		public String app_time;
		
		public Appointment() {
			app_id=0;
			customer_id=0;
			salon_id=0;
			service_id=0;
			app_date=null;
			app_time=null;
			
		}

		public Appointment(int app_id, int customer_id, int salon_id, int service_id, String app_date, String app_time) {
			this.app_id = app_id;
			this.customer_id = customer_id;
			this.salon_id = salon_id;
			this.service_id = service_id;
			this.app_date = app_date;
			this.app_time = app_time;
		}

		public int getApp_id() {
			return app_id;
		}

		public void setApp_id(int app_id) {
			this.app_id = app_id;
		}

		public int getCustomer_id() {
			return customer_id;
		}

		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
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

		public String getApp_date() {
			return app_date;
		}

		public void setApp_date(String app_date) {
			this.app_date = app_date;
		}

		public String getApp_time() {
			return app_time;
		}

		public void setApp_time(String app_time) {
			this.app_time = app_time;
		}

		@Override
		public String toString() {
			String str="";
			 str+= "app_id=" + app_id + ", customer_id=" + customer_id + ", salon_id=" + salon_id
					+ ", service_id=" + service_id + ", app_date=" + app_date + ", app_time=" + app_time + ", getApp_id()="
					+ getApp_id() + ", getCustomer_id()=" + getCustomer_id() + ", getSalon_id()=" + getSalon_id()
					+ ", getService_id()=" + getService_id() + ", getApp_date()=" + getApp_date() + ", getApp_time()="
					+ getApp_time();
			 return str;
		}
	
}
