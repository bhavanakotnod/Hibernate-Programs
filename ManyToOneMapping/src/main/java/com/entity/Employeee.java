package com.entity;


	
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.ManyToOne;

	@Entity
	public class Employeee { // MANY

		@Id
		private int emp_id;
		private String emp_name;

		@ManyToOne
		//@JoinColumn(name = "dddddeeeee")
		private Company comp;

		public int getEmp_id() {
			return emp_id;
		}

		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}

		public String getEmp_name() {
			return emp_name;
		}

		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}

		public Company getcomp() {
			return comp;
		}

		public void setcomp(Company comp) {
			this.comp = comp;
		}

		public Employeee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employeee(int emp_id, String emp_name, Company comp) {
			super();
			this.emp_id = emp_id;
			this.emp_name = emp_name;
			this.comp = comp;
		}

		@Override
		public String toString() {
			return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", dept=" + comp + "]";
		}

	

}
