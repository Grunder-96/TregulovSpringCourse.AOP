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
		Object targetMethodResult = null;
		try {
			targetMethodResult = jointPoint.proceed();
		} catch (Exception e) {
			System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение " + e);
			targetMethodResult = "Неизвестная книга";
		}
		System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
		return targetMethodResult;
	}
}
