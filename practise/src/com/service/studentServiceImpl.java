package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.student;

public class studentServiceImpl implements studentService{
// here <student> is generic class which data we need in form of list.
// so to keep the data we make lstudent (like a bag ) to carry data.
	
	static List<student> lstudent = new ArrayList<>();


	@Override
	public void addStudent(student s) {		
		lstudent.add(s);
		System.out.println("===added successfully==="+ lstudent.size());
	}
		

	@Override
	public List<student> getAllStudents() {		
		return lstudent;
	}



	

	
	
}
