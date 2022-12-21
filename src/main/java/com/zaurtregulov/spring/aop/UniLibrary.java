package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
	
//	@Override
	public void getBook(Book book) {
		System.out.println("Мы берем книгу " + book.getName() + " из библиотеки университета");
	}
	
	public String returnBook() {
		System.out.println("Мы возвращаем книгу в библиотеку университета");
		return "OK";
	}
	
	public void getMagazine() {
		System.out.println("Мы берем журнал из библиотеки университета");
	}
}
