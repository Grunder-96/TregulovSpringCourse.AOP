package com.zaurtregulov.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
	
	public static void main(String[] args) {
		System.out.println("method main starts");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
		String answer = library.returnBook();
		System.out.println(answer);
		context.close();
		System.out.println("method main ends");
	}
}
