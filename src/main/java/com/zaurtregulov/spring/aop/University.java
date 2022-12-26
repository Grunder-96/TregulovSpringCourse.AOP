package com.zaurtregulov.spring.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class University {
	
	private List<Student> students = new ArrayList<>();
	
	public void addStudent() {
		Student st1 = new Student("Grigory Taran", 4, 7.74);
		Student st2 = new Student("Michael Petrov", 3, 8.3);
		Student st3 = new Student("Elena Sidorova", 1, 9.1);
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
	}
	
	public List<Student> getStudents() {
		System.out.println("Information from method getStudent: ");
		System.out.println(students);
		return students;
	}
}
