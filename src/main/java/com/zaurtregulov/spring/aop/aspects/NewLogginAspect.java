package com.zaurtregulov.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLogginAspect {
	
	@Around("execution(public String returnBook())")
	public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint jointPoint) throws Throwable {
		System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");
		long begin = System.currentTimeMillis();
		Object targetMethodResult = jointPoint.proceed();
		targetMethodResult = "Муму";
		long end = System.currentTimeMillis();
		System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
		System.out.println("Метод returnBook() выполнил работу за " + (end - begin) + " мс.");
		return targetMethodResult;
	}
}
