package com.service;

import java.util.List;

import com.model.student;

public interface studentService {
	
	void addStudent(student s);
	
	
	List<student> getAllStudents();
	
}

