package com.zaurtregulov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
	
	
	
//	@Pointcut("execution(* com.zaurtregulov.spring.aop.UniLibrary.*())")
//	private void allMethodsFromUniLibrary() {}
//	
//	@Pointcut("execution(public void com.zaurtregulov.spring.aop.UniLibrary.returnMagazine())")
//	private void returnMagazineFromUniLibrary() {}
//	
//	@Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//	private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//	
//	@Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//	public void beforeAllMethodsExceptReturnMagazineAdvice() {
//		System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: log #10");
//	}
	
//	@Pointcut("execution(* com.zaurtregulov.spring.aop.UniLibrary.get*())")
//	private void allGetMethodsFromUniLibrary() {}
//	
//	@Pointcut("execution(* com.zaurtregulov.spring.aop.UniLibrary.return*())")
//	private void allReturnMethodsFromUniLibrary() {}
//	
//	@Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//	private void allGetAndReturnMethodsFromUniLibrary() {}
//	
//	@Before("allGetMethodsFromUniLibrary()")
//	public void beforeGetLoggingAdvice() {
//		System.out.println("beforeGetLoggingAdvice: writing log #1");
//	}
//	
//	@Before("allReturnMethodsFromUniLibrary()")
//	public void beforeReturnLoggingAdvice() {
//		System.out.println("beforeReturnLoggingAdvice: writing log #2");
//	}
//	
//	@Before("allGetAndReturnMethodsFromUniLibrary()")
//	public void beforeGetAndReturnLoggingAdvice() {
//		System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//	}
	
	
//	@Pointcut("execution(* get*())")
//	private void allGetMethods() {}
//	
	@Before("com.zaurtregulov.spring.aop.aspects.MyPointcuts.allGetMethods()")
	public void beforeGetLoggingAdvice() {
		System.out.println("beforeGetLoggingAdvice: логирование" + " попытки получить книгу/журнал");
	}
//	
//	@Before("allGetMethods()")
//	public void beforeGetSecurityAdvice() {
//		System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//	}
//	
//	@Before("execution(* returnBook())")
//	public void beforeReturnBookAdvice() {
//		System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//	}
}