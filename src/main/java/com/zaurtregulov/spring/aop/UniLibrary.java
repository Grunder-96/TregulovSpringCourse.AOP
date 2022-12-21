package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
	
//	@Override
	public void getBook() {
		System.out.println("Мы берем книгу из библиотеки университета");
	}
	
	public void returnBook() {
		System.out.println("Мы возвращаем книгу в библиотеку университета");
	}
	
	public void getMagazine() {
		System.out.println("Мы берем журнал из библиотеки университета");
	}
	
	public void returnMagazine() {
		System.out.println("Мы возвращаем журнал в библиотеку университета");
	}
	
	public void addBook() {
		System.out.println("Мы добавляем книгу в библиотеку университета");
	}
	
	public void addMagazine() {
		System.out.println("Мы добавляем журнал в библиотеку университета");
	}
}
