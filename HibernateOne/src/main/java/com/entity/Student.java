package com.entity;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int stud_id;
    
	private String name;
	private int age;
	private String city;
	private String surname ;

	public Student() {

	}

	public Student(int stud_id, int age, String name, String city,String surname) {
		super();
		this.stud_id = stud_id;
		this.age = age;
		this.name = name;
		this.city = city;
		this.surname= surname;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", age=" + age + ", name=" + name + ", city=" + city + ", + surname =" + surname +" ]";
	}




}
