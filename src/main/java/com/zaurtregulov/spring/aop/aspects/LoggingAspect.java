package com.zaurtregulov.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.zaurtregulov.spring.aop.Book;

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
//	@Before("com.zaurtregulov.spring.aop.aspects.MyPointcuts.allAddMethods()")
//	public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
//		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//		System.out.println("signature = " + signature);
//		System.out.println("return type = " + signature.getReturnType());
//		System.out.println("name = " + signature.getName());
//		System.out.println("beforeGetLoggingAdvice: ??????????????????????" + " ?????????????? ???????????????? ??????????/????????????");
//		if (signature.getName().equals("addBook")) {
//			Object[] arguments = joinPoint.getArgs();
//			for (Object arg : arguments) {
//				if (arg instanceof Book) {
//					Book myBook = (Book) arg;
//					System.out.println("???????????????????? ?? ??????????:");
//					System.out.println("???????????????? - " + myBook.getName());
//					System.out.println("?????????? - " + myBook.getAuthor());
//					System.out.println("?????? ???????????????????? - " + myBook.getYearOfPublication());
//				} else if (arg instanceof String) {
//					System.out.println("?????????? ?? ???????????????????? ?????????????????? ???????????????????????? " + arg);
//				}
//			}
//		} 
//		System.out.println("------------------------------------------");
//	}
//	
//	@Before("allGetMethods()")
//	public void beforeGetSecurityAdvice() {
//		System.out.println("beforeGetSecurityAdvice: ???????????????? ???????? ???? ?????????????????? ??????????/??????????????");
//	}
//	
//	@Before("execution(* returnBook())")
//	public void beforeReturnBookAdvice() {
//		System.out.println("beforeReturnBookAdvice: ?????????????? ?????????????? ??????????");
//	}
}
