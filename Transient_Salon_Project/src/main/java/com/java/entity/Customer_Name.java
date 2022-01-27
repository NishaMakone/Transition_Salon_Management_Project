package com.java.entity;


	public class Customer_Name {
		
		public String first_name;
		public String middle_name;
		public String last_name;
		
		public Customer_Name() {
			first_name=null;
			middle_name=null;
			last_name=null;
		}

		public Customer_Name(String first_name, String middle_name, String last_name) {
			this.first_name = first_name;
			//this.middle_name = middle_name;
			this.last_name = last_name;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getMiddle_name() {
			return middle_name;
		}

		public void setMiddle_name(String middle_name) {
			this.middle_name = middle_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String toString() {
			String str="";
			str+= "first_name=" + first_name + ", middle_name=" + middle_name + ", last_name=" + last_name;
			
			return str;
		}
		

}
