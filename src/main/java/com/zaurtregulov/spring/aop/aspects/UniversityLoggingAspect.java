package com.zaurtregulov.spring.aop.aspects;

import java.util.List;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.zaurtregulov.spring.aop.Student;

@Component
@Aspect
public class UniversityLoggingAspect {
	
	@Before("execution(* getStudents())")
	public void beforeGetStudentsLoggingAdvice() {
		System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
	}
	
	@AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
	public void AfterReturningGetStudentsLoggingAdvice(List<Student> students) {
		Student firstStudent = students.get(0);
		String nameSurname = firstStudent.getNameSurname();
		nameSurname = "Mr. " + nameSurname;
		firstStudent.setNameSurname(nameSurname);
		double avgGrade = firstStudent.getAvgGrade();
		avgGrade += 1.5;
		firstStudent.setAvgGrade(avgGrade);
		System.out.println("AfterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после метода getStudents");
	}
}
