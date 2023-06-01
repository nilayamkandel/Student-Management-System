package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.student;
import com.service.studentService;
import com.service.studentServiceImpl;

public class test {

	public static void main(String[] args) {
		add();
		getall();
	}
	
	static void add() {
		Scanner sc = new Scanner(System.in);
		char flag = 'y';
		studentService ss = new studentServiceImpl();
		do {
			System.out.println("enter id");
			System.out.println("enter name");
			System.out.println("enter address");
			
			student s = new student(sc.nextInt(), sc.next(), sc.next());
			ss.addStudent(s);
			
			System.out.println("do you want to add [y/n]");
			flag = sc.next().charAt(0);
			
		}while(flag == 'y');
				
	}
	
	static void getall() {
		studentService ss = new studentServiceImpl();
		List<student> lstudent = ss.getAllStudents();
		System.out.println(lstudent);
	}
	
	

	
}

