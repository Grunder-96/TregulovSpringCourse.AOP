package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
	
//	@Override
	public void getBook() {
		System.out.println("Мы берем книгу из библиотеки университета");
		System.out.println("------------------------------------------");
	}
	
	public String returnBook() {
		System.out.println("Мы возвращаем книгу в библиотеку университета");
		return "Война и мир";
	}
	
	public void getMagazine() {
		System.out.println("Мы берем журнал из библиотеки университета");
		System.out.println("------------------------------------------");
	}
	
	public void returnMagazine() {
		System.out.println("Мы возвращаем журнал в библиотеку университета");
		System.out.println("------------------------------------------");
	}
	
	public void addBook(String personName, Book book) {
		System.out.println("Мы добавляем книгу в библиотеку университета");
		System.out.println("------------------------------------------");
	}
	
	public void addMagazine() {
		System.out.println("Мы добавляем журнал в библиотеку университета");
		System.out.println("------------------------------------------");
	}
}
