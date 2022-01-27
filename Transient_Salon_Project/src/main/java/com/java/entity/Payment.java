package com.java.entity;

public class Payment {


		public int payment_id;
		public int customer_id;
		public int salon_id;
		public int freezing_amount;
		public String payment_date;
		public int total_amount;
		
		public Payment() {
			
			payment_id=0;
			customer_id=0;
			salon_id=0;
			freezing_amount=0;
			payment_date=null;
			total_amount=0;
			
			
		}

		public Payment(int payment_id, int customer_id, int salon_id, int freezing_amount, String payment_date,
				int total_amount) {
			
			this.payment_id = payment_id;
			this.customer_id = customer_id;
			this.salon_id = salon_id;
			this.freezing_amount = freezing_amount;
			this.payment_date = payment_date;
			this.total_amount = total_amount;
		}

		public int getPayment_id() {
			return payment_id;
		}

		public void setPayment_id(int payment_id) {
			this.payment_id = payment_id;
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

		public int getFreezing_amount() {
			return freezing_amount;
		}

		public void setFreezing_amount(int freezing_amount) {
			this.freezing_amount = freezing_amount;
		}

		public String getPayment_date() {
			return payment_date;
		}

		public void setPayment_date(String payment_date) {
			this.payment_date = payment_date;
		}

		public int getTotal_amount() {
			return total_amount;
		}

		public void setTotal_amount(int total_amount) {
			this.total_amount = total_amount;
		}

		@Override
		public String toString() {
			String str="";
		 str+= "payment_id=" + payment_id + ", customer_id=" + customer_id + ", salon_id=" + salon_id
					+ ", freezing_amount=" + freezing_amount + ", payment_date=" + payment_date + ", total_amount="
					+ total_amount + ", getPayment_id()=" + getPayment_id() + ", getCustomer_id()=" + getCustomer_id()
					+ ", getSalon_id()=" + getSalon_id() + ", getFreezing_amount()=" + getFreezing_amount()
					+ ", getPayment_date()=" + getPayment_date() + ", getTotal_amount()=" + getTotal_amount();
		
		return str;
		}
	
}
