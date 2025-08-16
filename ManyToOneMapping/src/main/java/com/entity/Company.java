package com.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Company {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int comp_id;
	private String comp_name;
	
	
	@OneToMany(mappedBy = "comp")
	private List<Employeee> emp;

	
	public int getComp_id() {
		return comp_id;
	}
	public void setComp_id(int comp_id) {
		this.comp_id = comp_id;
	}
	public String getComp_name() {
		return comp_name;
	}
	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}
	@Override
	public String toString() {
		return "Company [comp_id=" + comp_id + ", comp_name=" + comp_name + "]";
	}
	public Company(int comp_id, String comp_name) {
		super();
		this.comp_id = comp_id;
		this.comp_name = comp_name;
	}
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public void setEmp(ArrayList list) {
		// TODO Auto-generated method stub
		
	}
	
	
}
