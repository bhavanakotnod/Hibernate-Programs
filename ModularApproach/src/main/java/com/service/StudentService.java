package com.service;

import com.dao.StudentDao;
import com.entity.Student1;

public class StudentService {

	public void InsertData(Student1 s) {
		StudentDao sd = new StudentDao();
		sd.insertData(s);
	}
	


}
