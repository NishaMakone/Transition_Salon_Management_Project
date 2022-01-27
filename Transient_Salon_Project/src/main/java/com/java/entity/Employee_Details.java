package com.java.entity;

public class Employee_Details {


		public int emp_id;
		public int salone_id;
		public Employee_Name employee_name;
		public int emp_phone;
		public String emp_email;
		public String emp_job_description;
		
		public Employee_Details() {
			emp_id=0;
			salone_id=0;
			employee_name=null;
			emp_phone=0;
			emp_email=null;
			emp_job_description=null;
			
		}

		public Employee_Details(int emp_id, int salone_id, Employee_Name employee_name, int emp_phone, String emp_email,
				String emp_job_description) {
			super();
			this.emp_id = emp_id;
			this.salone_id = salone_id;
			this.employee_name = employee_name;
			this.emp_phone = emp_phone;
			this.emp_email = emp_email;
			this.emp_job_description = emp_job_description;
		}

		public int getEmp_id() {
			return emp_id;
		}

		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}

		public int getSalone_id() {
			return salone_id;
		}

		public void setSalone_id(int salone_id) {
			this.salone_id = salone_id;
		}

		public Employee_Name getEmployee_name() {
			return employee_name;
		}

		public void setEmployee_name(Employee_Name employee_name) {
			this.employee_name = employee_name;
		}

		public int getEmp_phone() {
			return emp_phone;
		}

		public void setEmp_phone(int emp_phone) {
			this.emp_phone = emp_phone;
		}

		public String getEmp_email() {
			return emp_email;
		}

		public void setEmp_email(String emp_email) {
			this.emp_email = emp_email;
		}

		public String getEmp_job_description() {
			return emp_job_description;
		}

		public void setEmp_job_description(String emp_job_description) {
			this.emp_job_description = emp_job_description;
		}


		public String toString() {
			
			String str="";
			 str+="emp_id=" + emp_id + ", salone_id=" + salone_id + ", employee_name=" + employee_name
					+ ", emp_phone=" + emp_phone + ", emp_email=" + emp_email + ", emp_job_description="
					+ emp_job_description + ", getEmp_id()=" + getEmp_id() + ", getSalone_id()=" + getSalone_id()
					+ ", getEmployee_name()=" + getEmployee_name() + ", getEmp_phone()=" + getEmp_phone()
					+ ", getEmp_email()=" + getEmp_email() + ", getEmp_job_description()=" + getEmp_job_description()
					+ ", getClass()=" + getClass() + ", toString()=" + super.toString();
			 
			 return str;
		}
		
	
}
