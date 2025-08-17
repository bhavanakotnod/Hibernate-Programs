package com.controller;

import com.entity.Student1;
import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		
		StudentService ss = new StudentService();
		Student1 s = new Student1();
		ss.InsertData(s);
		
	}
}
